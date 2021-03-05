package Memory.Memory;

import java.util.concurrent.TimeUnit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author Marc Cuenta, Mathias Debrun, Estefania Colombo
 *
 */

public class Ventana_Memory extends JFrame {

	private JPanel contentPane;
	boolean seleccionados[] = new boolean[] { false, false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false }; // Inicializamos todas las posiciones en false
	JToggleButton botones[] = new JToggleButton[16]; // Numero de botones
	boolean primeravez = true; // Variable de control, indica si es la primera vez que se gira la imagen
	int contadorintentos = 0; // Variable para contabilizar los intentos

	/**
	 * Create the frame.
	 */
	public Ventana_Memory() {

		// Título ventana y dimensiones del panel principal
		setTitle("Memory");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 419);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Botones, dimensiones y números asignados a cada una de ellas
		JToggleButton boton = new JToggleButton("6");
		boton.setBounds(12, 0, 122, 86);
		contentPane.add(boton);

		JToggleButton boton_1 = new JToggleButton("6");

		boton_1.setBounds(12, 98, 122, 86);
		contentPane.add(boton_1);

		JToggleButton boton_2 = new JToggleButton("3");
		boton_2.setBounds(146, 0, 122, 86);
		contentPane.add(boton_2);

		JToggleButton boton_3 = new JToggleButton("2");

		boton_3.setBounds(146, 98, 122, 86);
		contentPane.add(boton_3);

		JToggleButton boton_4 = new JToggleButton("4");
		boton_4.setBounds(280, 0, 122, 86);
		contentPane.add(boton_4);

		JToggleButton boton_5 = new JToggleButton("5");
		boton_5.setBounds(280, 98, 122, 86);
		contentPane.add(boton_5);

		JToggleButton boton_6 = new JToggleButton("1");
		boton_6.setBounds(414, 0, 122, 86);
		contentPane.add(boton_6);

		JToggleButton boton_7 = new JToggleButton("7");
		boton_7.setBounds(414, 98, 122, 86);
		contentPane.add(boton_7);

		JToggleButton boton_8 = new JToggleButton("1");
		boton_8.setBounds(12, 194, 122, 86);
		contentPane.add(boton_8);

		JToggleButton boton_9 = new JToggleButton("8");
		boton_9.setBounds(146, 196, 122, 86);
		contentPane.add(boton_9);

		JToggleButton boton_10 = new JToggleButton("7");
		boton_10.setBounds(280, 196, 122, 86);
		contentPane.add(boton_10);

		JToggleButton boton_11 = new JToggleButton("5");
		boton_11.setBounds(414, 196, 122, 86);
		contentPane.add(boton_11);

		JToggleButton boton_12 = new JToggleButton("4");
		boton_12.setBounds(12, 295, 122, 86);
		contentPane.add(boton_12);

		JToggleButton boton_13 = new JToggleButton("3");
		boton_13.setBounds(146, 294, 122, 86);
		contentPane.add(boton_13);

		JToggleButton boton_14 = new JToggleButton("2");
		boton_14.setBounds(280, 295, 122, 86);
		contentPane.add(boton_14);

		JToggleButton boton_15 = new JToggleButton("8");
		boton_15.setBounds(414, 295, 122, 86);
		contentPane.add(boton_15);

		// Asignamos a cada posicion de la matriz un nombre
		botones[0] = boton;
		botones[1] = boton_1;
		botones[2] = boton_2;
		botones[3] = boton_3;
		botones[4] = boton_4;
		botones[5] = boton_5;
		botones[6] = boton_6;
		botones[7] = boton_7;
		botones[8] = boton_8;
		botones[9] = boton_9;
		botones[10] = boton_10;
		botones[11] = boton_11;
		botones[12] = boton_12;
		botones[13] = boton_13;
		botones[14] = boton_14;
		botones[15] = boton_15;

