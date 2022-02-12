import java.util.Scanner;

public class Ejercicio1 {
	public static void main (String [] args) {
		/*
		 * 
		 * Crear un programa en Java que simule la petici�n de una opci�n seg�n el siguiente men� y
muestre en pantalla que ha ingresado a la opci�n seleccionada con las opciones siguientes:
Gracias por contactarte con nosotros!
�En qu� podemos ayudarte?
A) Documentaci�n
B) Cotizaci�n
C) Asistencia
D) Siniestros
E) Informaci�n de Pagos
F) Otras Consultas
G) Anulaci�n
Escribe la letra de la opci�n seleccionada.
		 */
		
		String documentacion = "Documentaci�n";
		String opcionA = "A";
		
		System.out.println("Gracias por contactarte con nosotros!");
		System.out.println("�En qu� podemos ayudarte?");
		System.out.println(opcionA + ") " + documentacion);
		System.out.println("B) Cotizaci�n");
		System.out.println("C) Asistencia");
		System.out.println("D) Siniestros");
		System.out.println("E) Informaci�n de Pagos");
		System.out.println("F) Otras Consultas");
		System.out.println("G) Anulaci�n");
		System.out.println("Escribe la letra de la opci�n seleccionada");
		
		Scanner scanner = new Scanner(System.in);
		String opcion = scanner.nextLine();
		scanner.close();
		
		opcion = opcion.toUpperCase();
		
		switch(opcion) {
			case "a":
			case "A" :
				System.out.println("Ha seleccionado " + documentacion);
				break;
			case "B":
				System.out.println("Ha seleccionado Cotizacion");
				break;
			case "C":
				System.out.println("Ha seleccionado Asistencia");
				break;
			case "D":
				System.out.println("Ha seleccionado Siniestros");
				break;
			case "E":
				System.out.println("Eligio la opcion E");
				break;
			case "F":
				System.out.println("Eligio la opcion F");
				break;
			case "G":
				System.out.println("Eligio la opcion G");
				break;
			default :
				System.out.println("No eligio ninguna opcion correcta");
				break;
		}
		
		/*
		Estados estado = Estados.PROMOCIONADO;
		
		switch(estado) {
		case APROBADO:
			System.out.println("Estas aprobado");
			break;
		case REPROBADO:
			System.out.println("Estas reprobado");
			break;
		default:
			System.out.println("Promocionaste");
			break;
		}
		*/
		
	}
	
	public enum Estados {
		PROMOCIONADO,
		APROBADO,
		REPROBADO,
	}
}
