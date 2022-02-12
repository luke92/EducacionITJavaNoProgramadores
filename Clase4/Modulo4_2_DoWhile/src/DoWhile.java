import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		System.out.println("Suma de numeros enteros");
		
		Scanner teclado = new Scanner(System.in);
		
		int suma = 0;
		int numeroIngresadoPorUsuario = 0;
		
		do {
			System.out.println("Para salir del programa ingrese el numero 0");
			numeroIngresadoPorUsuario = teclado.nextInt();
			suma += numeroIngresadoPorUsuario;
			
		} while (numeroIngresadoPorUsuario != 0);
		
		System.out.println("La suma total es : " + suma);

	}

}
