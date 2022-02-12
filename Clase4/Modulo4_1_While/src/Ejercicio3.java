
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Imprimir los números del 1 al 30 sin
imprimir números entre el 10 y el 20
uno abajo del otro
		 */
		
		int numero = 1;
		
		while (numero <= 30) {
			
			if (numero < 10 || numero > 20) {
				System.out.println(numero);
			}
			
			numero++;
		}

	}

}
