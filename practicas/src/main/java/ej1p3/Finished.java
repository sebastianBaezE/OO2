package ej1p3;

public class Finished extends ItemState{

	@Override
	protected void start(ToDoItem item) {}

	@Override
	protected void togglePause(ToDoItem item) {
		throw new RuntimeException("No se puede pausar la tarea esta finalizada");
		
	}

	@Override
	protected void finish(ToDoItem item) {}

	@Override
	protected void addComment(ToDoItem item, String comment) {}

}
