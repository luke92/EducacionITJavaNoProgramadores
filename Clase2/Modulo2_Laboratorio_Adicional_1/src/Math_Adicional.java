import java.util.Scanner;
import java.util.Random;

public class Math_Adicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		int randomInt = random.nextInt(25) + 97;
		
		
		
		System.out.println("Color Rojo");
		
		System.out.println(randomInt);
		
		System.out.println((char)randomInt);

		System.out.println("Color Verde");
		
		randomInt = random.nextInt(255);
		
		System.out.println(randomInt);
		
		System.out.println("Color Azul");
		
		randomInt = random.nextInt(255);
		
		System.out.println(randomInt);
		
	}

}
