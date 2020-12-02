package pe.edu.uni.aprendiendobucles;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Ejemplo04 {

	public static void main(String[] args) {
		int n = 8;
		int k; // Contador
		int r; // Variable auxiliar
		String repo;
		// Proceso
		k = 1;
		repo = ""; // cadena vacia.
		while (k <= 12) {
			r = n * k;
			repo += k + " * " + n + " = " + r + "\n";
			k++;
		}
		// REPORTE
		System.out.println("Tabla de Multiplicar del numero: " + n);
		System.out.println(repo);
		System.out.println("--- Fin ---");
	}

}
