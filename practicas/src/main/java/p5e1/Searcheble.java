package p5e1;

public class Searcheble {

	protected String nombre;
	
	public Searcheble (String nombre) {
		this.nombre = nombre;
		
	}
	
	public boolean coincideString(String nombre){
		return (this.nombre.contains(nombre));
	}


	

}
