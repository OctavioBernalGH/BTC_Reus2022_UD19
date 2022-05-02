package mainPkg;

/**
 * @author Octavio Bernal Vilana
 * @author Josep Oriol López Bosch
 * @author David Dalmau Dieguez
 * 
 * @version 0.0.1
 * @date 02/05/2022
 */

import viewPkg.Vista;

public class MainApp {

	public static void main(String[] args) {

		// Creamos una instancia de la vista principal.
		Vista v1 = new Vista();
		// Se cambiamos el valor de setVisible a true para mostrar la vista.
		v1.setVisible(true);
	}

}
