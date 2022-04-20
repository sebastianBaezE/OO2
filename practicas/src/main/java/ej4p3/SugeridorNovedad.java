package ej4p3;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SugeridorNovedad extends Sugeridor{

	@Override
	public List<Pelicula> getSugerencias(List<Pelicula> peliculas) {
		return peliculas.stream()
				.filter(pelicula -> !pelicula.seReprodujo())
				.sorted(Comparator.comparingInt(pelicula -> pelicula.getAno_estreno()))
				.limit(3)
				.collect(Collectors.toList());
	}

	@Override
	public Comparator getComparator() {
		// TODO Auto-generated method stub
		return null;
	}

}
