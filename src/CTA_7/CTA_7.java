package CTA_7;

import java.util.Scanner;

public class CTA_7 {
    public static void main(String[] args) {

        System.out.println("Escribe hasta poner *");
        Scanner texto = new Scanner(System.in);
        String leido = null;
        do {
            leido = texto.next();
        } while (!leido.equals("*"));
    }
}
