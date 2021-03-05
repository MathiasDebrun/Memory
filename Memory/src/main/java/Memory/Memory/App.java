package Memory.Memory;

import java.awt.EventQueue;

public class App 
{
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		//Invoca al JFrame Memory
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
}
