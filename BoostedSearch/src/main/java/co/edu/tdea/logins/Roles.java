package co.edu.tdea.logins;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Roles extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Roles frame = new Roles();
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
	public Roles() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 490, 345);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(99, 67, 148));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre de empresa");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Yu Gothic", Font.BOLD, 13));
		lblNewLabel.setBounds(170, 66, 131, 22);
		contentPane.add(lblNewLabel);
		
		JButton botonCliente = new JButton("Cliente");  
		botonCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginCliente vC = new LoginCliente(); 
				vC.setVisible(true);
				dispose();
				
			}
		});
		botonCliente.setBounds(101, 207, 89, 23);
		contentPane.add(botonCliente);
		
		JButton botonEmpleado = new JButton("Empleado");
		botonEmpleado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginEmpleado vE = new LoginEmpleado(); 
				vE.setVisible(true);
				dispose();
				
				
				
				
			}
		});
		botonEmpleado.setBounds(285, 207, 96, 23);
		contentPane.add(botonEmpleado);
		
		JLabel lblIngresarComo = new JLabel("Ingresar como:");
		lblIngresarComo.setForeground(new Color(0, 0, 0));
		lblIngresarComo.setFont(new Font("Yu Gothic", Font.BOLD, 13));
		lblIngresarComo.setBounds(188, 146, 96, 22);
		contentPane.add(lblIngresarComo);
	}
}
