package main;

public class Detergente extends Producto implements ConDescuento {
	
	private double descuento;
	
	public Detergente(String marca, double precio) {
		super(marca, precio);
	}
	
	@Override
	public double getDescuento() {
		return descuento;
	}
	
	@Override
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
	@Override
	public double getPrecioDescuento() {
		return this.getPrecio() - (this.getPrecio() * this.getDescuento() / 100);
	}
	
	@Override
	public String toString() {
		return "Detergente " + this.getMarca() + " Precio: $" + this.getPrecioDescuento();
	}
	
}
