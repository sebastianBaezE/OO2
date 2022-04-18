package ej4p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TemporarioTest {
	
	private Temporario temporarioCasadoSinHijos;
	private Temporario temporarioSolteroConHijos;
	
	@BeforeEach
	public void setUp() {
		this.temporarioCasadoSinHijos=new Temporario(); /*basico = 20.000+24*300=27200  adicional = 5000
														 descuento=3786*/
		this.temporarioCasadoSinHijos.setCasado(true); 
		this.temporarioCasadoSinHijos.setHijos(0);
		this.temporarioCasadoSinHijos.setHorasTrabajadas(24);
		
		this.temporarioSolteroConHijos=new Temporario();/*basico=23600 adicional=4000 descuento=3268*/
		this.temporarioSolteroConHijos.setCasado(false); 
		this.temporarioSolteroConHijos.setHijos(2);
		this.temporarioSolteroConHijos.setHorasTrabajadas(12);
		
	}

	@Test
	void test() {
		assertEquals(this.temporarioCasadoSinHijos.getSueldo(),28414);
		assertEquals(this.temporarioSolteroConHijos.getSueldo(),24332);
	}

}
