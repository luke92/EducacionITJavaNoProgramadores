
public class ClaseIf {

	public static void main(String[] args) {
		
		int numero = 5;
		boolean esPositivo = false;
		
		//SI EL NUMERO ES POSITIVO ENTONCES MUESTRO POR PANTALLA QUE ESE NUMERO ES POSITIVO
		if (numero > 0)
			esPositivo = true;
		
		esPositivo = numero > 0 ? true : false;
		
		System.out.println("A");
		int n1=20;
		int n2=10;
		int n3= (n1>n2) ? n1 : 0;
		System.out.println(n3);
		
		System.out.println("B");
		n3=(n1<n2)? n1 : n2;
		System.out.println(n3);
		
		System.out.println("C");
		n3=(n1==n2)? n1 : n2;
		System.out.println(n3);
		
		//ES DISTINTO o NO ES IGUAL
		//!=
		System.out.println("D");
		n3=(n1!=n2)? n1:0;
		System.out.println(n3);
		
		
	}

}
