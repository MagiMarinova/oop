package org.elsys.todo.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import org.elsys.todo.Criteria;
import org.elsys.todo.Priority;
import org.elsys.todo.Status;
import org.elsys.todo.Task;
import org.elsys.todo.TodoList;

public class TodoListImpl implements TodoList {

	private List<Task> tasks;
	
	/**
	 * TODO    | Do OOP homework              | Low    | school, programming
	 * TODO    | Get 8 hours of sleep.        | Low    | health
	 * DOING   | Party hard.                  | Normal | social
	 * DONE    | Netflix and chill.           | Normal | tv shows
	 * TODO    | Find missing socks.          | Low    | meh

	 * @param input
	 */
	public TodoListImpl(String input) {
		tasks = Arrays.stream(input.split("\n")).map(line -> {
			String[] token = Arrays.stream(line.split("\\|"))
				.map(String::trim)
				.toArray(size -> new String[size]);
			return new TaskImpl(
					Status.valueOf(token[0].toUpperCase()),
					token[1],
					Priority.valueOf(token[2].toUpperCase()),
					token[3].split(", "));
		}).collect(Collectors.toList());
	}

	public TodoListImpl(List<Task> list) {
		tasks = list;
	}

	@Override
	public Boolean isCompleted() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double completedPercentage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double statusPercentage(Status status) {
		double mult = 100.0 / this.tasks.size();
		
		int statusTasksCount = this.tasks
				.stream()
				.filter(t -> t.getStatus().equals(status))
				.collect(Collectors.toList())
				.size();
		
		return Math.round(statusTasksCount * mult) / 100.0;
	}

	@Override
	public Double matchingPercentage(Criteria criteria) {
		double mult = 100.0 / this.tasks.size();
		
		int matchingTasksCount = this.tasks
				.stream()
				.filter(((AbstractCriteria)criteria).getCriteriaType())
				.collect(Collectors.toList())
				.size();
		
		return Math.round(matchingTasksCount * mult) / 100.0;
	}

	@Override
	public List<Task> getTasks() {
		return tasks;
	}

	@Override
	public TodoList filter(Criteria criteria) {
		return new TodoListImpl(this.getTasks()
				.stream()
				.filter(((AbstractCriteria)criteria).getCriteriaType())
				.collect(Collectors.toList()));
	}

	@Override
	public int count(Criteria criteria) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void each(Consumer<Task> consumer) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public TodoList join(TodoList other) {
		List<Task> mergedTasks = new ArrayList<>(this.tasks);
		
		mergedTasks.addAll(other.getTasks());
		
		return new TodoListImpl(mergedTasks);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tasks == null) ? 0 : tasks.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TodoListImpl other = (TodoListImpl) obj;
		if (tasks == null) {
			if (other.tasks != null)
				return false;
		} else if (!tasks.equals(other.tasks))
			return false;
		return true;
	}
	
	

}
