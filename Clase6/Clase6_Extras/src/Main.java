import java.awt.Color;

import org.fusesource.jansi.AnsiConsole;

public class Main {
	
	public static void main(String[] args) {
		AnsiConsole.systemInstall();
		//Correr aplicacion
		//java -jar <path>\filename.jar
		System.out.println("\033[36mThis is cyan\033[0m");
		System.out.println(ConsoleColors.GREEN_BACKGROUND + "This text has a green background but default text!" + ConsoleColors.RESET);
		System.out.println(ConsoleColors.RED + "This text has red text but a default background!" + ConsoleColors.RESET);
		System.out.println(ConsoleColors.GREEN_BACKGROUND + ConsoleColors.RED + "This text has a green background and red text!" + ConsoleColors.RESET);
		
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}

}
