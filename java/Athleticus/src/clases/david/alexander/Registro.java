package clases.david.alexander;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Button;
import javax.swing.JSeparator;
import java.awt.event.MouseMotionAdapter;

public class Registro {

	private static JFrame frame;
	private JTextField txtNombre;
	private JTextField txtEmail;
	private JTextField txtUsuario;
	private JPasswordField passwordField;
	private JTextField textField_3;
	private int xx,xy;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro window = new Registro();
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Registro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.getContentPane().setBackground(new Color(51, 204, 255));
		frame.setBounds(100, 100, 1122, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(new Color(51, 204, 255));
		panel.setBounds(0, 0, 477, 613);
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
		       Registro.frame.setLocation(x - xx, y - xy);
			}
		});
		lblNewLabel.setIcon(new ImageIcon(Registro.class.getResource("/imagenes/AthleticusLogo (2).png")));
		panel.add(lblNewLabel);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Arial", Font.BOLD, 12));
		txtNombre.setText("nombre");
		txtNombre.setBounds(545, 88, 352, 47);
		frame.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setText("E-mail");
		txtEmail.setFont(new Font("Arial", Font.BOLD, 12));
		txtEmail.setColumns(10);
		txtEmail.setBounds(545, 171, 352, 47);
		frame.getContentPane().add(txtEmail);
		
		txtUsuario = new JTextField();
		txtUsuario.setText("Usuario");
		txtUsuario.setFont(new Font("Arial", Font.BOLD, 12));
		txtUsuario.setColumns(10);
		txtUsuario.setBounds(545, 258, 352, 47);
		frame.getContentPane().add(txtUsuario);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("");
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 12));
		passwordField.setBounds(545, 435, 352, 52);
		frame.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("Registrate");
		lblNewLabel_1.setForeground(SystemColor.text);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1.setBounds(703, 0, 98, 35);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setForeground(SystemColor.text);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_2.setBounds(545, 58, 70, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Correo electronico");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(545, 145, 155, 20);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Usuario");
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_2_2.setBounds(545, 228, 70, 20);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Edad");
		lblNewLabel_2_3.setForeground(Color.WHITE);
		lblNewLabel_2_3.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_2_3.setBounds(545, 315, 52, 20);
		frame.getContentPane().add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_3 = new JLabel("Contrase\u00F1a");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBackground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_3.setBounds(545, 412, 98, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_3.setText("18");
		textField_3.setBounds(545, 347, 352, 47);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		Button button = new Button("Registrar           ");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setForeground(SystemColor.text);
		button.setFont(new Font("Arial", Font.BOLD, 16));
		button.setBackground(new Color(255, 51, 0));
		button.setBounds(545, 514, 352, 52);
		frame.getContentPane().add(button);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(545, 303, 348, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(549, 216, 348, 2);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(545, 133, 348, 2);
		frame.getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(549, 392, 348, 2);
		frame.getContentPane().add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(549, 485, 348, 2);
		frame.getContentPane().add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(545, 88, 348, 2);
		frame.getContentPane().add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(549, 171, 348, 2);
		frame.getContentPane().add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBounds(545, 258, 348, 2);
		frame.getContentPane().add(separator_7);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setBounds(549, 435, 348, 2);
		frame.getContentPane().add(separator_9);
		
		JLabel lbl_cerrar = new JLabel("X");
		lbl_cerrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lbl_cerrar.setForeground(new Color(255, 0, 0));
		lbl_cerrar.setFont(new Font("Tahoma", Font.BOLD, 19));
		lbl_cerrar.setBounds(1067, 0, 86, 35);
		frame.setVisible(true);
		frame.getContentPane().add(lbl_cerrar);
	}
}
