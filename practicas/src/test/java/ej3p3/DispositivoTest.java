package ej3p3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DispositivoTest {
	
	private Dispositivo disp;
	
	@BeforeEach
	void setUp() {
		disp=new Dispositivo(new CRC16_Calculator());
	}
	
	@Test
	void testConfigurarCRC() {
		
	}
	
	@Test
	void testChangeConnection() {
		assertEquals(this.disp.changeConnection(new WifiConn()),"Conectado a Wifi");
		assertEquals(this.disp.changeConnection(new Adapter4G()),"Conectado a 4G");
	}

	@Test
	void testSend() {
		assertEquals(this.disp.send("Test mensaje por 4G"),"Se envio data por 4G");
		disp.changeConnection(new WifiConn());
		assertEquals(this.disp.send("Test mensaje por Wifi"),"Se envio data por WifiConn");
	}
	

}
