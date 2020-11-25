package pe.edu.uni.aprendiendojava;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Work03 {

    public static void main(String[] args) {
			
			int a = 10, b = 20;
			
			b += a; // b = b + a;
			System.out.println("b = " + b);
			
			b /= a;
			System.out.println("b = " + b);
        
			b *= b;
			System.out.println("b = " + b);
			
			char y = '6';
			int ascii_y = (int) y;
			boolean x = y != 6;
			System.out.println("x: " + x);
			System.out.println("y: " + y);
			System.out.println("ASCII(y): " + ascii_y);
    }

}
