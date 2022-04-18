package ej3p2;

import java.time.LocalDate;

public class Archivo extends FileSystem{

	public Archivo(String nombre, LocalDate fecha_creacion, int tamano) {
		super(nombre, fecha_creacion, tamano);
	}
	
	
	public Archivo archivoMasGrande() {
		return this;
	}
	
	public Archivo archivoMasNuevo() {
		return this;
	}
	


	

}