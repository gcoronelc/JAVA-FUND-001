/*
 * Desarrollar un programa para calcular el importe de una venta, los datos son el
precio del producto y la cantidad.
El precio del producto incluye el 18% correspondiente al impuesto de ley.
Se debe calcular el importe de la venta, el impuesto de ley y el total de la venta.
 */
package proyectos;

import java.util.Scanner;

/**
 *
 * @author toshiba
 */
public class Proyecto3 {
    public static void main(String[] args) {
        //VARIABLES
        double PrecioProd, cantidad, importeVen, impuesto=0.18;
        Scanner leer = new Scanner(System.in);

        //LECTURA DE DATOS
        System.out.print("ingrese el precio del Producto: ");
        PrecioProd = leer.nextDouble();
        
        System.out.print("ingrese la cantidad: ");
        cantidad = leer.nextDouble();
        //PROCESO
        
        importeVen=PrecioProd*cantidad+0.18;
       
        
        //REPORTE
        System.out.println("El importe es: " + importeVen);
        System.out.println("El impuesto es: " + impuesto);
        System.out.println("El Total de venta: " + impuesto);
    
    }
}
