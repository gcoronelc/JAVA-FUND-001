package pe.edu.uni.aprendiendobucles;

import java.util.Random;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Ejemplo081 {

	public static void main(String[] args) {
		// Variables
		int arreglo[];
		int suma;
		Random random = new Random();
		// Datos
		arreglo = new int[5]; // Creación del arreglo
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = random.nextInt(100) + 1;
		}
		// Proceso
		suma = 0;
		for (int dato : arreglo) {
			suma += dato;
		}
		// Reporte
		for (int dato : arreglo) {
			System.out.println("Dato: " + dato);
		}
		System.out.println("Suma => " + suma);
	}

}
