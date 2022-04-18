package ej1p3;

public class InProgress extends ItemState{

	@Override
	protected void start(ToDoItem item) {}

	@Override
	protected void togglePause(ToDoItem item) {
		item.changeState(new Paused());
	}

	@Override
	protected void finish(ToDoItem item) {
		item.changeState(new Finished());		
	}
	
	@Override
	protected void addComment(ToDoItem item,String comment) {
		item.setComment(comment);
	}

}