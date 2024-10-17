package co.edu.tdea.logins;

import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class LoginEmpleado extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField ingreseUsuarioEmp;
	private JPasswordField contraseñaLoginEmp;
	private Button botonLoginEmp;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginEmpleado frame = new LoginEmpleado();
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
	public LoginEmpleado() {
		setResizable(false);
		setTitle("Boosted Search");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 345);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(99, 67, 148));
		panel.setBounds(0, 0, 202, 306);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel imagenLogin = new JLabel("New label");
		imagenLogin.setBounds(-159, 64, 316, 135);
		panel.add(imagenLogin);
		imagenLogin.setIcon(new ImageIcon("C:\\Users\\choju\\Downloads\\icono.png"));
		
		JLabel NombreEmpresa = new JLabel("Nombre empresa");
		NombreEmpresa.setForeground(new Color(0, 0, 0));
		NombreEmpresa.setFont(new Font("Yu Gothic", Font.BOLD, 14));
		NombreEmpresa.setBounds(40, 210, 117, 24);
		panel.add(NombreEmpresa);
		
		JButton botonVolverEmp = new JButton("Volver");
		botonVolverEmp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Roles Rol = new Roles(); 
				Rol.setVisible(true);
				dispose();
				
				
				
			}
		});
		
		botonVolverEmp.setBounds(52, 11, 89, 23);
		panel.add(botonVolverEmp);
		
		JLabel tituloLoginEmp = new JLabel("Login empleados");
		tituloLoginEmp.setFont(new Font("Yu Gothic", Font.BOLD, 21));
		tituloLoginEmp.setBounds(249, 54, 172, 31);
		contentPane.add(tituloLoginEmp);
		
		JLabel usuarioEmp = new JLabel("USUARIO");
		usuarioEmp.setFont(new Font("Yu Gothic", Font.BOLD, 11));
		usuarioEmp.setBounds(316, 114, 51, 14);
		contentPane.add(usuarioEmp);
		
		ingreseUsuarioEmp = new JTextField();
		ingreseUsuarioEmp.setHorizontalAlignment(SwingConstants.CENTER);
		ingreseUsuarioEmp.setFont(new Font("Yu Gothic", Font.PLAIN, 11));
		ingreseUsuarioEmp.setText("Ingrese su nombre de usuario");
		ingreseUsuarioEmp.setForeground(new Color(128, 128, 128));
		ingreseUsuarioEmp.setBounds(264, 139, 160, 20);
		contentPane.add(ingreseUsuarioEmp);
		ingreseUsuarioEmp.setColumns(10);
		
		JLabel contraseñaEmp = new JLabel("CONTRASEÑA");
		contraseñaEmp.setFont(new Font("Yu Gothic", Font.BOLD, 11));
		contraseñaEmp.setBounds(305, 170, 79, 20);
		contentPane.add(contraseñaEmp);
		
		botonLoginEmp = new Button("Entrar");
		botonLoginEmp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				char[] contraseña = contraseñaLoginEmp.getPassword();
				String clave = new String(contraseña);
				
				if(ingreseUsuarioEmp.getText().equals("aaa") && clave.equals("777")) {
				dispose();
				JOptionPane.showMessageDialog(null, "Bienvenido");
				
				
				
				}else {
				JOptionPane.showMessageDialog(null,"Usuario o contraseña incorrectos");
			}
			
			
			}
			
		});
		botonLoginEmp.setForeground(new Color(255, 255, 255));
		botonLoginEmp.setBackground(new Color(99, 67, 148));
		botonLoginEmp.setBounds(305, 244, 70, 22);
		contentPane.add(botonLoginEmp);
		
		Button botonRegistroEmp = new Button("Registrarse");
		botonRegistroEmp.setForeground(Color.WHITE);
		botonRegistroEmp.setBackground(new Color(99, 67, 148));
		botonRegistroEmp.setBounds(305, 274, 70, 22);
		contentPane.add(botonRegistroEmp);
		
		contraseñaLoginEmp = new JPasswordField();
		contraseñaLoginEmp.setBounds(264, 201, 160, 20);
		contentPane.add(contraseñaLoginEmp);
		
	}

}
