package pe.edu.uni.aprendiendojava;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Ejemplo03 {

	public static void main(String[] args) {
		char c1 = 'A', c2 = '\t', c3 = '\u03A6';
		String msg;
		msg = Character.toString(c1) + Character.toString(c2) + Character.toString(c3);
		System.out.println(msg);
	}

}
