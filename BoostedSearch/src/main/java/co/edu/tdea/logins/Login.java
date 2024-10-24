package co.edu.tdea.logins;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import co.edu.tdea.inventario.IngresoProductos;
import co.edu.tdea.personas.Empleados;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;


public class Login extends JFrame {

	 private static final long serialVersionUID = 1L;
	 private JPanel contentPane;
	 private JTextField ingreseUsuario;
	 private JPasswordField contraseñaLogin;
	 private Button botonLogin;
	 private JComboBox comboBox;

	
	 
	 public Login() {
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

	        JLabel NombreEmpresa = new JLabel("BetterYou");
	        NombreEmpresa.setForeground(new Color(255, 255, 255));
	        NombreEmpresa.setFont(new Font("Yu Gothic", Font.BOLD, 16));
	        NombreEmpresa.setBounds(66, 215, 82, 24);
	        panel.add(NombreEmpresa);

	        JLabel iconoLogin = new JLabel("");
	        iconoLogin.setBounds(-156, 70, 348, 129);
	        panel.add(iconoLogin);
	        iconoLogin.setIcon(new ImageIcon("C:\\Users\\choju\\git\\BoostedSearch2\\BoostedSearch\\src\\main\\resources\\icono.png"));

	        JLabel tituloLogin = new JLabel("Login");
	        tituloLogin.setFont(new Font("Yu Gothic", Font.BOLD, 21));
	        tituloLogin.setBounds(311, 54, 56, 31);
	        contentPane.add(tituloLogin);

	        JLabel usuario = new JLabel("USUARIO");
	        usuario.setFont(new Font("Yu Gothic", Font.BOLD, 11));
	        usuario.setBounds(316, 114, 51, 14);
	        contentPane.add(usuario);

	        ingreseUsuario = new JTextField();
	        ingreseUsuario.setHorizontalAlignment(SwingConstants.CENTER);
	        ingreseUsuario.setFont(new Font("Yu Gothic", Font.PLAIN, 11));
	        ingreseUsuario.setText("Ingrese su nombre de usuario");
	        ingreseUsuario.setForeground(new Color(128, 128, 128));
	        ingreseUsuario.setBounds(264, 139, 160, 20);
	        contentPane.add(ingreseUsuario);
	        ingreseUsuario.setColumns(10);

	        JLabel contraseña = new JLabel("CONTRASEÑA");
	        contraseña.setFont(new Font("Yu Gothic", Font.BOLD, 11));
	        contraseña.setBounds(305, 170, 79, 20);
	        contentPane.add(contraseña);

	        botonLogin = new Button("Entrar");
	        botonLogin.setFont(new Font("Yu Gothic", Font.BOLD, 10));
	        botonLogin.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	
	            	
	            	if(comboBox.getSelectedItem().equals("Empleado")) {
	            		
	            		Empleados frame = new Empleados();
						frame.setVisible(true);
						dispose();
		                
	            		
	            	}else {
	            		 JOptionPane.showMessageDialog(null,"aaaaaa");
	            	}
	            	
	            	

	                
	            }
	        });

	        botonLogin.setForeground(new Color(255, 255, 255));
	        botonLogin.setBackground(new Color(99, 67, 148));
	        botonLogin.setBounds(365, 256, 70, 22);
	        contentPane.add(botonLogin);

	        contraseñaLogin = new JPasswordField();
	        contraseñaLogin.setBounds(264, 201, 160, 20);
	        contentPane.add(contraseñaLogin);
	        
	        comboBox = new JComboBox();
	        comboBox.setModel(new DefaultComboBoxModel(new String[] { "Cliente", "Empleado" }));
	        
	        comboBox.setFont(new Font("Yu Gothic", Font.BOLD, 10));
	        comboBox.setBounds(251, 256, 79, 22);
	        contentPane.add(comboBox);
	    }
	}