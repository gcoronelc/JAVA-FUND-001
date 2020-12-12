package practica02;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		//Variables
		double precioCompra, precioVenta, ganancia, porcentaje;
		String reporte;
		Scanner sc = new Scanner(System.in);

		//Lectura de datos
		System.out.println("Ingrese el precio de costo del producto: ");
		precioCompra = sc.nextDouble();
		System.out.println("Ingrese el precio de venta del producto: ");
		precioVenta = sc.nextDouble();

		//Proceso
		ganancia = precioVenta - precioCompra;
		porcentaje = 100 * ganancia / precioCompra;

		reporte = "barato.";
		if (porcentaje > 50) {
			reporte = "caro.";
		}

		//Reporte
		System.out.println("Este producto es " + reporte);
	}

}
