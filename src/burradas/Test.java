package burradas;

import java.util.Scanner;

public class Test {

    static String tpalabros[] = {"caca", "culo", "pedo", "pis"};

    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tus mensajes, o pulsa . Para terminar:\n");

        while (true) {
            try {
                String linea = leerLineaOK(sc);
                if (linea.equals(".")) {
                    break; // Terminar el programa si se introduce un punto
                }
                System.out.println("OK");
            } catch (BurradasNOException e) {
                System.out.println("Error: no se permite lenguaje obsceno (" + e.getPalabraProhibida() + ")");
            }
        }

        System.out.println("Fin de programa.");
        sc.close();
    }

    public static String leerLineaOK(Scanner sc) throws BurradasNOException {
        String linea = sc.nextLine();

        for (String palabra : tpalabros) {
            if (linea.toLowerCase().contains(palabra)) {
                throw new BurradasNOException(palabra);
            }
        }

        return linea;
    }
}
