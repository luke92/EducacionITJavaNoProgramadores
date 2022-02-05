import java.util.Arrays;

public class Vectores2 {

	public static void main(String[] args) {
		int[] numerosOrigen = {10, 30, 20};
		
		int[] numerosDestino = new int[numerosOrigen.length];
				
		//System.arraycopy(from, fromIndex, to, toIndex, n);
		System.arraycopy(numerosOrigen, 0, numerosDestino, 0, numerosOrigen.length);
		
		System.out.println(Arrays.equals(numerosOrigen, numerosDestino));

		/*
		 Arrays.sort(v) ordena los elementos del
		 vector.
		 ● Arrays.equals(v1,v2) comprueba si dos
		 vectores son iguales.
		 ● Arrays.toString(v) devuelve una cadena
		 que representa el contenido del vector.
		 Por ejemplo:
		 Arrays.sort(losValores)
*/
		int[] numerosOrdenados = {45, 40, 30};
		int[] numerosDesordenados = {30, 45, 40};
		
		Arrays.sort(numerosOrdenados);
		
		System.out.println(Arrays.toString(numerosOrdenados));
		
		String [] cadenas  = {"Hola","Lucas"};
		
		System.out.println(Arrays.toString(cadenas));

		System.out.println(Arrays.equals(numerosOrdenados, numerosDesordenados));
	}

}
