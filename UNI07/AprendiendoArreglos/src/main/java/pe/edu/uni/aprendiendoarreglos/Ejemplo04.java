package pe.edu.uni.aprendiendoarreglos;

import java.util.Random;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Ejemplo04 {

    public static void main(String[] args) {
			
			// Objeto Random
			Random rnd =  new Random();
	
			// Math.random()
			System.out.println("Random: " + Math.random());
			
			// Valores entre [0,20]
			System.out.println("Valores entre [0,20]");
			for(int i = 1; i <=10; i++){
				long dato = rnd.nextInt(21);
				System.out.println("Dato: " + dato);
			}
        
    }

}
