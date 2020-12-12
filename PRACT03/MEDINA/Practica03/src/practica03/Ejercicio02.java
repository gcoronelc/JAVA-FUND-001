package practica03;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		//Variables
		int numero;
		String hexadecimal;
		Scanner sc = new Scanner(System.in);

		//Lectura de datos
		System.out.println("Ingrese un número en base decimal:");
		numero = sc.nextInt();

		//Proceso
		hexadecimal = convertirHexadecimal(numero);
		
		//Reporte
		System.out.println("\nEl número en base hexadecimal es:");
		System.out.println(hexadecimal);
		System.out.println("------Fin------");
		
	}

	private static String convertirHexadecimal(int n) {
		char cifras[] = {'0', '1', '2', '3', '4', '5', '6', '7',
			'8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		
		int residuo;
		String cadenaResiduos = "";
		while (n > 0) {
			residuo = n % 16;
			cadenaResiduos = cifras[residuo] + cadenaResiduos;
			n = n / 16;
		}

		return cadenaResiduos;
	}

}
