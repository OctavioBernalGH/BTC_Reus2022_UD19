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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class CalculadoraView extends JFrame {

	private JPanel contentPane;
	private JTextField op1txt;
	private JTextField op2text;

	/**
	 * Creación de la vista con los diferentes componentes.
	 * En este ejercicio se utilizan labels, textBox, radioButtons y buttons.
	 * En esta vista calcularemos operaciones matemáticas simples y llamaremos
	 * a otra vista donde habrá una explicación del ejercicio.
	 */
	
	public CalculadoraView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 358, 516);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblOperando1 = new JLabel("Operando 1");
		lblOperando1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOperando1.setBounds(34, 33, 123, 38);
		contentPane.add(lblOperando1);

		op1txt = new JTextField();
		op1txt.setFont(new Font("Tahoma", Font.PLAIN, 14));
		op1txt.setBounds(34, 65, 184, 27);
		contentPane.add(op1txt);
		op1txt.setColumns(10);

		JLabel lblOperando2 = new JLabel("Operando 2");
		lblOperando2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOperando2.setBounds(34, 92, 123, 38);
		contentPane.add(lblOperando2);

		op2text = new JTextField();
		op2text.setFont(new Font("Tahoma", Font.PLAIN, 14));
		op2text.setColumns(10);
		op2text.setBounds(34, 125, 184, 27);
		contentPane.add(op2text);

		JRadioButton radioSumar = new JRadioButton("Sumar");
		radioSumar.setSelected(true);
		radioSumar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		radioSumar.setBounds(34, 207, 109, 23);
		contentPane.add(radioSumar);

		JRadioButton radioRestar = new JRadioButton("Restar");
		radioRestar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		radioRestar.setBounds(34, 233, 109, 23);
		contentPane.add(radioRestar);

		JRadioButton radioMultiplicar = new JRadioButton("Multiplicar");
		radioMultiplicar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		radioMultiplicar.setBounds(34, 259, 109, 23);
		contentPane.add(radioMultiplicar);

		JRadioButton radioDividir = new JRadioButton("Dividir");
		radioDividir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		radioDividir.setBounds(34, 285, 109, 23);
		contentPane.add(radioDividir);

		JLabel lblNewLabel = new JLabel("Selector de Operaciones");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(34, 172, 184, 28);
		contentPane.add(lblNewLabel);

		ButtonGroup grupoOperaciones = new ButtonGroup();
		grupoOperaciones.add(radioSumar);
		grupoOperaciones.add(radioRestar);
		grupoOperaciones.add(radioMultiplicar);
		grupoOperaciones.add(radioDividir);

		/**
		 * Botón para calcular las operaciones.
		 * Mediante este botón, los textBox de los operandos y los radioButton
		 * calcularemos las diferentes operación y mostraremos el resultado 
		 * mediante un JOptionPane.
		 */
		
		JButton boton = new JButton("Calcular");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double operandoUno = Double.parseDouble(op1txt.getText());
				double operandoDos = Double.parseDouble(op2text.getText());
				double resultado = 0;

				if (radioSumar.isSelected()) {
					resultado = operandoUno + operandoDos;
				} else if (radioRestar.isSelected()) {
					resultado = operandoUno - operandoDos;
				} else if (radioMultiplicar.isSelected()) {
					resultado = operandoUno * operandoDos;
				} else if (radioDividir.isSelected()) {
					resultado = operandoUno / operandoDos;
				}

				JOptionPane.showMessageDialog(boton, "El resultado es: " + resultado);
			}
		});
		boton.setBounds(34, 330, 89, 23);
		contentPane.add(boton);

		/**
		 * Botón para mostrar el about del programa.
		 * Este botón llamará a otra vista donde estará toda la información relativa
		 * al ejercicio desarrollado por el equipo 1.
		 */
		JButton aboutButton = new JButton("About");
		aboutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Creamos una instancia de la vista AboutView
				// Le damos visibilidad para que aparezca en pantalla
				AboutView vistaAbout = new AboutView();
				vistaAbout.setVisible(true);
			}
		});
		aboutButton.setBounds(133, 330, 89, 23);
		contentPane.add(aboutButton);

	}

}
