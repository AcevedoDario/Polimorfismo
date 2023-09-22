package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import main.Cereales;
import main.Detergente;
import main.TipoCereal;
import main.Vino;

class SupermercadoTest {

	@Test
	public void probarDetergente() {
		Detergente magistral = new Detergente("Magistral", 100.0);
		magistral.setDescuento(10.0);
		assertEquals(90.0, magistral.getPrecioDescuento());
	}
	
	@Test
	public void probarObtenerCaloriasCereales() {
		Cereales quaker = new Cereales("Quaker", 150.00, LocalDate.of(2024, 12, 31), TipoCereal.AVENA);
		assertEquals(5.0, quaker.getCalorias());
	}
	
	@Test
	public void probarCambioCaducidadCereales() {
		Cereales fruitLoops = new Cereales("Fruit Loops",200.00, LocalDate.of(2024, 12, 20), TipoCereal.OTROS);
		fruitLoops.setCaducidad(LocalDate.of(2024, 12, 31));
		assertEquals(LocalDate.of(2024, 12, 31), fruitLoops.getCaducidad());
	}
	
	@Test
	public void probarCalculoCaloriasVino() {
		Vino vinito = new Vino("Termidor", 800, 500.0, "Malbec", 30.0, 2.5, "Tetrapack", LocalDate.of(2030, 9, 20));	
		assertEquals(9680.0,vinito.getCalorias());
	}
}
