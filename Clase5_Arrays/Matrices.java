
public class Matrices {

	public static void main(String[] args) {
		//matriz 3 x 3 -> 3 filas
		/*
		X  		X  X --> fila
		O  		O  O
		X  		X  X
		
		columna
		*/
		
		int filas = 3;
		int columnas = 4;
		
		//MATRIZ 2D
		int[][] matrizNumeros = new int[filas][columnas];
		
		for(int fila = 0; fila < filas; fila++) {
			
			for (int columna = 0; columna < columnas; columna++) {
				
				matrizNumeros[fila][columna] = fila + columna;
				
				System.out.print(matrizNumeros[fila][columna]);
				System.out.print(" ");
			}
			
			System.out.println();
		}
		
	}

}
