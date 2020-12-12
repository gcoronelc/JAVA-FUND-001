/*
 * Crear un programa que calcular el Sueldo Neto a pagar a un trabajador, considerando
los siguientes puntos:
▪ El número de horas trabajadas.
▪ El pago por hora.
▪ Al trabajador se le debe retener el 5% del total de ingresos por concepto de impuesto.
 */
package proyectos;
import java.util.Scanner;

/**
 *
 * @author toshiba
 */
public class Proyecto5 {
    public static void main(String[] args) {
         //VARIABLES
        double sneto,ht,ph,spago;
        Scanner leer = new Scanner(System.in);

        //LECTURA DE DATOS
        System.out.print("ingrese el número de horas trabajadas: ");
        ht = leer.nextDouble();
        System.out.print("ingrese el pago por horas: ");
        ph = leer.nextDouble();
      
        //PROCESO
        spago=ht*ph;
        sneto=spago-spago*0.05;
        //REPORTE
        System.out.println("El área es: " + sneto);
    }
}
