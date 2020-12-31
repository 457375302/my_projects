package com.jjc.entity.knowledge.example;

import com.jjc.entity.common.example.AbstractExample;
import com.jjc.entity.common.example.GeneratedCriteria;

import java.util.List;

public class KnowledgeProductPraiseExample extends AbstractExample {

    @Override
    public Criteria or() {
        return (Criteria)super.or();
    }

    @Override
    public Criteria createCriteria() {
        return (Criteria)super.createCriteria();
    }

    @Override
    protected Criteria createCriteriaInternal() {
        return new Criteria();
    }

    public class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        public Criteria andKnowledgeProductIdIsNull() {
            addCriterion("knowledge_product_id is null");
            return (Criteria) this;
        }

        public Criteria andKnowledgeProductIdIsNotNull() {
            addCriterion("knowledge_product_id is not null");
            return (Criteria) this;
        }

        public Criteria andKnowledgeProductIdEqualTo(Long value) {
            addCriterion("knowledge_product_id =", value, "knowledgeProductId");
            return (Criteria) this;
        }

        public Criteria andKnowledgeProductIdNotEqualTo(Long value) {
            addCriterion("knowledge_product_id <>", value, "knowledgeProductId");
            return (Criteria) this;
        }

        public Criteria andKnowledgeProductIdGreaterThan(Long value) {
            addCriterion("knowledge_product_id >", value, "knowledgeProductId");
            return (Criteria) this;
        }

        public Criteria andKnowledgeProductIdGreaterThanOrEqualTo(Long value) {
            addCriterion("knowledge_product_id >=", value, "knowledgeProductId");
            return (Criteria) this;
        }

        public Criteria andKnowledgeProductIdLessThan(Long value) {
            addCriterion("knowledge_product_id <", value, "knowledgeProductId");
            return (Criteria) this;
        }

        public Criteria andKnowledgeProductIdLessThanOrEqualTo(Long value) {
            addCriterion("knowledge_product_id <=", value, "knowledgeProductId");
            return (Criteria) this;
        }

        public Criteria andKnowledgeProductIdIn(List<Long> values) {
            addCriterion("knowledge_product_id in", values, "knowledgeProductId");
            return (Criteria) this;
        }

        public Criteria andKnowledgeProductIdNotIn(List<Long> values) {
            addCriterion("knowledge_product_id not in", values, "knowledgeProductId");
            return (Criteria) this;
        }

        public Criteria andKnowledgeProductIdBetween(Long value1, Long value2) {
            addCriterion("knowledge_product_id between", value1, value2, "knowledgeProductId");
            return (Criteria) this;
        }

        public Criteria andKnowledgeProductIdNotBetween(Long value1, Long value2) {
            addCriterion("knowledge_product_id not between", value1, value2, "knowledgeProductId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andWouldPraiseIsNull() {
            addCriterion("would_praise is null");
            return (Criteria) this;
        }

        public Criteria andWouldPraiseIsNotNull() {
            addCriterion("would_praise is not null");
            return (Criteria) this;
        }

        public Criteria andWouldPraiseEqualTo(Integer value) {
            addCriterion("would_praise =", value, "wouldPraise");
            return (Criteria) this;
        }

        public Criteria andWouldPraiseNotEqualTo(Integer value) {
            addCriterion("would_praise <>", value, "wouldPraise");
            return (Criteria) this;
        }

        public Criteria andWouldPraiseGreaterThan(Integer value) {
            addCriterion("would_praise >", value, "wouldPraise");
            return (Criteria) this;
        }

        public Criteria andWouldPraiseGreaterThanOrEqualTo(Integer value) {
            addCriterion("would_praise >=", value, "wouldPraise");
            return (Criteria) this;
        }

        public Criteria andWouldPraiseLessThan(Integer value) {
            addCriterion("would_praise <", value, "wouldPraise");
            return (Criteria) this;
        }

        public Criteria andWouldPraiseLessThanOrEqualTo(Integer value) {
            addCriterion("would_praise <=", value, "wouldPraise");
            return (Criteria) this;
        }

        public Criteria andWouldPraiseIn(List<Integer> values) {
            addCriterion("would_praise in", values, "wouldPraise");
            return (Criteria) this;
        }

        public Criteria andWouldPraiseNotIn(List<Integer> values) {
            addCriterion("would_praise not in", values, "wouldPraise");
            return (Criteria) this;
        }

        public Criteria andWouldPraiseBetween(Integer value1, Integer value2) {
            addCriterion("would_praise between", value1, value2, "wouldPraise");
            return (Criteria) this;
        }

        public Criteria andWouldPraiseNotBetween(Integer value1, Integer value2) {
            addCriterion("would_praise not between", value1, value2, "wouldPraise");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(Long value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(Long value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(Long value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(Long value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(Long value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(Long value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<Long> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<Long> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(Long value1, Long value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(Long value1, Long value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
            return (Criteria) this;
        }
    }
}