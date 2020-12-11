package pe.edu.uni.promedioapp.prueba;

import pe.edu.uni.promedioapp.service.PromedioService;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba01 {
	
	public static void main(String[] args) {
		// datos
		int notas[] = {12,17,15,10,8,18,15};
		
		// Proceso
		PromedioService service = new PromedioService();
		int pr = service.calcPromedio(notas);
		
		// Promedio
		System.out.println("Promedio: " + pr);
		
	}

}
