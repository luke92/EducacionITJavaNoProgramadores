import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int suma = 0;
		for (int n = 1; n <= 10; n++){
			 if (n % 2 == 1){
				suma = suma + n;
			 }
		 }
		 System.out.println("La suma de los impares de 1 al 10 es: " + suma);
	}

}