package pe.edu.uni.aprendiendobucles.service;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class LogicaNegocio {

	public static long factorial(int n) {
		long f = 1;
		for (int i = 2; i <= n; i++) {
			f *= i;
		}
		return f;
	}

}
