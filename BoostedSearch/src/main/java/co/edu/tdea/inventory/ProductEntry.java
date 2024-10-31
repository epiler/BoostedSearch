package co.edu.tdea.inventory;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import co.edu.tdea.persons.Customers;
import co.edu.tdea.persons.Employees;

import javax.swing.JTable;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

	//Clase
	public class ProductEntry extends JFrame {
	
	// Atributos
		private JPanel contentPane;
	    private JTextField textFieldName;
	    private JTextField textFieldAmount;
	    private JTextField textFieldDate;
	    private JTextField textFieldCode;
	    private JTextField textFieldSupplier;
	    private JTextField textFieldSupplierPrice; 
	    private JTextField textFieldStorePrice;   
	    private DefaultTableModel tableModel;
	    private Inventory inventory;

	    
	     // Constructor
	     public ProductEntry() {
	    	 inventory = new Inventory();
	    	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	         setBounds(100, 100, 600, 500);
	         setResizable(false); // Evita que la ventana se pueda redimensionar
	         contentPane = new JPanel();
	         contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
	         setContentPane(contentPane);
	         contentPane.setLayout(null);

	         JPanel panel = new JPanel();
	         panel.setBackground(new Color(99, 67, 148));
	         panel.setBounds(0, 0, 584, 70);
	         contentPane.add(panel);
	         panel.setLayout(null);

	         JLabel lblProductEntry = new JLabel("Product entry");
	         lblProductEntry.setForeground(new Color(255, 255, 255));
	         lblProductEntry.setFont(new Font("Yu Gothic", Font.BOLD, 30));
	         lblProductEntry.setBounds(176, 22, 206, 48);
	         panel.add(lblProductEntry);

	         JLabel lblName = new JLabel("Product:");
	         lblName.setFont(new Font("Yu Gothic", Font.BOLD, 13));
	         lblName.setBounds(105, 104, 100, 25);
	         contentPane.add(lblName);

	         textFieldName = new JTextField();
	         textFieldName.setBounds(259, 104, 200, 25);
	         contentPane.add(textFieldName);

	         JLabel lblAmount = new JLabel("Amount:");
	         lblAmount.setFont(new Font("Yu Gothic", Font.BOLD, 13));
	         lblAmount.setBounds(105, 144, 100, 25);
	         contentPane.add(lblAmount);

	         textFieldAmount = new JTextField();
	         textFieldAmount.setBounds(259, 144, 200, 25);
	         contentPane.add(textFieldAmount);

	         JLabel lblDate = new JLabel("Date of entry:");
	         lblDate.setFont(new Font("Yu Gothic", Font.BOLD, 13));
	         lblDate.setBounds(105, 184, 120, 25);
	         contentPane.add(lblDate);

	         textFieldDate = new JTextField();
	         textFieldDate.setBounds(259, 184, 200, 25);
	         contentPane.add(textFieldDate);

	         JLabel lblCode = new JLabel("Code:");
	         lblCode.setFont(new Font("Yu Gothic", Font.BOLD, 13));
	         lblCode.setBounds(105, 224, 100, 25);
	         contentPane.add(lblCode);

	         textFieldCode = new JTextField();
	         textFieldCode.setBounds(259, 224, 200, 25);
	         contentPane.add(textFieldCode);

	         JLabel lblSupplier = new JLabel("Supplier:");
	         lblSupplier.setFont(new Font("Yu Gothic", Font.BOLD, 13));
	         lblSupplier.setBounds(105, 264, 100, 25);
	         contentPane.add(lblSupplier);

	         textFieldSupplier = new JTextField();
	         textFieldSupplier.setBounds(259, 264, 200, 25);
	         contentPane.add(textFieldSupplier);

	         // Campos para los precios
	         JLabel lblSupplierPrice = new JLabel("Supplier price:");
	         lblSupplierPrice.setFont(new Font("Yu Gothic", Font.BOLD, 13));
	         lblSupplierPrice.setBounds(105, 304, 120, 25);
	         contentPane.add(lblSupplierPrice);

	         textFieldSupplierPrice = new JTextField();
	         textFieldSupplierPrice.setBounds(259, 304, 200, 25);
	         contentPane.add(textFieldSupplierPrice);

	         JLabel lblStorePrice = new JLabel("Store price:");
	         lblStorePrice.setFont(new Font("Yu Gothic", Font.BOLD, 13));
	         lblStorePrice.setBounds(105, 344, 120, 25);
	         contentPane.add(lblStorePrice);

	         textFieldStorePrice = new JTextField();
	         textFieldStorePrice.setBounds(259, 344, 200, 25);
	         contentPane.add(textFieldStorePrice);

	         // Panel para los botones
	         JPanel panelButtons = new JPanel();
	         panelButtons.setBounds(28, 384, 500, 40);
	         contentPane.add(panelButtons);

	         JButton btnGetInto= new JButton("Get into");
	         btnGetInto.setFont(new Font("Yu Gothic", Font.BOLD, 11));
	         panelButtons.add(btnGetInto);

	         JButton btnShow = new JButton("Show inventory");
	         btnShow.setFont(new Font("Yu Gothic", Font.BOLD, 11));
	         panelButtons.add(btnShow);
	         
	         JButton btnCView = new JButton("Customer view");
	         btnCView.addActionListener(new ActionListener() {
	        	    public void actionPerformed(ActionEvent e) {
	        	        Customers customersFrame = new Customers(inventory); // Pasar la instancia de Inventory
	        	        customersFrame.setVisible(true);
	        	        dispose();
	        	    }
	        	});

	         btnCView.setFont(new Font ("Yu gothic", Font.BOLD, 11));
	         panelButtons.add(btnCView);

	         // Configuración de la tabla
	         tableModel = new DefaultTableModel();
	         tableModel.addColumn("Product");
	         tableModel.addColumn("Amount");
	         tableModel.addColumn("Date");
	         tableModel.addColumn("Code");
	         tableModel.addColumn("Supplier");
	         tableModel.addColumn("Supplier price");
	         tableModel.addColumn("Store price");

	         btnGetInto.addActionListener(e -> {
	             try {
	                 String name = textFieldName.getText();
	                 String amountText = textFieldAmount.getText();
	                 int amount = Integer.parseInt(amountText);
	                 String date = textFieldDate.getText();
	                 String code = textFieldCode.getText();
	                 String supplier = textFieldSupplier.getText();
	                 double supplierPrice = Double.parseDouble(textFieldSupplierPrice.getText());
	                 double storePrice = Double.parseDouble(textFieldStorePrice.getText());

	                 Product product = new Product(name, amount, date, code, 
	                 supplier, supplierPrice, storePrice);
	                 inventory.addProduct(product);

	                 tableModel.addRow(new Object[]{name, amount, date, code, supplier, 
	                         supplierPrice, storePrice});
	                 JOptionPane.showMessageDialog(this, "Product entered", "Confirmation",
	                         JOptionPane.INFORMATION_MESSAGE);

	                 // Eliminar automáticamente la información ingresada
	                 textFieldName.setText(""); 
	                 textFieldAmount.setText("");
	                 textFieldDate.setText("");
	                 textFieldCode.setText("");
	                 textFieldSupplier.setText("");
	                 textFieldSupplierPrice.setText("");
	                 textFieldStorePrice.setText("");
	             } catch (NumberFormatException ex) {
	                 JOptionPane.showMessageDialog(this, "Please enter a valid amount.",
	                         "Mistake", JOptionPane.ERROR_MESSAGE);
	             }
	         });

	         btnShow.addActionListener(e -> ShowInventory());
	     }

	     private void ShowInventory() {
	         if (inventory.getProducts().isEmpty()) {
	        	 JOptionPane.showMessageDialog(this,"The inventory is empty.", "Inventory", 
	        			 JOptionPane.INFORMATION_MESSAGE);
	             
	             return;
	         }
	         
	         JFrame frameInventory = new JFrame("Inventory");
	         frameInventory.setResizable(false);
	         frameInventory.setBounds(150, 150, 800, 400);
	         JPanel panel = new JPanel();
	         panel.setBorder(new LineBorder(Color.BLACK, 2));
	         frameInventory.getContentPane().add(panel);
	         panel.setLayout(new BorderLayout());

	         // Crear el título del encabezado
	         JLabel title = new JLabel("Inventory", SwingConstants.CENTER);
	         title.setFont(new Font("Yu Gothic", Font.BOLD, 24));
	         title.setOpaque(true);
	         title.setBackground (new Color(99, 67, 148));
	         title.setForeground(Color.WHITE);
	         panel.add(title, BorderLayout.NORTH);

	         // Crear la tabla
	         JTable inventoryTable = new JTable(tableModel);
	         inventoryTable.setFillsViewportHeight(true);
	         inventoryTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
	         inventoryTable.setPreferredScrollableViewportSize(new java.awt.Dimension(750, 300));
	         
	         // Estilizar la cabecera de la tabla
	         JTableHeader header = inventoryTable.getTableHeader();
	         header.setFont(new Font("Yu Gothic", Font.BOLD, 14));
	         header.setBackground (new Color(99, 67, 148));
	         header.setForeground(Color.WHITE);
	         header.setOpaque(true);
	         
	      // Ajustar el ancho de las columnas
	         inventoryTable.getColumnModel().getColumn(0).setPreferredWidth(100); 
	         inventoryTable.getColumnModel().getColumn(1).setPreferredWidth(80); 
	         inventoryTable.getColumnModel().getColumn(2).setPreferredWidth(120); 
	         inventoryTable.getColumnModel().getColumn(3).setPreferredWidth(100);	
	         inventoryTable.getColumnModel().getColumn(4).setPreferredWidth(150); 
	         inventoryTable.getColumnModel().getColumn(5).setPreferredWidth(150); 
	         inventoryTable.getColumnModel().getColumn(6).setPreferredWidth(120);

	         // Añadir la tabla al panel con scroll
	         JScrollPane scrollPane = new JScrollPane(inventoryTable);
	         panel.add(scrollPane, BorderLayout.CENTER);
	         
	         // Botón de regresar
	         JButton btnGoBackInventory = new JButton("Go back");
	         btnGoBackInventory.setFont(new Font("Yu Gothic", Font.BOLD, 11));
	         frameInventory.getContentPane().add(btnGoBackInventory, BorderLayout.SOUTH);

	         // Acción del botón de regresar
	         btnGoBackInventory.addActionListener(e1 -> {
	             frameInventory.setVisible(false);
	             setVisible(true);
	         });

	         frameInventory.setVisible(true);
	         setVisible(false);
	         }
	     }