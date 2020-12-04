package pe.edu.uni.aprendiendobucles;

import pe.edu.uni.aprendiendobucles.service.LogicaNegocio;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Ejemplo061 {

	public static void main(String[] args) {
		// Variables
		int n;
		long f;
		// Datos
		n = 6;
		// Proceso
		f = LogicaNegocio.factorial(n);
		// Reporte
		System.out.println("n: " + n);
		System.out.println("Factorial: " + f);
	}



}
