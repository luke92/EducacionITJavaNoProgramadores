import java.util.Scanner;

public class Ejercicio2 {
	public static void main (String [] args) {
		/*
		 * Dada la siguiente tabla del tiempo, hacer un programa que
indique qué puede hacer una persona con dicho pronóstico:
Ejercicio 2
Temperatura Tiempo Sugerencia
> 25° Soleado Caminar y Tomar sol
> 15° y <=25° Soleado Caminar
<=15° Soleado Caminar con Campera
<10° Lluvia Quedarse en casa o salir con Paraguas y Campera
<0° Nieve Esquiar
		 */
		
		System.out.println("Ingrese la temperatura en grados celsius");
		Scanner scanner = new Scanner(System.in);
		String cadena = scanner.nextLine();
		
		int temperatura = Integer.parseInt(cadena);
		//26
		if ( temperatura > 25) {
			System.out.println("Soleado Caminar y Tomar sol");
		}
		//16 al 24
		else if (temperatura > 15) {
			System.out.println("Soleado Caminar");
		}
		else if (temperatura <= 15 && temperatura >= 10) {
			System.out.println("Soleado Caminar con Campera");
		}
		else if (temperatura < 10 && temperatura >= 0) {
			System.out.println("Lluvia Quedarse en casa o salir con Paraguas y Campera");
		}
		else if (temperatura < 0){
			System.out.println("Nieve Esquiar");
		}
	}
}
