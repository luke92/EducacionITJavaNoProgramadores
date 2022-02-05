
public class Vectores {

	public static void main(String[] args) {
		//Una manera de declarar el array
		int[] numeros = {10,20,30};
		
		int[] numerosSinValor = new int[2];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		for (int i = 0; i < numerosSinValor.length; i++) {
			numerosSinValor[i] = i+1;
			System.out.println(numerosSinValor[i]);
		}
		
		int suma = 0;
		int[] losValores = {20,10,30};
		for (int i = 0; i < losValores.length; i++)
		{
			suma+= losValores[i];
		}
		System.out.println(suma);
	}

}
