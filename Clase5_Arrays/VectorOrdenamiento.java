import java.util.Arrays;

public class VectorOrdenamiento {

	public static void main(String[] args) {
		int[] vector =  { 12, 7, 6, 25, 11, 100, 80, 70};
		
		Arrays.sort(vector, 2, 7);
		
		System.out.println(Arrays.toString(vector));
		
		Arrays.sort(vector);

	}

}
