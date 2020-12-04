package pe.edu.uni.aprendiendobucles;

import java.util.Random;
import pe.edu.uni.aprendiendobucles.service.LogicaNegocio;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Ejemplo082 {

	public static void main(String[] args) {
		// Variables
		int arreglo[];
		int suma;
		Random random = new Random();
		// Datos
		arreglo = LogicaNegocio.generaArreglo(6);
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
