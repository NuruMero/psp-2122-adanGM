package Ejemplo8;

import java.io.File;
import java.io.IOException;

public class Ejemplo8 {

    public static void main(String[] args) throws IOException {
        ProcessBuilder pb = new ProcessBuilder("./src/script8.sh");

        File fOut = new File("salida8.txt");
        File fErr = new File("error8.txt");

        pb.redirectOutput(fOut);
        pb.redirectError(fErr);
        pb.start();
    }
}
