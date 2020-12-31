package com.jjc.entity.role;

import com.jjc.entity.common.BaseEntity;

import java.util.Date;
import javax.validation.constraints.*;

public class AdminUser extends BaseEntity {
    /**
     * 用户名称
     */
    private String userName;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 手机号
     */
    private String userPhone;

    /**
     * 用户类型（1-管理员，2-游客）
     */
    private Integer userType;

    /**
     * 用户状态（0-启用；1-禁用）
     */
    private Integer status;

    /**
     * 最后登录时间（拓展：小程序）
     */
    private Date lastLoginTime;

    /**
     * （密码）
     */
    private String password;

    private String remark;

    /**
     * nullable:false,length:100
     */
    @NotNull
    @Max(100)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * nullable:false,length:100
     */
    @NotNull
    @Max(100)
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * nullable:false,length:100
     */
    @NotNull
    @Max(100)
    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    /**
     * nullable:false,length:10
     */
    @NotNull
    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
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
     * nullable:true,length:19
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * nullable:true,length:100
     */
    @Max(100)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    @Max(300)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}