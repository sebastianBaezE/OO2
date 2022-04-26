package ej4p3;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SugeridorPuntaje extends Sugeridor {



	@Override
	public Comparator<Pelicula> getComparator() {
		return Comparator.comparing((p1,  p2) -> {
			int comp = Double.compare(p1.getPuntaje(), p2.getPuntaje());
			if (comp == 0) {
				return Integer.compare(p1.getAno_estreno , p2.getAno_estreno);
			}
			return comp;
		});
	}

	@Override
	public List<Pelicula> getListaPeliculas(Decodificador d) {
		return d.getGrilla();
	}
	
	

}
