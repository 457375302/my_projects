package com.jjc.entity.knowledge;

import com.jjc.entity.common.BaseEntity;

import javax.validation.constraints.*;

public class KnowledgeRecord extends BaseEntity {
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
     * 短视频分组ID
     */
    private Long groupId;

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
     * nullable:true,length:19
     */
    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
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