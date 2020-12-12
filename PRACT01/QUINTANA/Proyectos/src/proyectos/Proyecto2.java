/*
 * Desarrollar un programa para calcular la suma de los N primeros números.
 */
package proyectos;

import java.util.Scanner;

/**
 *
 * @author toshiba
 */
public class Proyecto2 {
    public static void main(String[] args) {
        //VARIABLES
        double n, suma;
        Scanner leer = new Scanner(System.in);

        //LECTURA DE DATOS
        System.out.print("ingrese el valor de n: ");
        n = leer.nextDouble();

        //PROCESO
        suma=(n*(n+1))/2;
        
        //REPORTE
        System.out.println("la suma de los n primeros números es: " + suma);
    }
}
