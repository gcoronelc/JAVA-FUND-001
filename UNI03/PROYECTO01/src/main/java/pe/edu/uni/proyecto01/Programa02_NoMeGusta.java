package pe.edu.uni.proyecto01;

import java.util.Scanner;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Programa02_NoMeGusta {

    public static void main(String[] args) {
        
			// Variables
			Scanner scanner = new Scanner(System.in);
			// Lectura de datos
			System.out.println("Ingrese nombre:");
			String nombre = scanner.nextLine(); // Lectura de un dato alfanumerico
			System.out.println("Ingrese edad:");
			int edad = scanner.nextInt();  // LEctura de un dato entero
			// Reporte
			System.out.println("Hola " + nombre);
			System.out.println("Que joven que eres, edad " + edad + ".");
			
    }

}
