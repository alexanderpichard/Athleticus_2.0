package clases.david.alexander;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Usuario {

	private static JFrame frame;
	private int xx,xy;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usuario window = new Usuario();
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
	public Usuario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.getContentPane().setBackground(new Color(0, 204, 255));
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 204, 255));
		panel.setBounds(0, 0, 415, 621);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				 xx = e.getX();
				 xy = e.getY();
			}
		});
		lblNewLabel.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
		        int y = e.getYOnScreen();
		       frame.setLocation(x - xx, y - xy);
			}
		});
		lblNewLabel.setIcon(new ImageIcon(Usuario.class.getResource("/imagenes/AthleticusLogo (2).png")));
		panel.add(lblNewLabel);
		
		Button button = new Button("Horarios");
		button.setFont(new Font("Arial", Font.BOLD, 12));
		button.setForeground(SystemColor.text);
		button.setBackground(new Color(51, 153, 255));
		button.setBounds(520, 564, 147, 57);
		frame.getContentPane().add(button);
		
		Button button_1 = new Button("Jugadores");
		button_1.setFont(new Font("Arial", Font.BOLD, 12));
		button_1.setForeground(SystemColor.text);
		button_1.setBackground(new Color(102, 153, 255));
		button_1.setBounds(760, 564, 147, 57);
		frame.getContentPane().add(button_1);
		
		Button button_2 = new Button("Reservar pista");
		button_2.setForeground(SystemColor.text);
		button_2.setFont(new Font("Arial", Font.BOLD, 12));
		button_2.setBackground(new Color(102, 153, 204));
		button_2.setBounds(1021, 564, 142, 57);
		frame.getContentPane().add(button_2);
		
		JLabel lbl_cerrar = new JLabel("   X");
		lbl_cerrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lbl_cerrar.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_cerrar.setForeground(Color.RED);
		lbl_cerrar.setBackground(SystemColor.text);
		lbl_cerrar.setBounds(1164, 0, 63, 33);
		frame.getContentPane().add(lbl_cerrar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(520, 48, 649, 448);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Panel Usuario");
		lblNewLabel_1.setForeground(SystemColor.text);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1.setBounds(760, 10, 147, 35);
		frame.getContentPane().add(lblNewLabel_1);
		frame.setBounds(100, 100, 1251, 658);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
