package p5e1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Spotify {
	
	private List<Usuario> users;
	private List<Autor> autores;
	
	public Spotify() {
		this.users = new ArrayList<Usuario>();
		this.autores = new ArrayList<Autor>();
		
	}
	
	public void agregarUsuario(Usuario u) {
		this.users.add(u);
	}

	public void agregarAutor(Autor autor) {
		this.autores.add(autor);
	}

	public List<Cancion> buscarPorAutor(String name) {
		return this.autores.stream()
				.filter(autor -> autor.coincideString(name))
				.flatMap(autor -> autor.getAlbumes().stream())
				.flatMap(album -> album.getCanciones().stream())
				.collect(Collectors.toList());
				
	}

	public List <Cancion> buscarPorAlbum(String album) {
		return this.autores.stream()
				.flatMap(autor -> autor.buscarPorAlbum(album).stream())
				.collect(Collectors.toList());
	}
	
	public List<Cancion> buscarPorCancion(String cancion) {
		return this.autores.stream()
				.flatMap(autor -> autor.buscarPorCancion(cancion).stream())
				.collect(Collectors.toList());
	}


	

}
