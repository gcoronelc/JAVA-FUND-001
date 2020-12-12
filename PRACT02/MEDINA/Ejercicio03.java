package practica02;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		//Variables
		double precio, importeBruto, descuento, importeNeto;
		int cantidad;
		Scanner sc = new Scanner(System.in);

		//Lectura de datos
		System.out.println("Ingrese el precio unitario del producto: ");
		precio = sc.nextDouble();
		System.out.println("Ingrese la cantidad del producto: ");
		cantidad = sc.nextInt();
		
		//Proceso
		importeBruto = precio * cantidad;
		
		descuento = 0.00;
		if (12 <= cantidad && cantidad < 24)
			descuento = 0.05;
		if (24 <= cantidad && cantidad < 36)
			descuento = 0.10;
		if (36 <= cantidad)
			descuento = 0.15;
		
		importeNeto = importeBruto * (1 - descuento);
		
		//Reporte
		System.out.println("\nREPORTE");
		System.out.println("============================");
		System.out.println("Precio unitario: S/" + precio);
		System.out.println("Cantidad: " + cantidad);
		System.out.println("Descuento: " + descuento*100 + " %");
		System.out.println("Importe de la venta: S/" + importeNeto);
	}

}
