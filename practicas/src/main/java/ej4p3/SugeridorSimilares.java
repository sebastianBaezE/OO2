package ej4p3;

import java.util.Comparator;
import java.util.List;

public class SugeridorSimilares extends Sugeridor{


	@Override
	public Comparator<Pelicula> getComparator(Pelicula p) {
		return Comparator.
	}

	@Override
	public List<Pelicula> getListaPeliculas(Decodificador d) {
		return d.getReproducidas();
	}

	@Override
	public Comparator<Pelicula> getComparator() {
		// TODO Auto-generated method stub
		return null;
	}

}
