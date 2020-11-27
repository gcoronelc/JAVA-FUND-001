package pe.edu.uni.aprendiendojava;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Ejemplo03 {

    public static void main(String[] args) {
			
			int mes = 2;
			String repo;
			
			switch(mes){
				case 1: case 2: case 3:
					repo = "1er trimestre";
					break;
				case 4: case 5: case 6:
					repo = "2do trimestre";
					break;
				default:
					repo = "2do semestre";
					break;
			}
			
			System.out.println("Reporte: " + repo);
        
    }

}
