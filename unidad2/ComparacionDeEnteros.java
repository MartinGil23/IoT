package unidad2;

import java.util.Scanner;

public class ComparacionDeEnteros {

	public static void main(String[] args) {		
				try (Scanner entrada= new Scanner(System.in)){
					int num1;
					int num2;
					
					System.out.print("Introduzca el primer numero: ");
					num1 = entrada.nextInt();
					
					System.out.print("Introduzca el segundo numero ");
					num2 = entrada.nextInt();
									
					if(num1>num2){
						System.out.println("El numero mayor es: " +num1);
					}
					
					else if(num2>num1){
						System.out.println("El numero mayor es: " +num2);
					}
					
					else if(num2==num1){
						System.out.println("Estos numeros son iguales");
					}
				}
			}
}