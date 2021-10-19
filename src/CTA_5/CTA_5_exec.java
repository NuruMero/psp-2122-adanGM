package CTA_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CTA_5_exec {

    public static void main(String[] args) throws IOException {

        ProcessBuilder pb = new ProcessBuilder("java", "-classpath", "./out/production/psp-2122-adanGM", "CTA_5.CTA_5","algo");
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
