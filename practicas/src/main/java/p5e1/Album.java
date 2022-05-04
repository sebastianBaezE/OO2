package p5e1;

import java.util.ArrayList;
import java.util.List;

public class Album extends Searcheble {
	

	private List<Cancion> canciones;

	public Album(String string) {
		super(string);
		this.canciones = new ArrayList<Cancion>();
	}
	
	public List<Cancion> getCanciones(){
		return this.canciones;
	}
	
	public void agregarCancion(Cancion cancion) {
		this.canciones.add(cancion);
	}
	
	public List<Cancion> buscarPorCancion(String nombre){
		return this.canciones.stream()
				.filter(cancion -> cancion.coincideString(nombre))
				.toList();
	}
	


	

}
