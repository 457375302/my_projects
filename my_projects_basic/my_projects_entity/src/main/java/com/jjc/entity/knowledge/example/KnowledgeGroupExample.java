package com.jjc.entity.knowledge.example;

import com.jjc.entity.common.example.AbstractExample;
import com.jjc.entity.common.example.GeneratedCriteria;

import java.util.List;

public class KnowledgeGroupExample extends AbstractExample {

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

        public Criteria andGroupNameIsNull() {
            addCriterion("group_name is null");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNotNull() {
            addCriterion("group_name is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNameEqualTo(String value) {
            addCriterion("group_name =", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotEqualTo(String value) {
            addCriterion("group_name <>", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThan(String value) {
            addCriterion("group_name >", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("group_name >=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThan(String value) {
            addCriterion("group_name <", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThanOrEqualTo(String value) {
            addCriterion("group_name <=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLike(String value) {
            addCriterion("group_name like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotLike(String value) {
            addCriterion("group_name not like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameIn(List<String> values) {
            addCriterion("group_name in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotIn(List<String> values) {
            addCriterion("group_name not in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameBetween(String value1, String value2) {
            addCriterion("group_name between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotBetween(String value1, String value2) {
            addCriterion("group_name not between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupImgIsNull() {
            addCriterion("group_img is null");
            return (Criteria) this;
        }

        public Criteria andGroupImgIsNotNull() {
            addCriterion("group_img is not null");
            return (Criteria) this;
        }

        public Criteria andGroupImgEqualTo(String value) {
            addCriterion("group_img =", value, "groupImg");
            return (Criteria) this;
        }

        public Criteria andGroupImgNotEqualTo(String value) {
            addCriterion("group_img <>", value, "groupImg");
            return (Criteria) this;
        }

        public Criteria andGroupImgGreaterThan(String value) {
            addCriterion("group_img >", value, "groupImg");
            return (Criteria) this;
        }

        public Criteria andGroupImgGreaterThanOrEqualTo(String value) {
            addCriterion("group_img >=", value, "groupImg");
            return (Criteria) this;
        }

        public Criteria andGroupImgLessThan(String value) {
            addCriterion("group_img <", value, "groupImg");
            return (Criteria) this;
        }

        public Criteria andGroupImgLessThanOrEqualTo(String value) {
            addCriterion("group_img <=", value, "groupImg");
            return (Criteria) this;
        }

        public Criteria andGroupImgLike(String value) {
            addCriterion("group_img like", value, "groupImg");
            return (Criteria) this;
        }

        public Criteria andGroupImgNotLike(String value) {
            addCriterion("group_img not like", value, "groupImg");
            return (Criteria) this;
        }

        public Criteria andGroupImgIn(List<String> values) {
            addCriterion("group_img in", values, "groupImg");
            return (Criteria) this;
        }

        public Criteria andGroupImgNotIn(List<String> values) {
            addCriterion("group_img not in", values, "groupImg");
            return (Criteria) this;
        }

        public Criteria andGroupImgBetween(String value1, String value2) {
            addCriterion("group_img between", value1, value2, "groupImg");
            return (Criteria) this;
        }

        public Criteria andGroupImgNotBetween(String value1, String value2) {
            addCriterion("group_img not between", value1, value2, "groupImg");
            return (Criteria) this;
        }

        public Criteria andGroupSortIsNull() {
            addCriterion("group_sort is null");
            return (Criteria) this;
        }

        public Criteria andGroupSortIsNotNull() {
            addCriterion("group_sort is not null");
            return (Criteria) this;
        }

        public Criteria andGroupSortEqualTo(Integer value) {
            addCriterion("group_sort =", value, "groupSort");
            return (Criteria) this;
        }

        public Criteria andGroupSortNotEqualTo(Integer value) {
            addCriterion("group_sort <>", value, "groupSort");
            return (Criteria) this;
        }

        public Criteria andGroupSortGreaterThan(Integer value) {
            addCriterion("group_sort >", value, "groupSort");
            return (Criteria) this;
        }

        public Criteria andGroupSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_sort >=", value, "groupSort");
            return (Criteria) this;
        }

        public Criteria andGroupSortLessThan(Integer value) {
            addCriterion("group_sort <", value, "groupSort");
            return (Criteria) this;
        }

        public Criteria andGroupSortLessThanOrEqualTo(Integer value) {
            addCriterion("group_sort <=", value, "groupSort");
            return (Criteria) this;
        }

        public Criteria andGroupSortIn(List<Integer> values) {
            addCriterion("group_sort in", values, "groupSort");
            return (Criteria) this;
        }

        public Criteria andGroupSortNotIn(List<Integer> values) {
            addCriterion("group_sort not in", values, "groupSort");
            return (Criteria) this;
        }

        public Criteria andGroupSortBetween(Integer value1, Integer value2) {
            addCriterion("group_sort between", value1, value2, "groupSort");
            return (Criteria) this;
        }

        public Criteria andGroupSortNotBetween(Integer value1, Integer value2) {
            addCriterion("group_sort not between", value1, value2, "groupSort");
            return (Criteria) this;
        }

        public Criteria andWouldShowIsNull() {
            addCriterion("would_show is null");
            return (Criteria) this;
        }

        public Criteria andWouldShowIsNotNull() {
            addCriterion("would_show is not null");
            return (Criteria) this;
        }

        public Criteria andWouldShowEqualTo(Integer value) {
            addCriterion("would_show =", value, "wouldShow");
            return (Criteria) this;
        }

        public Criteria andWouldShowNotEqualTo(Integer value) {
            addCriterion("would_show <>", value, "wouldShow");
            return (Criteria) this;
        }

        public Criteria andWouldShowGreaterThan(Integer value) {
            addCriterion("would_show >", value, "wouldShow");
            return (Criteria) this;
        }

        public Criteria andWouldShowGreaterThanOrEqualTo(Integer value) {
            addCriterion("would_show >=", value, "wouldShow");
            return (Criteria) this;
        }

        public Criteria andWouldShowLessThan(Integer value) {
            addCriterion("would_show <", value, "wouldShow");
            return (Criteria) this;
        }

        public Criteria andWouldShowLessThanOrEqualTo(Integer value) {
            addCriterion("would_show <=", value, "wouldShow");
            return (Criteria) this;
        }

        public Criteria andWouldShowIn(List<Integer> values) {
            addCriterion("would_show in", values, "wouldShow");
            return (Criteria) this;
        }

        public Criteria andWouldShowNotIn(List<Integer> values) {
            addCriterion("would_show not in", values, "wouldShow");
            return (Criteria) this;
        }

        public Criteria andWouldShowBetween(Integer value1, Integer value2) {
            addCriterion("would_show between", value1, value2, "wouldShow");
            return (Criteria) this;
        }

        public Criteria andWouldShowNotBetween(Integer value1, Integer value2) {
            addCriterion("would_show not between", value1, value2, "wouldShow");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andExpand1IsNull() {
            addCriterion("expand1 is null");
            return (Criteria) this;
        }

        public Criteria andExpand1IsNotNull() {
            addCriterion("expand1 is not null");
            return (Criteria) this;
        }

        public Criteria andExpand1EqualTo(String value) {
            addCriterion("expand1 =", value, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand1NotEqualTo(String value) {
            addCriterion("expand1 <>", value, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand1GreaterThan(String value) {
            addCriterion("expand1 >", value, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand1GreaterThanOrEqualTo(String value) {
            addCriterion("expand1 >=", value, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand1LessThan(String value) {
            addCriterion("expand1 <", value, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand1LessThanOrEqualTo(String value) {
            addCriterion("expand1 <=", value, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand1Like(String value) {
            addCriterion("expand1 like", value, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand1NotLike(String value) {
            addCriterion("expand1 not like", value, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand1In(List<String> values) {
            addCriterion("expand1 in", values, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand1NotIn(List<String> values) {
            addCriterion("expand1 not in", values, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand1Between(String value1, String value2) {
            addCriterion("expand1 between", value1, value2, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand1NotBetween(String value1, String value2) {
            addCriterion("expand1 not between", value1, value2, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand2IsNull() {
            addCriterion("expand2 is null");
            return (Criteria) this;
        }

        public Criteria andExpand2IsNotNull() {
            addCriterion("expand2 is not null");
            return (Criteria) this;
        }

        public Criteria andExpand2EqualTo(String value) {
            addCriterion("expand2 =", value, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand2NotEqualTo(String value) {
            addCriterion("expand2 <>", value, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand2GreaterThan(String value) {
            addCriterion("expand2 >", value, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand2GreaterThanOrEqualTo(String value) {
            addCriterion("expand2 >=", value, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand2LessThan(String value) {
            addCriterion("expand2 <", value, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand2LessThanOrEqualTo(String value) {
            addCriterion("expand2 <=", value, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand2Like(String value) {
            addCriterion("expand2 like", value, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand2NotLike(String value) {
            addCriterion("expand2 not like", value, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand2In(List<String> values) {
            addCriterion("expand2 in", values, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand2NotIn(List<String> values) {
            addCriterion("expand2 not in", values, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand2Between(String value1, String value2) {
            addCriterion("expand2 between", value1, value2, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand2NotBetween(String value1, String value2) {
            addCriterion("expand2 not between", value1, value2, "expand2");
            return (Criteria) this;
        }
    }
}