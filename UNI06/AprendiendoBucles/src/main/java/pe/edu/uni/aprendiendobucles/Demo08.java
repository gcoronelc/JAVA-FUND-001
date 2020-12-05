package pe.edu.uni.aprendiendobucles;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Demo08 {

    public static void main(String[] args) {
			
			for(int i = 1; i <= 10; i++){
				
				if(i==5){
					continue; // Regresa el control al inicio de bucle
				}
				
				System.out.println(i + ".- Somos una raza ganadora.");
				
			}
			System.out.println("FIN");
        
    }

}
