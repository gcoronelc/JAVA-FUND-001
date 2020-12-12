/*
 * Crear un programa para encontrar el Área de un Círculo
 */
package proyectos;

import java.util.Scanner;

/**
 *
 * @author toshiba
 */
public class Proyecto1 {
       public static void main(String[] args) {
        //VARIABLES
        double radio, area;
        Scanner leer = new Scanner(System.in);

        //LECTURA DE DATOS
        System.out.print("ingrese el valor de radio: ");
        radio = leer.nextDouble();

        //PROCESO
        area=Math.PI*Math.pow(radio, 2);
        
        //REPORTE
        System.out.println("El área del círculo es: " + area);
    }
}
