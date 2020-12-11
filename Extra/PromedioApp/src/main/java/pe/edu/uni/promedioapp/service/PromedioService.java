package pe.edu.uni.promedioapp.service;

import java.util.Arrays;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class PromedioService {
	
	public int calcPromedio(int ... notas){
		int prom = 0;
		Arrays.sort(notas);
		for (int i = 2; i < notas.length; i++) {
			prom += notas[i];
		}
		prom /= (notas.length - 2);
		return prom;
	}

}
