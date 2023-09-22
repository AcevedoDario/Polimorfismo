package main;

public class Producto {
	
	private String marca;
	private double precio;
	
	public Producto (String marca, double precio) {
		this.marca = marca;
		this.precio = precio;
	}
	
	public Producto() {
		
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public Double getPrecio() {
		return this.precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
