
<table>
 <tr>
    <td> <img src="https://github.com/OctavioBernalGH/BTC_Reus2022_UD16/blob/main/dou_logo.png" alt="Team DOU"/></td>
    <td><h1>Ejercicios SQL Unidad UD19</h1></td>
  
 </tr>
</table>
 
 [comment]: <> (<img src="https://github.com/OctavioBernalGH/BTC_Reus2022_UD16/blob/main/dou_logo.png" alt="Team DOU"/><br>)
 
<hr>
 
 [comment]: <> (### Ejercicios SQL Unidad UD16<hr>)


Este ejercicio ha sido realizado por los miembros del equipo 1. Dicho equipo esta formado por:

[- Octavio Bernal](https://github.com/OctavioBernalGH)<br>
[- David Dalmau](https://github.com/DavidDalmauDieguez)<br>
[- J.Oriol López Bosch](https://github.com/mednologic)

<h2>Se muestra la ejecución del ejercicio 1:</h2>

![Ejercicio_1](https://user-images.githubusercontent.com/103035621/166226610-c7e3498f-7c4c-4a6b-9803-3557d409800c.png)

<p align="justify">Este ejercicio se ha realizado en un solo fichero, no se ha separado la vista del main. Al ser el primero lo hemos desarrollado así para comprobar su funcionamiento. Es un ejercicio básico donde se pide al usuario introducir su nombre por el área de texto y el programa devolverá un saludo con su nombre.</p>

<details>
  <summary>Clase Main con la vista ejercicio 1.</summary>
<br>
<p align="justify">En este ejercicio se introduce en el textFiled el nombre de una persona y mediante un ActionListener en un botón nos mostrará por pantalla la cadena "Hola" y el nombre introducido..</p>
  
  ```java
package ejercicio_1;

/**
 * @author Octavio Bernal Vilana
 * @author Josep Oriol López Bosch
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
	 * ejecutará en la misma vista.
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
	 * Se crean los diferentes componentes de la aplicación. En este caso se define
	 * un JFrame y se añaden textFields, JButton y JLabael como componentes de esta.
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
		 * Se crea el botón Saludar. Se añade un ActionListener, cuando se pulse el
		 * botón almacenará el texto del JField en una variable y lo mostrará por
		 * pantalla junto con una cadena String definada mediante un JOptionPane.
		 */

		JButton btnNewButton = new JButton("Saludar");
		btnNewButton.setBounds(101, 95, 168, 56);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Se guarda el texto del JFiled en la variable nombre al pulsar el botón
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

  ```
 </details>
 <br>


<h2>Se muestra la ejecución del ejercicio 2:</h2>

![Ejercicio_2](https://user-images.githubusercontent.com/103035621/166226618-0f48f107-7e34-47e0-9f78-408150d9005a.png)

<p align="justify">Este ejercicio ha sido realizado separando la vista del main. Para ello se ha creado un paquete que contiene la vista en un fichero y el main en otro fichero. En este ejercicio se pide al usuario que introduzca en el text área el nombre de la pelicula. Mediante el botón definido abajo se añadirá dicha película al menú desplegable. </p>

Desplegable con el código referente a la clase encargada de llamar a la vista.

 <details>
  <summary>Clase Main ejercicio 2.</summary>
<br>
<p align="justify">En este fichero solo se llama a la vista.</p>
  
  ```java
package ejercicio_2;

/**
 * @author Octavio Bernal Vilana
 * @author Josep Oriol López Bosch
 * @author David Dalmau Dieguez
 * 
 * @version 0.0.1
 * @date 02/05/2022
 */

public class MainApp {

	/**
	 * Se llama a la vista "VistaFrame" des del main.
	 */
	
	public static void main(String[] args) {

		// Se crea una instancia de la vista del programa.
		VistaFrame vistaPrincipal = new VistaFrame();
		// Se otorga visibilidad para que aparezca la vista.
		vistaPrincipal.setVisible(true);

	}
}
  ```
 </details>
 <br>

Desplegable con el código referente a la vista del programa.

<details>  
    <summary>Clase VistaFrame ejercicio 2.</summary>
<br>
<p align="justify">Este fichero hace referencia a la vista del programa. Dentro se definen todos los componentes y se desarrolla el flujo de ejecución.</p>
  
  ```java
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

  ```
 </details>

<h2>Se muestra la ejecución del ejercicio 3:</h2>

![Ejercicio_3](https://user-images.githubusercontent.com/103035621/166226629-317b0431-bbde-43a5-892c-8f3f9207faf7.png)

<p align="justify">En este ejercicio se pide al usuario que realice una breve encuensta. Para ello se utilizarán tres radioButton con diferentes opciones, en este apartado solo se podrá elegir una de ellas. A continuación se le pide al usuario que marque las opciones de especialidad, se podrá marcar des de ningúna hasta todas. Mediante un slider el usuario elegirá las horas dedicadas y pulsará el botón el cual mostrará por pantalla al usuario el resumen de las opciones que ha elegido.
  
Se ha separado el código del programa en dos paquetes, en el primero "mainPkg" estará el código marcará el flujo de ejecución (llamará a la vista) y en el segundo "viewPkg" estará el código de la vista.
</p>

En el siguiente código del desplegable solo se llama a la vista principal donde estará la vista y el flujo de ejecución del programa.

 <details>
  <summary>Clase Main ejercicio 3.</summary>
<br>
<p align="justify">En este fichero solo se llama a la vista.</p>
  
  ```java
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
  ```
 </details>
 <br>
 
Este código hace referencia a la vista del programa. Dicha clase está separada en otro paquete llamado viewPkg. 
 
<details>  
    <summary>Clase Vista ejercicio 3.</summary>
<br>
<p align="justify">Este fichero hace referencia a la vista del programa. Dentro se definen todos los componentes y se desarrolla el flujo de ejecución.</p>
  
  ```java
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

  ```
 </details>

<h2>Se muestra la ejecución del ejercicio 4:</h2>

![Ejercicio_4](https://user-images.githubusercontent.com/103035621/166226646-73a2b179-51bb-408a-99b2-7b61a4698e11.png)

<p align="justify">El código de este ejercicio viene separado en dos paquetes y tres clases. En el paquete "mainPkg" vendrá definida la clase principal, su función es llamar a la vista CalculadoraView para comenzar con el flujo del programa. El siguiente paquete es "viewPkg", este paquete contiene la vista CalculadoraView y AboutView. La primera realiza los cálculos entre dos operandos escogiendo la operación a realizar mediante varios radioButton. La segunda vista vendrá asociada a un botón "about", una vez pulsado este botón se dará visibilidad a la vista "AboutView" la cual mostrará información relativa al ejercicio.</p>

A continuación se muestra el código de la clase main en el desplegable.

 <details>
  <summary>Clase Main ejercicio 4.</summary>
<br>
<p align="justify">En este fichero solo se llama a la vista.</p>
  
  ```java
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
  ```
 </details>
 
Se muestra el código de la clase CalduladoraView.
 
 <details>
  <summary>Clase CalculadoraView ejercicio 4.</summary>
<br>
<p align="justify">En esta vista vendrá toda la lógica de la calculadora, des de la introducción de operandos, seleccion de operación a realizar hasta el cálculo final y resultado.</p>
  
  ```java
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
  ```
 </details>
 
 Y por último el código de la vista About.
 
 <details>
  <summary>Clase AboutView ejercicio 4.</summary>
<br>
<p align="justify">En esta clase está el código referente a la vista AboutView, esta vista es llamada des de la vista CalculadoraView y muestra una breve explicación del ejercicio.</p>
  
  ```java
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
  ```
 </details>


