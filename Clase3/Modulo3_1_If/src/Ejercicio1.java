import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
				/*
				 * Crear un programa que simule un inicio de sesi�n con dos cadenas de caracteres (usuario y
		contrase�a), y mostrar un mensaje en pantalla: Bienvenido al Sistema
		En el caso en que el ingreso sea incorrecto, mostrar la respuesta credenciales incorrectas.
		Ejemplo de referencia:
				 */
		
		String usuarioCorrecto = "admin";
		String claveCorrecta = "admin123";
		
		System.out.println("Educacion IT");
		System.out.println("Inicie su sesi�n");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese su usuario");
		
		String usuario = scanner.nextLine();
		
		System.out.println("Ingrese su contrase�a");
		
		String clave = scanner.nextLine();
		
		scanner.close();
		
		/*
		if (usuario.equalsIgnoreCase(usuarioCorrecto) &&  clave.equals(claveCorrecta) ) {
			System.out.println("Bienvenido al sistema " + usuarioCorrecto);
		}
		/*
		else {
			System.out.println("Las credenciales son incorrectas");
			
			//! -> Negacion
			if (!usuario.equalsIgnoreCase(usuarioCorrecto))
				System.out.println("El usuario ingresado es incorrecto");
			
			if (!clave.equals(claveCorrecta))
				System.out.println("La clave es incorrecta");
		}
		*/
		/*
		else if (!usuario.equalsIgnoreCase(usuarioCorrecto) && clave.equals(claveCorrecta)) {
			System.out.println("El usuario ingresado es incorrecto");
		}
		else if (!clave.equals(claveCorrecta) && usuario.equalsIgnoreCase(usuarioCorrecto)) {
			System.out.println("La clave es incorrecta");
		}
		else {
			System.out.println("La clave es incorrecta");
			System.out.println("El usuario ingresado es incorrecto");
		}
		*/
		
		
		if ( (!usuario.equals(usuarioCorrecto)) &&  (!clave.equals(claveCorrecta) || usuario.equals("Lucas"))) {
			System.out.println("Las credenciales son incorrectas");
		}
		else 
			System.out.println("Credenciales correctas");
	}
}
