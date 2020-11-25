package pe.edu.uni.aprendiendojava;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Ejemplo11 {

	public static void main(String[] args) {
		int n;
		boolean ok;
		n = Integer.parseInt(args[0]);
		ok = (n % 3 == 0);
		ok &= (n % 5 == 0);
		System.out.println("n = " + n);
		System.out.println("Condicion = " + Boolean.toString(ok));

	}

}
