package pe.edu.uni.aprendiendojava;

import java.util.Scanner;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Ejercicio02B {

	public static void main(String[] args) {
		// Variables
		int numero;
		Scanner sc = new Scanner(System.in);
		String repo;
		// Lectura
		System.out.println("Ingrese el numero: ");
		numero = sc.nextInt();
		// Proceso
		repo = "El nímero " + numero + " es par.";
		if (numero % 2 != 0) {
			repo = "El nímero " + numero + " es impar.";
		}
		// Reporte
		System.out.println(repo);
	}

}
