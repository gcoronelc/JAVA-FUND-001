package pe.edu.uni.aprendiendobucles;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Demo06 {

    public static void main(String[] args) {
			
			List<Integer> notas = new ArrayList<>();
			
			notas.add(16);
			notas.add(18);
			notas.add(17);
			notas.add(19);
        
			int suma = 0;
			/*
			for (int i = 0; i < notas.size(); i++) {
				suma += notas.get(i);
			}
			*/
			for (Integer nota : notas) {
				suma += nota;
			}
			double promedio = suma * 1.0 / notas.size();
			
			System.out.println("Suma: " + suma);
			System.out.println("Promedio: " + promedio);
			
    }

}
