package practica02;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		//Variables
		double puntaje;
		String sitSis = "No ingresó";
		String sitElec = "No ingresó";
		String sitInd = "No ingresó";
		String sitMec = "No ingresó";
		Scanner sc = new Scanner(System.in);

		//Lectura de datos
		System.out.println("Ingrese el puntaje obtenido: ");
		puntaje = sc.nextDouble();

		//Proceso
		if (puntaje >= 80) 
			sitSis = "Sí ingresó";
		if (puntaje >= 70) 
			sitElec = "Sí ingresó";
		if (puntaje >= 60) 
			sitInd = "Sí ingresó";
		if (puntaje >= 50) 
			sitMec = "Sí ingresó";
		
		//Reporte
		System.out.println("\nSITUACIÓN DEL POSTULANTE:");
		System.out.println("=============================");
		System.out.println("Sistemas:    " + sitSis);
		System.out.println("Electrónica: " + sitElec);
		System.out.println("Industrial:  " + sitInd);
		System.out.println("Mecánica:    " + sitMec);

	}

}
