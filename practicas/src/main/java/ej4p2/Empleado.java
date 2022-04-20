package ej4p2;

public abstract class Empleado {	
	
	public abstract double getBasico();
	public abstract double getAdicional();
	
	public double getSueldo() {
		return this.getBasico()+this.getAdicional()-this.getDescuento();
	}
	
	public double getDescuento() {
		return (this.getBasico()*0.13) + (this.getAdicional()*0.05);
	}
	
	public abstract boolean estaCasado();
	
	public abstract int getHijos();
	
	public abstract int examenesRendidos();
	

}
