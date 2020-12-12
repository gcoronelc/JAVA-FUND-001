package practica03;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		//Variables
		int nota, puntaje, factor, compensacion;
		int limites[] = {0, 5, 12, 17, 20};
		int factores[] = {0, 50, 80, 120, 500};
		String reporte;
		Scanner sc = new Scanner(System.in);

		//Lectura de datos
		System.out.println("Ingrese la nota obtenida:");
		nota = sc.nextInt();

		//Proceso
		reporte = "";
		compensacion = 0;
		int i = 1;
		while (nota > limites[i]) {
			puntaje = limites[i] - limites[i - 1];
			factor = factores[i];
			compensacion += puntaje * factor;
			reporte += puntaje + " * " + factor + " = " + (puntaje * factor) + " +\n";
			i++;
		}

		puntaje = nota - limites[i - 1];
		factor = factores[i];
		compensacion += puntaje * factor;
		reporte += puntaje + " * " + factor + " = " + (puntaje * factor);

		//Reporte
		System.out.println("\nREPORTE");
		System.out.println("-----------------------");
		System.out.println(reporte);
		System.out.println("-----------------------");
		System.out.println("La compensación monetaria correspondiente es:");
		System.out.println("S/ " + compensacion + ".00");
	}

}
