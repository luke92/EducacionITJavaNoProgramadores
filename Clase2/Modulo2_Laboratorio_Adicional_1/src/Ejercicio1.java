import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double numero1;
		double numero2;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa el primero numero");
		
		numero1 = scanner.nextDouble();
		
		System.out.println("Valor inicial del numero 1: " + numero1);
		
		System.out.println("Ingresa el segundo numero");
		
		numero2 = scanner.nextDouble();
		
		System.out.println("Valor inicial del numero 2: " + numero2);
		
		double multiplicacion = numero1 * numero2;
		
		System.out.println("Resultado Multiplicacion:" + multiplicacion);
		
		double division = numero1 / numero2;
		
		System.out.println("Resultado division:" + division);
		
		double suma = numero1 + numero2;
		
		System.out.println("Resultado suma:" + suma);
		
		double resta = numero1 - numero2;
		
		System.out.println("Resultado resta:" + resta);
		
		int sumaEntera = (int) suma;
		
		System.out.println("Suma entera : " + sumaEntera);
		
		
		float numeroFloat1, numeroFloat2;
		double resultado;
		System.out.print("Indique un primer numero: ");
		numeroFloat1 = scanner.nextFloat();
		System.out.print("Indique un primer numero: ");
		numeroFloat2 = scanner.nextFloat();

		resultado = numeroFloat1 + numeroFloat2;
		System.out.println( String.format("La suma con decimales: %.20f ", resultado) );
		System.out.println("La suma sin decimales: " + ((int) resultado));
		
		

		resultado = numeroFloat1 - numeroFloat2;
		System.out.println(String.format("La suma con decimales: %.20f ", resultado));
		System.out.println("La suma sin decimales: " + ((int) resultado));

		resultado = numeroFloat1 + numeroFloat2;
		System.out.println(String.format("La resta con decimales: %.20f ", resultado));
		System.out.println("La resta sin decimales: " + ((int) resultado));

		resultado = numeroFloat1 * numeroFloat2;
		System.out.println(String.format("La multiplacion con decimales: %.20f ", resultado));
		System.out.println("La multiplicacion sin decimales: " + ((int) resultado));

		resultado = numeroFloat1 / numeroFloat2;
		System.out.println(String.format("La division con decimales: %.20f ", resultado));
		System.out.println("La division sin decimales: " + ((int) resultado));
		scanner.close();
	}

}
