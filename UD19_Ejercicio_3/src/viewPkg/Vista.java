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
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Vista extends JFrame {

	private JPanel contentPane;

	/**
	 * Se crea la vista del ejercicio 3. En esta vista se realizará una encuesta al
	 * usuario donde deberá marcar un sistema operativo, solo uno, deberá marcar una
	 * especialidad mediante checkbox. Podrá marcar des de ningúna hasta todas.
	 * 
	 * A continuación seleccionará las horas mediante un slider y al pulsar el botón
	 * generar informe se abrirá un JOptionPane que mostrará todas las opciones
	 * seleccionadas.
	 */
	public Vista() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 398, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JRadioButton windows = new JRadioButton("Windows OS");
		windows.setSelected(true);
		windows.setBounds(38, 46, 109, 23);
		contentPane.add(windows);

		JRadioButton mac = new JRadioButton("Mac OS");
		mac.setBounds(151, 46, 77, 23);
		contentPane.add(mac);

		JRadioButton linux = new JRadioButton("Linux OS");
		linux.setBounds(241, 46, 109, 23);
		contentPane.add(linux);

		/**
		 * Se crea un grupo de botones para los radioButton. Esta opción nos permitirá
		 * seleccionar solo una opción de las muchas que agregemos, en este caso se
		 * agregarán las opciones windows, mac y linux y el usuario solo podrá marcar
		 * una de ellas.
		 */
		ButtonGroup grupo = new ButtonGroup();

		// Se añaden los radioButton a un grupo de botones para controlar la selección.
		grupo.add(windows);
		grupo.add(mac);
		grupo.add(linux);

		JLabel lblNewLabel = new JLabel("Seleccione su OS preferido.");
		lblNewLabel.setBounds(91, 25, 209, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Elige especialidad");
		lblNewLabel_1.setBounds(108, 76, 109, 14);
		contentPane.add(lblNewLabel_1);

		JCheckBox chckprogramacion = new JCheckBox("Programaci\u00F3n");
		chckprogramacion.setBounds(38, 97, 149, 23);
		contentPane.add(chckprogramacion);

		JCheckBox chckdiseño = new JCheckBox("Dise\u00F1o gr\u00E1fico");
		chckdiseño.setBounds(38, 123, 149, 23);
		contentPane.add(chckdiseño);

		JCheckBox chckadministracion = new JCheckBox("Administraci\u00F3n");
		chckadministracion.setBounds(38, 149, 135, 23);
		contentPane.add(chckadministracion);

		JSlider slider = new JSlider();
		slider.setMajorTickSpacing(1);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setValue(5);
		slider.setMaximum(10);
		slider.setBounds(49, 204, 200, 67);
		contentPane.add(slider);

		JLabel lblNewLabel_2 = new JLabel("Horas dedicadas");
		lblNewLabel_2.setBounds(108, 179, 97, 14);
		contentPane.add(lblNewLabel_2);

		JLabel etiSlider = new JLabel();
		etiSlider.setBounds(38, 443, 200, 14);
		contentPane.add(etiSlider);

		/**
		 * Mediante el ActionListener del botón generar informe generaremos la cadena
		 * que mostraremos por pantalla con los valores seleccionados por el usuario.
		 */

		JButton boton = new JButton("Generar Informe");
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Selector del radioButton
				String selector = "";

				// Comprobación de radioButton, validamos cual ha sido seleccionado.
				if (windows.isSelected()) {
					selector = "Windows OS";
				} else if (mac.isSelected()) {
					selector = "Mac OS";
				} else if (linux.isSelected()) {
					selector = "Linux OS";
				}

				// Selector del checkBox
				ArrayList checkList = new ArrayList();

				// Comprobamos que checkbox ha sido seleccionado y añadimos la cadena
				// generada a un arrayList para poder mostrar los valores.
				if (chckadministracion.isSelected()) {
					checkList.add("Administración");
				}

				if (chckdiseño.isSelected()) {
					checkList.add("Diseño");
				}

				if (chckprogramacion.isSelected()) {
					checkList.add("Programación");
				}

				// Guardamos el valor del Slider en una variable
				int valor = slider.getValue();

				// Mostramos los valores seleccionados.
				JOptionPane.showMessageDialog(boton, "Sistema operativo seleccionado: " + selector + "\n Especialidad "
						+ checkList + "\n Valor slider " + valor);
			}
		});
		boton.setBounds(74, 282, 164, 23);
		contentPane.add(boton);

	}
}
