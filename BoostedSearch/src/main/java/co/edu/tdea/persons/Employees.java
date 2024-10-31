package co.edu.tdea.persons;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import co.edu.tdea.inventory.Inventory;
import co.edu.tdea.inventory.ProductEntry;
import co.edu.tdea.logins.Login;

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
import javax.swing.ImageIcon;

public class Employees extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	public Employees() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, 401);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(255, 255, 255));
		setJMenuBar(menuBar);
		
		JMenu EMenu = new JMenu("Options");
		EMenu.setFont(new Font("Yu Gothic", Font.BOLD, 12));
		menuBar.add(EMenu);
		
		JMenuItem MenRegisterProducts = new JMenuItem("Enter products");
		EMenu.add(MenRegisterProducts);
		MenRegisterProducts.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			ProductEntry frame = new ProductEntry();
			frame.setVisible(true);
			dispose();
		}});
		
		
		JSeparator separator = new JSeparator();
		EMenu.add(separator);
		
		JMenuItem MenShow = new JMenuItem("Show products");
		EMenu.add(MenShow);
		
		
	
		/**MenShow.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		      
		        Inventory inventoryFrame = new Inventory();
		        inventoryFrame.setVisible(true); 
		        dispose();
		    }
		});**/

		
		
		
		
		
		
		JSeparator separator_1 = new JSeparator();
		EMenu.add(separator_1);
		
		JMenuItem MenGoBack = new JMenuItem("Go Back");
		EMenu.add(MenGoBack);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		MenGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Login frame = new Login();
				frame.setVisible(true);
				dispose();
			}
		});
		
		
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(99, 67, 148));
		panel.setBounds(0, 0, 540, 340);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel Employees = new JLabel("Employees");
		Employees.setBounds(179, 25, 178, 53);
		panel.add(Employees);
		Employees.setForeground(new Color(255, 255, 255));
		Employees.setFont(new Font("Yu Gothic", Font.BOLD, 32));
		
		JLabel EmployeesImg = new JLabel("");
		EmployeesImg.setIcon(new ImageIcon("C:\\Users\\choju\\Downloads\\EmpleadoR.png"));
		EmployeesImg.setBounds(41, 103, 353, 312);
		panel.add(EmployeesImg);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\choju\\Downloads\\flechaR.png"));
		lblNewLabel.setBounds(-97, -29, 212, 162);
		panel.add(lblNewLabel);
	}
}
