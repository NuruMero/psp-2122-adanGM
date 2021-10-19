package App1_7;

import java.io.*;

public class App1_7 {

    public static void main(String[] args) throws IOException {

        ProcessBuilder pb = new ProcessBuilder("java", "-classpath","./out/production/psp-2122-adanGM","App1_7.App1_7prueba");
        File fOut = new File("salida1_7.txt");
        File fErr = new File("error1_7.txt");
        pb.redirectOutput(fOut);
        pb.redirectError(fErr);
        Process p = pb.start();

        OutputStream os = p.getOutputStream();

        ProcessBuilder pb2 = new ProcessBuilder("cat","./src/leer1_7");
        Process p2 = pb2.start();
        InputStream is2 = p2.getInputStream();
        BufferedReader bris = new BufferedReader(new InputStreamReader(is2));
        String lineacompleta = bris.readLine()+"\n";

        os.write(lineacompleta.getBytes());
        os.flush();

        InputStream is = p.getInputStream();

        BufferedReader bris2 = new BufferedReader(new InputStreamReader(is));
        String liner = null;
        while ((liner = bris2.readLine()) != null) {
            System.out.println(liner);
        }

        is.close();
        bris.close();
        bris2.close();

        int exitVal;
        try {
            exitVal = p.waitFor();
            System.out.println("Valor de Salida: " +exitVal);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
