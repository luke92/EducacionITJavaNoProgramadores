
public class VectoresContarNumero {

	public static void main(String[] args) {
		
		//Contar cuántas veces aparece el número 10
		
		int[] vector = {50, 20, 30, 10, 20, 10};
		
		int contador = 0;
		for(int i = 0; i < vector.length; i++){
			if (vector[i] == 10)
				contador++;
		}
		System.out.println("El numero 10 aparece: " + contador +" veces");

	}

}
