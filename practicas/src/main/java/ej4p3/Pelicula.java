package ej4p3;

import java.time.LocalDate;
import java.util.List;

public class Pelicula {
	
	private String titulo;
	private int ano_estreno;
	private List<Pelicula> similares;
	private double puntaje;
	private boolean reproducida;
	
	public Pelicula(String titulo, int ano_estreno, double puntaje) {
		this.titulo=titulo;
		this.ano_estreno=ano_estreno;
		this.puntaje=puntaje;
	}
	
	public boolean seReprodujo() {
		return this.reproducida;
	}
	
	public void setReproducida(boolean reproducida) {
		this.reproducida=reproducida;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getAno_estreno() {
		return ano_estreno;
	}

	public List<Pelicula> getSimilares() {
		return similares;
	}

	public void agregarSimilar(Pelicula pelicula) {
		this.similares.add(pelicula);
		pelicula.agregarSimilar(this);
	}

	public double getPuntaje() {
		return puntaje;
	}
	
	
	

}
