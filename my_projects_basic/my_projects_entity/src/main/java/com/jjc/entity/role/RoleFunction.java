package com.jjc.entity.role;

import com.jjc.entity.common.BaseEntity;

import javax.validation.constraints.*;

public class RoleFunction extends BaseEntity {
    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 模块级别（1-系统级别；2-菜单级别；3-列表级别；4-功能点级别）
     */
    private Integer modelGrade;

    /**
     * 功能模块父ID
     */
    private Long parentId;

    /**
     * 功能模块ID
     */
    private Long functionId;

    /**
     * 功能模块编号
     */
    private String modelNo;

    /**
     * 中文功能模块名称
     */
    private String modelChName;

    /**
     * 英文模块名称
     */
    private String modelEnName;

    /**
     * 模块链接地址
     */
    private String modelUrl;

    /**
     * 排序号
     */
    private Integer modelSort;

    /**
     * 英文角色名称
     */
    private String roleEnName;

    /**
     * 备注
     */
    private String remark;

    /**
     * nullable:false,length:19
     */
    @NotNull
    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * nullable:false,length:10
     */
    @NotNull
    public Integer getModelGrade() {
        return modelGrade;
    }

    public void setModelGrade(Integer modelGrade) {
        this.modelGrade = modelGrade;
    }

    /**
     * nullable:false,length:19
     */
    @NotNull
    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * nullable:false,length:19
     */
    @NotNull
    public Long getFunctionId() {
        return functionId;
    }

    public void setFunctionId(Long functionId) {
        this.functionId = functionId;
    }

    /**
     * nullable:false,length:100
     */
    @NotNull
    @Max(100)
    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo == null ? null : modelNo.trim();
    }

    /**
     * nullable:true,length:100
     */
    @Max(100)
    public String getModelChName() {
        return modelChName;
    }

    public void setModelChName(String modelChName) {
        this.modelChName = modelChName == null ? null : modelChName.trim();
    }

    /**
     * nullable:true,length:100
     */
    @Max(100)
    public String getModelEnName() {
        return modelEnName;
    }

    public void setModelEnName(String modelEnName) {
        this.modelEnName = modelEnName == null ? null : modelEnName.trim();
    }

    /**
     * nullable:true,length:100
     */
    @Max(100)
    public String getModelUrl() {
        return modelUrl;
    }

    public void setModelUrl(String modelUrl) {
        this.modelUrl = modelUrl == null ? null : modelUrl.trim();
    }

    /**
     * nullable:true,length:10
     */
    public Integer getModelSort() {
        return modelSort;
    }

    public void setModelSort(Integer modelSort) {
        this.modelSort = modelSort;
    }

    /**
     * nullable:true,length:100
     */
    @Max(100)
    public String getRoleEnName() {
        return roleEnName;
    }

    public void setRoleEnName(String roleEnName) {
        this.roleEnName = roleEnName == null ? null : roleEnName.trim();
    }

    /**
     * nullable:true,length:300
     */
    @Max(300)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}