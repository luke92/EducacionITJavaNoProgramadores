import java.util.Arrays;
import java.util.Collections;

public class OrdenarDescendentemente {

	public static void main(String[] args) {
		// Notar que tenemos que usar "Integer" en vez de
        // "int[]" ya que "Collections.reverseOrder()"
        // no funciona en tipos primitivos
        Integer[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };
  
        // Ordenamos arr[] en forma descendente usando
        // reverseOrder() metodo de la clase Collections
        // en Array.sort() como argumento
        Arrays.sort(arr, Collections.reverseOrder());
  
        // Imprimimos el resultado
        System.out.println("Modificado arr[] : " + Arrays.toString(arr));

	}

}
