package pe.edu.uni.aprendiendojava;

import java.util.Random;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Ejemplo02 {

    public static void main(String[] args) {
			
			int numero;
			Random random = new Random();
			numero = random.nextInt(100);
			
			System.out.println("Hola " + numero);
			if(numero > 50){
				System.out.println("Alianza se va.");
			} else {
				System.out.println("Alianza se queda.");
			}
			System.out.println("Chau");
			
        
    }

}
