package Gesacad_1;

import java.util.Scanner;

public class Gesacad {

    public static Scanner texto = new Scanner(System.in);

    public static void main(String[] args) {
        int eleccion = 0;
        do {
            System.out.println("****************************************");
            System.out.println("*********** Gestor académico ***********");
            System.out.println("****************************************");
            System.out.println("1.- Importar Actividades");
            System.out.println("2.- Consultar Actividades");
            System.out.println("3.- Crear Tarea");
            System.out.println("4.- Salir");
            System.out.print("Escribe una de las opciones: ");

            eleccion = texto.nextInt();
            comprobareleccion(eleccion);
        } while(eleccion != 4);
    }

    public static void comprobareleccion(int elec) {
        switch (elec) {
            case 1:
                CreadorActividades.importarActividades();
                break;
            case 2:
                System.out.println("No aplica");
                break;
            case 3:
                System.out.println("No aplica");
                break;
            case 4:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Error: Valor no válido");
                break;
        }
    }
}
