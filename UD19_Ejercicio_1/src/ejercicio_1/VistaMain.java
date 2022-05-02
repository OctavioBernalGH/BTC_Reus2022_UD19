package ejercicio_1;

/**
 * @author Octavio Bernal Vilana
 * @author Josep Oriol L�pez Bosch
 * @author David Dalmau Dieguez
 * 
 * @version 0.0.1
 * @date 02/05/2022
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class VistaMain {

	private JFrame frmEjercicio;
	private JTextField textField;

	/**
	 * Vista del ejercicio 1 integrada junto a la sentencia main. Este programa se
	 * ejecutar� en la misma vista.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaMain window = new VistaMain();
					window.frmEjercicio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VistaMain() {
		initialize();
	}

	/**
	 * Se crean los diferentes componentes de la aplicaci�n. En este caso se define
	 * un JFrame y se a�aden textFields, JButton y JLabael como componentes de esta.
	 */
	private void initialize() {
		frmEjercicio = new JFrame();
		frmEjercicio.setTitle("Ejercicio_1");
		frmEjercicio.setBounds(100, 100, 380, 241);
		frmEjercicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEjercicio.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setBounds(101, 53, 168, 31);
		frmEjercicio.getContentPane().add(textField);
		textField.setColumns(10);

		/**
		 * Se crea el bot�n Saludar. Se a�ade un ActionListener, cuando se pulse el
		 * bot�n almacenar� el texto del JField en una variable y lo mostrar� por
		 * pantalla junto con una cadena String definada mediante un JOptionPane.
		 */

		JButton btnNewButton = new JButton("Saludar");
		btnNewButton.setBounds(101, 95, 168, 56);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Se guarda el texto del JFiled en la variable nombre al pulsar el bot�n
				// saludar.
				String nombre = textField.getText();
				// Se muestra por pantalla el texto de la variable nombre junto a la cadena
				// "Hola".
				JOptionPane.showMessageDialog(btnNewButton, "Hola " + nombre);
			}
		});

		JLabel etiqueta = new JLabel("Introduce nombre para saludarte");
		etiqueta.setBounds(101, 11, 228, 56);
		etiqueta.setBackground(Color.GRAY);
		frmEjercicio.getContentPane().add(etiqueta);
		frmEjercicio.getContentPane().add(btnNewButton);
	}

}
