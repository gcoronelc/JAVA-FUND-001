package pe.edu.uni.aprendiendoarreglos;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class BuscarAmigo {

	public static void main(String[] args) {

		int N = 10;
		String amigos[] = new String[N];
		String nombre = "HUGO";

		// Lista de amigos
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

		// Ubicar amigo
		int p = -1;
		for (int j = 0; j < N; j++) {
			if (amigos[j].equalsIgnoreCase(nombre)) {
				p = j;
				break;
			}
		}

		// Imprimir lista de amigos
		System.out.println("Lista de Amigos\n");
		for (int j = 0; j < amigos.length; j++) {
			System.out.println(j + "\t" + amigos[j]);
		}

		// Imprimir resultado
		if (p == -1) {
			System.out.println("\n" + nombre + " no existe en la lista");
		} else {
			System.out.println("\n" + nombre + " esta en la posicion " + p);
		}
		System.out.println("\n\t----- Fin -----");

	}

}
