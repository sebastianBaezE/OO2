package ej4p3;

import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public abstract class Sugeridor {
	
	public List<Pelicula> getSugerencias(Decodificador d){
		List<Pelicula> miLista=this.getListaPeliculas(d);
		
		return miLista.stream()
		.sorted(this.getComparator())
		.limit(3)
		.collect(Collectors.toList());
	}
	
	public abstract Comparator<Pelicula> getComparator();
	
	public abstract List<Pelicula> getListaPeliculas(Decodificador d);
	

}
