package ej4p3;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SugeridorPuntaje extends Sugeridor {

	@Override
	public List<Pelicula> getSugerencias(List<Pelicula> peliculas) {
		return peliculas.stream()
				.filter(pelicula -> !pelicula.seReprodujo())
				.sorted((p1,p2) -> 
				
				/*se define un comparador(utilizado por el sorted)
				 que retorna negativo si tiene menor puntaje,
				 positivo si tiene mayor puntaje 
				 y en caso de que los puntajes sean iguales 
				 compara por ano*/
				
				{
					int comp=Double.compare(p1.getPuntaje(), p2.getPuntaje());
					if (comp==0) {
						return Integer.compare(p1.getAno_estreno(), p1.getAno_estreno());
					}
					return comp;
				})
				.limit(3)
				.collect(Collectors.toList());
						
				
				
	}

	@Override
	public Comparator getComparator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
