
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Imprimir los números del 1 al 10, sin
imprimir números 2, 5 y 9, uno abajo
del otro.
Requisito: se necesita tener
conocimiento del operador AND (&&)
y del operador NOT (!=)
		 */
		
		int numero = 1;
		
		while (numero <= 10) {
			
			if (numero != 2 && numero != 5 && numero != 9 && numero != 14) {
				System.out.println(numero);
				
			}
			
			numero++;
		}

	}

}
