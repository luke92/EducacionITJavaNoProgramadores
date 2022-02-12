
public class ForEjercicio3 {

	public static void main(String[] args) {
		// Imprimir los números del 1 al 10 salteando de a dos uno abajo del otro
		
		//i++ -> i = i + 1;
		// Cantidad de operaciones -> 5 * (Bloque de codigo) -> minimo 5 operaciones
		for(int i = 1; i <= 10; i+=2) {
			System.out.println(i); // 1 operacion
		}
		
		// Cantidad de operaciones -> 10 * (Bloque de codigo) -> minimo 20 operaciones
		for(int i = 1; i <= 10; i++) {
			if (i % 2 != 0) // -> i % 2, != 0 -> 2 operaciones
				System.out.println(i); 
		}
	}

}
