package pe.edu.uni.aprendiendoarreglos;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Ejemplo01 {

    public static void main(String[] args) {
			
			int[] notas = new int[5];
			
			for (int nota : notas) {
				System.out.println(nota);
			}
			
			String nombres[] = new String[5];
			for (String nombre : nombres) {
				System.out.println(nombre);
			}
			
			nombres[2] = "Hola todos, estoy con Java.";
        
			for (String nombre : nombres) {
				System.out.println(nombre);
			}
    }

}
