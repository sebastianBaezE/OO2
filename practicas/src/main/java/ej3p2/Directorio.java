package ej3p2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Directorio extends FileSystem {
	
	
	private ArrayList<FileSystem> hijos;
	

	public Directorio(String nombre, LocalDate fecha_creacion) {
		super(nombre, fecha_creacion, 35);
		this.hijos=new ArrayList<>();
	}

	public int getTamano() {
		return 35;
	}
	
	public int tamanoTotalOcupado() {
		return this.hijos.stream().mapToInt(h -> h.tamano).sum();
	}
	
	public void agregar(FileSystem elemento) {
		this.hijos.add(elemento);
	}
	
	public Archivo archivoMasGrande() {
		return null;
	}
	
	public Archivo archivoMasNuevo() {
		return null;
	}
		
}