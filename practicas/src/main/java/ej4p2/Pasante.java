package ej4p2;

public class Pasante extends Empleado {
	
	private int cantExamenes;

	@Override
	public double getBasico() {
		return 20000;
	}
	
	public void setExtamenes(int cant) {
		this.cantExamenes=cant;
	}

	@Override
	public double getAdicional() {
		return 2000*this.cantExamenes;
	}

	@Override
	public boolean estaCasado() {
		return false;
	}

	@Override
	public int getHijos() {
		return 0;
	}

	@Override
	public int examenesRendidos() {
		return cantExamenes;
	}

}
