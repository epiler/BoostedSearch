//Paquetes y librerias
package co.edu.tdea.inventario;

//Clase producto
public class Producto {
	
	//Atributos
	
	private String nombre;
	private int cantidad;
	private String fechaSolicitud;
	private String codigo;
	private String proveedor;
	private double precioProvedor;
	private double precioTienda;
	
	//Constructor sin parametros 
	public Producto() {
	
	}

	public Producto(String nombre, int cantidad, String fechaSolicitud, String codigo, String proveedor,
			double precioProvedor, double precioTienda) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.fechaSolicitud = fechaSolicitud;
		this.codigo = codigo;
		this.proveedor = proveedor;
		this.precioProvedor = precioProvedor;
		this.precioTienda = precioTienda;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getFechaSolicitud() {
		return fechaSolicitud;
	}

	public void setFechaSolicitud(String fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public double getPrecioProvedor() {
		return precioProvedor;
	}

	public void setPrecioProvedor(double precioProvedor) {
		this.precioProvedor = precioProvedor;
	}

	public double getPrecioTienda() {
		return precioTienda;
	}

	public void setPrecioTienda(double precioTienda) {
		this.precioTienda = precioTienda;
	}
	 
	
}
