import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MenuLibrerias {

	private JFrame frame;
	private LosSolesPerdidos losSolesPerdidosWindow; 
	private LaPazBajoAmenaza laPazBajoAmenazaWindow;
	private LaSangreImperio laSangreImperioWindow; 
	
	

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
		
		JButton btnNewButton = new JButton("Explore");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				losSolesPerdidosWindow = new LosSolesPerdidos();
				losSolesPerdidosWindow.setVisibility(true);
			}	
			
		});
		btnNewButton.setBounds(32, 172, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Explore");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				laPazBajoAmenazaWindow = new LaPazBajoAmenaza();
				laPazBajoAmenazaWindow.setVisibility(true);
			}
		});
		btnNewButton_1.setBounds(159, 172, 85, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Explore");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				laSangreImperioWindow = new LaSangreImperio();
				laSangreImperioWindow.setVisibility(true);
			}
		});
		btnNewButton_2.setBounds(301, 172, 85, 21);
		frame.getContentPane().add(btnNewButton_2);
	}
	
	public void setVisibility(boolean visible) {
		frame.setVisible(visible);
	}
}
