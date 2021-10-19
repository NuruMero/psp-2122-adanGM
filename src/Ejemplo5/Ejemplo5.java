package Ejemplo5;

import java.io.*;

public class Ejemplo5 {

    public static void main(String[] args) throws IOException {

        ProcessBuilder pb = new ProcessBuilder("java", "-classpath","./out/production/psp-2122-adanGM","Ejemplo5.Ejemplo5prueba");
        Process p = pb.start();

        OutputStream os = p.getOutputStream();
        os.write("Hola Manuel\n".getBytes());
        os.flush();

        InputStream is = p.getInputStream();

        BufferedReader bris = new BufferedReader(new InputStreamReader(is));
        String liner = null;
        while ((liner = bris.readLine()) != null) {
            System.out.println(liner);
        }

        is.close();
        bris.close();

        int exitVal;
        try {
            exitVal = p.waitFor();
            System.out.println("Valor de Salida: " +exitVal);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
