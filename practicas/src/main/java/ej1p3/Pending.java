package ej1p3;

public class Pending extends ItemState{

	@Override
	public void start(ToDoItem item) {
		item.changeState(new InProgress(),"InProgress");
	}

	@Override
	protected void togglePause(ToDoItem item) {
		throw new RuntimeException("La tarea no se puede pausar por que no comenzo");
		
	}

	@Override
	protected void finish(ToDoItem item) {}

	@Override
	protected void addComment(ToDoItem item,String comment) {
		item.setComment(comment);
	}

}
