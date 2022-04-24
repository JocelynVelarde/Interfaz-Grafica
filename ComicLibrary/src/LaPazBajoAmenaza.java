import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;


import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.MalformedURLException;

import java.net.URISyntaxException;
import java.net.URL;

public class LaPazBajoAmenaza {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LaPazBajoAmenaza window = new LaPazBajoAmenaza();
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
	public LaPazBajoAmenaza() {
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
		
		JLabel lblNewLabel = new JLabel("La Paz Bajo Amenaza");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setBounds(99, 23, 232, 50);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("El Tratado de Coruscant");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				abrirlink();
			}
			
			private void abrirlink() {
				URL url=null;
				try {
				    url = new URL("https://starwars.fandom.com/es/wiki/The_Old_Republic,_La_Paz_bajo_Amenaza_Acto_1:_El_Tratado_de_Coruscant#app_personajestps://franciscoguemes.wordpress.com/");
				    try {
				        Desktop.getDesktop().browse(url.toURI());
				    } catch (IOException e) {
				        e.printStackTrace();
				    } catch (URISyntaxException e) {
				        e.printStackTrace();
				    }
				} catch (MalformedURLException e1) {
				    e1.printStackTrace();
				}
			}
			
		});
		btnNewButton.setIcon(null);
		btnNewButton.setBounds(24, 147, 168, 30);
		frame.getContentPane().add(btnNewButton);
	}
	
	public void setVisibility(boolean visible) {
		frame.setVisible(visible);
	}

}