		// Imagen de fondo para todos los botones
		boton.setIcon(new ImageIcon("/Users/estefaniacr/git/Memory/Memory/src/main/java/Imagenes/fondo-boton.png"));
		boton_1.setIcon(new ImageIcon("/Users/estefaniacr/git/Memory/Memory/src/main/java/Imagenes/fondo-boton.png"));
		boton_2.setIcon(new ImageIcon("/Users/estefaniacr/git/Memory/Memory/src/main/java/Imagenes/fondo-boton.png"));
		boton_3.setIcon(new ImageIcon("/Users/estefaniacr/git/Memory/Memory/src/main/java/Imagenes/fondo-boton.png"));
		boton_4.setIcon(new ImageIcon("/Users/estefaniacr/git/Memory/Memory/src/main/java/Imagenes/fondo-boton.png"));
		boton_5.setIcon(new ImageIcon("/Users/estefaniacr/git/Memory/Memory/src/main/java/Imagenes/fondo-boton.png"));
		boton_6.setIcon(new ImageIcon("/Users/estefaniacr/git/Memory/Memory/src/main/java/Imagenes/fondo-boton.png"));
		boton_7.setIcon(new ImageIcon("/Users/estefaniacr/git/Memory/Memory/src/main/java/Imagenes/fondo-boton.png"));
		boton_8.setIcon(new ImageIcon("/Users/estefaniacr/git/Memory/Memory/src/main/java/Imagenes/fondo-boton.png"));
		boton_9.setIcon(new ImageIcon("/Users/estefaniacr/git/Memory/Memory/src/main/java/Imagenes/fondo-boton.png"));
		boton_10.setIcon(new ImageIcon("/Users/estefaniacr/git/Memory/Memory/src/main/java/Imagenes/fondo-boton.png"));
		boton_11.setIcon(new ImageIcon("/Users/estefaniacr/git/Memory/Memory/src/main/java/Imagenes/fondo-boton.png"));
		boton_12.setIcon(new ImageIcon("/Users/estefaniacr/git/Memory/Memory/src/main/java/Imagenes/fondo-boton.png"));
		boton_13.setIcon(new ImageIcon("/Users/estefaniacr/git/Memory/Memory/src/main/java/Imagenes/fondo-boton.png"));
		boton_14.setIcon(new ImageIcon("/Users/estefaniacr/git/Memory/Memory/src/main/java/Imagenes/fondo-boton.png"));
		boton_15.setIcon(new ImageIcon("/Users/estefaniacr/git/Memory/Memory/src/main/java/Imagenes/fondo-boton.png"));

		// Imagenes cartas Memory
		boton.setSelectedIcon(new ImageIcon("/Users/estefaniacr/git/Memory/Memory/src/main/java/Imagenes/6.png"));
		boton_1.setSelectedIcon(new ImageIcon("/Users/estefaniacr/git/Memory/Memory/src/main/java/Imagenes/6.png"));
		boton_3.setSelectedIcon(new ImageIcon("/Users/estefaniacr/git/Memory/Memory/src/main/java/Imagenes/2.png"));
		boton_14.setSelectedIcon(new ImageIcon("/Users/estefaniacr/git/Memory/Memory/src/main/java/Imagenes/2.png"));
		boton_6.setSelectedIcon(new ImageIcon("/Users/estefaniacr/git/Memory/Memory/src/main/java/Imagenes/1.png"));
		boton_8.setSelectedIcon(new ImageIcon("/Users/estefaniacr/git/Memory/Memory/src/main/java/Imagenes/1.png"));
		boton_2.setSelectedIcon(new ImageIcon("/Users/estefaniacr/git/Memory/Memory/src/main/java/Imagenes/3.png"));
		boton_13.setSelectedIcon(new ImageIcon("/Users/estefaniacr/git/Memory/Memory/src/main/java/Imagenes/3.png"));
		boton_4.setSelectedIcon(new ImageIcon("/Users/estefaniacr/git/Memory/Memory/src/main/java/Imagenes/4.png"));
		boton_12.setSelectedIcon(new ImageIcon("/Users/estefaniacr/git/Memory/Memory/src/main/java/Imagenes/4.png"));
		boton_5.setSelectedIcon(new ImageIcon("/Users/estefaniacr/git/Memory/Memory/src/main/java/Imagenes/5.png"));
		boton_11.setSelectedIcon(new ImageIcon("/Users/estefaniacr/git/Memory/Memory/src/main/java/Imagenes/5.png"));
		boton_7.setSelectedIcon(new ImageIcon("/Users/estefaniacr/git/Memory/Memory/src/main/java/Imagenes/7.png"));
		boton_10.setSelectedIcon(new ImageIcon("/Users/estefaniacr/git/Memory/Memory/src/main/java/Imagenes/7.png"));
		boton_9.setSelectedIcon(new ImageIcon("/Users/estefaniacr/git/Memory/Memory/src/main/java/Imagenes/8.png"));
		boton_15.setSelectedIcon(new ImageIcon("/Users/estefaniacr/git/Memory/Memory/src/main/java/Imagenes/8.png"));

