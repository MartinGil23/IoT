package unidad2;

import java.util.Scanner;

public class MenorYMayor {
	public static void main(String[]args) {
		try (Scanner entrada= new Scanner(System.in)){
		
		System.out.print("Escribir 1er numero entero:");
		int num1 = entrada.nextInt();
		
		System.out.print("Escribir 2do numero entero:");
		int num2 = entrada.nextInt();
		
		System.out.print("Escribir 3er numero entero:");
		int num3 = entrada.nextInt();
		
		int suma = num1 + num2 + num3;
		int promedio = suma/3;
		int producto = num1 * num2 * num3;
		int menor = Math.min(Math.min(num1, num2),num3);
		int mayor = Math.max(Math.max(num1, num2),num3);
		
		System.out.println("La suma es:"+ suma);
		System.out.println("El promedio es:"+ promedio);
		System.out.println("El producto es:"+ producto);
		System.out.println("El numero mayor es:"+ mayor);
		System.out.println("El numero menor es:"+ menor);
		
		}
	}
}