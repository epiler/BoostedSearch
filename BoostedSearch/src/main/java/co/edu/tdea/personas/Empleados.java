package co.edu.tdea.personas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import co.edu.tdea.inventory.IngresoProductos;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;

public class Empleados extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	public Empleados() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(99, 67, 148));
		panel.setBounds(0, 0, 540, 103);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Empleados");
		lblNewLabel.setBounds(175, 28, 178, 53);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Yu Gothic", Font.BOLD, 32));
		
		JButton btnIngresarProductos = new JButton("Ingresar productos");
		btnIngresarProductos.setFont(new Font("Yu Gothic", Font.BOLD, 11));
		btnIngresarProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				IngresoProductos frame = new IngresoProductos();
				frame.setVisible(true);
				dispose();
				
	
				
			}
		});
		btnIngresarProductos.setBounds(85, 270, 136, 25);
		contentPane.add(btnIngresarProductos);
		
		JButton btnMostrar = new JButton("Mostrar Inventario");
		btnMostrar.setFont(new Font("Yu Gothic", Font.BOLD, 11));
		btnMostrar.setBounds(311, 270, 131, 27);
		contentPane.add(btnMostrar);
	}
}
