package com.jjc.entity.user.example;

import com.jjc.entity.common.example.AbstractExample;
import com.jjc.entity.common.example.GeneratedCriteria;

import java.util.List;

public class UserAccountExample extends AbstractExample {

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

        public Criteria andAmountIncomeIsNull() {
            addCriterion("amount_income is null");
            return (Criteria) this;
        }

        public Criteria andAmountIncomeIsNotNull() {
            addCriterion("amount_income is not null");
            return (Criteria) this;
        }

        public Criteria andAmountIncomeEqualTo(Double value) {
            addCriterion("amount_income =", value, "amountIncome");
            return (Criteria) this;
        }

        public Criteria andAmountIncomeNotEqualTo(Double value) {
            addCriterion("amount_income <>", value, "amountIncome");
            return (Criteria) this;
        }

        public Criteria andAmountIncomeGreaterThan(Double value) {
            addCriterion("amount_income >", value, "amountIncome");
            return (Criteria) this;
        }

        public Criteria andAmountIncomeGreaterThanOrEqualTo(Double value) {
            addCriterion("amount_income >=", value, "amountIncome");
            return (Criteria) this;
        }

        public Criteria andAmountIncomeLessThan(Double value) {
            addCriterion("amount_income <", value, "amountIncome");
            return (Criteria) this;
        }

        public Criteria andAmountIncomeLessThanOrEqualTo(Double value) {
            addCriterion("amount_income <=", value, "amountIncome");
            return (Criteria) this;
        }

        public Criteria andAmountIncomeIn(List<Double> values) {
            addCriterion("amount_income in", values, "amountIncome");
            return (Criteria) this;
        }

        public Criteria andAmountIncomeNotIn(List<Double> values) {
            addCriterion("amount_income not in", values, "amountIncome");
            return (Criteria) this;
        }

        public Criteria andAmountIncomeBetween(Double value1, Double value2) {
            addCriterion("amount_income between", value1, value2, "amountIncome");
            return (Criteria) this;
        }

        public Criteria andAmountIncomeNotBetween(Double value1, Double value2) {
            addCriterion("amount_income not between", value1, value2, "amountIncome");
            return (Criteria) this;
        }

        public Criteria andAmountRedIncomeIsNull() {
            addCriterion("amount_red_income is null");
            return (Criteria) this;
        }

        public Criteria andAmountRedIncomeIsNotNull() {
            addCriterion("amount_red_income is not null");
            return (Criteria) this;
        }

        public Criteria andAmountRedIncomeEqualTo(Double value) {
            addCriterion("amount_red_income =", value, "amountRedIncome");
            return (Criteria) this;
        }

        public Criteria andAmountRedIncomeNotEqualTo(Double value) {
            addCriterion("amount_red_income <>", value, "amountRedIncome");
            return (Criteria) this;
        }

        public Criteria andAmountRedIncomeGreaterThan(Double value) {
            addCriterion("amount_red_income >", value, "amountRedIncome");
            return (Criteria) this;
        }

        public Criteria andAmountRedIncomeGreaterThanOrEqualTo(Double value) {
            addCriterion("amount_red_income >=", value, "amountRedIncome");
            return (Criteria) this;
        }

        public Criteria andAmountRedIncomeLessThan(Double value) {
            addCriterion("amount_red_income <", value, "amountRedIncome");
            return (Criteria) this;
        }

        public Criteria andAmountRedIncomeLessThanOrEqualTo(Double value) {
            addCriterion("amount_red_income <=", value, "amountRedIncome");
            return (Criteria) this;
        }

        public Criteria andAmountRedIncomeIn(List<Double> values) {
            addCriterion("amount_red_income in", values, "amountRedIncome");
            return (Criteria) this;
        }

        public Criteria andAmountRedIncomeNotIn(List<Double> values) {
            addCriterion("amount_red_income not in", values, "amountRedIncome");
            return (Criteria) this;
        }

        public Criteria andAmountRedIncomeBetween(Double value1, Double value2) {
            addCriterion("amount_red_income between", value1, value2, "amountRedIncome");
            return (Criteria) this;
        }

