package burradas;

public class BurradasNOException extends Exception {

	
	// Definición de la excepción personalizada que extiende de Exception
	
	    private String palabraProhibida; // Atributo para almacenar la palabra que causó la excepción

	    // Constructor que recibe la palabra prohibida y define el mensaje de error
	    public BurradasNOException(String palabra) {
	        super("Error no se permite lenguaje obsceno: " + palabra);
	        this.palabraProhibida = palabra;
	    }

	    // Método getter para obtener la palabra prohibida
	    public String getPalabraProhibida() {
	        return palabraProhibida;
	    
	}

}
