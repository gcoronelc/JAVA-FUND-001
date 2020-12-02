package pe.edu.uni.aprendiendobucles;

import java.util.Scanner;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Ejemplo03 {

	public static void main(String[] args) {
		// Variables
		// -------------------------------------------------
		int mes, dia;
		int dt = 0; // Acumulador de dias transcurridos
		int k = 1; // Contador
		int ids = 0; // Dia de la semana
		String sds = ""; // Nombre del dia de la semana
		Scanner scanner = new Scanner(System.in);
		// Lectura
		// ------------------------------------------------------
		System.out.println("Mes: ");
		mes = scanner.nextInt();
		dia = scanner.nextInt();
		// Proceso
		// --------------------------------------------------------
		// Acumula todos lo dias
		while (k < mes) {
			switch (k) {
				case 1, 3, 5, 7, 8, 10, 12 -> dt += 31;
				case 4, 6, 9, 11 -> dt += 30;
				case 2 -> dt += 28;
			}
			k++;
		}
		dt += dia; // días del mes que ha ingresado
		// Dia de la semana
		ids = dt % 7; // Dia de la semana
		switch (ids) {
			case 0 -> sds = "Viernes";
			case 1 -> sds = "Sabado";
			case 2 -> sds = "Domingo";
			case 3 -> sds = "Lunes";
			case 4 -> sds = "Martes";
			case 5 -> sds = "Miercoles";
			case 6 -> sds = "Jueves";
		}
		// Reporte
		// ------------------------------------------------
		System.out.println("Dias transcurridos: " + dt);
		System.out.println("Dia de la semana: " + sds);
	}

}
