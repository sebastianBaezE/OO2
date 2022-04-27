package ej2p4;


public class FileOO2 implements PrettyFile {
	
	private String nombre; 
	private String extension;
	private String tamano;
	private String fecha_creacion;
	private String fecha_modificacion;
	private String permisos;
	

	

	public FileOO2(String nombre, String extension, String tamano, String fecha_creacion,
			String fecha_modificacion, String permisos) {
		super();
		this.nombre = nombre;
		this.extension = extension;
		this.tamano = tamano;
		this.fecha_creacion = fecha_creacion;
		this.fecha_modificacion = fecha_modificacion;
		this.permisos = permisos;
	}


	@Override
	public String prettyPrint() {
		return this.nombre+" - "+this.extension;
	}


	public String getNombre() {
		return nombre;
	}


	public String getExtension() {
		return extension;
	}


	public String getTamano() {
		return tamano;
	}


	public String getFecha_creacion() {
		return fecha_creacion;
	}


	public String getFecha_modificacion() {
		return fecha_modificacion;
	}


	public String getPermisos() {
		return permisos;
	}
	
	

}
