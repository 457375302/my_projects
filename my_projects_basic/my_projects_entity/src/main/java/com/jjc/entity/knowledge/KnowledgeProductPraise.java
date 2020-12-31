package com.jjc.entity.knowledge;

import com.jjc.entity.common.BaseEntity;

import javax.validation.constraints.*;

public class KnowledgeProductPraise extends BaseEntity {
    /**
     * 短视频id
     */
    private Long knowledgeProductId;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 是否点赞 0-否；1-赞
     */
    private Integer wouldPraise;

    /**
     * 短视频分组ID
     */
    private Long groupId;

    /**
     * nullable:true,length:19
     */
    public Long getKnowledgeProductId() {
        return knowledgeProductId;
    }

    public void setKnowledgeProductId(Long knowledgeProductId) {
        this.knowledgeProductId = knowledgeProductId;
    }

    /**
     * nullable:true,length:19
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
    @Max(100)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * nullable:true,length:10
     */
    public Integer getWouldPraise() {
        return wouldPraise;
    }

    public void setWouldPraise(Integer wouldPraise) {
        this.wouldPraise = wouldPraise;
    }

    /**
     * nullable:true,length:19
     */
    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }
}