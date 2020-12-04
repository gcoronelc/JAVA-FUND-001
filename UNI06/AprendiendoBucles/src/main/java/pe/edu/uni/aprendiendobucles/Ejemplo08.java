package pe.edu.uni.aprendiendobucles;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Ejemplo08 {

	public static void main(String[] args) {
		int suma = 0;
		for (String dato : args) {
			suma += Integer.parseInt(dato);
		}
		System.out.println("Suma => " + suma);
	}

}
