package com.jjc.entity.knowledge;

import com.jjc.entity.common.BaseEntity;

import javax.validation.constraints.*;

public class KnowledgeGroup extends BaseEntity {
    /**
     * 分组名称
     */
    private String groupName;

    /**
     * 分组图标
     */
    private String groupImg;

    /**
     * 分组排序
     */
    private Integer groupSort;

    /**
     * 是否展示在C端 0-显示；1-不显示
     */
    private Integer wouldShow;

    /**
     * 状态 0-可用；1-禁用
     */
    private Integer status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 拓展字段1
     */
    private String expand1;

    /**
     * 拓展字段2
     */
    private String expand2;

    /**
     * nullable:false,length:100
     */
    @NotNull
    @Max(100)
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    /**
     * nullable:true,length:200
     */
    @Max(200)
    public String getGroupImg() {
        return groupImg;
    }

    public void setGroupImg(String groupImg) {
        this.groupImg = groupImg == null ? null : groupImg.trim();
    }

    /**
     * nullable:true,length:10
     */
    public Integer getGroupSort() {
        return groupSort;
    }

    public void setGroupSort(Integer groupSort) {
        this.groupSort = groupSort;
    }

    /**
     * nullable:false,length:10
     */
    @NotNull
    public Integer getWouldShow() {
        return wouldShow;
    }

    public void setWouldShow(Integer wouldShow) {
        this.wouldShow = wouldShow;
    }

    /**
     * nullable:false,length:10
     */
    @NotNull
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

    /**
     * nullable:true,length:100
     */
    @Max(100)
    public String getExpand1() {
        return expand1;
    }

    public void setExpand1(String expand1) {
        this.expand1 = expand1 == null ? null : expand1.trim();
    }

    /**
     * nullable:true,length:100
     */
    @Max(100)
    public String getExpand2() {
        return expand2;
    }

    public void setExpand2(String expand2) {
        this.expand2 = expand2 == null ? null : expand2.trim();
    }
}