package pe.edu.uni.aprendiendobucles;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Demo04 {

    public static void main(String[] args) {
        
			int notas[] = {18,17,16,15,20};
			
			System.out.println("NOTAS");
			for (int nota : notas) {
				System.out.println("Nota: " + nota);
			}
			
			double suma = 0.0;
			for (int nota : notas) {
				suma += nota;
			}
			double promedio = suma / notas.length;
			System.out.println("PROMEDIO");
			System.out.println("Promedio: " + promedio);
			
    }

}
