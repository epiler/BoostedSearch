package co.edu.tdea.persons;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import co.edu.tdea.inventory.ProductEntry;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

public class Employees extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	public Employees() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, 401);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(128, 128, 192));
		setJMenuBar(menuBar);
		
		JMenu EMenu = new JMenu("Opciones");
		menuBar.add(EMenu);
		
		JMenuItem MenRegisterProducts = new JMenuItem("Ingresar Productos");
		EMenu.add(MenRegisterProducts);
		MenRegisterProducts.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			ProductEntry frame = new ProductEntry();
			frame.setVisible(true);
			dispose();
		}});
		
		
		JSeparator separator = new JSeparator();
		EMenu.add(separator);
		
		JMenuItem MenShow = new JMenuItem("Mostrar Inventario");
		EMenu.add(MenShow);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(99, 67, 148));
		panel.setBounds(0, 0, 540, 103);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel Employees = new JLabel("Empleados");
		Employees.setBounds(175, 28, 178, 53);
		panel.add(Employees);
		Employees.setForeground(new Color(255, 255, 255));
		Employees.setFont(new Font("Yu Gothic", Font.BOLD, 32));
		
		JButton btnRegisterProducts = new JButton("Ingresar productos");
		btnRegisterProducts.setFont(new Font("Yu Gothic", Font.BOLD, 11));
		btnRegisterProducts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ProductEntry frame = new ProductEntry();
				frame.setVisible(true);
				dispose();
				
	
				
			}
		});
		btnRegisterProducts.setBounds(85, 270, 136, 25);
		contentPane.add(btnRegisterProducts);
		
		JButton btnShow = new JButton("Mostrar Inventario");
		btnShow.setFont(new Font("Yu Gothic", Font.BOLD, 11));
		btnShow.setBounds(311, 270, 131, 27);
		contentPane.add(btnShow);
	}
}
