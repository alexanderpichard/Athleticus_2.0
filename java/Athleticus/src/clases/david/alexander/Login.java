package clases.david.alexander;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Button;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.TextField;
import javax.swing.JSpinner;

public class Login {

	private static JFrame frame;
	private JTextField txtUsuario;
	private JPasswordField pwdContraseña;
	private int xx,xy;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		frame.getContentPane().setFocusTraversalPolicyProvider(true);
		frame.getContentPane().setBackground(new Color(0, 204, 255));
		frame.getContentPane().setForeground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 1087, 652);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		panel.setBackground(new Color(0, 204, 255));
		panel.setBounds(0, 0, 544, 662);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				 xx = e.getX();
				 xy = e.getY();
			}
		});
		lblNewLabel_1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
		        int y = e.getYOnScreen();
		       Login.frame.setLocation(x - xx, y - xy); 
			}
		});
		lblNewLabel_1.setBounds(22, 5, 500, 500);
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/imagenes/AthleticusLogo (2).png")));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Athleticus \u00A9 powered by Alexander & David | 2021");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.PLAIN, 15));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(33, 528, 462, 27);
		panel.add(lblNewLabel_3);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(22, 565, 483, 2);
		panel.add(separator_2);
		
		Button button = new Button("Entrar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setFont(new Font("Arial Black", Font.BOLD, 17));
		button.setForeground(new Color(255, 255, 255));
		button.setBackground(new Color(255, 0, 0));
		button.setBounds(584, 305, 394, 54);
		frame.getContentPane().add(button);
		
		txtUsuario = new JTextField();
		txtUsuario.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtUsuario.setText("Usuario");
		txtUsuario.setBounds(584, 118, 394, 48);
		frame.getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(584, 164, 394, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 17));
		lblNewLabel.setBounds(584, 89, 80, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setForeground(new Color(255, 255, 255));
		lblContrasea.setFont(new Font("Arial Black", Font.BOLD, 17));
		lblContrasea.setBounds(583, 186, 105, 31);
		frame.getContentPane().add(lblContrasea);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(584, 263, 394, 2);
		frame.getContentPane().add(separator_1);
		
		pwdContraseña = new JPasswordField();
		pwdContraseña.setText("Contrase\u00F1a");
		pwdContraseña.setBounds(584, 217, 394, 48);
		frame.getContentPane().add(pwdContraseña);
		
		JLabel lblNewLabel_2 = new JLabel("Inicia sesi\u00F3n");
		lblNewLabel_2.setBounds(791, 10, 150, 53);
		frame.getContentPane().add(lblNewLabel_2);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		
		JLabel lbl_cerrar = new JLabel("X");
		lbl_cerrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lbl_cerrar.setFont(new Font("Tahoma", Font.BOLD, 19));
		lbl_cerrar.setForeground(new Color(255, 0, 51));
		lbl_cerrar.setBounds(1036, 0, 51, 54);
		frame.getContentPane().add(lbl_cerrar);
		
		Button button_1 = new Button("Registrar");
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Arial Black", Font.BOLD, 17));
		button_1.setBackground(new Color(0, 153, 255));
		button_1.setBounds(584, 429, 394, 54);
		frame.getContentPane().add(button_1);
		
		JLabel lblNewLabel_4 = new JLabel("Registrate");
		lblNewLabel_4.setForeground(SystemColor.text);
		lblNewLabel_4.setBackground(new Color(240, 240, 240));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setBounds(733, 403, 114, 20);
		frame.getContentPane().add(lblNewLabel_4);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(SystemColor.text);
		separator_3.setBounds(991, 557, -416, -15);
		frame.getContentPane().add(separator_3);
		
		JLabel lblNewLabel_4_1 = new JLabel("Entra como invitado");
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4_1.setBackground(SystemColor.menu);
		lblNewLabel_4_1.setBounds(692, 515, 172, 20);
		frame.getContentPane().add(lblNewLabel_4_1);
		
		Button button_1_1 = new Button("Invitado");
		button_1_1.setForeground(Color.WHITE);
		button_1_1.setFont(new Font("Arial Black", Font.BOLD, 17));
		button_1_1.setBackground(new Color(0, 153, 255));
		button_1_1.setBounds(584, 541, 394, 54);
		frame.getContentPane().add(button_1_1);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(584, 427, 394, -4);
		frame.getContentPane().add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(584, 540, 394, 2);
		frame.getContentPane().add(separator_5);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
