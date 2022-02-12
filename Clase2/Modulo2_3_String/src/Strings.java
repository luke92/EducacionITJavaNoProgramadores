
public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre = "Lucas";
		String apellido = "Vargas";
		
		
		System.out.println(nombre.charAt(0));
		
		System.out.println(nombre.concat("Vargas"));
		
		String join = nombre.join(" ", nombre, apellido);
		System.out.println(join);
		
		System.out.println(nombre.contains(" "));
		
		System.out.println(apellido.indexOf("a"));
		
		System.out.println(apellido.lastIndexOf("a"));
		
		System.out.println(" ".isEmpty());
		
		System.out.println(" ".trim().isEmpty());
		
		System.out.println("  Hola  s ".trim());
		
		System.out.println("Hola".toLowerCase());
		System.out.println("Mundo".toUpperCase());
		
		System.out.println("Hola".equalsIgnoreCase("hola"));
		
		System.out.println("anana".replace("a", "e"));
		
		System.out.println("Lucas".substring(2));
		
		System.out.println("Lucas".substring(1,5));
		
		System.out.println("Lucas".length());
		
		System.out.println(nombre.substring(1, nombre.length()-1));
		
		String nombre2 = "Lucas";
		
		System.out.println(nombre == nombre2);
	}

}
