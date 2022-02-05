import java.util.Arrays;
import java.util.Scanner;

public class VectorEjercicio1 {

	public static void main(String[] args) {
		/*
		Crear un programa que ingrese una oración que realice
		las siguientes operaciones:
		1. Contar las palabras.
		2. Indicar si hay palabras repetidas.
		3. Ordenar las palabras de forma ascendente y mostrar.
		4. Ordenar las letras y mostrar.
		5. La oración no puede estar vacía.
*/
		
		//Ingresar Oracion y validar que no este vacia
		Scanner teclado = new Scanner(System.in);
		String oracion = "";
		
		do {
			System.out.println("Ingresar la oracion");
			oracion = teclado.nextLine();
		} while (oracion.trim().length() == 0);
		
		
		// Contar las palabras
		oracion = oracion.trim();
		oracion = oracion.replace("  ", "");
		String[] palabras = oracion.split(" ");
		System.out.println("Cantidad de palabras :" + palabras.length);
		
		// Indicar si hay palabras repetidas
		boolean hayPalabrasRepetidas = false;
		int contador = 0;
		
		String[] palabrasRepetidas = new String[palabras.length];
		for (int i = 0; i < palabrasRepetidas.length; i++) {
			palabrasRepetidas[i] = "";
		}
		int contadorPalabrasRepetidas = 0;
		
		for (int i = 0; i < palabras.length; i++) {
			
			String palabra = palabras[i];
			contador = 0;
			
			for (int j = i; j < palabras.length; j++) {
				
				if (palabras[j].equals(palabra)) {
					contador++;
				}
			}
			
			boolean existeLaPalabraEnElVector = false;
			
			if (contador > 1) {
				
				if (contadorPalabrasRepetidas == 0)
					palabrasRepetidas[0] = palabra;
				
				for ( int indice = 0; indice < contadorPalabrasRepetidas; indice ++) {
					if (!palabrasRepetidas[indice].equals(palabra)) {
						palabrasRepetidas[indice] = palabra;
					}
					else {
						existeLaPalabraEnElVector = true;
					}
				}
				
				if (!existeLaPalabraEnElVector) {
					contadorPalabrasRepetidas++;
					System.out.println("La palabra :" + palabra + " aparece " + contador + " veces");
					hayPalabrasRepetidas = true;	
				}							
			}
		}
		
		System.out.println(hayPalabrasRepetidas ? "Hay Palabras repetidas" : "Ninguna palabra se repite");
		System.out.println(Arrays.toString(palabrasRepetidas));
		
		// Ordenar las palabras de forma ascendente
		
		Arrays.sort(palabras);
		System.out.println(Arrays.toString(palabras));
		
		// ordenar las letras y mostrarlas
		
		char[] letras = oracion.replace(" ", "").toCharArray();
		Arrays.sort(letras);
		System.out.println(Arrays.toString(letras));
	}

}
