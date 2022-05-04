package p5e1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SpOOtifyTest {
	
	Spotify spotify;
	Autor autor;
	Album album;
	List<Cancion> cancionesCharlySNM;
	
	@BeforeEach
	void setUp() {
		Cancion cancion;
		this.cancionesCharlySNM = new ArrayList<Cancion>();
		this.spotify = new Spotify();
		this.autor = new Autor("Charly Garcia");
		this.album = new Album("Say no more");
		
		cancion = new Cancion("Canciones de jirafas");
		this.cancionesCharlySNM.add(cancion);
		this.album.agregarCancion(cancion);
		
		cancion = new Cancion("Necesito un gol");
		this.cancionesCharlySNM.add(cancion);
		this.album.agregarCancion(cancion);
		
		cancion = new Cancion("Cuchillos");
		this.cancionesCharlySNM.add(cancion);
		this.album.agregarCancion(cancion);
		
		this.autor.agregarAlbum(this.album);
		this.spotify.agregarAutor(this.autor);
		
	}

	@Test
	void testBuscarPorAutor() {
		assertEquals(this.cancionesCharlySNM,this.spotify.buscarPorAutor("Charly"));
		assertEquals(Collections.emptyList(), this.spotify.buscarPorAutor("zzz"));
	}
	
	@Test
	void testBuscarPorAlbum() {
		assertEquals(this.cancionesCharlySNM,this.spotify.buscarPorAlbum("Say no more"));
		assertEquals(Collections.emptyList(), this.spotify.buscarPorAlbum("zzz"));
	}
	
	@Test
	void testBuscarPorCancion() {
		List<Cancion> canciones = this.spotify.buscarPorCancion("C");
		
		assertEquals(2,canciones.size());
		assertEquals("Canciones de jirafas", canciones.get(0).getNombre());
		assertEquals("Cuchillos", canciones.get(1).getNombre());
		assertEquals(Collections.emptyList(), this.spotify.buscarPorCancion("zzz"));
	}
}
