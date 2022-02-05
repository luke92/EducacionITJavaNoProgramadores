
public class VectoresPromedio {

	public static void main(String[] args) {
		
		int[] vector = {50, 20, 30, 10, 20, 10};
		int total = 0;
		for(int i = 0; i < vector.length; i++) {
			total += vector[i];
		}
		System.out.println("La suma total es: "+total);
		System.out.println("El promedio es: " + total / vector.length);

	}

}
