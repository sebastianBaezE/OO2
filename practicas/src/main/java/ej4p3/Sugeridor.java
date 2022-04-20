package ej4p3;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Sugeridor {
	
	public List<Pelicula> getSugerencias(List<Pelicula> peliculas){
		return peliculas.stream()
		.filter(pelicula -> !pelicula.seReprodujo())
		.sorted(this.getComparator())
		.limit(3)
		.collect(Collectors.toList());
	}
	
	public abstract Comparator getComparator();

}
