package ej4p3;

import java.util.ArrayList;
import java.util.List;

public class Decodificador {

	private List<Pelicula> grilla;
	private List<Pelicula> reproducidas;
	
	
	public Decodificador () {
		this.grilla=new ArrayList<Pelicula>();
		this.reproducidas=new ArrayList<Pelicula>();
	}
	
	public void addPeliculaAGrilla(Pelicula p) {
		this.grilla.add(p);
	}
	
	public void addPeliculaAReproducidas(Pelicula p) {
		this.reproducidas.add(p);
	}
	
	public List<Pelicula> getGrilla(){
		return this.grilla;
	}
	
	public List<Pelicula> getReproducidas(){
		return this.reproducidas;
	}
	
}
