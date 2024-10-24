//Paquetes y librerias

package co.edu.tdea.inventario;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

	//Clase
	public class IngresoProductos extends JFrame {
	
	// Atributos
		private JPanel contentPane;
	    private JTextField textFieldNombre;
	    private JTextField textFieldCantidad;
	    private JTextField textFieldFecha;
	    private JTextField textFieldCodigo;
	    private JTextField textFieldProveedor;
	    private JTextField textFieldPrecioProveedor; // Nuevo campo
	    private JTextField textFieldPrecioTienda;    // Nuevo campo
	    private DefaultTableModel tableModel;
	    private Inventario inventario;

	    // Método main
	    public static void main(String[] args) {
	        EventQueue.invokeLater(() -> {
	            try {
	                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	                IngresoProductos frame = new IngresoProductos();
	                frame.setVisible(true);
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        });
	    }

	    // Constructor
	    public IngresoProductos() {
	        inventario = new Inventario();
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setBounds(100, 100, 600, 500); 
	        contentPane = new JPanel();
	        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
	        setContentPane(contentPane);
	        contentPane.setLayout(null);
	        
	        JPanel panel = new JPanel();
	        panel.setBackground(new Color(99, 67, 148));
	        panel.setBounds(0, 0, 584, 70);
	        contentPane.add(panel);
	        panel.setLayout(null);
	        
	        JLabel lblNewLabel = new JLabel("Ingreso de productos");
	        lblNewLabel.setForeground(new Color(255, 255, 255));
	        lblNewLabel.setFont(new Font("Yu Gothic", Font.BOLD, 30));
	        lblNewLabel.setBounds(122, 22, 334, 48);
	        panel.add(lblNewLabel);

	        JLabel lblNombre = new JLabel("Producto:");
	        lblNombre.setFont(new Font("Yu Gothic", Font.BOLD, 13));
	        lblNombre.setBounds(105, 104, 100, 25);
	        contentPane.add(lblNombre);

	        textFieldNombre = new JTextField();
	        textFieldNombre.setBounds(259, 104, 200, 25);
	        contentPane.add(textFieldNombre);

	        JLabel lblCantidad = new JLabel("Cantidad:");
	        lblCantidad.setFont(new Font("Yu Gothic", Font.BOLD, 13));
	        lblCantidad.setBounds(105, 144, 100, 25);
	        contentPane.add(lblCantidad);

	        textFieldCantidad = new JTextField();
	        textFieldCantidad.setBounds(259, 144, 200, 25);
	        contentPane.add(textFieldCantidad);

	        JLabel lblFecha = new JLabel("Fecha de ingreso:");
	        lblFecha.setFont(new Font("Yu Gothic", Font.BOLD, 13));
	        lblFecha.setBounds(105, 184, 120, 25);
	        contentPane.add(lblFecha);

	        textFieldFecha = new JTextField();
	        textFieldFecha.setBounds(259, 184, 200, 25);
	        contentPane.add(textFieldFecha);

	        JLabel lblCodigo = new JLabel("Código:");
	        lblCodigo.setFont(new Font("Yu Gothic", Font.BOLD, 13));
	        lblCodigo.setBounds(105, 224, 100, 25);
	        contentPane.add(lblCodigo);

	        textFieldCodigo = new JTextField();
	        textFieldCodigo.setBounds(259, 224, 200, 25);
	        contentPane.add(textFieldCodigo);

	        JLabel lblProveedor = new JLabel("Proveedor:");
	        lblProveedor.setFont(new Font("Yu Gothic", Font.BOLD, 13));
	        lblProveedor.setBounds(105, 264, 100, 25);
	        contentPane.add(lblProveedor);

	        textFieldProveedor = new JTextField();
	        textFieldProveedor.setBounds(259, 264, 200, 25);
	        contentPane.add(textFieldProveedor);

	        //Campos para los precios
	        JLabel lblPrecioProveedor = new JLabel("Precio Proveedor:");
	        lblPrecioProveedor.setFont(new Font("Yu Gothic", Font.BOLD, 13));
	        lblPrecioProveedor.setBounds(105, 304, 120, 25);
	        contentPane.add(lblPrecioProveedor);

	        textFieldPrecioProveedor = new JTextField();
	        textFieldPrecioProveedor.setBounds(259, 304, 200, 25);
	        contentPane.add(textFieldPrecioProveedor);

	        JLabel lblPrecioTienda = new JLabel("Precio Tienda:");
	        lblPrecioTienda.setFont(new Font("Yu Gothic", Font.BOLD, 13));
	        lblPrecioTienda.setBounds(105, 344, 120, 25);
	        contentPane.add(lblPrecioTienda);

	        textFieldPrecioTienda = new JTextField();
	        textFieldPrecioTienda.setBounds(259, 344, 200, 25);
	        contentPane.add(textFieldPrecioTienda);

	        // Panel para los botones
	        JPanel panelBotones = new JPanel();
	        panelBotones.setBounds(28, 384, 500, 40);
	        contentPane.add(panelBotones);

	        JButton btnIngresar = new JButton("Ingresar");
	        btnIngresar.setFont(new Font("Yu Gothic", Font.BOLD, 11));
	        panelBotones.add(btnIngresar);

	        JButton btnMostrar = new JButton("Mostrar Inventario");
	        btnMostrar.setFont(new Font("Yu Gothic", Font.BOLD, 11));
	        panelBotones.add(btnMostrar);

	        // Configuración de la tabla
	        tableModel = new DefaultTableModel();
	        tableModel.addColumn("Producto");
	        tableModel.addColumn("Cantidad");
	        tableModel.addColumn("Fecha");
	        tableModel.addColumn("Código");
	        tableModel.addColumn("Proveedor");
	        tableModel.addColumn("Precio Proveedor");
	        tableModel.addColumn("Precio Tienda");

	        btnIngresar.addActionListener(e -> {
	            try {
	                String nombre = textFieldNombre.getText();
	                String cantidadTexto = textFieldCantidad.getText();
	                int cantidad = Integer.parseInt(cantidadTexto);
	                String fecha = textFieldFecha.getText();
	                String codigo = textFieldCodigo.getText();
	                String proveedor = textFieldProveedor.getText();
	                double precioProveedor = Double.parseDouble(textFieldPrecioProveedor.getText());
	                double precioTienda = Double.parseDouble(textFieldPrecioTienda.getText());

	                Producto producto = new Producto(nombre, cantidad, fecha, codigo, 
	                proveedor, precioProveedor, precioTienda);
	                inventario.agregarProducto(producto);

	                tableModel.addRow(new Object[]{nombre, cantidad, fecha, codigo, proveedor, 
	                		precioProveedor, precioTienda});
	                JOptionPane.showMessageDialog(this, "Producto ingresado", "Confirmación",
	                		JOptionPane.INFORMATION_MESSAGE);
	            } catch (NumberFormatException ex) {
	                JOptionPane.showMessageDialog(this, "Por favor ingresa una cantidad valida.",
	                		"Error", JOptionPane.ERROR_MESSAGE);
	            }
	        });

	        btnMostrar.addActionListener(e -> mostrarInventario());
	    }

	    private void mostrarInventario() {
	        if (inventario.getProductos().isEmpty()) {
	            JOptionPane.showMessageDialog(this, "El inventario está vacío.",
	                    "Inventario", JOptionPane.INFORMATION_MESSAGE);
	            return;
	        }

	        JFrame frameInventario = new JFrame("Inventario");
	        frameInventario.setBounds(150, 150, 800, 400); 
	        JPanel panel = new JPanel();
	        panel.setBorder(new LineBorder(Color.BLACK, 2));
	        frameInventario.getContentPane().add(panel);
	        panel.setLayout(new GridLayout(1, 1));
	        
	        JTable tablaInventario = new JTable(tableModel);
	        tablaInventario.setFillsViewportHeight(true);
	        
	        // Ajuste de la tabla
	        tablaInventario.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
	        
	        // Ajustar el tamaño 
	        tablaInventario.setPreferredScrollableViewportSize(new java.awt.Dimension(750, 300));

	        JScrollPane scrollPane = new JScrollPane(tablaInventario);
	        panel.add(scrollPane);

	        frameInventario.setVisible(true);

        }
}
	
	


