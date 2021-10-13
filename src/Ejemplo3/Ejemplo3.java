package Ejemplo3;

import java.io.*;

public class Ejemplo3 {

    public static void main(String[] args) throws IOException{

        //El proceso a ejecutar es Ejemplo2
        ProcessBuilder pb = new ProcessBuilder("java", "-classpath","./out/production/psp-2122-adanGM","Ejemplo2.Ejemplo2");

        System.out.printf("Directorio de trabajo: %s%n",pb.directory());

        //se ejecuta el proceso
        Process p = pb.start();

        //obtener la salida devuelta por el proceso
        try {
            InputStream  is = p.getInputStream();

            BufferedReader bris = new BufferedReader(new InputStreamReader(is));
            String liner = null;
            while ((liner = bris.readLine()) != null) {
                System.out.println(liner);
            }

            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}