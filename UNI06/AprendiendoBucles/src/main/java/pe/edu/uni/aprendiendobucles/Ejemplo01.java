package pe.edu.uni.aprendiendobucles;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Ejemplo01 {

	public static void main(String[] args) {

		// While
		int n = 10;
		while (n >= 1) {
			System.out.println("Alianza no se va!!!!.");
			n--;
		}

		// Do-While
		int m = 10;
		do {
			System.out.println("Alianza se queda!!!!.");
			m--; // m = m - 1;
		} while (m >= 1);
		
		// For
		for(n = 1; n <= 10; n++){
			
			if( n==5 ){
				continue;
			}
			
			if(n == 8){
				break;
			}
			
			System.out.println(n + ".- Alianza es el PERU!!!!.");
		}
	}

}
