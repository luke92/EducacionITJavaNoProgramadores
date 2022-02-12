
public class ForEjercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Mostrar la resta de la multiplicación de los números
			del 1 al 5 con la suma de los números del 1 al 5. Por
			ejemplo, sería (1*2*3*4*5) - (1+2+3+4+5)
		 */
		
		int resultadoResta = 0;
		int resultadoMultiplicacion = 1;
		int resultadoSuma = 0;
		
		for (int i = 1; i <= 5; i++) {
			
			resultadoSuma+= i;
			resultadoMultiplicacion *= i;
		}
		
		resultadoResta = resultadoMultiplicacion - resultadoSuma;
		
		System.out.println("Resultado de la multiplicacion :" + resultadoMultiplicacion);
		System.out.println("Resultado de la suma :" + resultadoSuma);
		System.out.println("Resultado de la resta :" + resultadoResta);

	}

}
