package practica03;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		//Variables
		int n, producto;
		String reporte;
		Scanner sc = new Scanner(System.in);

		//Lectura de datos
		System.out.println("Ingrese un número:");
		n = sc.nextInt();

		//Proceso
		reporte = "";

		for (int m = 1; m <= 12; m++) {
			producto = n * m;
			reporte += String.format("%2d",m) + " x " + n + " = " + producto + "\n";
		}

		//Reporte
		System.out.println("\nTABLA DE MULTIPLICAR DEL " + n);
		System.out.println("-----------------");
		System.out.println(reporte);
		System.out.println("-------Fin-------");

	}

}
