
public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// ejemplo break
		
		int numero = 0;
		
		while(true) {
			
			if (numero != 5) {
				System.out.println("numero :" + numero);
				numero++;
			}
			else {
				numero++;
				continue;
			}
			
			System.out.println("Paso por aca");
			if (numero >= 10) {
				break; 
			}
		}
	}

}
