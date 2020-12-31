package com.jjc.entity.role.example;

import com.jjc.entity.common.example.AbstractExample;
import com.jjc.entity.common.example.GeneratedCriteria;

import java.util.List;

public class AdminRoleExample extends AbstractExample {

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

        public Criteria andRoleChNameIsNull() {
            addCriterion("role_ch_name is null");
            return (Criteria) this;
        }

        public Criteria andRoleChNameIsNotNull() {
            addCriterion("role_ch_name is not null");
            return (Criteria) this;
        }

        public Criteria andRoleChNameEqualTo(String value) {
            addCriterion("role_ch_name =", value, "roleChName");
            return (Criteria) this;
        }

        public Criteria andRoleChNameNotEqualTo(String value) {
            addCriterion("role_ch_name <>", value, "roleChName");
            return (Criteria) this;
        }

        public Criteria andRoleChNameGreaterThan(String value) {
            addCriterion("role_ch_name >", value, "roleChName");
            return (Criteria) this;
        }

        public Criteria andRoleChNameGreaterThanOrEqualTo(String value) {
            addCriterion("role_ch_name >=", value, "roleChName");
            return (Criteria) this;
        }

        public Criteria andRoleChNameLessThan(String value) {
            addCriterion("role_ch_name <", value, "roleChName");
            return (Criteria) this;
        }

        public Criteria andRoleChNameLessThanOrEqualTo(String value) {
            addCriterion("role_ch_name <=", value, "roleChName");
            return (Criteria) this;
        }

        public Criteria andRoleChNameLike(String value) {
            addCriterion("role_ch_name like", value, "roleChName");
            return (Criteria) this;
        }

        public Criteria andRoleChNameNotLike(String value) {
            addCriterion("role_ch_name not like", value, "roleChName");
            return (Criteria) this;
        }

        public Criteria andRoleChNameIn(List<String> values) {
            addCriterion("role_ch_name in", values, "roleChName");
            return (Criteria) this;
        }

        public Criteria andRoleChNameNotIn(List<String> values) {
            addCriterion("role_ch_name not in", values, "roleChName");
            return (Criteria) this;
        }

        public Criteria andRoleChNameBetween(String value1, String value2) {
            addCriterion("role_ch_name between", value1, value2, "roleChName");
            return (Criteria) this;
        }

        public Criteria andRoleChNameNotBetween(String value1, String value2) {
            addCriterion("role_ch_name not between", value1, value2, "roleChName");
            return (Criteria) this;
        }

        public Criteria andRoleEnNameIsNull() {
            addCriterion("role_en_name is null");
            return (Criteria) this;
        }

        public Criteria andRoleEnNameIsNotNull() {
            addCriterion("role_en_name is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEnNameEqualTo(String value) {
            addCriterion("role_en_name =", value, "roleEnName");
            return (Criteria) this;
        }

        public Criteria andRoleEnNameNotEqualTo(String value) {
            addCriterion("role_en_name <>", value, "roleEnName");
            return (Criteria) this;
        }

        public Criteria andRoleEnNameGreaterThan(String value) {
            addCriterion("role_en_name >", value, "roleEnName");
            return (Criteria) this;
        }

        public Criteria andRoleEnNameGreaterThanOrEqualTo(String value) {
            addCriterion("role_en_name >=", value, "roleEnName");
            return (Criteria) this;
        }

        public Criteria andRoleEnNameLessThan(String value) {
            addCriterion("role_en_name <", value, "roleEnName");
            return (Criteria) this;
        }

        public Criteria andRoleEnNameLessThanOrEqualTo(String value) {
            addCriterion("role_en_name <=", value, "roleEnName");
            return (Criteria) this;
        }

        public Criteria andRoleEnNameLike(String value) {
            addCriterion("role_en_name like", value, "roleEnName");
            return (Criteria) this;
        }

        public Criteria andRoleEnNameNotLike(String value) {
            addCriterion("role_en_name not like", value, "roleEnName");
            return (Criteria) this;
        }

        public Criteria andRoleEnNameIn(List<String> values) {
            addCriterion("role_en_name in", values, "roleEnName");
            return (Criteria) this;
        }

        public Criteria andRoleEnNameNotIn(List<String> values) {
            addCriterion("role_en_name not in", values, "roleEnName");
            return (Criteria) this;
        }

        public Criteria andRoleEnNameBetween(String value1, String value2) {
            addCriterion("role_en_name between", value1, value2, "roleEnName");
            return (Criteria) this;
        }

        public Criteria andRoleEnNameNotBetween(String value1, String value2) {
            addCriterion("role_en_name not between", value1, value2, "roleEnName");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIsNull() {
            addCriterion("role_type is null");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIsNotNull() {
            addCriterion("role_type is not null");
            return (Criteria) this;
        }

        public Criteria andRoleTypeEqualTo(Integer value) {
            addCriterion("role_type =", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNotEqualTo(Integer value) {
            addCriterion("role_type <>", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeGreaterThan(Integer value) {
            addCriterion("role_type >", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_type >=", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeLessThan(Integer value) {
            addCriterion("role_type <", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeLessThanOrEqualTo(Integer value) {
            addCriterion("role_type <=", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIn(List<Integer> values) {
            addCriterion("role_type in", values, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNotIn(List<Integer> values) {
            addCriterion("role_type not in", values, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeBetween(Integer value1, Integer value2) {
            addCriterion("role_type between", value1, value2, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("role_type not between", value1, value2, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleGradeIsNull() {
            addCriterion("role_grade is null");
            return (Criteria) this;
        }

        public Criteria andRoleGradeIsNotNull() {
            addCriterion("role_grade is not null");
            return (Criteria) this;
        }

        public Criteria andRoleGradeEqualTo(Integer value) {
            addCriterion("role_grade =", value, "roleGrade");
            return (Criteria) this;
        }

        public Criteria andRoleGradeNotEqualTo(Integer value) {
            addCriterion("role_grade <>", value, "roleGrade");
            return (Criteria) this;
        }

        public Criteria andRoleGradeGreaterThan(Integer value) {
            addCriterion("role_grade >", value, "roleGrade");
            return (Criteria) this;
        }

        public Criteria andRoleGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_grade >=", value, "roleGrade");
            return (Criteria) this;
        }

        public Criteria andRoleGradeLessThan(Integer value) {
            addCriterion("role_grade <", value, "roleGrade");
            return (Criteria) this;
        }

        public Criteria andRoleGradeLessThanOrEqualTo(Integer value) {
            addCriterion("role_grade <=", value, "roleGrade");
            return (Criteria) this;
        }

        public Criteria andRoleGradeIn(List<Integer> values) {
            addCriterion("role_grade in", values, "roleGrade");
            return (Criteria) this;
        }

        public Criteria andRoleGradeNotIn(List<Integer> values) {
            addCriterion("role_grade not in", values, "roleGrade");
            return (Criteria) this;
        }

        public Criteria andRoleGradeBetween(Integer value1, Integer value2) {
            addCriterion("role_grade between", value1, value2, "roleGrade");
            return (Criteria) this;
        }

        public Criteria andRoleGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("role_grade not between", value1, value2, "roleGrade");
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
    }
}