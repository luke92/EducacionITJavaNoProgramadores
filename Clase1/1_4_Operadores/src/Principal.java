public class Principal {

	public static void main(String[] args) {

                /**
                * Operadores Aritméticos
                * (+) Suma numero1 + numero2 
                * (-) Resta numero1 - numero2 
                * (*) Multiplicación numero1 * numero2 
                * (/) División	numero1 / numero2
                * (%) Módulo o Resto numero1 % numero2
                */

                System.out.println("---------Aritméticos---------");
                //int numero1, numero2, operacion;
                int numero1;
                int numero2;
                int operacion = 0;
                //asignamos valores iniciales a las variables
                numero1 = 5;
                numero2 = 3;
                
                System.out.println("Numero 1 : " + numero1);
                System.out.println("Número 2 : " + numero2);

                
                operacion = numero1 + numero2;
                
                // imprimimos el resultado
                System.out.println("Suma:");
                System.out.println(operacion);

                operacion = numero1 - numero2;
                // imprimimos el resultado
                System.out.println("Resta:");
                System.out.println(operacion);

                operacion = numero1 * numero2;
                // imprimimos el resultado
                System.out.println("Multiplicación:");
                System.out.println(operacion);

                operacion = numero1 / numero2;
                // imprimimos el resultado
                //el resultado en esta operacion devolvera un numero entero ya que operamos con enteros (int)
                System.out.println("División:");
                System.out.println(operacion);

                operacion = numero1 % numero2;
                // imprimimos el resultado
                System.out.println("Resto:");
                System.out.println(operacion);
                /**
                * = Asignación numero1 = numero2
                * += Suma y asignación numero1 += numero2 (numero1=numero1 + numero2)
                * -= Resta y asignación numero1 -= numero2 (numero1=numero1 - numero2)
                * *= Multiplicación y asignación numero1 *= numero2 (numero1=numero1 * numero2)
                * /= División y asignación numero1 / numero2 (numero1=numero1 / numero2)
                * %= Módulo y asignación numero1 % numero2 (numero1=numero1 % numero2)
                */
                System.out.println("---------Asignación---------");
                
                //asignamos valores nuevos a las variables
                numero1 = 60;
                numero2 = 15;
                
                numero1 = numero2;
                System.out.println("Asignación:");
                System.out.println(numero1);

                numero1 += numero2;
                System.out.println("Suma:");
                System.out.println(numero1);

                numero1 -= numero2;
                System.out.println("Resta:");
                System.out.println(numero1);

                numero1 *= numero2;
                System.out.println("Multiplicación:");
                System.out.println(numero1);

                numero1 /= numero2;
                System.out.println("División:");
                System.out.println(numero1);

                numero1 %= numero2;
                System.out.println("Resto:");
                System.out.println(numero1);     
                

                /**
                * Operadores Lógicos
                * (&&) AND op1 && op2
                * (&) AND Inclusivo op1 & op2    
                * (||) OR op1 || op2
                * (|) OR Inclusivo op1 | op2     
                * (!) NOT !op1
                */
                System.out.println("---------Lógicos---------");
                boolean op1, op2;
                //asignamos valores iniciales a las variables

                op1 = true;
                op2 = false;

                //para poder verificar estos operadores los vamos a usar en la consola
                // imprimimos la operacion 
                System.out.println("AND:");
                System.out.println(op1 && op2);

                // imprimimos la operacion 
                System.out.println("OR:");
                System.out.println(op1 || op2);

                // imprimimos la operacion 
                System.out.println("Negacion:");
                System.out.println(!op1);
                System.out.println(!op2);

                // imprimimos la operacion 
                System.out.println("AND Inclusivo:");
                System.out.println(op2 & op1);

                // imprimimos la operacion 
                System.out.println("OR Inclusivo:");
                System.out.println(op2 | op1);
        
                /**
                * Operadores Relacionales (Comparacion)
                * == Igualdad numero1 == numero2 
                * != Distinto numero1 != numero2
                * < Menor que numero1 < numero2
                * > Mayor que numero1 > numero2
                * <= Menor o igual que numero1 <= numero2
                * >= Mayor o igual que numero1 >= numero2
                */
                
                System.out.println("---------Relacionales---------");

                //asignamos valores nuevos a las variables
                numero1 = 45;
                numero2 = 43;
        
                // imprimimos la operacion 
                System.out.println("Igualdad:");
                System.out.println(numero1 == numero2);

                // imprimimos la operacion 
                System.out.println("Distinto:");
                System.out.println(numero1 != numero2);

                // imprimimos la operacion 
                System.out.println("Mayor:");
                System.out.println(numero1 > numero2);

                // imprimimos la operacion 
                System.out.println("Menor:");
                System.out.println(numero1 < numero2);
                
                // imprimimos la operacion 
                System.out.println("Mayor Igual:");
                System.out.println(numero1 >= numero2);

                // imprimimos la operacion 
                System.out.println("Menor Igual:");
                System.out.println(numero1 <= numero2);
                
                
                /*
                * Operadores Incrementales
                * (++) para incrementar de uno en uno
                * (--) para disminuir de uno en uno
                */
                System.out.println("---------Incrementales---------");
                int cantidad = 0;

                cantidad++;
                //cantidad +=1;
                //cantidad = cantidad + 1; 
                // imprimimos la operacion 
                System.out.println("Incremetar:");
                System.out.println(cantidad);
                
                // incrementar y despues usar
                System.out.println("Incremetar y despues usar:");
                System.out.println(++cantidad);
                System.out.println("cantidad = " + cantidad);
                
                // incrementar y despues usar
                System.out.println("Usar y despues incrementar:");
                System.out.println(cantidad++);
                System.out.println("cantidad = " + cantidad);
                
                cantidad--;
                // imprimimos la operacion 
                System.out.println("Disminuir:");
                System.out.println(cantidad);
                
                // decrementar y despues usar
                System.out.println("Disminuir y despues usar:");
                System.out.println(--cantidad);
                System.out.println("cantidad = " + cantidad);
                
                // incrementar y despues usar
                System.out.println("Usar y despues Disminuir:");
                System.out.println(cantidad--);
                System.out.println("cantidad = " + cantidad);
        }

}