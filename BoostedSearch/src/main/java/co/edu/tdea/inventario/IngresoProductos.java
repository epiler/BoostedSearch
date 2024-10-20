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
        setBounds(100, 100, 600, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblTitle = new JLabel("Ingreso de Productos");
        lblTitle.setFont(new Font("Arial Black", Font.BOLD, 20));
        lblTitle.setBounds(150, 10, 300, 30);
        contentPane.add(lblTitle);

        JLabel lblNombre = new JLabel("Producto:");
        lblNombre.setBounds(30, 60, 100, 25);
        contentPane.add(lblNombre);

        textFieldNombre = new JTextField();
        textFieldNombre.setBounds(150, 60, 200, 25);
        contentPane.add(textFieldNombre);

        JLabel lblCantidad = new JLabel("Cantidad:");
        lblCantidad.setBounds(30, 100, 100, 25);
        contentPane.add(lblCantidad);

        textFieldCantidad = new JTextField();
        textFieldCantidad.setBounds(150, 100, 200, 25);
        contentPane.add(textFieldCantidad);

        JLabel lblFecha = new JLabel("Fecha de solicitud:");
        lblFecha.setBounds(30, 140, 120, 25);
        contentPane.add(lblFecha);

        textFieldFecha = new JTextField();
        textFieldFecha.setBounds(150, 140, 200, 25);
        contentPane.add(textFieldFecha);

        JLabel lblCodigo = new JLabel("Código:");
        lblCodigo.setBounds(30, 180, 100, 25);
        contentPane.add(lblCodigo);

        textFieldCodigo = new JTextField();
        textFieldCodigo.setBounds(150, 180, 200, 25);
        contentPane.add(textFieldCodigo);

        JLabel lblProveedor = new JLabel("Proveedor:");
        lblProveedor.setBounds(30, 220, 100, 25);
        contentPane.add(lblProveedor);

        textFieldProveedor = new JTextField();
        textFieldProveedor.setBounds(150, 220, 200, 25);
        contentPane.add(textFieldProveedor);

        // Panel para los botones
        JPanel panelBotones = new JPanel();
        panelBotones.setBounds(30, 260, 500, 40);
        contentPane.add(panelBotones);

        JButton btnIngresar = new JButton("Ingresar");
        panelBotones.add(btnIngresar);

        JButton btnMostrar = new JButton("Mostrar Inventario");
        panelBotones.add(btnMostrar);

        JButton btnCancelar = new JButton("Cancelar");
        panelBotones.add(btnCancelar);

        // Configuración de la tabla
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Producto");
        tableModel.addColumn("Cantidad");
        tableModel.addColumn("Fecha");
        tableModel.addColumn("Código");
        tableModel.addColumn("Proveedor");

        btnIngresar.addActionListener(e -> {
            try {
                String nombre = textFieldNombre.getText();
                String cantidadTexto = textFieldCantidad.getText();
                int cantidad = Integer.parseInt(cantidadTexto.replaceAll("[^0-9]", ""));
                String fecha = textFieldFecha.getText();
                String codigo = textFieldCodigo.getText();
                String proveedor = textFieldProveedor.getText();

                Producto producto = new Producto(nombre, cantidad, fecha, codigo, proveedor);
                inventario.agregarProducto(producto);

                tableModel.addRow(new Object[]{nombre, cantidadTexto, fecha, codigo, proveedor});
                JOptionPane.showMessageDialog(this, "Producto ingresado", "confimación",
                		JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Por favor, ingresa una cantidad válida.",
                		"Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        btnMostrar.addActionListener(e -> mostrarInventario());

        btnCancelar.addActionListener(e -> {
            // Limpiar campos de texto
            textFieldNombre.setText("");
            textFieldCantidad.setText("");
            textFieldFecha.setText("");
            textFieldCodigo.setText("");
            textFieldProveedor.setText("");
        });
    }

    private void mostrarInventario() {
        if (inventario.getProductos().isEmpty()) {
            JOptionPane.showMessageDialog(this, "El inventario está vacío.",
            		"Inventario", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        JFrame frameInventario = new JFrame("Inventario");
        frameInventario.setBounds(150, 150, 600, 400);
        JPanel panel = new JPanel();
        panel.setBorder(new LineBorder(Color.BLACK, 2));
        frameInventario.getContentPane().add(panel);
        panel.setLayout(new GridLayout(1, 1)); 
        JTable tablaInventario = new JTable(tableModel);
        tablaInventario.setFillsViewportHeight(true); 
        JScrollPane scrollPane = new JScrollPane(tablaInventario);
        panel.add(scrollPane);
        frameInventario.setVisible(true);
        }
}
	
	


