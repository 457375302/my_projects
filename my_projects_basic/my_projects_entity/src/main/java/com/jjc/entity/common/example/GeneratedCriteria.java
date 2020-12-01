package com.jjc.entity.common.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class GeneratedCriteria {
	protected List<Criterion> criteria;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected GeneratedCriteria() {
		this.criteria = new ArrayList();
	}

	public boolean isValid() {
		return this.criteria.size() > 0;
	}

	public List<Criterion> getAllCriteria() {
		return this.criteria;
	}

	public List<Criterion> getCriteria() {
		return this.criteria;
	}

	protected void addCriterion(String condition) {
		if (condition == null) {
			throw new RuntimeException("Value for condition cannot be null");
		}
		this.criteria.add(new Criterion(condition));
	}

	protected void addCriterion(String condition, Object value, String property) {
		if (value == null) {
			throw new RuntimeException("Value for " + property + " cannot be null");
		}
		this.criteria.add(new Criterion(condition, value));
	}

	protected void addCriterion(String condition, Object value1, Object value2, String property) {
		if ((value1 == null) || (value2 == null)) {
			throw new RuntimeException("Between values for " + property + " cannot be null");
		}
		this.criteria.add(new Criterion(condition, value1, value2));
	}

	protected void addCriterionForJDBCDate(String condition, java.util.Date value, String property) {
		if (value == null) {
			throw new RuntimeException("Value for " + property + " cannot be null");
		}
		addCriterion(condition, new java.sql.Date(value.getTime()), property);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected void addCriterionForJDBCDate(String condition, List<java.util.Date> values, String property) {
		if ((values == null) || (values.size() == 0)) {
			throw new RuntimeException("Value list for " + property + " cannot be null or empty");
		}
		List dateList = new ArrayList();
		Iterator iter = values.iterator();
		while (iter.hasNext()) {
			dateList.add(new java.sql.Date(((java.util.Date) iter.next()).getTime()));
		}
		addCriterion(condition, dateList, property);
	}

	protected void addCriterionForJDBCDate(String condition, java.util.Date value1, java.util.Date value2,
			String property) {
		if ((value1 == null) || (value2 == null)) {
			throw new RuntimeException("Between values for " + property + " cannot be null");
		}
		addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
	}

	public GeneratedCriteria andIdIsNull() {
		addCriterion("id is null");
		return this;
	}

	public GeneratedCriteria andIdIsNotNull() {
		addCriterion("id is not null");
		return this;
	}

	public GeneratedCriteria andIdEqualTo(Long value) {
		addCriterion("id =", value, "id");
		return this;
	}

	public GeneratedCriteria andIdNotEqualTo(Long value) {
		addCriterion("id <>", value, "id");
		return this;
	}

	public GeneratedCriteria andIdGreaterThan(Long value) {
		addCriterion("id >", value, "id");
		return this;
	}

	public GeneratedCriteria andIdGreaterThanOrEqualTo(Long value) {
		addCriterion("id >=", value, "id");
		return this;
	}

	public GeneratedCriteria andIdLessThan(Long value) {
		addCriterion("id <", value, "id");
		return this;
	}

	public GeneratedCriteria andIdLessThanOrEqualTo(Long value) {
		addCriterion("id <=", value, "id");
		return this;
	}

	public GeneratedCriteria andIdIn(List<Long> values) {
		addCriterion("id in", values, "id");
		return this;
	}

	public GeneratedCriteria andIdNotIn(List<Long> values) {
		addCriterion("id not in", values, "id");
		return this;
	}

	public GeneratedCriteria andIdBetween(Long value1, Long value2) {
		addCriterion("id between", value1, value2, "id");
		return this;
	}

	public GeneratedCriteria andIdNotBetween(Long value1, Long value2) {
		addCriterion("id not between", value1, value2, "id");
		return this;
	}

	public GeneratedCriteria andCreateOnIsNull() {
		addCriterion("create_on is null");
		return this;
	}

	public GeneratedCriteria andCreateOnIsNotNull() {
		addCriterion("create_on is not null");
		return this;
	}

	public GeneratedCriteria andCreateOnEqualTo(java.util.Date value) {
		addCriterion("create_on =", value, "createOn");
		return this;
	}

	public GeneratedCriteria andCreateOnNotEqualTo(java.util.Date value) {
		addCriterion("create_on <>", value, "createOn");
		return this;
	}

	public GeneratedCriteria andCreateOnGreaterThan(java.util.Date value) {
		addCriterion("create_on >", value, "createOn");
		return this;
	}

	public GeneratedCriteria andCreateOnGreaterThanOrEqualTo(java.util.Date value) {
		addCriterion("create_on >=", value, "createOn");
		return this;
	}

	public GeneratedCriteria andCreateOnLessThan(java.util.Date value) {
		addCriterion("create_on <", value, "createOn");
		return this;
	}

	public GeneratedCriteria andCreateOnLessThanOrEqualTo(java.util.Date value) {
		addCriterion("create_on <=", value, "createOn");
		return this;
	}

	public GeneratedCriteria andCreateOnIn(List<java.util.Date> values) {
		addCriterion("create_on in", values, "createOn");
		return this;
	}

	public GeneratedCriteria andCreateOnNotIn(List<java.util.Date> values) {
		addCriterion("create_on not in", values, "createOn");
		return this;
	}

	public GeneratedCriteria andCreateOnBetween(java.util.Date value1, java.util.Date value2) {
		addCriterion("create_on between", value1, value2, "createOn");
		return this;
	}

	public GeneratedCriteria andCreateOnNotBetween(java.util.Date value1, java.util.Date value2) {
		addCriterion("create_on not between", value1, value2, "createOn");
		return this;
	}

	public GeneratedCriteria andCreateByIsNull() {
		addCriterion("create_by is null");
		return this;
	}

	public GeneratedCriteria andCreateByIsNotNull() {
		addCriterion("create_by is not null");
		return this;
	}

	public GeneratedCriteria andCreateByEqualTo(Long value) {
		addCriterion("create_by =", value, "createBy");
		return this;
	}

	public GeneratedCriteria andCreateByNotEqualTo(Long value) {
		addCriterion("create_by <>", value, "createBy");
		return this;
	}

	public GeneratedCriteria andCreateByGreaterThan(Long value) {
		addCriterion("create_by >", value, "createBy");
		return this;
	}

	public GeneratedCriteria andCreateByGreaterThanOrEqualTo(Long value) {
		addCriterion("create_by >=", value, "createBy");
		return this;
	}

	public GeneratedCriteria andCreateByLessThan(Long value) {
		addCriterion("create_by <", value, "createBy");
		return this;
	}

	public GeneratedCriteria andCreateByLessThanOrEqualTo(Long value) {
		addCriterion("create_by <=", value, "createBy");
		return this;
	}

	public GeneratedCriteria andCreateByIn(List<Long> values) {
		addCriterion("create_by in", values, "createBy");
		return this;
	}

	public GeneratedCriteria andCreateByNotIn(List<Long> values) {
		addCriterion("create_by not in", values, "createBy");
		return this;
	}

	public GeneratedCriteria andCreateByBetween(Long value1, Long value2) {
		addCriterion("create_by between", value1, value2, "createBy");
		return this;
	}

	public GeneratedCriteria andCreateByNotBetween(Long value1, Long value2) {
		addCriterion("create_by not between", value1, value2, "createBy");
		return this;
	}

	public GeneratedCriteria andUpdateOnIsNull() {
		addCriterion("update_on is null");
		return this;
	}

	public GeneratedCriteria andUpdateOnIsNotNull() {
		addCriterion("update_on is not null");
		return this;
	}

	public GeneratedCriteria andUpdateOnEqualTo(java.util.Date value) {
		addCriterion("update_on =", value, "updateOn");
		return this;
	}

	public GeneratedCriteria andUpdateOnNotEqualTo(java.util.Date value) {
		addCriterion("update_on <>", value, "updateOn");
		return this;
	}

	public GeneratedCriteria andUpdateOnGreaterThan(java.util.Date value) {
		addCriterion("update_on >", value, "updateOn");
		return this;
	}

	public GeneratedCriteria andUpdateOnGreaterThanOrEqualTo(java.util.Date value) {
		addCriterion("update_on >=", value, "updateOn");
		return this;
	}

	public GeneratedCriteria andUpdateOnLessThan(java.util.Date value) {
		addCriterion("update_on <", value, "updateOn");
		return this;
	}

	public GeneratedCriteria andUpdateOnLessThanOrEqualTo(java.util.Date value) {
		addCriterion("update_on <=", value, "updateOn");
		return this;
	}

	public GeneratedCriteria andUpdateOnIn(List<java.util.Date> values) {
		addCriterion("update_on in", values, "updateOn");
		return this;
	}

	public GeneratedCriteria andUpdateOnNotIn(List<java.util.Date> values) {
		addCriterion("update_on not in", values, "updateOn");
		return this;
	}

	public GeneratedCriteria andUpdateOnBetween(java.util.Date value1, java.util.Date value2) {
		addCriterion("update_on between", value1, value2, "updateOn");
		return this;
	}

	public GeneratedCriteria andUpdateOnNotBetween(java.util.Date value1, java.util.Date value2) {
		addCriterion("update_on not between", value1, value2, "updateOn");
		return this;
	}

	public GeneratedCriteria andUpdateByIsNull() {
		addCriterion("update_by is null");
		return this;
	}

	public GeneratedCriteria andUpdateByIsNotNull() {
		addCriterion("update_by is not null");
		return this;
	}

	public GeneratedCriteria andUpdateByEqualTo(Long value) {
		addCriterion("update_by =", value, "updateBy");
		return this;
	}

	public GeneratedCriteria andUpdateByNotEqualTo(Long value) {
		addCriterion("update_by <>", value, "updateBy");
		return this;
	}

	public GeneratedCriteria andUpdateByGreaterThan(Long value) {
		addCriterion("update_by >", value, "updateBy");
		return this;
	}

	public GeneratedCriteria andUpdateByGreaterThanOrEqualTo(Long value) {
		addCriterion("update_by >=", value, "updateBy");
		return this;
	}

	public GeneratedCriteria andUpdateByLessThan(Long value) {
		addCriterion("update_by <", value, "updateBy");
		return this;
	}

	public GeneratedCriteria andUpdateByLessThanOrEqualTo(Long value) {
		addCriterion("update_by <=", value, "updateBy");
		return this;
	}

	public GeneratedCriteria andUpdateByIn(List<Long> values) {
		addCriterion("update_by in", values, "updateBy");
		return this;
	}

	public GeneratedCriteria andUpdateByNotIn(List<Long> values) {
		addCriterion("update_by not in", values, "updateBy");
		return this;
	}

	public GeneratedCriteria andUpdateByBetween(Long value1, Long value2) {
		addCriterion("update_by between", value1, value2, "updateBy");
		return this;
	}

	public GeneratedCriteria andUpdateByNotBetween(Long value1, Long value2) {
		addCriterion("update_by not between", value1, value2, "updateBy");
		return this;
	}

	public GeneratedCriteria andCreateTimeIsNull() {
		addCriterion("create_time is null");
		return this;
	}

	public GeneratedCriteria andCreateTimeIsNotNull() {
		addCriterion("create_time is not null");
		return this;
	}

	public GeneratedCriteria andCreateTimeEqualTo(java.util.Date value) {
		addCriterion("create_time =", value, "createTime");
		return this;
	}

	public GeneratedCriteria andCreateTimeNotEqualTo(java.util.Date value) {
		addCriterion("create_time <>", value, "createTime");
		return this;
	}

	public GeneratedCriteria andCreateTimeGreaterThan(java.util.Date value) {
		addCriterion("create_time >", value, "createTime");
		return this;
	}

	public GeneratedCriteria andCreateTimeGreaterThanOrEqualTo(java.util.Date value) {
		addCriterion("create_time >=", value, "createTime");
		return this;
	}

	public GeneratedCriteria andCreateTimeLessThan(java.util.Date value) {
		addCriterion("create_time <", value, "createTime");
		return this;
	}

	public GeneratedCriteria andCreateTimeLessThanOrEqualTo(java.util.Date value) {
		addCriterion("create_time <=", value, "createTime");
		return this;
	}

	public GeneratedCriteria andCreateTimeIn(List<java.util.Date> values) {
		addCriterion("create_time in", values, "createTime");
		return this;
	}

	public GeneratedCriteria andCreateTimeNotIn(List<java.util.Date> values) {
		addCriterion("create_time not in", values, "createTime");
		return this;
	}

	public GeneratedCriteria andCreateTimeBetween(java.util.Date value1, java.util.Date value2) {
		addCriterion("create_time between", value1, value2, "createTime");
		return this;
	}

	public GeneratedCriteria andCreateTimeNotBetween(java.util.Date value1, java.util.Date value2) {
		addCriterion("create_time not between", value1, value2, "createTime");
		return this;
	}

	public GeneratedCriteria andUpdateTimeIsNull() {
		addCriterion("update_time is null");
		return this;
	}

	public GeneratedCriteria andUpdateTimeIsNotNull() {
		addCriterion("update_time is not null");
		return this;
	}

	public GeneratedCriteria andUpdateTimeEqualTo(java.util.Date value) {
		addCriterion("update_time =", value, "updateTime");
		return this;
	}

	public GeneratedCriteria andUpdateTimeNotEqualTo(java.util.Date value) {
		addCriterion("update_time <>", value, "updateTime");
		return this;
	}

	public GeneratedCriteria andUpdateTimeGreaterThan(java.util.Date value) {
		addCriterion("update_time >", value, "updateTime");
		return this;
	}

	public GeneratedCriteria andUpdateTimeGreaterThanOrEqualTo(java.util.Date value) {
		addCriterion("update_time >=", value, "updateTime");
		return this;
	}

	public GeneratedCriteria andUpdateTimeLessThan(java.util.Date value) {
		addCriterion("update_time <", value, "updateTime");
		return this;
	}

	public GeneratedCriteria andUpdateTimeLessThanOrEqualTo(java.util.Date value) {
		addCriterion("update_time <=", value, "updateTime");
		return this;
	}

	public GeneratedCriteria andUpdateTimeIn(List<java.util.Date> values) {
		addCriterion("update_time in", values, "updateTime");
		return this;
	}

	public GeneratedCriteria andUpdateTimeNotIn(List<java.util.Date> values) {
		addCriterion("update_time not in", values, "updateTime");
		return this;
	}

	public GeneratedCriteria andUpdateTimeBetween(java.util.Date value1, java.util.Date value2) {
		addCriterion("update_time between", value1, value2, "updateTime");
		return this;
	}

	public GeneratedCriteria andUpdateTimeNotBetween(java.util.Date value1, java.util.Date value2) {
		addCriterion("update_time not between", value1, value2, "updateTime");
		return this;
	}
}
