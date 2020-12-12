/*
 * Desarrollar un programa para calcular el área de un triángulo
aplicando la fórmula de Herón.
 */
package proyectos;

import java.util.Scanner;

/**
 *
 * @author toshiba
 */
public class Proyecto4 {
    public static void main(String[] args) {
        //VARIABLES
        double a,b,c, s,area;
        Scanner leer = new Scanner(System.in);

        //LECTURA DE DATOS
        System.out.print("ingrese el valor de a: ");
        a = leer.nextDouble();
        System.out.print("ingrese el valor de b: ");
        b = leer.nextDouble();
        System.out.print("ingrese el valor de c: ");
        c = leer.nextDouble();
        //PROCESO
        s=(a+b+c)/2;
        area=Math.pow((s*(s-a)*(s-b)*(s-c)), 2);
        //REPORTE
        System.out.println("El área es: " + area);
    }
}
