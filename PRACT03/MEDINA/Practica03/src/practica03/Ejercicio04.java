package practica03;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		//Variables
		int importe;
		String reporte;
		Scanner sc = new Scanner(System.in);

		//Lectura de datos
		System.out.println("Ingrese el importe en soles:");
		importe = sc.nextInt();

		//Proceso
		reporte = descomposicionMonetaria(importe);

		//Reporte
		System.out.println("\nREPORTE:");
		System.out.println(reporte);
	}

	private static String descomposicionMonetaria(int N) {
		int valoresBil[] = {200, 100, 50, 20, 10, 5, 2, 1};
		int cantidadBil[] = new int[8];
		
		for (int i = 0; i < 8; i++) {
			cantidadBil[i] = N / valoresBil[i];
			N = N % valoresBil[i];
		}

		String reporte = "";
		for (int i = 0; i < 8; i++) {
			if (cantidadBil[i] == 0) {
				continue;
			}
			if (valoresBil[i] >= 10) 
				reporte += "Billetes de " + valoresBil[i] + " : " + cantidadBil[i] + "\n";
			else 
				reporte += "Monedas de   " + valoresBil[i] + " : " + cantidadBil[i] + "\n";
		}
		return reporte;
	}

}
