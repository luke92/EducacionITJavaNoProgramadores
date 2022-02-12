import java.util.Scanner;

public class Ejercicio1DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Crear un programa que lea números enteros (Positivos y
			Negativos) del teclado y muestre la suma de dichos
			números ingresados, el programa se detendrá cuando el
			usuario indique el número 0, adicionalmente debe indicar
			el número mayor y número menor introducido en el
			programa.
		 */
		
		int suma = 0;		
		// inicializamos el numero mayor con el numero menor posible en Java
		//int numeroMayor = -2147483648;
		// inicializamos el numero menor con el numero mayor posible en Java
		//int numeroMenor = 2147483647;
		
		int numeroMayor = 0;
		int numeroMenor = 0;
		boolean existeNumeroMayor = false;
		boolean existeNumeroMenor = false;
		
		Scanner teclado = new Scanner(System.in);
		
		int numeroIngresadoPorUsuario = 0;
		
		do {
			System.out.println("Para salir del programa ingrese el numero 0");
			numeroIngresadoPorUsuario = teclado.nextInt();
			suma += numeroIngresadoPorUsuario;
			
			if ( (numeroIngresadoPorUsuario > numeroMayor && numeroIngresadoPorUsuario != 0 ) || !existeNumeroMayor ) {
				numeroMayor = numeroIngresadoPorUsuario;
				existeNumeroMayor = true;
			}
			
			if (numeroIngresadoPorUsuario < numeroMenor && numeroIngresadoPorUsuario != 0 || !existeNumeroMenor) {
				numeroMenor = numeroIngresadoPorUsuario;
				existeNumeroMenor = true;
			}
			
		} while (numeroIngresadoPorUsuario != 0);
		
		System.out.println("La suma total es : " + suma);
		System.out.println("Numero mayor :" + numeroMayor);
		System.out.println("Numero menor :" + numeroMenor);

	}

}
