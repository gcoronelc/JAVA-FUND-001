package pe.edu.uni.aprendiendobucles;

import java.util.Scanner;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Ejemplo02 {

	public static void main(String[] args) {
		// Variables
		int m, n;
		String resultado;
		Scanner scanner = new Scanner(System.in);
		// Lectura
		System.out.println("Valor de M: ");
		m = scanner.nextInt();
		System.out.println("Valor de N: ");
		n = scanner.nextInt();
		// Proceso
		resultado = "";
		while (m <= n) {
			if (m % 2 == 0) {
				resultado += m + "\t";
			}
			m++;
		}
		// Reporte
		System.out.println("REPORTE");
		System.out.println(resultado);
	}

}
