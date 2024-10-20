//Paquetes y librerias
package co.edu.tdea.inventario;

//Clase producto
public class Producto {
	
	//Atributos
	
	String nombre;
	int cantidad;
	String fechaSolicitud;
	String codigo;
	String proveedor;
	
	//Constructor sin parametros
	public Producto() {
	
	}
	 
	//Constructor con parametros
	public Producto(String nombre, int cantidad, String fechaSolicitud, String codigo, String proveedor) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.fechaSolicitud = fechaSolicitud;
		this.codigo = codigo;
		this.proveedor = proveedor;
	}
	//Getters and Setters 
	
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
	}
