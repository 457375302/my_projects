package com.jjc.entity.role.example;

import com.jjc.entity.common.example.AbstractExample;
import com.jjc.entity.common.example.GeneratedCriteria;

import java.util.List;

public class RoleFunctionExample extends AbstractExample {

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

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Long value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Long value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Long value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Long value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Long value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Long> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Long> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Long value1, Long value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Long value1, Long value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andModelGradeIsNull() {
            addCriterion("model_grade is null");
            return (Criteria) this;
        }

        public Criteria andModelGradeIsNotNull() {
            addCriterion("model_grade is not null");
            return (Criteria) this;
        }

        public Criteria andModelGradeEqualTo(Integer value) {
            addCriterion("model_grade =", value, "modelGrade");
            return (Criteria) this;
        }

        public Criteria andModelGradeNotEqualTo(Integer value) {
            addCriterion("model_grade <>", value, "modelGrade");
            return (Criteria) this;
        }

        public Criteria andModelGradeGreaterThan(Integer value) {
            addCriterion("model_grade >", value, "modelGrade");
            return (Criteria) this;
        }

        public Criteria andModelGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("model_grade >=", value, "modelGrade");
            return (Criteria) this;
        }

        public Criteria andModelGradeLessThan(Integer value) {
            addCriterion("model_grade <", value, "modelGrade");
            return (Criteria) this;
        }

        public Criteria andModelGradeLessThanOrEqualTo(Integer value) {
            addCriterion("model_grade <=", value, "modelGrade");
            return (Criteria) this;
        }

        public Criteria andModelGradeIn(List<Integer> values) {
            addCriterion("model_grade in", values, "modelGrade");
            return (Criteria) this;
        }

        public Criteria andModelGradeNotIn(List<Integer> values) {
            addCriterion("model_grade not in", values, "modelGrade");
            return (Criteria) this;
        }

        public Criteria andModelGradeBetween(Integer value1, Integer value2) {
            addCriterion("model_grade between", value1, value2, "modelGrade");
            return (Criteria) this;
        }

        public Criteria andModelGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("model_grade not between", value1, value2, "modelGrade");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Long value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Long value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Long value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Long value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Long value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Long> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Long> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Long value1, Long value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Long value1, Long value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdIsNull() {
            addCriterion("function_id is null");
            return (Criteria) this;
        }

        public Criteria andFunctionIdIsNotNull() {
            addCriterion("function_id is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionIdEqualTo(Long value) {
            addCriterion("function_id =", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdNotEqualTo(Long value) {
            addCriterion("function_id <>", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdGreaterThan(Long value) {
            addCriterion("function_id >", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("function_id >=", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdLessThan(Long value) {
            addCriterion("function_id <", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdLessThanOrEqualTo(Long value) {
            addCriterion("function_id <=", value, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdIn(List<Long> values) {
            addCriterion("function_id in", values, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdNotIn(List<Long> values) {
            addCriterion("function_id not in", values, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdBetween(Long value1, Long value2) {
            addCriterion("function_id between", value1, value2, "functionId");
            return (Criteria) this;
        }

        public Criteria andFunctionIdNotBetween(Long value1, Long value2) {
            addCriterion("function_id not between", value1, value2, "functionId");
            return (Criteria) this;
        }

        public Criteria andModelNoIsNull() {
            addCriterion("model_no is null");
            return (Criteria) this;
        }

        public Criteria andModelNoIsNotNull() {
            addCriterion("model_no is not null");
            return (Criteria) this;
        }

        public Criteria andModelNoEqualTo(String value) {
            addCriterion("model_no =", value, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelNoNotEqualTo(String value) {
            addCriterion("model_no <>", value, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelNoGreaterThan(String value) {
            addCriterion("model_no >", value, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelNoGreaterThanOrEqualTo(String value) {
            addCriterion("model_no >=", value, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelNoLessThan(String value) {
            addCriterion("model_no <", value, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelNoLessThanOrEqualTo(String value) {
            addCriterion("model_no <=", value, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelNoLike(String value) {
            addCriterion("model_no like", value, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelNoNotLike(String value) {
            addCriterion("model_no not like", value, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelNoIn(List<String> values) {
            addCriterion("model_no in", values, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelNoNotIn(List<String> values) {
            addCriterion("model_no not in", values, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelNoBetween(String value1, String value2) {
            addCriterion("model_no between", value1, value2, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelNoNotBetween(String value1, String value2) {
            addCriterion("model_no not between", value1, value2, "modelNo");
            return (Criteria) this;
        }

        public Criteria andModelChNameIsNull() {
            addCriterion("model_ch_name is null");
            return (Criteria) this;
        }

        public Criteria andModelChNameIsNotNull() {
            addCriterion("model_ch_name is not null");
            return (Criteria) this;
        }

        public Criteria andModelChNameEqualTo(String value) {
            addCriterion("model_ch_name =", value, "modelChName");
            return (Criteria) this;
        }

        public Criteria andModelChNameNotEqualTo(String value) {
            addCriterion("model_ch_name <>", value, "modelChName");
            return (Criteria) this;
        }

        public Criteria andModelChNameGreaterThan(String value) {
            addCriterion("model_ch_name >", value, "modelChName");
            return (Criteria) this;
        }

        public Criteria andModelChNameGreaterThanOrEqualTo(String value) {
            addCriterion("model_ch_name >=", value, "modelChName");
            return (Criteria) this;
        }

        public Criteria andModelChNameLessThan(String value) {
            addCriterion("model_ch_name <", value, "modelChName");
            return (Criteria) this;
        }

        public Criteria andModelChNameLessThanOrEqualTo(String value) {
            addCriterion("model_ch_name <=", value, "modelChName");
            return (Criteria) this;
        }

        public Criteria andModelChNameLike(String value) {
            addCriterion("model_ch_name like", value, "modelChName");
            return (Criteria) this;
        }

        public Criteria andModelChNameNotLike(String value) {
            addCriterion("model_ch_name not like", value, "modelChName");
            return (Criteria) this;
        }

        public Criteria andModelChNameIn(List<String> values) {
            addCriterion("model_ch_name in", values, "modelChName");
            return (Criteria) this;
        }

        public Criteria andModelChNameNotIn(List<String> values) {
            addCriterion("model_ch_name not in", values, "modelChName");
            return (Criteria) this;
        }

        public Criteria andModelChNameBetween(String value1, String value2) {
            addCriterion("model_ch_name between", value1, value2, "modelChName");
            return (Criteria) this;
        }

        public Criteria andModelChNameNotBetween(String value1, String value2) {
            addCriterion("model_ch_name not between", value1, value2, "modelChName");
            return (Criteria) this;
        }

        public Criteria andModelEnNameIsNull() {
            addCriterion("model_en_name is null");
            return (Criteria) this;
        }

        public Criteria andModelEnNameIsNotNull() {
            addCriterion("model_en_name is not null");
            return (Criteria) this;
        }

        public Criteria andModelEnNameEqualTo(String value) {
            addCriterion("model_en_name =", value, "modelEnName");
            return (Criteria) this;
        }

        public Criteria andModelEnNameNotEqualTo(String value) {
            addCriterion("model_en_name <>", value, "modelEnName");
            return (Criteria) this;
        }

        public Criteria andModelEnNameGreaterThan(String value) {
            addCriterion("model_en_name >", value, "modelEnName");
            return (Criteria) this;
        }

        public Criteria andModelEnNameGreaterThanOrEqualTo(String value) {
            addCriterion("model_en_name >=", value, "modelEnName");
            return (Criteria) this;
        }

        public Criteria andModelEnNameLessThan(String value) {
            addCriterion("model_en_name <", value, "modelEnName");
            return (Criteria) this;
        }

        public Criteria andModelEnNameLessThanOrEqualTo(String value) {
            addCriterion("model_en_name <=", value, "modelEnName");
            return (Criteria) this;
        }

        public Criteria andModelEnNameLike(String value) {
            addCriterion("model_en_name like", value, "modelEnName");
            return (Criteria) this;
        }

        public Criteria andModelEnNameNotLike(String value) {
            addCriterion("model_en_name not like", value, "modelEnName");
            return (Criteria) this;
        }

        public Criteria andModelEnNameIn(List<String> values) {
            addCriterion("model_en_name in", values, "modelEnName");
            return (Criteria) this;
        }

        public Criteria andModelEnNameNotIn(List<String> values) {
            addCriterion("model_en_name not in", values, "modelEnName");
            return (Criteria) this;
        }

        public Criteria andModelEnNameBetween(String value1, String value2) {
            addCriterion("model_en_name between", value1, value2, "modelEnName");
            return (Criteria) this;
        }

        public Criteria andModelEnNameNotBetween(String value1, String value2) {
            addCriterion("model_en_name not between", value1, value2, "modelEnName");
            return (Criteria) this;
        }

        public Criteria andModelUrlIsNull() {
            addCriterion("model_url is null");
            return (Criteria) this;
        }

        public Criteria andModelUrlIsNotNull() {
            addCriterion("model_url is not null");
            return (Criteria) this;
        }

        public Criteria andModelUrlEqualTo(String value) {
            addCriterion("model_url =", value, "modelUrl");
            return (Criteria) this;
        }

        public Criteria andModelUrlNotEqualTo(String value) {
            addCriterion("model_url <>", value, "modelUrl");
            return (Criteria) this;
        }

        public Criteria andModelUrlGreaterThan(String value) {
            addCriterion("model_url >", value, "modelUrl");
            return (Criteria) this;
        }

        public Criteria andModelUrlGreaterThanOrEqualTo(String value) {
            addCriterion("model_url >=", value, "modelUrl");
            return (Criteria) this;
        }

        public Criteria andModelUrlLessThan(String value) {
            addCriterion("model_url <", value, "modelUrl");
            return (Criteria) this;
        }

        public Criteria andModelUrlLessThanOrEqualTo(String value) {
            addCriterion("model_url <=", value, "modelUrl");
            return (Criteria) this;
        }

        public Criteria andModelUrlLike(String value) {
            addCriterion("model_url like", value, "modelUrl");
            return (Criteria) this;
        }

        public Criteria andModelUrlNotLike(String value) {
            addCriterion("model_url not like", value, "modelUrl");
            return (Criteria) this;
        }

        public Criteria andModelUrlIn(List<String> values) {
            addCriterion("model_url in", values, "modelUrl");
            return (Criteria) this;
        }

        public Criteria andModelUrlNotIn(List<String> values) {
            addCriterion("model_url not in", values, "modelUrl");
            return (Criteria) this;
        }

        public Criteria andModelUrlBetween(String value1, String value2) {
            addCriterion("model_url between", value1, value2, "modelUrl");
            return (Criteria) this;
        }

        public Criteria andModelUrlNotBetween(String value1, String value2) {
            addCriterion("model_url not between", value1, value2, "modelUrl");
            return (Criteria) this;
        }

        public Criteria andModelSortIsNull() {
            addCriterion("model_sort is null");
            return (Criteria) this;
        }

        public Criteria andModelSortIsNotNull() {
            addCriterion("model_sort is not null");
            return (Criteria) this;
        }

        public Criteria andModelSortEqualTo(Integer value) {
            addCriterion("model_sort =", value, "modelSort");
            return (Criteria) this;
        }

        public Criteria andModelSortNotEqualTo(Integer value) {
            addCriterion("model_sort <>", value, "modelSort");
            return (Criteria) this;
        }

        public Criteria andModelSortGreaterThan(Integer value) {
            addCriterion("model_sort >", value, "modelSort");
            return (Criteria) this;
        }

        public Criteria andModelSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("model_sort >=", value, "modelSort");
            return (Criteria) this;
        }

        public Criteria andModelSortLessThan(Integer value) {
            addCriterion("model_sort <", value, "modelSort");
            return (Criteria) this;
        }

        public Criteria andModelSortLessThanOrEqualTo(Integer value) {
            addCriterion("model_sort <=", value, "modelSort");
            return (Criteria) this;
        }

        public Criteria andModelSortIn(List<Integer> values) {
            addCriterion("model_sort in", values, "modelSort");
            return (Criteria) this;
        }

        public Criteria andModelSortNotIn(List<Integer> values) {
            addCriterion("model_sort not in", values, "modelSort");
            return (Criteria) this;
        }

        public Criteria andModelSortBetween(Integer value1, Integer value2) {
            addCriterion("model_sort between", value1, value2, "modelSort");
            return (Criteria) this;
        }

        public Criteria andModelSortNotBetween(Integer value1, Integer value2) {
            addCriterion("model_sort not between", value1, value2, "modelSort");
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