        public Criteria andAmountRedIncomeNotBetween(Double value1, Double value2) {
            addCriterion("amount_red_income not between", value1, value2, "amountRedIncome");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("total_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(Double value) {
            addCriterion("total_amount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(Double value) {
            addCriterion("total_amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(Double value) {
            addCriterion("total_amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("total_amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(Double value) {
            addCriterion("total_amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(Double value) {
            addCriterion("total_amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<Double> values) {
            addCriterion("total_amount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<Double> values) {
            addCriterion("total_amount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(Double value1, Double value2) {
            addCriterion("total_amount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(Double value1, Double value2) {
            addCriterion("total_amount not between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountIsNull() {
            addCriterion("cash_amount is null");
            return (Criteria) this;
        }

        public Criteria andCashAmountIsNotNull() {
            addCriterion("cash_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCashAmountEqualTo(Double value) {
            addCriterion("cash_amount =", value, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountNotEqualTo(Double value) {
            addCriterion("cash_amount <>", value, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountGreaterThan(Double value) {
            addCriterion("cash_amount >", value, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("cash_amount >=", value, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountLessThan(Double value) {
            addCriterion("cash_amount <", value, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountLessThanOrEqualTo(Double value) {
            addCriterion("cash_amount <=", value, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountIn(List<Double> values) {
            addCriterion("cash_amount in", values, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountNotIn(List<Double> values) {
            addCriterion("cash_amount not in", values, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountBetween(Double value1, Double value2) {
            addCriterion("cash_amount between", value1, value2, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andCashAmountNotBetween(Double value1, Double value2) {
            addCriterion("cash_amount not between", value1, value2, "cashAmount");
            return (Criteria) this;
        }

        public Criteria andFreeAmountIsNull() {
            addCriterion("free_amount is null");
            return (Criteria) this;
        }

        public Criteria andFreeAmountIsNotNull() {
            addCriterion("free_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFreeAmountEqualTo(Double value) {
            addCriterion("free_amount =", value, "freeAmount");
            return (Criteria) this;
        }

        public Criteria andFreeAmountNotEqualTo(Double value) {
            addCriterion("free_amount <>", value, "freeAmount");
            return (Criteria) this;
        }

        public Criteria andFreeAmountGreaterThan(Double value) {
            addCriterion("free_amount >", value, "freeAmount");
            return (Criteria) this;
        }

        public Criteria andFreeAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("free_amount >=", value, "freeAmount");
            return (Criteria) this;
        }

        public Criteria andFreeAmountLessThan(Double value) {
            addCriterion("free_amount <", value, "freeAmount");
            return (Criteria) this;
        }

        public Criteria andFreeAmountLessThanOrEqualTo(Double value) {
            addCriterion("free_amount <=", value, "freeAmount");
            return (Criteria) this;
        }

        public Criteria andFreeAmountIn(List<Double> values) {
            addCriterion("free_amount in", values, "freeAmount");
            return (Criteria) this;
        }

        public Criteria andFreeAmountNotIn(List<Double> values) {
            addCriterion("free_amount not in", values, "freeAmount");
            return (Criteria) this;
        }

        public Criteria andFreeAmountBetween(Double value1, Double value2) {
            addCriterion("free_amount between", value1, value2, "freeAmount");
            return (Criteria) this;
        }

        public Criteria andFreeAmountNotBetween(Double value1, Double value2) {
            addCriterion("free_amount not between", value1, value2, "freeAmount");
            return (Criteria) this;
        }

        public Criteria andTotalRedAmountIsNull() {
            addCriterion("total_red_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalRedAmountIsNotNull() {
            addCriterion("total_red_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalRedAmountEqualTo(Double value) {
            addCriterion("total_red_amount =", value, "totalRedAmount");
            return (Criteria) this;
        }

        public Criteria andTotalRedAmountNotEqualTo(Double value) {
            addCriterion("total_red_amount <>", value, "totalRedAmount");
            return (Criteria) this;
        }

        public Criteria andTotalRedAmountGreaterThan(Double value) {
            addCriterion("total_red_amount >", value, "totalRedAmount");
            return (Criteria) this;
        }

        public Criteria andTotalRedAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("total_red_amount >=", value, "totalRedAmount");
            return (Criteria) this;
        }

        public Criteria andTotalRedAmountLessThan(Double value) {
            addCriterion("total_red_amount <", value, "totalRedAmount");
            return (Criteria) this;
        }

        public Criteria andTotalRedAmountLessThanOrEqualTo(Double value) {
            addCriterion("total_red_amount <=", value, "totalRedAmount");
            return (Criteria) this;
        }

        public Criteria andTotalRedAmountIn(List<Double> values) {
            addCriterion("total_red_amount in", values, "totalRedAmount");
            return (Criteria) this;
        }

        public Criteria andTotalRedAmountNotIn(List<Double> values) {
            addCriterion("total_red_amount not in", values, "totalRedAmount");
            return (Criteria) this;
        }

        public Criteria andTotalRedAmountBetween(Double value1, Double value2) {
            addCriterion("total_red_amount between", value1, value2, "totalRedAmount");
            return (Criteria) this;
        }

        public Criteria andTotalRedAmountNotBetween(Double value1, Double value2) {
            addCriterion("total_red_amount not between", value1, value2, "totalRedAmount");
            return (Criteria) this;
        }

        public Criteria andCashRedAmountIsNull() {
            addCriterion("cash_red_amount is null");
            return (Criteria) this;
        }

        public Criteria andCashRedAmountIsNotNull() {
            addCriterion("cash_red_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCashRedAmountEqualTo(Double value) {
            addCriterion("cash_red_amount =", value, "cashRedAmount");
            return (Criteria) this;
        }

        public Criteria andCashRedAmountNotEqualTo(Double value) {
            addCriterion("cash_red_amount <>", value, "cashRedAmount");
            return (Criteria) this;
        }

        public Criteria andCashRedAmountGreaterThan(Double value) {
            addCriterion("cash_red_amount >", value, "cashRedAmount");
            return (Criteria) this;
        }

        public Criteria andCashRedAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("cash_red_amount >=", value, "cashRedAmount");
            return (Criteria) this;
        }

        public Criteria andCashRedAmountLessThan(Double value) {
            addCriterion("cash_red_amount <", value, "cashRedAmount");
            return (Criteria) this;
        }

        public Criteria andCashRedAmountLessThanOrEqualTo(Double value) {
            addCriterion("cash_red_amount <=", value, "cashRedAmount");
            return (Criteria) this;
        }

        public Criteria andCashRedAmountIn(List<Double> values) {
            addCriterion("cash_red_amount in", values, "cashRedAmount");
            return (Criteria) this;
        }

        public Criteria andCashRedAmountNotIn(List<Double> values) {
            addCriterion("cash_red_amount not in", values, "cashRedAmount");
            return (Criteria) this;
        }

        public Criteria andCashRedAmountBetween(Double value1, Double value2) {
            addCriterion("cash_red_amount between", value1, value2, "cashRedAmount");
            return (Criteria) this;
        }

        public Criteria andCashRedAmountNotBetween(Double value1, Double value2) {
            addCriterion("cash_red_amount not between", value1, value2, "cashRedAmount");
            return (Criteria) this;
        }

        public Criteria andFreeRedAmountIsNull() {
            addCriterion("free_red_amount is null");
            return (Criteria) this;
        }

        public Criteria andFreeRedAmountIsNotNull() {
            addCriterion("free_red_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFreeRedAmountEqualTo(Double value) {
            addCriterion("free_red_amount =", value, "freeRedAmount");
            return (Criteria) this;
        }

        public Criteria andFreeRedAmountNotEqualTo(Double value) {
            addCriterion("free_red_amount <>", value, "freeRedAmount");
            return (Criteria) this;
        }

        public Criteria andFreeRedAmountGreaterThan(Double value) {
            addCriterion("free_red_amount >", value, "freeRedAmount");
            return (Criteria) this;
        }

        public Criteria andFreeRedAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("free_red_amount >=", value, "freeRedAmount");
            return (Criteria) this;
        }

        public Criteria andFreeRedAmountLessThan(Double value) {
            addCriterion("free_red_amount <", value, "freeRedAmount");
            return (Criteria) this;
        }

        public Criteria andFreeRedAmountLessThanOrEqualTo(Double value) {
            addCriterion("free_red_amount <=", value, "freeRedAmount");
            return (Criteria) this;
        }

        public Criteria andFreeRedAmountIn(List<Double> values) {
            addCriterion("free_red_amount in", values, "freeRedAmount");
            return (Criteria) this;
        }

        public Criteria andFreeRedAmountNotIn(List<Double> values) {
            addCriterion("free_red_amount not in", values, "freeRedAmount");
            return (Criteria) this;
        }

        public Criteria andFreeRedAmountBetween(Double value1, Double value2) {
            addCriterion("free_red_amount between", value1, value2, "freeRedAmount");
            return (Criteria) this;
        }

        public Criteria andFreeRedAmountNotBetween(Double value1, Double value2) {
            addCriterion("free_red_amount not between", value1, value2, "freeRedAmount");
            return (Criteria) this;
        }

        public Criteria andPointIncomeIsNull() {
            addCriterion("point_income is null");
            return (Criteria) this;
        }

        public Criteria andPointIncomeIsNotNull() {
            addCriterion("point_income is not null");
            return (Criteria) this;
        }

        public Criteria andPointIncomeEqualTo(Double value) {
            addCriterion("point_income =", value, "pointIncome");
            return (Criteria) this;
        }

        public Criteria andPointIncomeNotEqualTo(Double value) {
            addCriterion("point_income <>", value, "pointIncome");
            return (Criteria) this;
        }

        public Criteria andPointIncomeGreaterThan(Double value) {
            addCriterion("point_income >", value, "pointIncome");
            return (Criteria) this;
        }

        public Criteria andPointIncomeGreaterThanOrEqualTo(Double value) {
            addCriterion("point_income >=", value, "pointIncome");
            return (Criteria) this;
        }

        public Criteria andPointIncomeLessThan(Double value) {
            addCriterion("point_income <", value, "pointIncome");
            return (Criteria) this;
        }

        public Criteria andPointIncomeLessThanOrEqualTo(Double value) {
            addCriterion("point_income <=", value, "pointIncome");
            return (Criteria) this;
        }

        public Criteria andPointIncomeIn(List<Double> values) {
            addCriterion("point_income in", values, "pointIncome");
            return (Criteria) this;
        }

        public Criteria andPointIncomeNotIn(List<Double> values) {
            addCriterion("point_income not in", values, "pointIncome");
            return (Criteria) this;
        }

        public Criteria andPointIncomeBetween(Double value1, Double value2) {
            addCriterion("point_income between", value1, value2, "pointIncome");
            return (Criteria) this;
        }

        public Criteria andPointIncomeNotBetween(Double value1, Double value2) {
            addCriterion("point_income not between", value1, value2, "pointIncome");
            return (Criteria) this;
        }

        public Criteria andTotalPointIsNull() {
            addCriterion("total_point is null");
            return (Criteria) this;
        }

        public Criteria andTotalPointIsNotNull() {
            addCriterion("total_point is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPointEqualTo(Double value) {
            addCriterion("total_point =", value, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointNotEqualTo(Double value) {
            addCriterion("total_point <>", value, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointGreaterThan(Double value) {
            addCriterion("total_point >", value, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointGreaterThanOrEqualTo(Double value) {
            addCriterion("total_point >=", value, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointLessThan(Double value) {
            addCriterion("total_point <", value, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointLessThanOrEqualTo(Double value) {
            addCriterion("total_point <=", value, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointIn(List<Double> values) {
            addCriterion("total_point in", values, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointNotIn(List<Double> values) {
            addCriterion("total_point not in", values, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointBetween(Double value1, Double value2) {
            addCriterion("total_point between", value1, value2, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andTotalPointNotBetween(Double value1, Double value2) {
            addCriterion("total_point not between", value1, value2, "totalPoint");
            return (Criteria) this;
        }

        public Criteria andCashPointIsNull() {
            addCriterion("cash_point is null");
            return (Criteria) this;
        }

        public Criteria andCashPointIsNotNull() {
            addCriterion("cash_point is not null");
            return (Criteria) this;
        }

        public Criteria andCashPointEqualTo(Double value) {
            addCriterion("cash_point =", value, "cashPoint");
            return (Criteria) this;
        }

        public Criteria andCashPointNotEqualTo(Double value) {
            addCriterion("cash_point <>", value, "cashPoint");
            return (Criteria) this;
        }

        public Criteria andCashPointGreaterThan(Double value) {
            addCriterion("cash_point >", value, "cashPoint");
            return (Criteria) this;
        }

        public Criteria andCashPointGreaterThanOrEqualTo(Double value) {
            addCriterion("cash_point >=", value, "cashPoint");
            return (Criteria) this;
        }

        public Criteria andCashPointLessThan(Double value) {
            addCriterion("cash_point <", value, "cashPoint");
            return (Criteria) this;
        }

        public Criteria andCashPointLessThanOrEqualTo(Double value) {
            addCriterion("cash_point <=", value, "cashPoint");
            return (Criteria) this;
        }

        public Criteria andCashPointIn(List<Double> values) {
            addCriterion("cash_point in", values, "cashPoint");
            return (Criteria) this;
        }

        public Criteria andCashPointNotIn(List<Double> values) {
            addCriterion("cash_point not in", values, "cashPoint");
            return (Criteria) this;
        }

        public Criteria andCashPointBetween(Double value1, Double value2) {
            addCriterion("cash_point between", value1, value2, "cashPoint");
            return (Criteria) this;
        }

        public Criteria andCashPointNotBetween(Double value1, Double value2) {
            addCriterion("cash_point not between", value1, value2, "cashPoint");
            return (Criteria) this;
        }

        public Criteria andFreePointIsNull() {
            addCriterion("free_point is null");
            return (Criteria) this;
        }

        public Criteria andFreePointIsNotNull() {
            addCriterion("free_point is not null");
            return (Criteria) this;
        }

        public Criteria andFreePointEqualTo(Double value) {
            addCriterion("free_point =", value, "freePoint");
            return (Criteria) this;
        }

        public Criteria andFreePointNotEqualTo(Double value) {
            addCriterion("free_point <>", value, "freePoint");
            return (Criteria) this;
        }

        public Criteria andFreePointGreaterThan(Double value) {
            addCriterion("free_point >", value, "freePoint");
            return (Criteria) this;
        }

        public Criteria andFreePointGreaterThanOrEqualTo(Double value) {
            addCriterion("free_point >=", value, "freePoint");
            return (Criteria) this;
        }

        public Criteria andFreePointLessThan(Double value) {
            addCriterion("free_point <", value, "freePoint");
            return (Criteria) this;
        }

        public Criteria andFreePointLessThanOrEqualTo(Double value) {
            addCriterion("free_point <=", value, "freePoint");
            return (Criteria) this;
        }

        public Criteria andFreePointIn(List<Double> values) {
            addCriterion("free_point in", values, "freePoint");
            return (Criteria) this;
        }

        public Criteria andFreePointNotIn(List<Double> values) {
            addCriterion("free_point not in", values, "freePoint");
            return (Criteria) this;
        }

        public Criteria andFreePointBetween(Double value1, Double value2) {
            addCriterion("free_point between", value1, value2, "freePoint");
            return (Criteria) this;
        }

        public Criteria andFreePointNotBetween(Double value1, Double value2) {
            addCriterion("free_point not between", value1, value2, "freePoint");
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

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
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