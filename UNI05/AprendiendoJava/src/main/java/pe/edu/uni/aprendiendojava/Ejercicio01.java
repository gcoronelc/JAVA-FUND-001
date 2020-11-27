package pe.edu.uni.aprendiendojava;

import java.util.Scanner;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Ejercicio01 {

    public static void main(String[] args) {
			
			// Variables
			double precio, descuento, importe, dctoAplicar;
			int cantidad;
			Scanner scanner = new Scanner(System.in);
			
			// Lectura de datos
			System.out.println("Precio: ");
			precio = scanner.nextDouble();
			System.out.println("Descuento: ");
			descuento = scanner.nextDouble();
			System.out.println("Cantidad: ");
			cantidad = scanner.nextInt();
			
			// Proceso
			dctoAplicar = 0.0; // Punto de partida
			if( cantidad >= 6 ){
				dctoAplicar = descuento;
			}
			importe = (precio - dctoAplicar) * cantidad;
			
			// Reporte o salida
			System.out.println("\n\n");
			System.out.println("REPORTE");
			System.out.println("==========================");
			System.out.println("Precio: " + precio);
			System.out.println("Descuento: " + dctoAplicar);
			System.out.println("Cantidad: " + cantidad);
			System.out.println("Importe: " + importe);
        
    }

}
