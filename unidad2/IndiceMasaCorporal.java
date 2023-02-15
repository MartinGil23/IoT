package unidad2;

import java.util.Scanner;

public class IndiceMasaCorporal {

public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)){
			
			System.out.print("Peso en Kg: ");
			double peso = input.nextDouble();
			
			System.out.print("Altura en Metros: ");
			double altura = input.nextDouble();
			
			double bmi = peso/(altura*altura);
			System.out.println("Su masa corporal es: "+ bmi);
			
			if (bmi > 30) {
				System.out.println("Obesidad");
			}
			else if (bmi < 30 &&bmi > 25){
				System.out.println("Sobre peso");
			}
			else if (bmi < 25 &&bmi > 18.5){
				System.out.println("Peso normal");
			}
			else if (bmi <= 18.5) {
				System.out.println("Bajo peso");
			}
		}
		
		System.out.println(" ");
		System.out.println("Valores del BMI");
		System.out.println("Bajo peso: menos de 18.5");
		System.out.println("Normal: entre 18.5 y 24.9");
		System.out.println("Sobrepeso: entre 25 y 29.9");
		System.out.println("Obeso: 30 o mas");

	}
}