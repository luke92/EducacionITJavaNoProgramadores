import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int filas = 3;
		char[][] matrizTateti = inicializarMatriz(filas, filas);
		
		boolean continuaJuego = true;
		int fila = -1;
		int columna = -1;
		String valor = "";
		boolean esJugador1 = true;
		
		while(continuaJuego) {
			mostrarMatriz(filas, filas, matrizTateti);
			
			boolean posicionValida = false;
			do {
				System.out.println("Ingrese la fila");
				fila = ingresarPosicion();
				System.out.println("Ingrese la columna");
				columna = ingresarPosicion();
				posicionValida = estaVaciaPosicion(fila, columna, matrizTateti);
			} while (!posicionValida);
			
			//JUGADOR 1
			valor = ingresarValor(esJugador1);
			guardarValor(fila, columna, valor, matrizTateti);
			continuaJuego = !hizoTateti(matrizTateti, filas, filas);
			if(!continuaJuego) 
			{
				System.out.println("Gano el jugador " + (esJugador1 ? "1" : "2"));
			}
			
			if (esJugador1) {
				esJugador1 = false;
			}
			else {
				esJugador1 = true;
			}
		}

	}
	
	public static void mostrarMatriz(int filas, int columnas, char[][] matriz ) {
		for(int fila = 0; fila < filas; fila++) {
			
			for (int columna = 0; columna < columnas; columna++) {
				System.out.print(" | ");
				System.out.print(matriz[fila][columna]);
			}
			
			System.out.println();
		}
	}
	
	public static char[][] inicializarMatriz(int filas, int columnas) {
		char[][] matriz = new char[filas][columnas];
		
		for(int fila = 0; fila < filas; fila++) {
			for (int columna = 0; columna < columnas; columna++) {
				matriz[fila][columna] = ' ';
			}
		}
		
		return matriz;
	}
	
	// INTERFAZ DE USUARIO
	
	public static boolean esValidoValor(String valor, boolean esJugador1) {
		char caracter = valor.charAt(0);
		
		if (esJugador1) {
			return  caracter == 'X';
		}
		
		return caracter == 'O';
	}
	
	public static void guardarValor(int fila, int columna, String valor, char[][] matriz) {
		matriz[fila][columna] = valor.charAt(0);
	}
	
	public static boolean estaVaciaPosicion(int fila, int columna, char[][] matriz) {
		return matriz[fila][columna] == ' ';
	}
	
	public static String ingresarValor(boolean esJugador1) {
		Scanner scanner = new Scanner(System.in);
		String valor = "";
		do {
			System.out.println("Ingrese el valor");
			valor = scanner.nextLine();
		}while (!esValidoValor(valor, esJugador1));
		return valor;
	}
	
	public static int ingresarPosicion() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
	
	public static boolean hizoTateti(char[][] matriz, int filas, int columnas) {
		
		char caracterX = 'X';		
		char caracterO = 'O';
		char caracterVacio = ' ';
		
		
		for(int fila = 0; fila < filas; fila++) {
			for (int columna = 0; columna < columnas; columna++) {
				if (fila == 0 && columna == 0) {
					if(matriz[fila][columna] != caracterVacio) {
						char caracter = matriz[fila][columna];
						
						//Horizontal
						if(matriz[0][1] == caracter && matriz[0][2] == caracter)
							return true;
						
						//Diagonal
						if(matriz[1][1] == caracter && matriz[2][2] == caracter)
							return true;
						
						//Vertical
						if(matriz[1][0] == caracter && matriz[2][0] == caracter)
							return true;
					}
					
				}
				
				if (fila == 0 && columna == 1) {
					if(matriz[fila][columna] != caracterVacio) {
						char caracter = matriz[fila][columna];
						
						//Horizontal
						if(matriz[0][0] == caracter && matriz[0][2] == caracter)
							return true;
						
						//Vertical
						if(matriz[1][1] == caracter && matriz[2][1] == caracter)
							return true;
					}
					
				}
				
				if (fila == 0 && columna == 2) {
					if(matriz[fila][columna] != caracterVacio) {
						char caracter = matriz[fila][columna];
						
						//Horizontal
						if(matriz[0][0] == caracter && matriz[0][1] == caracter)
							return true;
						
						//Diagonal
						if(matriz[1][1] == caracter && matriz[2][0] == caracter)
							return true;
						
						//Vertical
						if(matriz[1][2] == caracter && matriz[2][2] == caracter)
							return true;
					}
					
				}
			}
		}
		
		return false;
	}

}
