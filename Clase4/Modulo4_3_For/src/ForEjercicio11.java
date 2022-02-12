
public class ForEjercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		 * Imprimir la siguiente figura:
@
@@
@@@
@@@@
@@@
@@
@
		 */
		
		int minimoArrobas = 1;
		int maximoArrobas = 4;
		int incrementoArrobas = 1;
		
		for(int i = minimoArrobas; i <= maximoArrobas; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		
		for (int i = maximoArrobas - 1; i >= minimoArrobas; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
		
	}

}
