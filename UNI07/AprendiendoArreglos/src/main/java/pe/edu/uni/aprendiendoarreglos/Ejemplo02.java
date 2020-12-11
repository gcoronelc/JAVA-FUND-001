package pe.edu.uni.aprendiendoarreglos;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Ejemplo02 {

	public static void main(String[] args) {

		String ciudades[] = {"Chiclayo", "Trujillo", "Cuzco", "Arequipa", "Huancayo", "Tarapoto"};

		System.out.println("Tamaño: " + ciudades.length);

		for (String ciudad : ciudades) {
			System.out.println(ciudad);
		}

	}

}
