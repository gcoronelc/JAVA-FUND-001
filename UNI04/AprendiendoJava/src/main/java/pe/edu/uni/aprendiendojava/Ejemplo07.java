package pe.edu.uni.aprendiendojava;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Ejemplo07 {

	public static void main(String[] args) {

		String nombre;
		int a, b, r1, r2, r3;
		float r4;
		nombre = args[0];
		System.out.println("Nombre: " + nombre);
	
		a = Integer.parseInt(args[1]);
		b = Integer.parseInt(args[2]);
		r1 = a * b;
		/* Multiplicación */
		r2 = a / b;
		/* División Entera */
		r3 = a % b;
		/* Resto */
		r4 = (float) a / b;
		/* División Real */
		System.out.println("Hola " + nombre);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("Multiplicacion = " + r1);
		System.out.println("Division Entera = " + r2);
		System.out.println("Resto = " + r3);
		System.out.println("Division Real = " + r4);

	}

}
