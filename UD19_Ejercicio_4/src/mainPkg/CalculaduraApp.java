package mainPkg;

import viewPkg.CalculadoraView;

/**
 * @author Octavio Bernal Vilana
 * @author Josep Oriol López Bosch
 * @author David Dalmau Dieguez
 * 
 * @version 0.0.1
 * @date 02/05/2022
 */

public class CalculaduraApp {

	public static void main(String[] args) {
		
		// Se crea una instancia de la vista Calculadora.
		CalculadoraView calculadora = new CalculadoraView();
		// Le cambiamos la visibilidad para que aparezca la vista.
		calculadora.setVisible(true);
	}

}
