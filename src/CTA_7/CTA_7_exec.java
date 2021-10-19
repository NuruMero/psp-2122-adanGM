package CTA_7;

import java.io.*;
import java.util.Scanner;

public class CTA_7_exec {

    public static void main(String[] args) throws IOException {

        ProcessBuilder pb = new ProcessBuilder("java", "-classpath","./out/production/psp-2122-adanGM","CTA_7.CTA_7");
        Process p = pb.start();

        OutputStream os = p.getOutputStream();
        InputStream is = p.getInputStream();
        BufferedReader bris = new BufferedReader(new InputStreamReader(is));

        Scanner texto = new Scanner(System.in);
        String leido = null;
        do {
            leido = texto.next();
            os.write(leido.getBytes());
        } while (!leido.equals("*"));
        os.flush();

        String liner = null;
        while ((liner = bris.readLine()) != null) {
            System.out.println(liner);
        }
        is.close();
        bris.close();
    }
}
