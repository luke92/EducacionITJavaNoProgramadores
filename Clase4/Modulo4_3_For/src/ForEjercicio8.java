
public class ForEjercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Imprimir la siguiente figura:
			@
			@@
			@
			@@
			@
		 */
		
		for (int i = 1; i <= 5; i++) {
			
			System.out.print("@");
			
			if (i % 2 == 0) {
				System.out.print("@");
			}
			
			System.out.println();
			
		}
	}

}
