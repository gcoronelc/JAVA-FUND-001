package pe.edu.uni.aprendiendoarreglos;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Ejm02Mat {

    public static void main(String[] args) {
			
			int mat1[][] = {
				{14,56,78,12,34},
				{43,56,87,12,34,56,56,76,89},
				{65,23,45,65,98,12,34}
			};
			
			for(int fila = 0; fila < mat1.length; fila++){
				for(int columna = 0; columna < mat1[fila].length; columna++){
					System.out.print(mat1[fila][columna] + "\t");
				}
				System.out.println();
			}
        
    }

}
