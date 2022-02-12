
public class Clase_If_Else {
	public static void main(String[] args) {
		
		int numero = 0;
		
		if (numero > 0) {
			System.out.println("El numero es positivo");
		} else {
			if (numero < 0) {
				System.out.println("El numero es negativo");
			}
			else {
				if (numero == 0) {
					System.out.println("El numero es 0 (zero)");
				}
			}		
		}
		System.out.println("Fin del programa");
	}
}
