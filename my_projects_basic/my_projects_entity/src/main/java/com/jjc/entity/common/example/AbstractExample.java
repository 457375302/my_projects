package com.jjc.entity.common.example;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractExample {
	protected String orderByClause;
	protected boolean distinct;
	protected List<GeneratedCriteria> oredCriteria;
	protected int pageStart = -1;

	protected int pageSize = -1;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public AbstractExample() {
		this.oredCriteria = new ArrayList();
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public String getOrderByClause() {
		return this.orderByClause;
	}

	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	public boolean isDistinct() {
		return this.distinct;
	}

	public List<GeneratedCriteria> getOredCriteria() {
		return this.oredCriteria;
	}

	public void or(GeneratedCriteria criteria) {
		this.oredCriteria.add(criteria);
	}

	public GeneratedCriteria or() {
		GeneratedCriteria criteria = createCriteriaInternal();
		this.oredCriteria.add(criteria);
		return criteria;
	}

	public GeneratedCriteria createCriteria() {
		GeneratedCriteria criteria = createCriteriaInternal();
		if (this.oredCriteria.size() == 0) {
			this.oredCriteria.add(criteria);
		}
		return criteria;
	}

	public void clear() {
		this.oredCriteria.clear();
		this.orderByClause = null;
		this.distinct = false;
	}

	public void setPageStart(int pageStart) {
		this.pageStart = pageStart;
	}

	public int getPageStart() {
		return this.pageStart;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageSize() {
		return this.pageSize;
	}

	protected abstract GeneratedCriteria createCriteriaInternal();
}
