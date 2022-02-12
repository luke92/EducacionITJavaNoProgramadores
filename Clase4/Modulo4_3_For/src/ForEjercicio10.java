
public class ForEjercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Imprimir la siguiente figura:
@@@@@
@@@@
@@@
@@
@
 */
		String cadena = "@@@@@";
		for (int i = 0; i < 5; i++) {
			String subCadena = cadena.substring(i);
			System.out.println(subCadena);
		}
		
		for (int i = 1; i <= 5; i++){
			for (int j = 5; j >= i; j--){
				System.out.print("@");
			}
			System.out.println();
		}
	}

}
