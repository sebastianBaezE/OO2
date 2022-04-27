package ej2p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClientTest {
	
	private PrettyFile file;
	
	
	@BeforeEach
	void setup() {
		this.file=new FileOO2("testFile", ".txt", "1000", "27/04/2022", "sin modificar", "Permisos: all users");
	}

	@Test
	void testConcreto() {
		assertEquals("testFile - .txt", this.file.prettyPrint());
		assertEquals("testFile",this.file.getNombre());
	}
	
	@Test
	void testDecoratorFechaCreacion() {
		PrettyFile fileFecha = new FileOO2Fecha(this.file);
		System.out.println(fileFecha.prettyPrint());
		assertEquals("testFile - .txt - 27/04/2022", fileFecha.prettyPrint());
	}
	
	@Test
	void testDecoratorTamanoPermisos() {
		PrettyFile fileTamanoPermisos = new FileOO2TamanoP(this.file);
		assertEquals("Permisos: all users - testFile - .txt - 1000",fileTamanoPermisos.prettyPrint());
		
	}

}
