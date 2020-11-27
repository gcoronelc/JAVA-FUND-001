package pe.edu.uni.aprendiendojava;

import java.util.Scanner;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Ejercicio03 {

	public static void main(String[] args) {

		//Variables
		int num1, num2;
		String reporte;
		Scanner sc = new Scanner(System.in);

		//Lectura de datos
		System.out.println("Ingrese el primer numero");
		num1 = sc.nextInt();
		System.out.println("Ingrese el segundo numero");
		num2 = sc.nextInt();

		//Proceso
		reporte = "Los números son iguales.";
		if (num1 > num2) {
			reporte = "El número mayor es " + num1 + ".";
		}
		if (num1 < num2) {
			reporte = "El número mayor es " + num2 + ".";
		}
		
		//Reporte
		System.out.println(reporte);
		
	}

}
