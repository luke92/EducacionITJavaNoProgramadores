import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Crear un programa que lea números enteros (Positivos y
			Negativos) del teclado y muestre la suma de dichos
			números ingresados, el programa se detendrá cuando el
			usuario indique el número 0
		 */
		
		System.out.println("Suma de numeros enteros");
		System.out.println("Para salir del programa ingrese el numero 0");
		Scanner teclado = new Scanner(System.in);
		int numeroIngresadoPorUsuario = teclado.nextInt();
		int suma = 0;
		while (numeroIngresadoPorUsuario != 0) {
			
			suma = suma + numeroIngresadoPorUsuario;
			
			System.out.println("Para finalizar el programa escriba 0");
			numeroIngresadoPorUsuario = teclado.nextInt();
			
		}
		System.out.println("La suma total es : " + suma);

	}

}
