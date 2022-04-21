//package
//hay error paquete no existente
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//hola
public class PaginaInicio {

	private JFrame frmComicLibrary;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaginaInicio window = new PaginaInicio();
					window.frmComicLibrary.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PaginaInicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmComicLibrary = new JFrame();
		frmComicLibrary.getContentPane().setForeground(new Color(0, 0, 0));
		frmComicLibrary.getContentPane().setBackground(new Color(255, 255, 255));
		frmComicLibrary.setForeground(Color.WHITE);
		frmComicLibrary.setBackground(new Color(0, 0, 0));
		frmComicLibrary.setTitle("Comic Library");
		frmComicLibrary.setBounds(500, 500, 1248, 782);
		frmComicLibrary.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmComicLibrary.getContentPane().setLayout(null);
		
		JButton btnButtonExplore = new JButton("Explore");
		btnButtonExplore.addMouseListener(new MouseAdapter() {
			@Override	
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnButtonExplore.setFont(new Font("Bahnschrift", Font.PLAIN, 36));
		btnButtonExplore.setBackground(new Color(0, 0, 0));
		btnButtonExplore.setForeground(new Color(0, 0, 0));
		btnButtonExplore.setBounds(499, 633, 250, 75);
		frmComicLibrary.getContentPane().add(btnButtonExplore);
		
		JLabel lbComicLibrary = new JLabel("COMIC LIBRARY");
		lbComicLibrary.setBackground(new Color(255, 255, 255));
		lbComicLibrary.setForeground(new Color(255, 215, 0));
		lbComicLibrary.setFont(new Font("Bahnschrift", Font.PLAIN, 99));
		lbComicLibrary.setBounds(269, 506, 1018, 132);
		frmComicLibrary.getContentPane().add(lbComicLibrary);
		
		JLabel lblWelcome = new JLabel("Welcome");
		lblWelcome.setFont(new Font("Bahnschrift", Font.PLAIN, 99));
		lblWelcome.setForeground(new Color(255, 215, 0));
		lblWelcome.setBounds(441, 38, 536, 221);
		frmComicLibrary.getContentPane().add(lblWelcome);
		
		JLabel lbtoTheUltimate = new JLabel("to the ultimate");
		lbtoTheUltimate.setForeground(new Color(255, 215, 0));
		lbtoTheUltimate.setFont(new Font("Bahnschrift", Font.PLAIN, 99));
		lbtoTheUltimate.setBounds(56, 330, 693, 96);
		frmComicLibrary.getContentPane().add(lbtoTheUltimate);
		
		JLabel lbStarWarsLogo = new JLabel("");
		lbStarWarsLogo.setIcon(new ImageIcon("C:\\Users\\jvela\\Downloads\\pngwing.com.png"));
		lbStarWarsLogo.setBounds(804, 296, 342, 221);
		frmComicLibrary.getContentPane().add(lbStarWarsLogo);
		
		JLabel lbFondoPaginaInicio = new JLabel("fondo pagina inicio ");
		lbFondoPaginaInicio.setForeground(new Color(255, 255, 255));
		lbFondoPaginaInicio.setIcon(new ImageIcon("C:\\Users\\jvela\\Downloads\\31-311540_m.jpg"));
		lbFondoPaginaInicio.setBounds(0, -10, 1234, 787);
		frmComicLibrary.getContentPane().add(lbFondoPaginaInicio);
	}
}

