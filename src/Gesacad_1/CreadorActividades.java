package Gesacad_1;

import java.util.ArrayList;
import java.util.Scanner;

public class CreadorActividades {

    public static ArrayList<Actividad> lista = new ArrayList<>();
    public static Scanner texto = new Scanner(System.in);

    public static void importarActividades() {
        int numact = 0;
        String stract = "";
        do {
            System.out.println("Escribe un número de actividad:");
            numact = texto.nextInt();
            System.out.println("Actividad número: " +numact +"     Escribe una descripción de la actividad:");
            stract = texto.next();
            System.out.println("Descripción de la actividad: " +stract);
            Actividad acttemp = new Actividad(numact,stract);
            lista.add(acttemp);
        } while (numact != -1);

        System.out.println("Listado de actividades creadas/importadas:");
        for (int i = 0; i<lista.size(); i++) {
            System.out.println("Número: " +lista.get(i).getNumactiv() +" - Descripción: " +lista.get(i).getDescactiv());
        }
    }
}
