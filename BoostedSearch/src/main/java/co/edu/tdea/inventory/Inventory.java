//Paquetes y librerias
package co.edu.tdea.inventory;

import java.util.ArrayList;
import java.util.List;


//Clase
public class Inventory {

	private List<Product>products;
	
	public Inventory () {
		products = new ArrayList<>();
	}
	
	public void addProduct(Product product) {
		products.add(product);
	}
	
	public List<Product>getProducts(){
		return products;
	}
	
	
} 

