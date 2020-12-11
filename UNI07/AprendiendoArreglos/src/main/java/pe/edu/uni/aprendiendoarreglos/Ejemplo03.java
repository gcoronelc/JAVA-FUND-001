package pe.edu.uni.aprendiendoarreglos;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Ejemplo03 {

    public static void main(String[] args) {
			
			// Math.random()
			System.out.println("Random: " + Math.random());
			
			// Valores entre [0,20]
			System.out.println("Valores entre [0,20]");
			for(int i = 1; i <=10; i++){
				long dato = Math.round(Math.random() * 20);
				System.out.println("Dato: " + dato);
			}
        
    }

}
