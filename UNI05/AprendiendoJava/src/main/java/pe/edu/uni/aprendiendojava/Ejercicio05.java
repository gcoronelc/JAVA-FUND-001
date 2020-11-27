package pe.edu.uni.aprendiendojava;

import java.util.Scanner;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Ejercicio05 {

	public static void main(String[] args) {
		
		//Variables
		double num1, num2, resultado;
		char operador;
		Scanner sc = new Scanner(System.in);

		//Lectura de datos
		System.out.println("Ingrese el primer número:");
		num1 = sc.nextDouble();
		System.out.println("Ingrese el segundo número:");
		num2 = sc.nextDouble();
		System.out.println("Ingrese una operación aritmética");
		operador = sc.next().charAt(0);
		
		//Proceso
		switch (operador) {
			case '+':
				resultado = num1 + num2;
				break;
			case '-':
				resultado = num1 - num2;
				break;
			case '*':
				resultado = num1 * num2;
				break;
			case '/':
				resultado = num1 / num2;
				break;
			default:
				System.out.println("ERROR: No ingresó un operador aritmético");
				resultado = 0;

		}
		
		//Reporte
		System.out.println("RESULTADO: " + num1 + " " + operador + " " + num2 + " = " + resultado);
	}

}
