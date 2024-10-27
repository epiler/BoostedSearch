//Paquetes y librerias
package co.edu.tdea.inventory;

//Clase producto
public class Product {
	
	//Atributos
	
	private String name;
	private int amount;
	private String applicationDate;
	private String code;
	private String supplier;
	private double supplierPrice;
	private double storePrice;
	
	// Constructor sin parametros
	public Product() {
		super();
	}

	// Cosntructor con parametros
	public Product(String name, int amount, String applicationDate, String code, String supplier, double supplierPrice,
			double storePrice) {
		super();
		this.name = name;
		this.amount = amount;
		this.applicationDate = applicationDate;
		this.code = code;
		this.supplier = supplier;
		this.supplierPrice = supplierPrice;
		this.storePrice = storePrice;
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(String applicationDate) {
		this.applicationDate = applicationDate;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public double getSupplierPrice() {
		return supplierPrice;
	}

	public void setSupplierPrice(double supplierPrice) {
		this.supplierPrice = supplierPrice;
	}

	public double getStorePrice() {
		return storePrice;
	}

	public void setStorePrice(double storePrice) {
		this.storePrice = storePrice;
	}
	
	
	
	
	 
	
}
