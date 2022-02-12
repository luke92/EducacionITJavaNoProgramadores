import java.util.Scanner;

public class FOREjercicio1 {

	public static void main(String[] args) {
		/*
		 * Crear un programa que ingrese una oración y muestre
cuál es el carácter que más se repite.
● No debe incluir el espacio en blanco.
● La oración a ingresar no debe estar vacía.
		 */
		Scanner teclado = new Scanner(System.in);
		String oracion = "";
		
		do {
			System.out.println("Ingrese una frase NO VACIA");
			oracion = teclado.nextLine().trim();
		} while(oracion.isEmpty());
		
		boolean existeCaracterMasUsado = false;
		int cantidadVecesQueApareceCaracterMasUsado = 0;
		char caracterMasUsado = ' ';
		int indiceCaracterMasUsado = 0;
		
		for (int i = 0; i < oracion.length(); i++) 
		{
			char caracter = oracion.charAt(i);
			if (caracter == ' ') {
				continue;
			}
			
			int cantidadVecesApareceCaracter = 0;
			
			
			for (int j = 0; j < oracion.length(); j++) {
				char caracterAuxiliar = oracion.charAt(j);
				if (caracter == caracterAuxiliar) {
					cantidadVecesApareceCaracter++;
				}
			}
			
			if (cantidadVecesApareceCaracter > cantidadVecesQueApareceCaracterMasUsado) {
				cantidadVecesQueApareceCaracterMasUsado = cantidadVecesApareceCaracter;
				caracterMasUsado = caracter;
				indiceCaracterMasUsado = i;
			}			
		}
		
		
		System.out.println("Caracter mas repetido :" + caracterMasUsado);
		System.out.println("Cantidad de veces que aparece :" + cantidadVecesQueApareceCaracterMasUsado);
		System.out.println("Posicion de la cadena mas usada :" + indiceCaracterMasUsado);
		System.out.println("Fin del programa");

	}

}
