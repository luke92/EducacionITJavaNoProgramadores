import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
	
	/**
	 * Crear un programa que recibe 3 parámetros y calcule la
suma, resta, multiplicación, división, resto de dos
números con decimales
Las consignas para poder lograrlo son:
● Debe crear un método que no retorna, nada que
reciba los 3 parámetros, 2 números con decimales y
el carácter de operación.
● Debe crear los métodos de las operaciones que
retornar un número con decimales.
● Debe mostrar por consola un mensaje que indique el
resultado y la operación realizada.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float numero1 = ingresarNumero();
		float numero2 = ingresarNumero();
		
		char[] operadoresValidos = { '+','-','*','/','%'};
		boolean operadorValido = true;
		String operacion = "";
		do {
			mostrarOperacionesDisponibles(operadoresValidos);
			operacion = ingresarOperacion();
			operadorValido = validarOperador(operadoresValidos, operacion);
		} while (!operadorValido);
		
		float resultado = realizarOperacion(operacion, numero1, numero2);
		mostrarResultado(operacion, numero1, numero2, resultado);
	}
	
	private static boolean validarOperador(char[] operadoresValidos, String operacion) {
		char operador = operacion.charAt(0);
		for(int i = 0; i < operadoresValidos.length; i++) {
			if(operadoresValidos[i] == operador)
				return true;
		}
		return false;
	}

	public static float ingresarNumero() {
		System.out.println("Ingrese el numero: ");
		Scanner scanner = new Scanner(System.in);
		float numero = scanner.nextFloat();
		return numero;
	}
	
	public static void mostrarOperacionesDisponibles(char[] operadores) {
		System.out.println("Ingrese la operacion que desea realizar " + Arrays.toString(operadores));
	}
	
	public static String ingresarOperacion() {
		Scanner scanner = new Scanner(System.in);
		String operacion = scanner.nextLine();
		return operacion;
	}
	
	public static float realizarOperacion(String operacion, float numero1, float numero2) {
		float resultado = 0;
		switch(operacion) {
			case "+":
				resultado = sumar(numero1, numero2);
				break;
			case "-":
				resultado = restar(numero1, numero2);
				break;
			case "*":
				resultado = multiplicar(numero1, numero2);
				break;
			case "/":
				resultado = dividir(numero1, numero2);
				break;
			case "%":
				resultado = restoDivision(numero1, numero2);
				break;
			default :
				System.out.println("Opcion invalida");
				break;
			
		}
		return resultado;
		
	}
	
	public static void mostrarResultado(String operacion, float numero1, float numero2, float resultado) {
		System.out.println(numero1 + " " + operacion + " " + numero2 + " = " + resultado);
	}
	
	public static float sumar(float numero1, float numero2) {
		return numero1 + numero2;
	}
	
	public static float restar(float numero1, float numero2) {
		return numero1 - numero2;
	}
	
	public static float multiplicar(float numero1, float numero2) {
		return numero1 * numero2;
	}
	
	public static float dividir(float numero1, float numero2) {
		return numero1 / numero2;
	}
	
	public static float restoDivision(float numero1, float numero2) {
		return numero1 % numero2;
	}

}
