package org.elsys.todo.impl;

import java.util.function.Predicate;

import org.elsys.todo.Criteria;
import org.elsys.todo.Task;

public class AbstractCriteria implements Criteria {

	protected Predicate<Task> criteriaType;
	
	public Predicate<Task> getCriteriaType() {
		return criteriaType;
	}

	public void setCriteriaType(Predicate<Task> criteriaType) {
		this.criteriaType = criteriaType;
	}

	@Override
	public Criteria and(Criteria other) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Criteria or(Criteria other) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Criteria xor(Criteria other) {
		return new XorCriteria(this, other);
	}

	@Override
	public Criteria not() {
		// TODO Auto-generated method stub
		return null;
	}

}
