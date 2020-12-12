package practica03;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		//Variables
		int N, sum_pares, sum_impares;
		Scanner sc = new Scanner(System.in);

		//Lectura de datos
		System.out.println("Ingrese el valor de N (número natural):");
		N = sc.nextInt();

		//Proceso
		sum_pares = 0;
		sum_impares = 0;
		for (int i = 1; i <= N; i++) {
			if (i % 2 == 0)
				sum_pares += i;
			else
				sum_impares += i;
		}

		//Reporte
		System.out.println("\nREPORTE: ");
		System.out.println("La suma de los números pares hasta   N = " + N + " es: " + sum_pares);
		System.out.println("La suma de los números impares hasta N = " + N + " es: " + sum_impares);
		
	}

}
