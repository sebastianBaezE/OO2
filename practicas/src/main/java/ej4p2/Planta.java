package ej4p2;

public class Planta extends Empleado{
	
	private boolean casado;
	private int cantHijos;
	private int antiguedad;
	
	@Override
	public double getBasico() {
		return 50000;
	}
	
	public void setCasado(boolean estado) {
		this.casado=estado;
	}
	
	public void setCantHijos(int cantHijos) {
		this.cantHijos=cantHijos;
	}
	
	public void setAntiguedad(int antiguedad) {
		this.antiguedad=antiguedad;
	}

	@Override
	public double getAdicional() {
		if (casado) {
			return 5000+(2000*cantHijos)+(2000*antiguedad);
		}
		return (2000*cantHijos)+(2000*antiguedad);
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
	
	public double adicionalDuda() {
		return super.adicionalDuda()+2000*antiguedad;
	}

}
