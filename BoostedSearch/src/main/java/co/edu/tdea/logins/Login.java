package co.edu.tdea.logins;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import co.edu.tdea.persons.Employees;

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
	 private JTextField userLogin;
	 private JPasswordField passwordLogin;
	 private Button btnLogin;
	 private JComboBox optionBox;

	
	  
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

	        JLabel CompanyName = new JLabel("BetterYou");
	        CompanyName.setForeground(new Color(255, 255, 255));
	        CompanyName.setFont(new Font("Yu Gothic", Font.BOLD, 16));
	        CompanyName.setBounds(66, 215, 82, 24);
	        panel.add(CompanyName);

	        JLabel iconLogin = new JLabel("");
	        iconLogin.setBounds(-156, 70, 348, 129);
	        panel.add(iconLogin);
	        iconLogin.setIcon(new ImageIcon("src/main/resources/icono.png"));

	        JLabel titleLogin = new JLabel("Login");
	        titleLogin.setFont(new Font("Yu Gothic", Font.BOLD, 21));
	        titleLogin.setBounds(311, 54, 56, 31);
	        contentPane.add(titleLogin);

	        JLabel user = new JLabel("USUARIO");
	        user.setFont(new Font("Yu Gothic", Font.BOLD, 11));
	        user.setBounds(316, 114, 51, 14);
	        contentPane.add(user);

	        userLogin = new JTextField();
	        userLogin.setHorizontalAlignment(SwingConstants.CENTER);
	        userLogin.setFont(new Font("Yu Gothic", Font.PLAIN, 11));
	        userLogin.setText("Ingrese su nombre de usuario");
	        userLogin.setForeground(new Color(128, 128, 128));
	        userLogin.setBounds(264, 139, 160, 20);
	        contentPane.add(userLogin);
	        userLogin.setColumns(10);

	        JLabel password = new JLabel("CONTRASEÑA");
	        password.setFont(new Font("Yu Gothic", Font.BOLD, 11));
	        password.setBounds(305, 170, 79, 20);
	        contentPane.add(password);

	        btnLogin = new Button("Entrar");
	        btnLogin.setFont(new Font("Yu Gothic", Font.BOLD, 10));
	        btnLogin.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	
	            	
	            	if(optionBox.getSelectedItem().equals("Empleado")) {
	            		
	            		Employees frame = new Employees();
						frame.setVisible(true);
						dispose();
		                
	            		
	            	}else {
	            		 JOptionPane.showMessageDialog(null,"aaaaaa");
	            	}
	            	
	            	

	                
	            }
	        });

	        btnLogin.setForeground(new Color(255, 255, 255));
	        btnLogin.setBackground(new Color(99, 67, 148));
	        btnLogin.setBounds(365, 256, 70, 22);
	        contentPane.add(btnLogin);

	        passwordLogin = new JPasswordField();
	        passwordLogin.setBounds(264, 201, 160, 20);
	        contentPane.add(passwordLogin);
	        
	        optionBox = new JComboBox();
	        optionBox.setModel(new DefaultComboBoxModel(new String[] { "Cliente", "Empleado" }));
	        
	        optionBox.setFont(new Font("Yu Gothic", Font.BOLD, 10));
	        optionBox.setBounds(251, 256, 79, 22);
	        contentPane.add(optionBox);
	    }
	}