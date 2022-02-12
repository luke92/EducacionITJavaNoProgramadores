
public class Procedimientos {

	public static void main(String[] args) {
		
		String palabra = "Esta es una palabra";
		imprimirPantalla(palabra, "esta es la cadena 2");
		imprimirPantalla(palabra);
	}
	
	public static void holaMundo() {
		System.out.println("Hola Mundo");
	}
	
	/**
	 * Imprimo en la pantalla de la consola una cadena de texto
	 * @param cadena
	 */
	public static void imprimirPantalla(String cadena) {
		System.out.println(cadena);
	}
	
	
	public static void imprimirPantalla(String cadena, String cadena2) {
		System.out.println(cadena);
		System.out.println(cadena2);
		cadena = "Otra cosa";
		System.out.println(cadena);
	}

}