		// Acciones que desencadenarán los diferentes botones
		// Acción al pulsar el boton
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (primeravez) {
					primeravez = false;
					seleccionados[0] = true;
				} else {
					comparar(boton, botones);
				}
			}
		});
		// Acción al pulsar el boton_1
		boton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (primeravez) {
					primeravez = false;
					seleccionados[0] = true;
				} else {
					comparar(boton_1, botones);
				}
			}
		});
		// Acción al pulsar el boton_2
		boton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (primeravez) {
					primeravez = false;
					seleccionados[2] = true;
				} else {
					comparar(boton_2, botones);
				}
			}
		});
		// Acción al pulsar el boton_3
		boton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (primeravez) {
					primeravez = false;
					seleccionados[3] = true;
				} else {
					comparar(boton_3, botones);
				}
			}
		});
		// Acción al pulsar el boton_4
		boton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (primeravez) {
					primeravez = false;
					seleccionados[4] = true;
				} else {
					comparar(boton_4, botones);
				}
			}
		});
		// Acción al pulsar el boton_5
		boton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (primeravez) {
					primeravez = false;
					seleccionados[5] = true;
				} else {
					comparar(boton_5, botones);
				}
			}
		});
		// Acción al pulsar el boton_6
		boton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (primeravez) {
					primeravez = false;
					seleccionados[6] = true;
				} else {
					comparar(boton_6, botones);
				}
			}
		});
		// Acción al pulsar el boton_7
		boton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (primeravez) {
					primeravez = false;
					seleccionados[7] = true;
				} else {
					comparar(boton_7, botones);
				}
			}
		});
		// Accion al pulsar el boton_8
		boton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (primeravez) {
					primeravez = false;
					seleccionados[8] = true;
				} else {
					comparar(boton_8, botones);
				}
			}
		});
		// Acción al pulsar el boton_9
		boton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (primeravez) {
					primeravez = false;
					seleccionados[9] = true;
				} else {
					comparar(boton_9, botones);
				}
			}
		});
		// Acción al pulsar el boton_10
		boton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (primeravez) {
					primeravez = false;
					seleccionados[10] = true;
				} else {
					comparar(boton_10, botones);
				}
			}
		});
		// Acción al pulsar el boton_11
		boton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (primeravez) {
					primeravez = false;
					seleccionados[11] = true;

				} else {
					comparar(boton_11, botones);
				}
			}
		});
		// Acción al pulsar el boton_12
		boton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (primeravez) {
					primeravez = false;
					seleccionados[12] = true;
				} else {
					comparar(boton_12, botones);
				}
			}
		});
		// Acción al pulsar el boton_13
		boton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (primeravez) {
					primeravez = false;
					seleccionados[13] = true;
				} else {
					comparar(boton_13, botones);
				}
			}
		});
		// Acción al pulsar el boton_14
		boton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (primeravez) {
					primeravez = false;
					seleccionados[14] = true;
				} else {
					comparar(boton_14, botones);
				}
			}
		});
		// Acción al pulsar el boton_15
		boton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (primeravez) {
					primeravez = false;
					seleccionados[15] = true;
				} else {
					comparar(boton_15, botones);
				}
			}
		});
	}

	// Método que realiza la comparación de cartas
	public void comparar(JToggleButton botonA, JToggleButton arrayBtn[]) {
		int contador = 0; // Variable que indicará intentos
		JToggleButton botonB = new JToggleButton();
		for (int i = 0; i < 16; i++) {
			if (seleccionados[i]) {
				botonB = botones[i];
				seleccionados[i] = false;
			}
		}
		primeravez = true;
		contadorintentos++;

		if (botonA.getText().equals(botonB.getText())) {
			if (botonA == botonB) {
			} else {
				botonA.setEnabled(false);
				botonB.setEnabled(false);
				contador++;
				if (contador == 8) {
					JOptionPane.showMessageDialog(null,
							"¡Felicidades, has ganado! \nHas tenido " + (contadorintentos - 7) + " fallos.");
				}
			}
		} else {
			botonA.setSelected(false);
			botonB.setSelected(false);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			botonA.setSelected(false);
			botonB.setSelected(false);
		}
	}
}