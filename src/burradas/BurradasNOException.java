package burradas;

/**
 * Excepción personalizada que se lanza cuando se detecta una palabra prohibida.
 * 
 * @author Katherin Cabrera
 * @version 1.0
 */
public class BurradasNOException extends Exception {
    /** Palabra prohibida que provocó la excepción */
    private String palabraProhibida;

    /**
     * Constructor de la excepción.
     * 
     * @param palabra Palabra prohibida detectada.
     */
    public BurradasNOException(String palabra) {
        super("Se ha detectado una palabra prohibida: " + palabra);
        this.palabraProhibida = palabra;
    }

    /**
     * Devuelve la palabra prohibida que provocó la excepción.
     * 
     * @return La palabra prohibida.
     */
    public String getPalabraProhibida() {
        return palabraProhibida;
    }
}
