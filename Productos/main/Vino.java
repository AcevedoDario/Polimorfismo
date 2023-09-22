package main;

import java.time.LocalDate;

public class Vino extends Producto implements ConDescuento, EsLiquido, EsAlimento {
	
	private String tipoVino;
	private String tipoEnvase;
	private double volumen;
	private double porcAlcohol;
	private double grAzucar;
	private LocalDate caducidad;
	private double descuento;
	
	public Vino(String marca, double volumen, double precio, String tipoVino, double porcAlcohol, double grAzucar, String tipoEnvase, LocalDate caducidad) {
		super(marca, precio);
		this.volumen = volumen;
		this.tipoVino = tipoVino;
		this.tipoEnvase = tipoEnvase;
		this.porcAlcohol = porcAlcohol;
		this.grAzucar = grAzucar;
		this.caducidad = caducidad;
	}
	
	public double getPorcAlcohol() {
		return porcAlcohol;
	}
	
	public void setPorcAlcohol(double porcAlcohol) {
		this.porcAlcohol = porcAlcohol;
	}
	
	public double getGrAzucar() {
		return grAzucar;
	}
	
	public void setGrAzucar(double grAzucar) {
		this.grAzucar = grAzucar;
	}
	
	public String getTipoVino() {
		return tipoVino;
	}
	
	public void setTipoVino(String tipoVino) {
		this.tipoVino = tipoVino;
	}
	
	public double calcularCaloriasDeAlcohol() {
		System.out.println(volumen * (porcAlcohol / 100.0) * 7.0);
		return volumen * (porcAlcohol / 100.0) * 7.0;
	}
	
	public double calcularCaloriasDeAzucar() {
		return volumen * grAzucar * 4.0;
	}
	
	//METODOS DE EsLiquido
	@Override
	public double getVolumen() {
		return volumen;
	}
	
	@Override
	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}
	
	@Override
	public String getTipoEnvase() {
		return tipoEnvase;
	}
	
	@Override
	public void setTipoEnvase(String tipoEnvase) {
		this.tipoEnvase = tipoEnvase;
	}
	
	//METODOS DE EsAlimento
	@Override
	public LocalDate getCaducidad() {
		return caducidad;
	}
	
	@Override
	public void setCaducidad(LocalDate caducidad) {
		this.caducidad = caducidad;
	}
	
	@Override
	public double getCalorias() {
		return calcularCaloriasDeAlcohol() + calcularCaloriasDeAzucar();
	}
	
	//METODOS DE ConDescuento
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
	
}
