package pe.edu.uni.aprendiendojava;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Ejemplo09 {

	public static void main(String[] args) {
		int n;
		boolean esPar;
		n = 35;
		esPar = n % 2 == 0;
		System.out.println("n = " + n);
		System.out.println("Es Par = " + Boolean.toString(esPar));

	}

}
