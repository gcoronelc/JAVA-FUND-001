package pe.edu.uni.aprendiendobucles;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Demo03 {
	
	public static void main(String[] args) {
		
		int notas[] = {18,17,16,15,20};
		
		// Recorrido indexado de un arreglo
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Nota " + i + ": " + notas[i]);
		}
		
		double suma = 0;
		for (int i = 0; i < notas.length; i++) {
			suma += notas[i];
		}
		double promedio = suma / notas.length;
		System.out.println("Promedio: " + promedio);
		
	}

}
