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
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Ventana_Memory extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	boolean seleccionados[] = new boolean[] {false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false};
	JToggleButton botones[]= new JToggleButton[16];
	boolean primeravez= true;
	int contador=0;
	int contadorintentos=0;
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
		
		
	
		setTitle("Memory");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 419);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JToggleButton boton = new JToggleButton("6");
		boton.setSelectedIcon(new ImageIcon("/home/mathiasdebrun/Escritorio/imagenes/6.png"));
		boton.setBackground(UIManager.getColor("Button.background"));
		boton.setForeground(Color.BLACK);
		
		boton.setBounds(12, 0, 122, 86);
		contentPane.add(boton);
		
		boton.setIcon(null);
		
		JToggleButton boton_1 = new JToggleButton("6");
		
		boton_1.setBounds(12, 98, 122, 86);
		contentPane.add(boton_1);
		
		JToggleButton boton_2 = new JToggleButton("3");
		boton_2.setSelectedIcon(new ImageIcon("/home/mathiasdebrun/Escritorio/imagenes/3.png"));
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
		

		botones[0]=boton;
		botones[1]=boton_1;
		botones[2]=boton_2;
		botones[3]=boton_3;
		botones[4]=boton_4;
		botones[5]=boton_5;
		botones[6]=boton_6;
		botones[7]=boton_7;
		botones[8]=boton_8;
		botones[9]=boton_9;
		botones[10]=boton_10;
		botones[11]=boton_11;
		botones[12]=boton_12;
		botones[13]=boton_13;
		botones[14]=boton_14;
		botones[15]=boton_15;
		boton.setIcon(new ImageIcon("/home/mathiasdebrun/Escritorio/imagenes/in.jpeg"));
		boton_1.setIcon(new ImageIcon("/home/mathiasdebrun/Escritorio/imagenes/in.jpeg"));
		boton_2.setIcon(new ImageIcon("/home/mathiasdebrun/Escritorio/imagenes/in.jpeg"));
		boton_3.setIcon(new ImageIcon("/home/mathiasdebrun/Escritorio/imagenes/in.jpeg"));
		boton_4.setIcon(new ImageIcon("/home/mathiasdebrun/Escritorio/imagenes/in.jpeg"));
		boton_5.setIcon(new ImageIcon("/home/mathiasdebrun/Escritorio/imagenes/in.jpeg"));
		boton_6.setIcon(new ImageIcon("/home/mathiasdebrun/Escritorio/imagenes/in.jpeg"));
		boton_7.setIcon(new ImageIcon("/home/mathiasdebrun/Escritorio/imagenes/in.jpeg"));
		boton_8.setIcon(new ImageIcon("/home/mathiasdebrun/Escritorio/imagenes/in.jpeg"));
		boton_9.setIcon(new ImageIcon("/home/mathiasdebrun/Escritorio/imagenes/in.jpeg"));
		boton_10.setIcon(new ImageIcon("/home/mathiasdebrun/Escritorio/imagenes/in.jpeg"));
		boton_11.setIcon(new ImageIcon("/home/mathiasdebrun/Escritorio/imagenes/in.jpeg"));
		boton_12.setIcon(new ImageIcon("/home/mathiasdebrun/Escritorio/imagenes/in.jpeg"));
		boton_13.setIcon(new ImageIcon("/home/mathiasdebrun/Escritorio/imagenes/in.jpeg"));
		boton_14.setIcon(new ImageIcon("/home/mathiasdebrun/Escritorio/imagenes/in.jpeg"));
		boton_15.setIcon(new ImageIcon("/home/mathiasdebrun/Escritorio/imagenes/in.jpeg"));
		boton.setSelectedIcon(new ImageIcon("/home/mathiasdebrun/Escritorio/imagenes/6.jpg"));
		boton_1.setSelectedIcon(new ImageIcon("/home/mathiasdebrun/Escritorio/imagenes/6.jpg"));
		boton_3.setSelectedIcon(new ImageIcon("/home/mathiasdebrun/Escritorio/imagenes/2.jpg"));
		boton_14.setSelectedIcon(new ImageIcon("/home/mathiasdebrun/Escritorio/imagenes/2.jpg"));
		boton_6.setSelectedIcon(new ImageIcon("/home/mathiasdebrun/Escritorio/imagenes/1.jpg"));
		boton_8.setSelectedIcon(new ImageIcon("/home/mathiasdebrun/Escritorio/imagenes/1.jpg"));
		boton_2.setSelectedIcon(new ImageIcon("/home/mathiasdebrun/Escritorio/imagenes/3.jpg"));
		boton_13.setSelectedIcon(new ImageIcon("/home/mathiasdebrun/Escritorio/imagenes/3.jpg"));
		boton_4.setSelectedIcon(new ImageIcon("/home/mathiasdebrun/Escritorio/imagenes/4.jpeg"));
		boton_12.setSelectedIcon(new ImageIcon("/home/mathiasdebrun/Escritorio/imagenes/4.jpeg"));
		boton_5.setSelectedIcon(new ImageIcon("/home/mathiasdebrun/Escritorio/imagenes/5.jpeg"));
		boton_11.setSelectedIcon(new ImageIcon("/home/mathiasdebrun/Escritorio/imagenes/5.jpeg"));
		boton_7.setSelectedIcon(new ImageIcon("/home/mathiasdebrun/Escritorio/imagenes/7.jpg"));
		boton_10.setSelectedIcon(new ImageIcon("/home/mathiasdebrun/Escritorio/imagenes/7.jpg"));
		boton_9.setSelectedIcon(new ImageIcon("/home/mathiasdebrun/Escritorio/imagenes/8.jpg"));
		boton_15.setSelectedIcon(new ImageIcon("/home/mathiasdebrun/Escritorio/imagenes/8.jpg"));
		
		
		
		
		boton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
		
				if (primeravez) {
					
					primeravez=false;
					seleccionados[0]=true;

					
				} else {

					
					for (int i=0; i<16; i++) {
						 if (seleccionados[i]) {
							comparar(boton, botones[i]);
							 primeravez=true;
							 seleccionados[i]=false;
							 contadorintentos++;
						 }
					}
				 }
			
			}
			
			
			});
		boton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			
				if (primeravez) {
					primeravez=false;
					seleccionados[0]=true;
					
				} else {
					;
					
					
					for (int i=0; i<16; i++) {
						 if (seleccionados[i]) {
							 comparar(boton_1, botones[i]);
							 
							 primeravez=true;
							 seleccionados[i]=false;
							 contadorintentos++;
						 }
					}
				}
				
			}});
		
		
		boton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (primeravez) {
					primeravez=false;
					seleccionados[3]=true;
					
				} else {
					for (int i=0; i<16; i++) {
						 if (seleccionados[i]) {
							 comparar(boton_3, botones[i]);
							 primeravez=true;
							 seleccionados[i]=false;
							 contadorintentos++;
						 }
					}
				}
			}
		});
		boton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (primeravez) {
					primeravez=false;
					seleccionados[14]=true;
					
				} else {
					for (int i=0; i<16; i++) {
						 if (seleccionados[i]) {
							 comparar(boton_14, botones[i]);
							 primeravez=true;
							 seleccionados[i]=false;
							 contadorintentos++;
						 }
					}
				}
			}
		});
		boton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if (primeravez) {
					
					primeravez=false;
					seleccionados[6]=true;
					
				} else {
					for (int i=0; i<16; i++) {
						 if (seleccionados[i]) {
							 comparar(boton_6, botones[i]);
							 primeravez=true;
							 seleccionados[i]=false;
							 contadorintentos++;
						 }
					}
				}
			}
		});
		boton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (primeravez) {
					primeravez=false;
					seleccionados[8]=true;
					
				} else {
					for (int i=0; i<16; i++) {
						 if (seleccionados[i]) {
							 comparar(boton_8, botones[i]);
							 primeravez=true;
							 seleccionados[i]=false;
							 contadorintentos++;
						 }
					}
				}
			}
		});
		
		boton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (primeravez) {
					primeravez=false;
					seleccionados[2]=true;
					
				} else {
					for (int i=0; i<16; i++) {
						 if (seleccionados[i]) {
							 comparar(boton_2, botones[i]);
							 primeravez=true;
							 seleccionados[i]=false;
							 contadorintentos++;
						 }
					}
				}
			}
		});
		boton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (primeravez) {
					primeravez=false;
					seleccionados[13]=true;
					
				} else {
					for (int i=0; i<16; i++) {
						 if (seleccionados[i]) {
							 comparar(boton_13, botones[i]);
							 primeravez=true;
							 seleccionados[i]=false;
							 contadorintentos++;
						 }
					}
				}
			}
		});
		boton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (primeravez) {
					primeravez=false;
					seleccionados[4]=true;
					
				} else {
					for (int i=0; i<16; i++) {
						 if (seleccionados[i]) {
							 comparar(boton_4, botones[i]);
							 primeravez=true;
							 seleccionados[i]=false;
							 contadorintentos++;
						 }
					}
				}
			}
		});
		boton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (primeravez) {
					primeravez=false;
					seleccionados[12]=true;
					
				} else {
					for (int i=0; i<16; i++) {
						 if (seleccionados[i]) {
							 comparar(boton_12, botones[i]);
							 primeravez=true;
							 seleccionados[i]=false;
							 contadorintentos++;
						 }
					}
				}
			}
		});
		boton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (primeravez) {
					primeravez=false;
					seleccionados[5]=true;
					
				} else {
					for (int i=0; i<16; i++) {
						 if (seleccionados[i]) {
							 comparar(boton_5, botones[i]);
							 primeravez=true;
							 seleccionados[i]=false;
							 contadorintentos++;
						 }
					}
				}
			}
		});
		boton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (primeravez) {
					primeravez=false;
					seleccionados[11]=true;
					
				} else {
					for (int i=0; i<16; i++) {
						 if (seleccionados[i]) {
							 comparar(boton_11, botones[i]);
							 primeravez=true;
							 seleccionados[i]=false;
							 contadorintentos++;
						 }
					}
				}
			}
		});
		boton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (primeravez) {
					primeravez=false;
					seleccionados[7]=true;
					
				} else {
					for (int i=0; i<16; i++) {
						 if (seleccionados[i]) {
							 comparar(boton_7, botones[i]);
							 primeravez=true;
							 seleccionados[i]=false;
							 contadorintentos++;
						 }
					}
				}
			}
		});
		boton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (primeravez) {
					primeravez=false;
					seleccionados[10]=true;
					
				} else {
					for (int i=0; i<16; i++) {
						 if (seleccionados[i]) {
							 comparar(boton_10, botones[i]);
							 primeravez=true;
							 seleccionados[i]=false;
							 contadorintentos++;
						 }
					}
				}
			}
		});
		boton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (primeravez) {
					primeravez=false;
					seleccionados[9]=true;
					
				} else {
					
					for (int i=0; i<16; i++) {
						 if (seleccionados[i]) {
							 comparar(boton_9, botones[i]);
							 primeravez=true;
							 seleccionados[i]=false;
							 contadorintentos++;
						 }
					}
				}
			}
		});
		boton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (primeravez) {
					primeravez=false;
					seleccionados[15]=true;
					
				} else {
					
					for (int i=0; i<16; i++) {
						 if (seleccionados[i]) {
							 comparar(boton_15, botones[i]);
							 primeravez=true;
							 seleccionados[i]=false;
							 contadorintentos++;
						 }
					}
				}
			}
		});
	
	}
	
	
	public void comparar(JToggleButton botona, JToggleButton botonb) {
		
		if (botona.getText().equals(botonb.getText())) {
			if (botona==botonb) {
				
			} else {
		
			botona.setEnabled(false);
			botonb.setEnabled(false);
			contador++;
			if (contador==8) {
				JOptionPane.showMessageDialog(null, "Felicidades, has ganado \n Te ha tomado " +(contadorintentos-6)+ " intentos");
			  
			}
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
