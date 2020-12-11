package pe.edu.uni.aprendiendoarreglos;

import java.util.Random;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Ejemplo05 {

    public static void main(String[] args) {
			
			// Objeto Random
			Random rnd =  new Random();
			
			// Valores entre [10,30]
			System.out.println("Valores entre [10,30]");
			for(int i = 1; i <=10; i++){
				long dato = rnd.nextInt(21) + 10;
				System.out.println("Dato: " + dato);
			}
        
    }

}
