package practica02;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		//Variables
		double peso, distancia, costoKm, importe;
		Scanner sc = new Scanner(System.in);

		//Lectura de datos
		System.out.println("Ingrese el peso del paquete, en kg: ");
		peso = sc.nextDouble();
		System.out.println("Ingrese la distancia, en km, hasta el punto de reparto: ");
		distancia = sc.nextDouble();
		
		//Proceso
		costoKm = 8;
		if (5 <= peso && peso < 10)
			costoKm = 6;
		if (10 <= peso)
			costoKm = 4;
		
		importe = distancia * costoKm;
		
		//Reporte
		System.out.println("\nREPORTE");
		System.out.println("============================");
		System.out.println("Costo por kilómetro: S/" + costoKm);
		System.out.println("Importe del envío: S/" + importe);
	}

}
