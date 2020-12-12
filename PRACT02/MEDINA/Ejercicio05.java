package practica02;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		//Variables
		double horas, pagoHora, pagoNormal, pagoExtra;
		double sueldoBruto, impuesto, sueldoNeto;
		Scanner sc = new Scanner(System.in);

		//Lectura de datos
		System.out.println("Ingrese el número de horas trabajadas: ");
		horas = sc.nextDouble();
		System.out.println("Ingrese el pago por hora del trabajador: ");
		pagoHora = sc.nextDouble();

		//Proceso
		pagoNormal = horas * pagoHora;
		pagoExtra = 0.0;
		if (horas > 40) {
			pagoNormal = 40 * pagoHora;
			pagoExtra = (horas - 40) * pagoHora * (1 + 0.5);
		}
		sueldoBruto = pagoNormal + pagoExtra;

		impuesto = 0.0;
		if (sueldoBruto > 2000)
			impuesto = 0.08 * sueldoBruto;
		
		sueldoNeto = sueldoBruto - impuesto;

		//Reporte
		System.out.println("\nREPORTE DE SUELDO");
		System.out.println("============================");
		System.out.println("Pago por horas normales: S/" + pagoNormal);
		System.out.println("Pago por horas extra:    S/" + pagoExtra);
		System.out.println("Sueldo sin descuentos:   S/" + sueldoBruto);
		System.out.println("Impuesto a la renta:     S/" + impuesto);
		System.out.println("Sueldo neto:             S/" + sueldoNeto);
	}

}
