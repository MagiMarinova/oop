package org.elsys.todo;

import static org.junit.Assert.*;

import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;

public class TodoListImplTest {

	private TodoList todoList = TodoList.parse(
			"TODO    | Do OOP homework              | Low    | school, programming\r\n" + 
			"TODO    | Get 8 hours of sleep.        | Low    | health\r\n" + 
			"DOING   | Party hard.                  | Normal | social\r\n" + 
			"DONE    | Netflix and chill.           | Normal | tv shows\r\n" + 
			"TODO    | Find missing socks.          | Low    | meh\r\n" + 
			"");
	
	private TodoList filtered = TodoList.parse(
			"TODO    | Do OOP homework              | Low    | school, programming\r\n"
					+ "");
	
	@Test
	public void testFilter() {
		TodoList tf = todoList.filter(Criteria.description("OOP", false));
		assertEquals(tf, filtered);
	}
	  
	@Test
	public void testMatchingPercentage() {
		Double d1 = 0.2;
		assertEquals(d1, todoList.matchingPercentage(Criteria.description("Party", false)));
	}
}
