package pe.edu.uni.aprendiendojava;

import java.util.Scanner;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Ejercicio01B {

    public static void main(String[] args) {
			
			// Variables
			double precioUnitario, descuentoUnitario, importe, descuento, total;
			int cantidad;
			Scanner scanner = new Scanner(System.in);
			
			// Lectura de datos
			System.out.println("Precio Unitario: ");
			precioUnitario = scanner.nextDouble();
			System.out.println("Descuento Unitario: ");
			descuentoUnitario = scanner.nextDouble();
			System.out.println("Cantidad: ");
			cantidad = scanner.nextInt();
			
			// Proceso
			importe = precioUnitario * cantidad;
			descuento = 0.0;
			if( cantidad >= 6 ){
				descuento = descuentoUnitario * cantidad;
			}
			total = importe - descuento;
			
			// Reporte o salida
			System.out.println("\n\n");
			System.out.println("REPORTE");
			System.out.println("==========================");
			System.out.println("Precio x Inidad: " + precioUnitario);
			System.out.println("Descuento x Unidad: " + descuentoUnitario);
			System.out.println("Cantidad: " + cantidad);
			System.out.println("Importe: " + importe);
			System.out.println("Descuento: " + descuento);
			System.out.println("Total: " + total);
        
    }

}
