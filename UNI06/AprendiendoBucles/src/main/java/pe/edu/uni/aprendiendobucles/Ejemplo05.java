package pe.edu.uni.aprendiendobucles;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Ejemplo05 {

	public static void main(String[] args) {
		int n = 8;
		int a, b, k , c;
		String serie;
		// Proceso
		a = 0;
		b = 1;
		c = 0;
		k = 2;
		serie = "0,1";
		do {
			k++;
			c = a + b;
			serie += "," + c;
			a = b;
			b = c;
		} while (k < n);
		// Reporte
		System.out.println("Serie de Fibonacci");
		System.out.println(serie);
		System.out.println("\n--- Fin ---");
	}

}
