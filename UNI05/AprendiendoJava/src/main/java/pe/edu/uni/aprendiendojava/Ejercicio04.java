package pe.edu.uni.aprendiendojava;

import java.util.Scanner;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Ejercicio04 {

	public static void main(String args[]) {

		// Variables
		int nota;
		Scanner entrada = new Scanner(System.in);
		String repo;
		// Lectura
		System.out.println("nota: ");
		nota = entrada.nextInt();
		// Proceso
		repo = "Nota fuera de rango.";
		if (nota >= 0 && nota <= 5) {
			repo = "Nota pesima";
		}
		if (nota > 5 && nota <= 11) {
			repo = "Nota baja";
		}
		if (nota > 11 && nota <= 15) {
			repo = "Nota regular";
		}

		// Reporte
		System.out.println(repo);
		
	}

}
