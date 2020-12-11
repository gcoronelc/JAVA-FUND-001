package pe.edu.uni.aprendiendoarreglos;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class EjemploMediana {

	public static void main(String[] args) {

		int n = 6;
		int lista[] = new int[n]; // Lista original
		int lista2[] = null; // Lista ordenada
		Random random = new Random();
		
		// Generar Lista
		for (int k = 0; k < n; k++) {
			lista[k] = random.nextInt(100) + 1;
		}
		lista2 = lista.clone();
		
		// Ordenar Lista - Metodo Burbuja
		for (int i = 0; i < (n - 1); i++) {
			for (int j = i + 1; j < n; j++) {
				if (lista[i] > lista[j]) {
					int temp = lista[i];
					lista[i] = lista[j];
					lista[j] = temp;
				}
			}
		}
		
		// Obtener la Mediana
		int p = n / 2;
		float mediana;
		if (n % 2 == 0) {
			mediana = (float) (lista[p] + lista[p - 1]) / 2;
		} else {
			mediana = lista[p];
		}
		
		// Imprimir lista ordenada

		System.out.println("Lista Generada \t Lista Ordenada");
		for (int k = 0; k < n; k++) {
			System.out.println("\t" + lista2[k] + "\t\t" + lista[k]);
		}
		
		// Imprimir mediana
		System.out.println("Mediana: " + mediana);
		System.out.println("----- Fin -----");
		
	}

}
