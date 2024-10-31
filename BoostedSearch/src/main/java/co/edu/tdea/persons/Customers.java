package co.edu.tdea.persons;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import co.edu.tdea.inventory.Inventory;
import co.edu.tdea.inventory.Product;
import co.edu.tdea.inventory.ProductEntry;
import javax.swing.JLabel;
import java.awt.Font;

public class Customers extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable table;
    private DefaultTableModel tableModel;

   
    public Customers(Inventory inventory) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 400);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        

        tableModel = new DefaultTableModel();
        tableModel.addColumn("Product");
        tableModel.addColumn("Store Price");

      
        loadInventoryData(inventory);

        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(30, 79, 540, 231);
        contentPane.add(scrollPane);
        
        JButton btnGoBack = new JButton("Go Back");
        btnGoBack.setBounds(30, 320, 100, 30);
        btnGoBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                ProductEntry productEntry = new ProductEntry();
                productEntry.setVisible(true);
                dispose();
            }
        });
        contentPane.add(btnGoBack);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(99, 67, 148));
        panel.setForeground(new Color(0, 0, 0));
        panel.setBounds(0, 0, 584, 68);
        contentPane.add(panel);
        panel.setLayout(null);
        
        JLabel TitleCustomers = new JLabel("CUSTOMERS");
        TitleCustomers.setForeground(new Color(255, 255, 255));
        TitleCustomers.setFont(new Font("Yu Gothic", Font.BOLD, 20));
        TitleCustomers.setBounds(215, 24, 129, 33);
        panel.add(TitleCustomers);
    }

    private void loadInventoryData(Inventory inventory) {
        for (Product product : inventory.getProducts()) {
            tableModel.addRow(new Object[]{product.getName(), product.getStorePrice()});
        }
    }
}
