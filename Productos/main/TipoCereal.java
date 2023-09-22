package main;

public enum TipoCereal {
	TRIGO(8.0),
	MAIZ(12.0),
	AVENA(5.0),
	OTROS(15.0);
	
	private double calorias;
	
	private TipoCereal(double calorias) {
		this.calorias = calorias;
	}
	
	public double getCalorias() {
		return this.calorias;
	}
	
	public String toString() {
		return this.name() + " - " + this.calorias;
	}
}
