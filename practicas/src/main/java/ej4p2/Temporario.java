package ej4p2;

public class Temporario extends Empleado {
	
	private boolean casado;
	private int cantHijos;
	private int horasTrabajadas;
	
	public void setCasado(boolean estado) {
		this.casado=estado;
	}
	
	public void setHijos(int cant) {
		this.cantHijos=cant;
	}
	
	public int cantHorasTrabajadas() {
		return this.horasTrabajadas;
	}
	
	public void setHorasTrabajadas(int cant) {
		this.horasTrabajadas=cant;
	}
	
	public double getBasico(){
		return 20000+(this.cantHorasTrabajadas()*300);
	}

	@Override
	public double getAdicional() {
		double adicional=0;
		if (casado) {
			adicional+=5000;
		}
		if (cantHijos > 0 ) {
			adicional+=cantHijos*2000;
		}
		return adicional;
	}

	@Override
	public boolean estaCasado() {
		return casado;
	}

	@Override
	public int getHijos() {
		return cantHijos;
	}

	@Override
	public int examenesRendidos() {
		return 0;
	}

}
