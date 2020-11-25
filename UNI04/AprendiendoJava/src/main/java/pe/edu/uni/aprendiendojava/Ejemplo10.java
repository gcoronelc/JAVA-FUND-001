package pe.edu.uni.aprendiendojava;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Ejemplo10 {

	public static void main(String[] args) {
		int n;
		boolean ok;
		
		n = 20;
		ok = (n % 2 == 0) & (n % 5 == 0);
		
		String condicion = (ok)?"Cumple":"No cumple";
		
		System.out.println("n = " + n);
		System.out.println("Condicion = " + condicion);

	}

}
