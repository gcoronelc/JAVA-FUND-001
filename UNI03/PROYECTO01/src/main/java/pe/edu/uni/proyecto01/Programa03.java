package pe.edu.uni.proyecto01;

import java.util.Scanner;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Programa03 {

    public static void main(String[] args) {
			// Variables
			int numero1, numero2, suma, producto;
			Scanner scanner = new Scanner(System.in);
			// Lectura de datos
			System.out.println("Número 1:");
			numero1 = scanner.nextInt();
			System.out.println("Número 2:");
			numero2 = scanner.nextInt();
			// Proceso
			suma = numero1 + numero2;
			producto = numero1 * numero2;
			// Reporte
      System.out.println("Suma: " + suma);
      System.out.println("Producto: " + producto);
    }

}
