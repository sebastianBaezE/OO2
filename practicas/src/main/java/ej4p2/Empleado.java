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
	

	/*
	*DUDAS*
	
	¿hay que aplicar el template method, como?
	
	¿intento de codigo compartido, esta bien?

	*/
	
	public double adicionalDuda(){
		if (this.estaCasado()) {
			return 5000+(2000*this.getHijos());  //con empleado de Planta se hace return super.sueldo+2000*anos_Antiguedad
		}
		return 2000*this.getHijos()+2000*this.examenesRendidos();
	}
	
}
