package com.jjc.entity.knowledge;

import com.jjc.entity.common.BaseEntity;

import javax.validation.constraints.*;

public class KnowledgeComment extends BaseEntity {
    /**
     * 知识产品ID
     */
    private Long knowledgeProductId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 用户头像
     */
    private String headUrl;

    /**
     * 评论内容
     */
    private String context;

    /**
     * 评论地址
     */
    private String imgUrl;

    /**
     * 点赞数
     */
    private Integer goodNum;

    /**
     * 拓展字段
     */
    private String expand1;

    /**
     * 拓展字段
     */
    private String expand2;

    /**
     * nullable:false,length:19
     */
    @NotNull
    public Long getKnowledgeProductId() {
        return knowledgeProductId;
    }

    public void setKnowledgeProductId(Long knowledgeProductId) {
        this.knowledgeProductId = knowledgeProductId;
    }

    /**
     * nullable:false,length:19
     */
    @NotNull
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * nullable:true,length:100
     */
    @Max(100)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * nullable:true,length:200
     */
    @Max(200)
    public String getHeadUrl() {
        return headUrl;
    }

    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl == null ? null : headUrl.trim();
    }

    /**
     * nullable:true,length:1000
     */
    @Max(1000)
    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }

    /**
     * nullable:true,length:200
     */
    @Max(200)
    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    /**
     * nullable:true,length:10
     */
    public Integer getGoodNum() {
        return goodNum;
    }

    public void setGoodNum(Integer goodNum) {
        this.goodNum = goodNum;
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