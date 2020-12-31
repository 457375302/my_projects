package com.jjc.entity.user;

import com.jjc.entity.common.BaseEntity;

public class User extends BaseEntity {
    /**
     * 用户账户
     */
    private Long userNumber;

    /**
     * 用户密码
     */
    private Long userPassword;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户支付密码
     */
    private Long userPayPassword;

    /**
     * 用户类型 （0-微信用户；1-app用户）
     */
    private Integer userType;

    /**
     * 昵称 （微信/支付宝）
     */
    private String nickName;

    /**
     * 微信商户号下唯一标识
     */
    private String unionId;

    /**
     * 微信公众号下唯一标识
     */
    private String openId;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 是不是店主 ：0-否；1-是
     */
    private Integer wouldStore;

    /**
     * 会员等级  0-普通用户
     */
    private Integer userLevel;

    /**
     * 用户状态 （0-启用；1-禁用；2-冻结）
     */
    private Integer status;

    /**
     * 是否实名认证 ：0-否；1-是
     */
    private Integer wouldReal;

    /**
     * 真实姓名
     */
    private String userRealName;

    /**
     * 头像地址
     */
    private String headUrl;

    /**
     * 省份
     */
    private Long provinceId;

    /**
     * 城市
     */
    private Long cityId;

    /**
     * 区
     */
    private Long areaId;

    /**
     * 男/女
     */
    private String userSex;

    /**
     * qq
     */
    private String userQq;

    /**
     * 邮件
     */
    private String userMail;

    /**
     * 微信号
     */
    private String userWx;

    /**
     * 拓展字段1
     */
    private String expand1;

    /**
     * 拓展字段2
     */
    private String expand2;

}