package ej1p3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ItemStateTest {
	
	private ToDoItem item;
	
	@BeforeEach
	void setUp() {
		this.item=new ToDoItem("Programar iniciar sesion");
	}

	@Test
	void testState() {
		assertEquals(item.getStateString(),"Pending");
		this.item.start();
		assertEquals(item.getStateString(),"InProgress");
		this.item.togglePause();
		assertEquals(item.getStateString(),"Paused");
		this.item.togglePause();
		assertEquals(item.getStateString(),"InProgress");
		this.item.finish();
		assertEquals(item.getStateString(),"Finished");
	}
	
	@Test
	void testComment() {
		this.item.addComment("Comentario en pending");
		assertEquals(this.item.getComment(),"Comentario en pending");
		this.item.start();
		this.item.addComment("Comentario InProgress");
		assertEquals(this.item.getComment(),"Comentario InProgress");
		this.item.finish();
		this.item.addComment("Comentario no permitido");
		assertEquals(this.item.getComment(),"Comentario InProgress");
		
	}
	
	@Test
	void testThrows() {
    	Exception e = assertThrows(RuntimeException.class, () -> item.togglePause());
    	String expectedMessage = "La tarea no se puede pausar por que no comenzo";
    	assertEquals(expectedMessage, e.getMessage());
    	
    	item.start();
    	item.finish();
    	
    	e = assertThrows(RuntimeException.class, () -> item.togglePause());
    	expectedMessage = "No se puede pausar la tarea esta finalizada";
    	assertEquals(expectedMessage, e.getMessage());
    	
	}

}
