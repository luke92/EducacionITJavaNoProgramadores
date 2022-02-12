import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int multi= 1,suma = 0;
		for (int n = 1; n <= 5; n++){
			multi = multi * n;
			suma = suma + n;
		}
		System.out.println("Resultado:" +(multi - suma));

	}

}