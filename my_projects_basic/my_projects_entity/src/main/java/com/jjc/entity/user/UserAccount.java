package com.jjc.entity.user;

import com.jjc.entity.common.BaseEntity;
import com.sun.istack.internal.NotNull;

import javax.validation.constraints.*;

public class UserAccount extends BaseEntity {
    /**
     * 会员ID
     */
    private Long userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 金额收益
     */
    private Double amountIncome;

    /**
     * 红包收益
     */
    private Double amountRedIncome;

    /**
     * 总金额
     */
    private Double totalAmount;

    /**
     * 可用金额
     */
    private Double cashAmount;

    /**
     * 冻结金额
     */
    private Double freeAmount;

    /**
     * 红包总金额
     */
    private Double totalRedAmount;

    /**
     * 可提现红包金额
     */
    private Double cashRedAmount;

    /**
     * 冻结红包金额
     */
    private Double freeRedAmount;

    /**
     * 积分收益
     */
    private Double pointIncome;

    /**
     * 总积分
     */
    private Double totalPoint;

    /**
     * 可用积分
     */
    private Double cashPoint;

    /**
     * 冻结积分
     */
    private Double freePoint;

    /**
     * 账号状态 （0-启用；1-禁用；2-冻结）
     */
    private Integer status;

    /**
     * 钱包密码
     */
    private String password;

    /**
     * 拓展字段1
     */
    private String expand1;

    /**
     * 拓展字段2
     */
    private String expand2;

    /**
     * nullable:false,length:19
     */
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * nullable:true,length:100
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * nullable:true,length:20
     */
    public Double getAmountIncome() {
        return amountIncome;
    }

    public void setAmountIncome(Double amountIncome) {
        this.amountIncome = amountIncome;
    }

    /**
     * nullable:true,length:20
     */
    public Double getAmountRedIncome() {
        return amountRedIncome;
    }

    public void setAmountRedIncome(Double amountRedIncome) {
        this.amountRedIncome = amountRedIncome;
    }

    /**
     * nullable:true,length:20
     */
    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * nullable:true,length:20
     */
    public Double getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(Double cashAmount) {
        this.cashAmount = cashAmount;
    }

    /**
     * nullable:true,length:20
     */
    public Double getFreeAmount() {
        return freeAmount;
    }

    public void setFreeAmount(Double freeAmount) {
        this.freeAmount = freeAmount;
    }

    /**
     * nullable:true,length:20
     */
    public Double getTotalRedAmount() {
        return totalRedAmount;
    }

    public void setTotalRedAmount(Double totalRedAmount) {
        this.totalRedAmount = totalRedAmount;
    }

    /**
     * nullable:true,length:20
     */
    public Double getCashRedAmount() {
        return cashRedAmount;
    }

    public void setCashRedAmount(Double cashRedAmount) {
        this.cashRedAmount = cashRedAmount;
    }

    /**
     * nullable:true,length:20
     */
    public Double getFreeRedAmount() {
        return freeRedAmount;
    }

    public void setFreeRedAmount(Double freeRedAmount) {
        this.freeRedAmount = freeRedAmount;
    }

    /**
     * nullable:true,length:20
     */
    public Double getPointIncome() {
        return pointIncome;
    }

    public void setPointIncome(Double pointIncome) {
        this.pointIncome = pointIncome;
    }

    /**
     * nullable:true,length:20
     */
    public Double getTotalPoint() {
        return totalPoint;
    }

    public void setTotalPoint(Double totalPoint) {
        this.totalPoint = totalPoint;
    }

    /**
     * nullable:true,length:20
     */
    public Double getCashPoint() {
        return cashPoint;
    }

    public void setCashPoint(Double cashPoint) {
        this.cashPoint = cashPoint;
    }

    /**
     * nullable:true,length:20
     */
    public Double getFreePoint() {
        return freePoint;
    }

    public void setFreePoint(Double freePoint) {
        this.freePoint = freePoint;
    }

    /**
     * nullable:true,length:10
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * nullable:true,length:100
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * nullable:true,length:100
     */
    public String getExpand1() {
        return expand1;
    }

    public void setExpand1(String expand1) {
        this.expand1 = expand1 == null ? null : expand1.trim();
    }

    /**
     * nullable:true,length:100
     */
    public String getExpand2() {
        return expand2;
    }

    public void setExpand2(String expand2) {
        this.expand2 = expand2 == null ? null : expand2.trim();
    }
}