package pe.edu.uni.aprendiendoarreglos;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class BuscarMejorAmigo {

	public static void main(String[] args) {

		int N = 10;
		String amigos[];// = new String[N];
		int edades[] = new int[N];
		
		// Lista de amigos
		/*
		amigos[0] = "Sergio";
		amigos[1] = "Claudia";
		amigos[2] = "Hugo";
		amigos[3] = "Delia";
		amigos[4] = "Julio";
		amigos[5] = "Karla";
		amigos[6] = "Ricardo";
		amigos[7] = "Mariela";
		amigos[8] = "Laura";
		amigos[9] = "Adriana";
		*/
		amigos = new String[]{"Sergio","Claudia","Hugo","Delia","Julio",
			"Karla","Ricardo","Mariela","Laura","Adriana"};
		
		// Generar edades
		for (int j = 0; j < edades.length; j++) {
			edades[j] = (int) (Math.random() * 100);
		}
		
		// Ubicar al de mayor edad
		// Se asume que el de mayor edad es el primero de la lista
		int mayor = edades[0], p = 0;
		
		// Luego se hace un recorrido del arreglo
		for (int j = 1; j < N; j++) {
			if (mayor < edades[j]) {
				mayor = edades[j];
				p = j;
			}
		}
		
		// Imprimir lista de amigos
		System.out.println("Lista de Amigos\n");
		for (int j = 0; j < amigos.length; j++) {
			System.out.println(j + "\t" + amigos[j] + "\t" + edades[j]);
		}
		
		// Imprimir el de mayor edad
		System.out.println("\nResultado de la Busqueda\n");
		System.out.println("Posicion: " + p);
		System.out.println("Amigo: " + amigos[p]);
		System.out.println("Edad: " + edades[p]);
		System.out.println("\n\t----- Fin -----");

	}

}
