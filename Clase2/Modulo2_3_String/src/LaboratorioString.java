import java.util.Scanner;

public class LaboratorioString {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa el primer parrafo");
		
		String parrafo1 = scanner.nextLine();
		
		System.out.println("Ingresa el segundo parrafo");
		
		String parrafo2 = scanner.nextLine();
		
		System.out.println("Parrafo1");
		System.out.println(parrafo1);
		
		System.out.println("Parrafo2");
		System.out.println(parrafo2);
		
		System.out.println("Son Iguales usando == ? : " + parrafo1 == parrafo2);
		System.out.println("Son Iguales usando equals? : " + parrafo1.equals(parrafo2));
		
		System.out.println("Son iguales sin importar el case sensitive (Sin importar minuscula o mayuscula)" + parrafo1.equalsIgnoreCase(parrafo2));
		
		System.out.println("Parrafo 1 en mayuscula :" + parrafo1.toUpperCase());
		System.out.println("Parrafo 1 en minuscula :" + parrafo1.toLowerCase());
		
		String primerCaracter = parrafo1.substring(0,1);
		primerCaracter = primerCaracter.toUpperCase();
		String restoParrafo = parrafo1.substring(1,parrafo1.length());

		System.out.println("Letra capital :" + primerCaracter + restoParrafo);
		
		String parrafos = String.join(",", parrafo1, parrafo2);
		System.out.println(parrafos);
	}
}
