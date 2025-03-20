package burradas;

import java.util.Scanner;

/**
 * Clase principal que gestiona la lectura de líneas y detecta palabras prohibidas.
 * Si se encuentra una palabra prohibida, se lanza la excepción BurradasNOException.
 * 
 * @author Katherin Cabrera
 * @version 1.0
 */
public class Test {

    /** Lista de palabras prohibidas */
    static String tpalabros[] = {"caca", "culo", "pedo", "pis"};

    /**
     * Método principal que inicia la lectura de líneas de la consola.
     * Se detiene cuando el usuario introduce ".".
     * 
     * @param argv Argumentos de línea de comandos (no usados)
     */
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

    /**
     * Lee una línea de entrada y verifica si contiene palabras prohibidas.
     * 
     * @param sc Scanner para leer la entrada del usuario.
     * @return La línea ingresada si no contiene palabras prohibidas.
     * @throws BurradasNOException Si se encuentra una palabra prohibida en la línea.
     */
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
