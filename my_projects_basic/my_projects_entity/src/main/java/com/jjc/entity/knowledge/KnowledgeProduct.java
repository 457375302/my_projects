package com.jjc.entity.knowledge;

import com.jjc.entity.common.BaseEntity;

import javax.validation.constraints.*;

public class KnowledgeProduct extends BaseEntity {
    /**
     * 分组ID
     */
    private Long groupId;

    /**
     * 是否上架 0-下架；1-上架
     */
    private Integer saleStatus;

    /**
     * 文章名称
     */
    private String productTitle;

    /**
     * 文章编号
     */
    private String productSn;

    /**
     * 关键词
     */
    private String keywords;

    /**
     * 大图 （多张大图用；隔开）
     */
    private String maxImage;

    /**
     * 小图 （多张小图用；隔开）
     */
    private String minImage;

    /**
     * 视频地址
     */
    private String videoUrl;

    /**
     * 是否热销产品 0:否 1:是 （平台端控制）
     */
    private Integer wouldHot;

    /**
     * 是否新品 0:否 1:是  （平台端控制）
     */
    private Integer wouldNew;

    /**
     * 是否推荐到首页 （平台端控制）
     */
    private Integer wouldRecomHome;

    /**
     * 排序号
     */
    private Integer sortNumber;

    /**
     * 备注
     */
    private String remark;

    /**
     * 视频标签
     */
    private String productIden;

    /**
     * 点赞数
     */
    private Integer goodNum;

    /**
     * 评论数
     */
    private Integer commentNum;

    /**
     * 观看数
     */
    private Integer playNum;

    /**
     * 关注数
     */
    private Integer followNum;

    /**
     * 转发数
     */
    private Integer forwardNum;

    /**
     * 上传入口:0-后端上传；1-主播店铺上传；2-C端上传
     */
    private Integer uploadEntry;

    /**
     * C端用户id
     */
    private Long userId;

    /**
     * C端用户名称
     */
    private String userName;

    /**
     * C端用户头像
     */
    private String headUrl;

    /**
     * 作者
     */
    private String videoAuthor;

    /**
     * 拓展字段1
     */
    private String expand1;

    /**
     * 拓展字段2
     */
    private String expand2;

    /**
     * 文章内容
     */
    private String productContext;

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
     * nullable:false,length:10
     */
    @NotNull
    public Integer getSaleStatus() {
        return saleStatus;
    }

    public void setSaleStatus(Integer saleStatus) {
        this.saleStatus = saleStatus;
    }

    /**
     * nullable:true,length:100
     */
    @Max(100)
    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle == null ? null : productTitle.trim();
    }

    /**
     * nullable:true,length:100
     */
    @Max(100)
    public String getProductSn() {
        return productSn;
    }

    public void setProductSn(String productSn) {
        this.productSn = productSn == null ? null : productSn.trim();
    }

    /**
     * nullable:true,length:300
     */
    @Max(300)
    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    /**
     * nullable:true,length:200
     */
    @Max(200)
    public String getMaxImage() {
        return maxImage;
    }

    public void setMaxImage(String maxImage) {
        this.maxImage = maxImage == null ? null : maxImage.trim();
    }

    /**
     * nullable:true,length:200
     */
    @Max(200)
    public String getMinImage() {
        return minImage;
    }

    public void setMinImage(String minImage) {
        this.minImage = minImage == null ? null : minImage.trim();
    }

    /**
     * nullable:true,length:200
     */
    @Max(200)
    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl == null ? null : videoUrl.trim();
    }

    /**
     * nullable:false,length:10
     */
    @NotNull
    public Integer getWouldHot() {
        return wouldHot;
    }

    public void setWouldHot(Integer wouldHot) {
        this.wouldHot = wouldHot;
    }

    /**
     * nullable:false,length:10
     */
    @NotNull
    public Integer getWouldNew() {
        return wouldNew;
    }

    public void setWouldNew(Integer wouldNew) {
        this.wouldNew = wouldNew;
    }

    /**
     * nullable:false,length:10
     */
    @NotNull
    public Integer getWouldRecomHome() {
        return wouldRecomHome;
    }

    public void setWouldRecomHome(Integer wouldRecomHome) {
        this.wouldRecomHome = wouldRecomHome;
    }

    /**
     * nullable:true,length:10
     */
    public Integer getSortNumber() {
        return sortNumber;
    }

    public void setSortNumber(Integer sortNumber) {
        this.sortNumber = sortNumber;
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
    public String getProductIden() {
        return productIden;
    }

    public void setProductIden(String productIden) {
        this.productIden = productIden == null ? null : productIden.trim();
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
     * nullable:true,length:10
     */
    public Integer getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    /**
     * nullable:true,length:10
     */
    public Integer getPlayNum() {
        return playNum;
    }

    public void setPlayNum(Integer playNum) {
        this.playNum = playNum;
    }

    /**
     * nullable:true,length:10
     */
    public Integer getFollowNum() {
        return followNum;
    }

    public void setFollowNum(Integer followNum) {
        this.followNum = followNum;
    }

    /**
     * nullable:true,length:10
     */
    public Integer getForwardNum() {
        return forwardNum;
    }

    public void setForwardNum(Integer forwardNum) {
        this.forwardNum = forwardNum;
    }

    /**
     * nullable:true,length:10
     */
    public Integer getUploadEntry() {
        return uploadEntry;
    }

    public void setUploadEntry(Integer uploadEntry) {
        this.uploadEntry = uploadEntry;
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
     * nullable:true,length:300
     */
    @Max(300)
    public String getHeadUrl() {
        return headUrl;
    }

    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl == null ? null : headUrl.trim();
    }

    /**
     * nullable:true,length:100
     */
    @Max(100)
    public String getVideoAuthor() {
        return videoAuthor;
    }

    public void setVideoAuthor(String videoAuthor) {
        this.videoAuthor = videoAuthor == null ? null : videoAuthor.trim();
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

    /**
     * nullable:true,length:65535
     */
    @Max(65535)
    public String getProductContext() {
        return productContext;
    }

    public void setProductContext(String productContext) {
        this.productContext = productContext == null ? null : productContext.trim();
    }
}