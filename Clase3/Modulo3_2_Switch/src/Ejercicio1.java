import java.util.Scanner;

public class Ejercicio1 {
	public static void main (String [] args) {
		/*
		 * 
		 * Crear un programa en Java que simule la petición de una opción según el siguiente menú y
muestre en pantalla que ha ingresado a la opción seleccionada con las opciones siguientes:
Gracias por contactarte con nosotros!
¿En qué podemos ayudarte?
A) Documentación
B) Cotización
C) Asistencia
D) Siniestros
E) Información de Pagos
F) Otras Consultas
G) Anulación
Escribe la letra de la opción seleccionada.
		 */
		
		String documentacion = "Documentación";
		String opcionA = "A";
		
		System.out.println("Gracias por contactarte con nosotros!");
		System.out.println("¿En qué podemos ayudarte?");
		System.out.println(opcionA + ") " + documentacion);
		System.out.println("B) Cotización");
		System.out.println("C) Asistencia");
		System.out.println("D) Siniestros");
		System.out.println("E) Información de Pagos");
		System.out.println("F) Otras Consultas");
		System.out.println("G) Anulación");
		System.out.println("Escribe la letra de la opción seleccionada");
		
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
