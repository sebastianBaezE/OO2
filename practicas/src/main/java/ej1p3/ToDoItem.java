package ej1p3;

import java.time.Duration;
import java.time.LocalDateTime;

public class ToDoItem {
	
	private LocalDateTime comienzo;
	private LocalDateTime final_;
	private String nombre;
	private String comment;
	private ItemState itemState;
	private String stateString;
	
	public ToDoItem(String nombre) {
		this.nombre=nombre;
		this.itemState=new Pending();
		this.stateString="Pending";
	}
	
	public void changeState(ItemState state, String stateString) {
		this.itemState=state;
		this.stateString=stateString;
	}
	
	public void start() {
		comienzo=LocalDateTime.now();
		itemState.start(this);
	}
	
	public Duration workedTime() {
		if (this.comienzo==null) {
			throw new RuntimeException("La tarea no ha comenzado");
		}
		if (this.final_!=null) {
			return Duration.between(comienzo, final_);
		}
		return Duration.between(comienzo, LocalDateTime.now());
		
	}
	
	public void togglePause() {
		itemState.togglePause(this);
	}
	
	public void finish() {
		final_=LocalDateTime.now();
		itemState.finish(this);
	}
	
	public void setComment(String comment) {
		this.comment=comment;
	}
	
	public void addComment(String comment) {
		itemState.addComment(this,comment);
	}
	
	public String getStateString() {
		return this.stateString;
	}
	
	public String getComment() {
		return this.comment;
	}
	

}
