//Paquetes y librerias
package co.edu.tdea.inventario;

import java.util.ArrayList;
import java.util.List;

//Clase
public class Inventario {

	private List<Producto>productos;
	
	public Inventario () {
		productos = new ArrayList<>();
		
	}
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	
	public List<Producto>getProductos(){
		return productos;
	}
} 
