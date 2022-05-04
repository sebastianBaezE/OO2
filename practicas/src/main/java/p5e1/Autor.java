package p5e1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Autor extends Searcheble {
	private List<Album> albumes;
	
	public Autor(String string) {
		super(string);
		this.albumes = new ArrayList<Album>();
	}
	
	public List<Cancion> buscarPorAlbum(String nombre){
		return this.albumes.stream()
				.filter(album -> album.coincideString(nombre))
				.flatMap(album -> album.getCanciones().stream())
				.collect(Collectors.toList());
	}
	
	public List<Cancion> buscarPorCancion(String nombre){
		return this.albumes.stream()
				.flatMap(album -> album.buscarPorCancion(nombre).stream())
				.collect(Collectors.toList());
	}
	
	public void agregarAlbum(Album album) {
		this.albumes.add(album);
	}
	
	public List<Album> getAlbumes(){
		return this.albumes;
	}



}
