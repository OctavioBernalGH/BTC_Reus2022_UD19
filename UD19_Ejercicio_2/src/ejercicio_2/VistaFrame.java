package ejercicio_2;

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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textPelicula;

	/**
	 * Se crea la vista principal del programa. Este programa almacenará los datos
	 * introducidos del el textField en el comboBox, para ello se utilizará un
	 * actionListener en el botón añadir pelicula.
	 */

	public VistaFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Se crea un comboBox con valores por defecto.
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(
				new String[] { "Harry Potter", "El senior de los anillos", "Shrek en la cienaga" }));
		comboBox.setBounds(53, 132, 135, 22);
		contentPane.add(comboBox);

		textPelicula = new JTextField();
		textPelicula.setBounds(53, 101, 86, 20);
		contentPane.add(textPelicula);
		textPelicula.setColumns(10);

		JLabel lblNewLabel = new JLabel("Escriba la pelicula a a\u00F1adir al listado.");
		lblNewLabel.setBounds(53, 82, 270, 14);
		contentPane.add(lblNewLabel);

		// Se crea el botón
		JButton btnNewButton = new JButton("A\u00F1adir pelicula");

		/**
		 * Mediante el siguiente ActionListener, obtenemos la cadena introducida en el
		 * textFiled, la almacenamos en la variable pelicula y la insertamos en el
		 * comboBox.
		 */

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Se almacena el texto en la variable.
				String pelicula = textPelicula.getText();
				// Se añade el objeto en el comboBox.
				comboBox.addItem(pelicula);
				JOptionPane.showMessageDialog(btnNewButton,
						"Se ha añadido la pelicula " + pelicula + " al listado de peliculas.");
			}
		});
		btnNewButton.setBounds(53, 183, 148, 23);
		contentPane.add(btnNewButton);
	}
}
