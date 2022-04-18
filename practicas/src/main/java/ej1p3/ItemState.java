package ej1p3;

public abstract class ItemState {
			
	protected abstract void start(ToDoItem item);
	
	protected abstract void togglePause(ToDoItem item);
	
	protected abstract void finish(ToDoItem item);
	
	protected abstract void addComment(ToDoItem item,String comment);

}
