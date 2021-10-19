package CTA_6;

import java.io.*;

public class CTA_6_exec {

    public static void main(String[] args) throws IOException {

        ProcessBuilder pb = new ProcessBuilder("java", "-classpath", "./out/production/psp-2122-adanGM", "CTA_6.CTA_6","algo");
        File fOut = new File("salidaCTA_6.txt");
        pb.redirectOutput(fOut);
        Process p = pb.start();

        InputStream is = p.getInputStream();
        BufferedReader bris = new BufferedReader(new InputStreamReader(is));
        String liner;
        while ((liner = bris.readLine()) != null) {
            System.out.println(liner);
        }
        is.close();
        bris.close();
    }
}
