package pe.edu.uni.aprendiendojava;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Ejemplo02 {

	public static void main(String[] args) {
		
		int edad = 25;
		boolean esViejo = (edad>30)?true:false;
		
		System.out.println("Viejo = " + esViejo);
		System.out.println("Viejo = " + Boolean.toString(esViejo));
		
	}

}
