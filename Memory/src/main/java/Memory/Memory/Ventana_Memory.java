package Memory.Memory;

import java.awt.BorderLayout;
import java.util.Timer;
import java.util.concurrent.TimeUnit;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.util.Timer;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.ButtonGroup;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ventana_Memory extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	boolean seleccionados[] = new boolean[] { false, false, false, false, false, false, false, false, false, false,
			false, false, false, false, false, false };
	JToggleButton botones[] = new JToggleButton[16];
	boolean primeravez = true;
	boolean girado = false;
//	Timer tiempo= new Timer();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana_Memory frame = new Ventana_Memory();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana_Memory() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 419);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

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
		buttonGroup.add(boton_10);
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

		boton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (primeravez && !girado) {
					primeravez = false;
					girado = true;
					seleccionados[0] = true;

				} else {

					for (int i = 0; i < 16; i++) {
						if (seleccionados[i]) {

							comparar(boton, botones[i]);
							primeravez = true;

							seleccionados[i] = false;
						}
					}
				}

			}

		});
		boton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (primeravez && !girado) {
					primeravez = false;
					girado = true;
					seleccionados[0] = true;

				} else {

					for (int i = 0; i < 16; i++) {
						if (seleccionados[i]) {
							comparar(boton_1, botones[i]);
							primeravez = true;

							seleccionados[i] = false;
						}
					}
				}

			}
		});

		boton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (primeravez && !girado) {
					primeravez = false;
					girado = true;
					seleccionados[3] = true;

				} else {
					for (int i = 0; i < 16; i++) {
						if (seleccionados[i]) {
							comparar(boton_3, botones[i]);
							primeravez = true;

							seleccionados[i] = false;
						}
					}
				}

			}
		});
		boton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (primeravez && !girado) {
					primeravez = false;
					girado = true;
					seleccionados[14] = true;

				} else {
					for (int i = 0; i < 16; i++) {
						if (seleccionados[i]) {
							comparar(boton_14, botones[i]);
							primeravez = true;

							seleccionados[i] = false;
						}
					}
				}

			}
		});
		boton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (primeravez && !girado) {
					primeravez = false;
					girado = true;
					seleccionados[6] = true;

				} else {
					for (int i = 0; i < 16; i++) {
						if (seleccionados[i]) {
							comparar(boton_6, botones[i]);
							primeravez = true;
							seleccionados[i] = false;
						}
					}
				}
			}
		});
		boton_8.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (primeravez && !girado) {
					primeravez = false;
					girado = true;
					seleccionados[8] = true;

				} else {
					for (int i = 0; i < 16; i++) {
						if (seleccionados[i]) {
							comparar(boton_8, botones[i]);
							primeravez = true;
							seleccionados[i] = false;
						}
					}
				}

			}
		});

		boton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (primeravez && !girado) {
					primeravez = false;
					girado = true;
					seleccionados[2] = true;

				} else {
					for (int i = 0; i < 16; i++) {
						if (seleccionados[i]) {
							comparar(boton_2, botones[i]);
							primeravez = true;

							seleccionados[i] = false;
						}
					}
				}
			}
		});
		boton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (primeravez && !girado) {
					primeravez = false;
					girado = true;
					seleccionados[13] = true;

				} else {
					for (int i = 0; i < 16; i++) {
						if (seleccionados[i]) {
							comparar(boton_13, botones[i]);

							seleccionados[i] = false;
						}
					}
				}

			}
		});
		boton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (primeravez && !girado) {
					primeravez = false;
					girado = true;
					seleccionados[4] = true;

				} else {
					for (int i = 0; i < 16; i++) {
						if (seleccionados[i]) {
							comparar(boton_4, botones[i]);
							primeravez = true;
							seleccionados[i] = false;
						}
					}
				}

			}
		});
		boton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (primeravez && !girado) {
					primeravez = false;
					girado = true;
					seleccionados[12] = true;

				} else {
					for (int i = 0; i < 16; i++) {
						if (seleccionados[i]) {
							comparar(boton_12, botones[i]);
							primeravez = true;
							seleccionados[i] = false;
						}
					}
				}

			}
		});
		boton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (primeravez && !girado) {
					primeravez = false;
					girado = true;
					seleccionados[5] = true;

				} else {
					for (int i = 0; i < 16; i++) {
						if (seleccionados[i]) {
							comparar(boton_5, botones[i]);
							primeravez = true;
							seleccionados[i] = false;
						}
					}
				}

			}
		});
		boton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (primeravez && !girado) {
					primeravez = false;
					girado = true;
					seleccionados[11] = true;

				} else {
					for (int i = 0; i < 16; i++) {
						if (seleccionados[i]) {
							comparar(boton_11, botones[i]);
							primeravez = true;
							seleccionados[i] = false;
						}
					}
				}

			}
		});
		boton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (primeravez && !girado) {
					primeravez = false;
					girado = true;
					seleccionados[7] = true;

				} else {
					for (int i = 0; i < 16; i++) {
						if (seleccionados[i]) {
							comparar(boton_7, botones[i]);
							primeravez = true;
							seleccionados[i] = false;
						}
					}
				}

			}
		});
		boton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (primeravez && !girado) {
					primeravez = false;
					girado = true;
					seleccionados[10] = true;

				} else {
					for (int i = 0; i < 16; i++) {
						if (seleccionados[i]) {
							comparar(boton_10, botones[i]);
							primeravez = true;

							seleccionados[i] = false;
						}
					}
				}

			}
		});
		boton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (primeravez && !girado) {
					primeravez = false;
					girado = true;
					seleccionados[9] = true;

				} else {

					for (int i = 0; i < 16; i++) {
						if (seleccionados[i]) {
							comparar(boton_9, botones[i]);
							primeravez = true;
							seleccionados[i] = false;
						}
					}
				}

			}
		});
		boton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (primeravez && !girado) {
					primeravez = false;
					girado = true;
					seleccionados[15] = true;

				} else {

					for (int i = 0; i < 16; i++) {
						if (seleccionados[i]) {
							comparar(boton_15, botones[i]);
							primeravez = true;
							seleccionados[i] = false;
						}
					}
				}
			}
		});

	}

	public void comparar(JToggleButton botona, JToggleButton botonb) {
		if (botona.getText().equals(botonb.getText())) {
			if (botona == botonb) {

			} else {

				botona.setEnabled(false);
				botonb.setEnabled(false);
			}
		} else {

			botona.setSelected(false);
			botonb.setSelected(false);

			try {
				TimeUnit.SECONDS.sleep(1);

			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			botona.setSelected(false);
			botonb.setSelected(false);

		}

	}
}