
public class Casteo {
	
	public static void main(String[] args) {
		/*
		 * Casteo Implicito
		 */

		// un byte el elemento numerico mas pequeño en Java
		byte miByte = 37;

		short miShort = miByte;
		
		System.out.println("Short: " + miShort);

		int miInt = miShort;
		
		System.out.println("Int: " + miInt);

		long miLong = miInt;
		
		System.out.println("Long: " + miLong);

		float miFloat = miLong;
		
		System.out.println("Float: " + miFloat);

		double miDouble = miFloat;
		
		System.out.println("Double: " + miDouble);

		// un caracter tambien representa un numero entero ASCII por lo que podemos igualar un numerico a un caracter
		char miChar = 'P';
		
		System.out.println("Char: " + miChar);

		miDouble = miChar;
		
		System.out.println("Double: " + miDouble);

		System.out.println("Casteo Implicito");

		System.out.println(miInt);

		System.out.println(miDouble);

		System.out.println("Casteo Explicito");
		
		/*
		 * Casteo Explicito
		 */

		// un double el elemento numerico mas grande en Java
		double miDouble2 = 2.9856222222222222222222222;
		
		System.out.println("Double: " + miDouble2);

		float miFloat2 = (float) miDouble2;
		
		System.out.println("Float: " + miFloat2);

		long miLong2 = (long) miFloat2;
		
		System.out.println("Long: " + miLong2);

		int miInt2 = (int) miLong2;
		
		System.out.println("Int: " + miInt2);

		short miShort2 = (short) miInt2;
		
		System.out.println("Short: " + miShort2);

		byte miByte2 = (byte) miShort2;
		
		System.out.println("Byte: " + miByte2);

		int valorEnteroA = 65;
		
		char miChar2 = (char) valorEnteroA;
		
		System.out.println("Char: " + miChar2);

		valorEnteroA = valorEnteroA + 32;
		
		char miChar3 = (char) valorEnteroA;
		
		System.out.println("Char: " + miChar3);


		System.out.println(miByte2);

		System.out.println(miChar2);
	}
}
