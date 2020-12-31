package com.jjc.entity.role;

import com.jjc.entity.common.BaseEntity;

import javax.validation.constraints.*;

public class FunctionModel extends BaseEntity {
    /**
     * 上级模块ID
     */
    private Long parentId;

    /**
     * 模块编号
     */
    private String modelNo;

    /**
     * 中文模块名称
     */
    private String modelChName;

    /**
     * 英文模块名称
     */
    private String modelEnName;

    /**
     * 模块级别（1-系统级别；2-菜单级别；3-列表级别；4-功能点级别）
     */
    private Integer modelGrade;

    /**
     * 模块连接地址
     */
    private String modelUrl;

    /**
     * 模块图标地址
     */
    private String modelIconUrl;

    /**
     * 排序号
     */
    private Integer modelSort;

    /**
     * 状态（0-启用；1-禁用）
     */
    private Integer status;

    /**
     * 备注
     */
    private String remark;

    /**
     * nullable:true,length:19
     */
    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * nullable:true,length:100
     */
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
     * nullable:true,length:10
     */
    public Integer getModelGrade() {
        return modelGrade;
    }

    public void setModelGrade(Integer modelGrade) {
        this.modelGrade = modelGrade;
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
     * nullable:true,length:100
     */
    @Max(100)
    public String getModelIconUrl() {
        return modelIconUrl;
    }

    public void setModelIconUrl(String modelIconUrl) {
        this.modelIconUrl = modelIconUrl == null ? null : modelIconUrl.trim();
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
     * nullable:true,length:10
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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