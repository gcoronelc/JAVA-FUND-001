package pe.edu.uni.aprendiendojava;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Ejemplo05 {

    public static void main(String[] args) {
			
			int mes = 2;
			String repo;
			
			switch(mes){
				case 1, 2, 3 -> repo = "1er trimestre";
				case 4, 5, 6 -> repo = "2do trimestre";
				default -> repo = "2do semestre";
			}
			
			System.out.println("Reporte: " + repo);
        
    }

}
