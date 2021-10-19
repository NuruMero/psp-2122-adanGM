package CTA_5;

public class CTA_5 {

    public static void main(String[] args) {
        System.out.println("Ejecutando...");
        if (args != null) {
            for (int i = 0; i<5; i++) {
                System.out.println(args[0]);
            }
        }
        else {
            System.out.println("No se introdujo ningún argumento");
            System.exit(1);
        }
    }
}
