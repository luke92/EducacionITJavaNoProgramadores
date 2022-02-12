
public class Funciones {

	public static void main(String[] args) {
		
		double ivaProducto = obtenerIVA(100);
		System.out.println(ivaProducto);
		double ivaProducto2 = obtenerIVA(0.10, 100);
		System.out.println(ivaProducto2);
		
		String mensaje = "El numero es ";
		System.out.println(mensaje + (esPar(3) ? "Par" : "Impar"));
		
	}
	
	public static double obtenerIVA(int valor) {
		return obtenerIVA(0.21, valor);		
	}
	
	public static double obtenerIVA(double porcentaje, int valor) {
		return valor * porcentaje;
	}
	
	public static boolean esPar(int numero) {
		return numero % 2 == 0;
	}

}
