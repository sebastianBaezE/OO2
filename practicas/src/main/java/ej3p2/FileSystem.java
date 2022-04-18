package ej3p2;

import java.time.LocalDate;

public abstract class FileSystem {
	
	protected String nombre;
	protected LocalDate fecha_creacion;
	protected int tamano;
	
	public FileSystem(String nombre, LocalDate fecha_creacion, int tamano) {
		this.nombre=nombre;
		this.fecha_creacion=fecha_creacion;
		this.tamano=tamano;
		
	}
	
	public String getNombre() {
		return this.getNombre();
	}
	
	public int tamanoTotalOcupado() {
		return this.tamano;
	}
	
	public abstract Archivo archivoMasGrande();
	public abstract Archivo archivoMasNuevo();
	
}