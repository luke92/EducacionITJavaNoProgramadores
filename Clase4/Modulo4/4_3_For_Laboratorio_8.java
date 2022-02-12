import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		for (int n = 1; n <= 4; n++){
			if (n % 2 == 1)
				System.out.println("@");
			else
				System.out.println("@@");
		}
	}

}