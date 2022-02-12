import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Generar un programa que permita al usuario
ingresar por consola en la misma línea el primer
nombre y primer apellido y realice las siguientes
operaciones:
1. Mostrar el nombre y apellido por separado.
2. Mostrar las iniciales en Mayúsculas
		 */
		
		String nombreApellido = "";
		
		String nombre = "";
		String apellido = "";
		
		
		System.out.println("Ingrese su nombre y apellido");
		
		Scanner scanner = new Scanner(System.in);
		nombreApellido = scanner.nextLine();
		scanner.close();
		
		nombreApellido = nombreApellido.trim();
		
		int indiceEspacio = nombreApellido.indexOf(" ");
		if (indiceEspacio > -1 || nombreApellido.contains(" ")) {
			nombre = nombreApellido.substring(0,indiceEspacio);
			apellido = nombreApellido.substring(indiceEspacio);
		}
		else {
			nombre = nombreApellido;
		}
		
		nombre = nombre.trim();
		apellido = apellido.trim();
		
		String primerCaracter = nombre.substring(0,1);
		primerCaracter = primerCaracter.toUpperCase();
		String restoParrafo = nombre.substring(1,nombre.length());
		
		nombre = primerCaracter + restoParrafo;
		
		System.out.println("Su nombre es " + nombre);
		if(!apellido.isEmpty())
			System.out.println("Su apellido es " + apellido.trim());
		else {
			System.out.println("No se ingreso el apellido");
		}
		
		
	}

}
