import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class MenuLibrerias {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuLibrerias window = new MenuLibrerias();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenuLibrerias() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSelectALibrary = new JLabel("Select a library");
		lblSelectALibrary.setBounds(133, 52, 192, 13);
		frame.getContentPane().add(lblSelectALibrary);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"La Paz Bajo Amenaza", "La Sangre del Imperio", "Los Soles Perdidos"}));
		comboBox.setBounds(133, 112, 132, 21);
		frame.getContentPane().add(comboBox);
	}
	
	public void setVisibility(boolean visible) {
		frame.setVisible(visible);
	}
}
