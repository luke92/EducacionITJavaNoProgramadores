import java.util.Scanner;

public class CalculadoraBasica {
	public static void main (String [] args) {
		
		int numero1 = 0, numero2 = 0;
		String opcion = "";
		
		System.out.println("Bienvenido a la calculadora basica");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa el primer numero");
		numero1 = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Ingresa el segundo numero");
		numero2 = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Opciones:");
		System.out.println("---------");
		
		System.out.println("'+' Suma");
		System.out.println("'-' Resta");
		System.out.println("'*' Multiplicacion");
		System.out.println("'/' Division");
		
		System.out.println("Ingrese una opcion");
		opcion = scanner.nextLine();		
		scanner.close();
		
		switch(opcion) {
			case "+":
				System.out.println(numero1 + numero2);
				break;
			case "-":
				System.out.println(numero1 - numero2);
				break;
			case "*":
				System.out.println(numero1 * numero2);
				break;
			case "/":
				System.out.println(numero1 / numero2);
				break;
			default :
				System.out.println("Operación no soportada");
				break;
		}
	}
}
