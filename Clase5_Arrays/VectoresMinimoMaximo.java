
public class VectoresMinimoMaximo {

	public static void main(String[] args) {
		
		int[] vectorNumeros = {30, 20, 35, 40, 36};
		
		int maximo=vectorNumeros[0],minimo=vectorNumeros[0];
		
		// si solo voy calcular el maximo y minimo puedo recorrer desde 1
		for (int i = 1; i < vectorNumeros.length ; i++) {
			
			if (vectorNumeros[i] > maximo) {
				maximo = vectorNumeros[i];
			}
				
			if (vectorNumeros[i] < minimo)
				minimo = vectorNumeros[i];
		
		}
		
		System.out.println("El maximo es : "+maximo);
		System.out.println("El minimo es : "+minimo);

	}

}
