
public class ForEjercicio5 {

	public static void main(String[] args) {
		// Imprimir la suma de los números impares del 1 al 10.
		
		// IMPAR -> 1, 3, 5, -1  -> numero % 2 != 0 
		// PAR -> 2, 4, 6 -> numero % 2 == 0
		
		for(int i = 1; i <= 10; i++) {
			if (i % 2 != 0) // -> i % 2, != 0 -> 2 operaciones
				System.out.println(i); 
		}

	}

}
