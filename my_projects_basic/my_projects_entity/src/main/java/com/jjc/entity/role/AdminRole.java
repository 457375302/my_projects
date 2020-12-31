package com.jjc.entity.role;

import com.jjc.entity.common.BaseEntity;

import javax.validation.constraints.*;

public class AdminRole extends BaseEntity {
    /**
     * 中文角色名称
     */
    private String roleChName;

    /**
     * 英文角色名称
     */
    private String roleEnName;

    /**
     * 用户块类型（1-后端管理用户；2-店铺管理用户）
     */
    private Integer roleType;

    /**
     * 角色等级（1-高级；2-中级；3-普通）
     */
    private Integer roleGrade;

    /**
     * 模块状态（0-启用；1-禁用）
     */
    private Integer status;

    /**
     * 备注
     */
    private String remark;

    /**
     * nullable:false,length:100
     */
    @NotNull
    @Max(100)
    public String getRoleChName() {
        return roleChName;
    }

    public void setRoleChName(String roleChName) {
        this.roleChName = roleChName == null ? null : roleChName.trim();
    }

    /**
     * nullable:false,length:100
     */
    @NotNull
    @Max(100)
    public String getRoleEnName() {
        return roleEnName;
    }

    public void setRoleEnName(String roleEnName) {
        this.roleEnName = roleEnName == null ? null : roleEnName.trim();
    }

    /**
     * nullable:false,length:10
     */
    @NotNull
    public Integer getRoleType() {
        return roleType;
    }

    public void setRoleType(Integer roleType) {
        this.roleType = roleType;
    }

    /**
     * nullable:false,length:10
     */
    @NotNull
    public Integer getRoleGrade() {
        return roleGrade;
    }

    public void setRoleGrade(Integer roleGrade) {
        this.roleGrade = roleGrade;
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
}