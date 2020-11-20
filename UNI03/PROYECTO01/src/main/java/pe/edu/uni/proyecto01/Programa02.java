package pe.edu.uni.proyecto01;

import java.util.Scanner;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Programa02 {

    public static void main(String[] args) {
        
			// Variables
			String nombre;
			int edad;
			Scanner scanner = new Scanner(System.in);
			// Lectura de datos
			System.out.println("Ingrese nombre:");
			nombre = scanner.nextLine();
			System.out.println("Ingrese edad:");
			edad = scanner.nextInt();
			// Reporte
			System.out.println("Hola " + nombre);
			System.out.println("Que joven que eres.");
			
    }

}
