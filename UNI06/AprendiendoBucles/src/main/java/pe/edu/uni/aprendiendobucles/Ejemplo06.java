package pe.edu.uni.aprendiendobucles;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Ejemplo06 {

	public static void main(String[] args) {
		// Variables
		int n;
		long f;
		// Datos
		n = 5;
		// Proceso
		f = 1;
		for (int k = n; k > 1; k--) {
			f *= k; // f = f * k
		}
		// Reporte
		System.out.println("n: " + n);
		System.out.println("Factorial: " + f);
	}

}
