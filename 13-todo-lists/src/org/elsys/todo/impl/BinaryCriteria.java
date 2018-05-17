package org.elsys.todo.impl;

import org.elsys.todo.Criteria;

public class BinaryCriteria extends AbstractCriteria {
	
	private Criteria criteria1;

	private Criteria criteria2;
	
	public BinaryCriteria(Criteria criteria1, Criteria criteria2) {
		this.criteria1 = criteria1;
		this.criteria2 = criteria2;
	}

	public Criteria getCriteria1() {
		return criteria1;
	}

	public void setCriteria1(Criteria criteria1) {
		this.criteria1 = criteria1;
	}

	public Criteria getCriteria2() {
		return criteria2;
	}

	public void setCriteria2(Criteria criteria2) {
		this.criteria2 = criteria2;
	}
}
