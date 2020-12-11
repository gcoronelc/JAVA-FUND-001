package pe.edu.uni.aprendiendoarreglos;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Ejm01Mat {

    public static void main(String[] args) {
			
			int[][] mat1 = new int[3][4];
			
			/*
			mat1[0] = new int[]{56,43,56,78,65,78,90};
			mat1[0][4] = 500;
			*/
			
			mat1[1][1] = 78;
			mat1[0][3] = 89;
			
			for(int fila = 0; fila < mat1.length; fila++){
				for(int columna = 0; columna < mat1[fila].length; columna++){
					System.out.print(mat1[fila][columna] + "\t");
				}
				System.out.println();
			}
			
			
			
        
    }

}
