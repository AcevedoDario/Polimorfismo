package main;

import java.time.LocalDate;

public class Cereales extends Producto implements EsAlimento{
	
	private TipoCereal tipoCereal;
	private LocalDate caducidad;
	
	public Cereales(String marca, double precio, LocalDate caducidad, TipoCereal tipoCereal) {
		super(marca, precio);
		this.tipoCereal = tipoCereal;
		this.caducidad = LocalDate.MAX;
	}
	
	@Override
	public LocalDate getCaducidad() {
		return caducidad;
	}
	
	@Override
	public void setCaducidad(LocalDate fc) {
		this.caducidad = fc;
	}
	
	public TipoCereal getTipoCereal() {
		return tipoCereal;
	}
	
	public void setTipoCereal(TipoCereal tipoCereal) {
		this.tipoCereal = tipoCereal;
	}
	
	@Override
	public double getCalorias() {
		return tipoCereal.getCalorias();
	}
}
