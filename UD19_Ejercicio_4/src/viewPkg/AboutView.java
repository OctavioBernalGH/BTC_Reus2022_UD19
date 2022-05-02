package viewPkg;

/**
 * @author Octavio Bernal Vilana
 * @author Josep Oriol López Bosch
 * @author David Dalmau Dieguez
 * 
 * @version 0.0.1
 * @date 02/05/2022
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.TextArea;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class AboutView extends JFrame {

	private JPanel contentPane;

	/**
	 * Se crea la vista AboutView.
	 * La función de esta vista es ofrecer información general respecto al ejercicio
	 * creado. Explicamos brevemente su funcionamiento.
	 */

	public AboutView() {
		setTitle("About ejercicio 4 UD19");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 502, 377);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TextArea textArea = new TextArea();
		textArea.setText("Ejercicio 4 unidad 19 equipo 1.\r\n\r\nEste ejercicio ha sido realizado por Josep Oriol, David Dieguez y \r\nOctavio Bernal, integrantes del equipo 1.\r\n\r\nEste ejercicio recrea una calculadora simple donde introduces por teclado \r\ndos operandos en los textbox,  seleccionas la operaci\u00F3n a realizar mediante\r\nlos diferentes radioButton y calculas la operaci\u00F3n marcada en el bot\u00F3n calcular. \r\n\r\nEl bot\u00F3n about te lleva a esta ventana  con la informaci\u00F3n del equipo y ejercicio.");
		textArea.setEditable(false);
		textArea.setBounds(20, 10, 456, 208);
		contentPane.add(textArea);
		
		/**
		 * Se define un botón para volver a la ventana anterior.
		 * Mediante dispose(); cerramos la venta about y queda abierta la ventana
		 * CalculadoraView.
		 */
		
		Button volverButton = new Button("Volver");
		volverButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Cierra la ventana actual manteniendo la padre abierta.
				dispose();
			}
		});
		volverButton.setBounds(191, 260, 70, 22);
		contentPane.add(volverButton);
		
		
	
	}
}
