package ej4p3;

import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class SugeridorNovedad extends Sugeridor{


	@Override
	public Comparator<Pelicula> getComparator() {
		return Comparator.comparing(p -> p.getAno_estreno()); //thenComparing();
	}

	@Override
	public List<Pelicula> getListaPeliculas(Decodificador d) {
		return d.getGrilla();
	}

}
