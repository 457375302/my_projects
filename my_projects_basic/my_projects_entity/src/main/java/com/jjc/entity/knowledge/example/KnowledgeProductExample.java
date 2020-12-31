package com.jjc.entity.knowledge.example;

import com.jjc.entity.common.example.AbstractExample;
import com.jjc.entity.common.example.GeneratedCriteria;

import java.util.List;

public class KnowledgeProductExample extends AbstractExample {

    @Override
    public Criteria or() {
        return (Criteria)super.or();
    }

    @Override
    public Criteria createCriteria() {
        return (Criteria)super.createCriteria();
    }

    @Override
    protected Criteria createCriteriaInternal() {
        return new Criteria();
    }

    public class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }

        public Criteria andGroupIdIsNull() {
            addCriterion("group_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("group_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(Long value) {
            addCriterion("group_id =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(Long value) {
            addCriterion("group_id <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(Long value) {
            addCriterion("group_id >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(Long value) {
            addCriterion("group_id >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(Long value) {
            addCriterion("group_id <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(Long value) {
            addCriterion("group_id <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<Long> values) {
            addCriterion("group_id in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<Long> values) {
            addCriterion("group_id not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(Long value1, Long value2) {
            addCriterion("group_id between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(Long value1, Long value2) {
            addCriterion("group_id not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andSaleStatusIsNull() {
            addCriterion("sale_status is null");
            return (Criteria) this;
        }

        public Criteria andSaleStatusIsNotNull() {
            addCriterion("sale_status is not null");
            return (Criteria) this;
        }

        public Criteria andSaleStatusEqualTo(Integer value) {
            addCriterion("sale_status =", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusNotEqualTo(Integer value) {
            addCriterion("sale_status <>", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusGreaterThan(Integer value) {
            addCriterion("sale_status >", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_status >=", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusLessThan(Integer value) {
            addCriterion("sale_status <", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusLessThanOrEqualTo(Integer value) {
            addCriterion("sale_status <=", value, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusIn(List<Integer> values) {
            addCriterion("sale_status in", values, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusNotIn(List<Integer> values) {
            addCriterion("sale_status not in", values, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusBetween(Integer value1, Integer value2) {
            addCriterion("sale_status between", value1, value2, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andSaleStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_status not between", value1, value2, "saleStatus");
            return (Criteria) this;
        }

        public Criteria andProductTitleIsNull() {
            addCriterion("product_title is null");
            return (Criteria) this;
        }

        public Criteria andProductTitleIsNotNull() {
            addCriterion("product_title is not null");
            return (Criteria) this;
        }

        public Criteria andProductTitleEqualTo(String value) {
            addCriterion("product_title =", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleNotEqualTo(String value) {
            addCriterion("product_title <>", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleGreaterThan(String value) {
            addCriterion("product_title >", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleGreaterThanOrEqualTo(String value) {
            addCriterion("product_title >=", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleLessThan(String value) {
            addCriterion("product_title <", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleLessThanOrEqualTo(String value) {
            addCriterion("product_title <=", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleLike(String value) {
            addCriterion("product_title like", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleNotLike(String value) {
            addCriterion("product_title not like", value, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleIn(List<String> values) {
            addCriterion("product_title in", values, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleNotIn(List<String> values) {
            addCriterion("product_title not in", values, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleBetween(String value1, String value2) {
            addCriterion("product_title between", value1, value2, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductTitleNotBetween(String value1, String value2) {
            addCriterion("product_title not between", value1, value2, "productTitle");
            return (Criteria) this;
        }

        public Criteria andProductSnIsNull() {
            addCriterion("product_sn is null");
            return (Criteria) this;
        }

        public Criteria andProductSnIsNotNull() {
            addCriterion("product_sn is not null");
            return (Criteria) this;
        }

        public Criteria andProductSnEqualTo(String value) {
            addCriterion("product_sn =", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnNotEqualTo(String value) {
            addCriterion("product_sn <>", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnGreaterThan(String value) {
            addCriterion("product_sn >", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnGreaterThanOrEqualTo(String value) {
            addCriterion("product_sn >=", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnLessThan(String value) {
            addCriterion("product_sn <", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnLessThanOrEqualTo(String value) {
            addCriterion("product_sn <=", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnLike(String value) {
            addCriterion("product_sn like", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnNotLike(String value) {
            addCriterion("product_sn not like", value, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnIn(List<String> values) {
            addCriterion("product_sn in", values, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnNotIn(List<String> values) {
            addCriterion("product_sn not in", values, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnBetween(String value1, String value2) {
            addCriterion("product_sn between", value1, value2, "productSn");
            return (Criteria) this;
        }

        public Criteria andProductSnNotBetween(String value1, String value2) {
            addCriterion("product_sn not between", value1, value2, "productSn");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNull() {
            addCriterion("keywords is null");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNotNull() {
            addCriterion("keywords is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordsEqualTo(String value) {
            addCriterion("keywords =", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotEqualTo(String value) {
            addCriterion("keywords <>", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThan(String value) {
            addCriterion("keywords >", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("keywords >=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThan(String value) {
            addCriterion("keywords <", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThanOrEqualTo(String value) {
            addCriterion("keywords <=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLike(String value) {
            addCriterion("keywords like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotLike(String value) {
            addCriterion("keywords not like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsIn(List<String> values) {
            addCriterion("keywords in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotIn(List<String> values) {
            addCriterion("keywords not in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsBetween(String value1, String value2) {
            addCriterion("keywords between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotBetween(String value1, String value2) {
            addCriterion("keywords not between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andMaxImageIsNull() {
            addCriterion("max_image is null");
            return (Criteria) this;
        }

        public Criteria andMaxImageIsNotNull() {
            addCriterion("max_image is not null");
            return (Criteria) this;
        }

        public Criteria andMaxImageEqualTo(String value) {
            addCriterion("max_image =", value, "maxImage");
            return (Criteria) this;
        }

        public Criteria andMaxImageNotEqualTo(String value) {
            addCriterion("max_image <>", value, "maxImage");
            return (Criteria) this;
        }

        public Criteria andMaxImageGreaterThan(String value) {
            addCriterion("max_image >", value, "maxImage");
            return (Criteria) this;
        }

        public Criteria andMaxImageGreaterThanOrEqualTo(String value) {
            addCriterion("max_image >=", value, "maxImage");
            return (Criteria) this;
        }

        public Criteria andMaxImageLessThan(String value) {
            addCriterion("max_image <", value, "maxImage");
            return (Criteria) this;
        }

        public Criteria andMaxImageLessThanOrEqualTo(String value) {
            addCriterion("max_image <=", value, "maxImage");
            return (Criteria) this;
        }

        public Criteria andMaxImageLike(String value) {
            addCriterion("max_image like", value, "maxImage");
            return (Criteria) this;
        }

        public Criteria andMaxImageNotLike(String value) {
            addCriterion("max_image not like", value, "maxImage");
            return (Criteria) this;
        }

        public Criteria andMaxImageIn(List<String> values) {
            addCriterion("max_image in", values, "maxImage");
            return (Criteria) this;
        }

        public Criteria andMaxImageNotIn(List<String> values) {
            addCriterion("max_image not in", values, "maxImage");
            return (Criteria) this;
        }

        public Criteria andMaxImageBetween(String value1, String value2) {
            addCriterion("max_image between", value1, value2, "maxImage");
            return (Criteria) this;
        }

        public Criteria andMaxImageNotBetween(String value1, String value2) {
            addCriterion("max_image not between", value1, value2, "maxImage");
            return (Criteria) this;
        }

        public Criteria andMinImageIsNull() {
            addCriterion("min_image is null");
            return (Criteria) this;
        }

        public Criteria andMinImageIsNotNull() {
            addCriterion("min_image is not null");
            return (Criteria) this;
        }

        public Criteria andMinImageEqualTo(String value) {
            addCriterion("min_image =", value, "minImage");
            return (Criteria) this;
        }

        public Criteria andMinImageNotEqualTo(String value) {
            addCriterion("min_image <>", value, "minImage");
            return (Criteria) this;
        }

        public Criteria andMinImageGreaterThan(String value) {
            addCriterion("min_image >", value, "minImage");
            return (Criteria) this;
        }

        public Criteria andMinImageGreaterThanOrEqualTo(String value) {
            addCriterion("min_image >=", value, "minImage");
            return (Criteria) this;
        }

        public Criteria andMinImageLessThan(String value) {
            addCriterion("min_image <", value, "minImage");
            return (Criteria) this;
        }

        public Criteria andMinImageLessThanOrEqualTo(String value) {
            addCriterion("min_image <=", value, "minImage");
            return (Criteria) this;
        }

        public Criteria andMinImageLike(String value) {
            addCriterion("min_image like", value, "minImage");
            return (Criteria) this;
        }

        public Criteria andMinImageNotLike(String value) {
            addCriterion("min_image not like", value, "minImage");
            return (Criteria) this;
        }

        public Criteria andMinImageIn(List<String> values) {
            addCriterion("min_image in", values, "minImage");
            return (Criteria) this;
        }

        public Criteria andMinImageNotIn(List<String> values) {
            addCriterion("min_image not in", values, "minImage");
            return (Criteria) this;
        }

        public Criteria andMinImageBetween(String value1, String value2) {
            addCriterion("min_image between", value1, value2, "minImage");
            return (Criteria) this;
        }

        public Criteria andMinImageNotBetween(String value1, String value2) {
            addCriterion("min_image not between", value1, value2, "minImage");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIsNull() {
            addCriterion("video_url is null");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIsNotNull() {
            addCriterion("video_url is not null");
            return (Criteria) this;
        }

        public Criteria andVideoUrlEqualTo(String value) {
            addCriterion("video_url =", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotEqualTo(String value) {
            addCriterion("video_url <>", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlGreaterThan(String value) {
            addCriterion("video_url >", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("video_url >=", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLessThan(String value) {
            addCriterion("video_url <", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLessThanOrEqualTo(String value) {
            addCriterion("video_url <=", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLike(String value) {
            addCriterion("video_url like", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotLike(String value) {
            addCriterion("video_url not like", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIn(List<String> values) {
            addCriterion("video_url in", values, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotIn(List<String> values) {
            addCriterion("video_url not in", values, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlBetween(String value1, String value2) {
            addCriterion("video_url between", value1, value2, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotBetween(String value1, String value2) {
            addCriterion("video_url not between", value1, value2, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andWouldHotIsNull() {
            addCriterion("would_hot is null");
            return (Criteria) this;
        }

        public Criteria andWouldHotIsNotNull() {
            addCriterion("would_hot is not null");
            return (Criteria) this;
        }

        public Criteria andWouldHotEqualTo(Integer value) {
            addCriterion("would_hot =", value, "wouldHot");
            return (Criteria) this;
        }

        public Criteria andWouldHotNotEqualTo(Integer value) {
            addCriterion("would_hot <>", value, "wouldHot");
            return (Criteria) this;
        }

        public Criteria andWouldHotGreaterThan(Integer value) {
            addCriterion("would_hot >", value, "wouldHot");
            return (Criteria) this;
        }

        public Criteria andWouldHotGreaterThanOrEqualTo(Integer value) {
            addCriterion("would_hot >=", value, "wouldHot");
            return (Criteria) this;
        }

        public Criteria andWouldHotLessThan(Integer value) {
            addCriterion("would_hot <", value, "wouldHot");
            return (Criteria) this;
        }

        public Criteria andWouldHotLessThanOrEqualTo(Integer value) {
            addCriterion("would_hot <=", value, "wouldHot");
            return (Criteria) this;
        }

        public Criteria andWouldHotIn(List<Integer> values) {
            addCriterion("would_hot in", values, "wouldHot");
            return (Criteria) this;
        }

        public Criteria andWouldHotNotIn(List<Integer> values) {
            addCriterion("would_hot not in", values, "wouldHot");
            return (Criteria) this;
        }

        public Criteria andWouldHotBetween(Integer value1, Integer value2) {
            addCriterion("would_hot between", value1, value2, "wouldHot");
            return (Criteria) this;
        }

        public Criteria andWouldHotNotBetween(Integer value1, Integer value2) {
            addCriterion("would_hot not between", value1, value2, "wouldHot");
            return (Criteria) this;
        }

        public Criteria andWouldNewIsNull() {
            addCriterion("would_new is null");
            return (Criteria) this;
        }

        public Criteria andWouldNewIsNotNull() {
            addCriterion("would_new is not null");
            return (Criteria) this;
        }

        public Criteria andWouldNewEqualTo(Integer value) {
            addCriterion("would_new =", value, "wouldNew");
            return (Criteria) this;
        }

        public Criteria andWouldNewNotEqualTo(Integer value) {
            addCriterion("would_new <>", value, "wouldNew");
            return (Criteria) this;
        }

        public Criteria andWouldNewGreaterThan(Integer value) {
            addCriterion("would_new >", value, "wouldNew");
            return (Criteria) this;
        }

        public Criteria andWouldNewGreaterThanOrEqualTo(Integer value) {
            addCriterion("would_new >=", value, "wouldNew");
            return (Criteria) this;
        }

        public Criteria andWouldNewLessThan(Integer value) {
            addCriterion("would_new <", value, "wouldNew");
            return (Criteria) this;
        }

        public Criteria andWouldNewLessThanOrEqualTo(Integer value) {
            addCriterion("would_new <=", value, "wouldNew");
            return (Criteria) this;
        }

        public Criteria andWouldNewIn(List<Integer> values) {
            addCriterion("would_new in", values, "wouldNew");
            return (Criteria) this;
        }

        public Criteria andWouldNewNotIn(List<Integer> values) {
            addCriterion("would_new not in", values, "wouldNew");
            return (Criteria) this;
        }

        public Criteria andWouldNewBetween(Integer value1, Integer value2) {
            addCriterion("would_new between", value1, value2, "wouldNew");
            return (Criteria) this;
        }

        public Criteria andWouldNewNotBetween(Integer value1, Integer value2) {
            addCriterion("would_new not between", value1, value2, "wouldNew");
            return (Criteria) this;
        }

        public Criteria andWouldRecomHomeIsNull() {
            addCriterion("would_recom_home is null");
            return (Criteria) this;
        }

        public Criteria andWouldRecomHomeIsNotNull() {
            addCriterion("would_recom_home is not null");
            return (Criteria) this;
        }

        public Criteria andWouldRecomHomeEqualTo(Integer value) {
            addCriterion("would_recom_home =", value, "wouldRecomHome");
            return (Criteria) this;
        }

        public Criteria andWouldRecomHomeNotEqualTo(Integer value) {
            addCriterion("would_recom_home <>", value, "wouldRecomHome");
            return (Criteria) this;
        }

        public Criteria andWouldRecomHomeGreaterThan(Integer value) {
            addCriterion("would_recom_home >", value, "wouldRecomHome");
            return (Criteria) this;
        }

        public Criteria andWouldRecomHomeGreaterThanOrEqualTo(Integer value) {
            addCriterion("would_recom_home >=", value, "wouldRecomHome");
            return (Criteria) this;
        }

        public Criteria andWouldRecomHomeLessThan(Integer value) {
            addCriterion("would_recom_home <", value, "wouldRecomHome");
            return (Criteria) this;
        }

        public Criteria andWouldRecomHomeLessThanOrEqualTo(Integer value) {
            addCriterion("would_recom_home <=", value, "wouldRecomHome");
            return (Criteria) this;
        }

        public Criteria andWouldRecomHomeIn(List<Integer> values) {
            addCriterion("would_recom_home in", values, "wouldRecomHome");
            return (Criteria) this;
        }

        public Criteria andWouldRecomHomeNotIn(List<Integer> values) {
            addCriterion("would_recom_home not in", values, "wouldRecomHome");
            return (Criteria) this;
        }

        public Criteria andWouldRecomHomeBetween(Integer value1, Integer value2) {
            addCriterion("would_recom_home between", value1, value2, "wouldRecomHome");
            return (Criteria) this;
        }

        public Criteria andWouldRecomHomeNotBetween(Integer value1, Integer value2) {
            addCriterion("would_recom_home not between", value1, value2, "wouldRecomHome");
            return (Criteria) this;
        }

        public Criteria andSortNumberIsNull() {
            addCriterion("sort_number is null");
            return (Criteria) this;
        }

        public Criteria andSortNumberIsNotNull() {
            addCriterion("sort_number is not null");
            return (Criteria) this;
        }

        public Criteria andSortNumberEqualTo(Integer value) {
            addCriterion("sort_number =", value, "sortNumber");
            return (Criteria) this;
        }

        public Criteria andSortNumberNotEqualTo(Integer value) {
            addCriterion("sort_number <>", value, "sortNumber");
            return (Criteria) this;
        }

        public Criteria andSortNumberGreaterThan(Integer value) {
            addCriterion("sort_number >", value, "sortNumber");
            return (Criteria) this;
        }

        public Criteria andSortNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort_number >=", value, "sortNumber");
            return (Criteria) this;
        }

        public Criteria andSortNumberLessThan(Integer value) {
            addCriterion("sort_number <", value, "sortNumber");
            return (Criteria) this;
        }

        public Criteria andSortNumberLessThanOrEqualTo(Integer value) {
            addCriterion("sort_number <=", value, "sortNumber");
            return (Criteria) this;
        }

        public Criteria andSortNumberIn(List<Integer> values) {
            addCriterion("sort_number in", values, "sortNumber");
            return (Criteria) this;
        }

        public Criteria andSortNumberNotIn(List<Integer> values) {
            addCriterion("sort_number not in", values, "sortNumber");
            return (Criteria) this;
        }

        public Criteria andSortNumberBetween(Integer value1, Integer value2) {
            addCriterion("sort_number between", value1, value2, "sortNumber");
            return (Criteria) this;
        }

        public Criteria andSortNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("sort_number not between", value1, value2, "sortNumber");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andProductIdenIsNull() {
            addCriterion("product_iden is null");
            return (Criteria) this;
        }

        public Criteria andProductIdenIsNotNull() {
            addCriterion("product_iden is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdenEqualTo(String value) {
            addCriterion("product_iden =", value, "productIden");
            return (Criteria) this;
        }

        public Criteria andProductIdenNotEqualTo(String value) {
            addCriterion("product_iden <>", value, "productIden");
            return (Criteria) this;
        }

        public Criteria andProductIdenGreaterThan(String value) {
            addCriterion("product_iden >", value, "productIden");
            return (Criteria) this;
        }

        public Criteria andProductIdenGreaterThanOrEqualTo(String value) {
            addCriterion("product_iden >=", value, "productIden");
            return (Criteria) this;
        }

        public Criteria andProductIdenLessThan(String value) {
            addCriterion("product_iden <", value, "productIden");
            return (Criteria) this;
        }

        public Criteria andProductIdenLessThanOrEqualTo(String value) {
            addCriterion("product_iden <=", value, "productIden");
            return (Criteria) this;
        }

        public Criteria andProductIdenLike(String value) {
            addCriterion("product_iden like", value, "productIden");
            return (Criteria) this;
        }

        public Criteria andProductIdenNotLike(String value) {
            addCriterion("product_iden not like", value, "productIden");
            return (Criteria) this;
        }

        public Criteria andProductIdenIn(List<String> values) {
            addCriterion("product_iden in", values, "productIden");
            return (Criteria) this;
        }

        public Criteria andProductIdenNotIn(List<String> values) {
            addCriterion("product_iden not in", values, "productIden");
            return (Criteria) this;
        }

        public Criteria andProductIdenBetween(String value1, String value2) {
            addCriterion("product_iden between", value1, value2, "productIden");
            return (Criteria) this;
        }

        public Criteria andProductIdenNotBetween(String value1, String value2) {
            addCriterion("product_iden not between", value1, value2, "productIden");
            return (Criteria) this;
        }

        public Criteria andGoodNumIsNull() {
            addCriterion("good_num is null");
            return (Criteria) this;
        }

        public Criteria andGoodNumIsNotNull() {
            addCriterion("good_num is not null");
            return (Criteria) this;
        }

        public Criteria andGoodNumEqualTo(Integer value) {
            addCriterion("good_num =", value, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumNotEqualTo(Integer value) {
            addCriterion("good_num <>", value, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumGreaterThan(Integer value) {
            addCriterion("good_num >", value, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("good_num >=", value, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumLessThan(Integer value) {
            addCriterion("good_num <", value, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumLessThanOrEqualTo(Integer value) {
            addCriterion("good_num <=", value, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumIn(List<Integer> values) {
            addCriterion("good_num in", values, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumNotIn(List<Integer> values) {
            addCriterion("good_num not in", values, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumBetween(Integer value1, Integer value2) {
            addCriterion("good_num between", value1, value2, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumNotBetween(Integer value1, Integer value2) {
            addCriterion("good_num not between", value1, value2, "goodNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumIsNull() {
            addCriterion("comment_num is null");
            return (Criteria) this;
        }

        public Criteria andCommentNumIsNotNull() {
            addCriterion("comment_num is not null");
            return (Criteria) this;
        }

        public Criteria andCommentNumEqualTo(Integer value) {
            addCriterion("comment_num =", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumNotEqualTo(Integer value) {
            addCriterion("comment_num <>", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumGreaterThan(Integer value) {
            addCriterion("comment_num >", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_num >=", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumLessThan(Integer value) {
            addCriterion("comment_num <", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumLessThanOrEqualTo(Integer value) {
            addCriterion("comment_num <=", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumIn(List<Integer> values) {
            addCriterion("comment_num in", values, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumNotIn(List<Integer> values) {
            addCriterion("comment_num not in", values, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumBetween(Integer value1, Integer value2) {
            addCriterion("comment_num between", value1, value2, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_num not between", value1, value2, "commentNum");
            return (Criteria) this;
        }

        public Criteria andPlayNumIsNull() {
            addCriterion("play_num is null");
            return (Criteria) this;
        }

        public Criteria andPlayNumIsNotNull() {
            addCriterion("play_num is not null");
            return (Criteria) this;
        }

        public Criteria andPlayNumEqualTo(Integer value) {
            addCriterion("play_num =", value, "playNum");
            return (Criteria) this;
        }

        public Criteria andPlayNumNotEqualTo(Integer value) {
            addCriterion("play_num <>", value, "playNum");
            return (Criteria) this;
        }

        public Criteria andPlayNumGreaterThan(Integer value) {
            addCriterion("play_num >", value, "playNum");
            return (Criteria) this;
        }

        public Criteria andPlayNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("play_num >=", value, "playNum");
            return (Criteria) this;
        }

        public Criteria andPlayNumLessThan(Integer value) {
            addCriterion("play_num <", value, "playNum");
            return (Criteria) this;
        }

        public Criteria andPlayNumLessThanOrEqualTo(Integer value) {
            addCriterion("play_num <=", value, "playNum");
            return (Criteria) this;
        }

        public Criteria andPlayNumIn(List<Integer> values) {
            addCriterion("play_num in", values, "playNum");
            return (Criteria) this;
        }

        public Criteria andPlayNumNotIn(List<Integer> values) {
            addCriterion("play_num not in", values, "playNum");
            return (Criteria) this;
        }

        public Criteria andPlayNumBetween(Integer value1, Integer value2) {
            addCriterion("play_num between", value1, value2, "playNum");
            return (Criteria) this;
        }

        public Criteria andPlayNumNotBetween(Integer value1, Integer value2) {
            addCriterion("play_num not between", value1, value2, "playNum");
            return (Criteria) this;
        }

        public Criteria andFollowNumIsNull() {
            addCriterion("follow_num is null");
            return (Criteria) this;
        }

        public Criteria andFollowNumIsNotNull() {
            addCriterion("follow_num is not null");
            return (Criteria) this;
        }

        public Criteria andFollowNumEqualTo(Integer value) {
            addCriterion("follow_num =", value, "followNum");
            return (Criteria) this;
        }

        public Criteria andFollowNumNotEqualTo(Integer value) {
            addCriterion("follow_num <>", value, "followNum");
            return (Criteria) this;
        }

        public Criteria andFollowNumGreaterThan(Integer value) {
            addCriterion("follow_num >", value, "followNum");
            return (Criteria) this;
        }

        public Criteria andFollowNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("follow_num >=", value, "followNum");
            return (Criteria) this;
        }

        public Criteria andFollowNumLessThan(Integer value) {
            addCriterion("follow_num <", value, "followNum");
            return (Criteria) this;
        }

        public Criteria andFollowNumLessThanOrEqualTo(Integer value) {
            addCriterion("follow_num <=", value, "followNum");
            return (Criteria) this;
        }

        public Criteria andFollowNumIn(List<Integer> values) {
            addCriterion("follow_num in", values, "followNum");
            return (Criteria) this;
        }

        public Criteria andFollowNumNotIn(List<Integer> values) {
            addCriterion("follow_num not in", values, "followNum");
            return (Criteria) this;
        }

        public Criteria andFollowNumBetween(Integer value1, Integer value2) {
            addCriterion("follow_num between", value1, value2, "followNum");
            return (Criteria) this;
        }

        public Criteria andFollowNumNotBetween(Integer value1, Integer value2) {
            addCriterion("follow_num not between", value1, value2, "followNum");
            return (Criteria) this;
        }

        public Criteria andForwardNumIsNull() {
            addCriterion("forward_num is null");
            return (Criteria) this;
        }

        public Criteria andForwardNumIsNotNull() {
            addCriterion("forward_num is not null");
            return (Criteria) this;
        }

        public Criteria andForwardNumEqualTo(Integer value) {
            addCriterion("forward_num =", value, "forwardNum");
            return (Criteria) this;
        }

        public Criteria andForwardNumNotEqualTo(Integer value) {
            addCriterion("forward_num <>", value, "forwardNum");
            return (Criteria) this;
        }

        public Criteria andForwardNumGreaterThan(Integer value) {
            addCriterion("forward_num >", value, "forwardNum");
            return (Criteria) this;
        }

        public Criteria andForwardNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("forward_num >=", value, "forwardNum");
            return (Criteria) this;
        }

        public Criteria andForwardNumLessThan(Integer value) {
            addCriterion("forward_num <", value, "forwardNum");
            return (Criteria) this;
        }

        public Criteria andForwardNumLessThanOrEqualTo(Integer value) {
            addCriterion("forward_num <=", value, "forwardNum");
            return (Criteria) this;
        }

        public Criteria andForwardNumIn(List<Integer> values) {
            addCriterion("forward_num in", values, "forwardNum");
            return (Criteria) this;
        }

        public Criteria andForwardNumNotIn(List<Integer> values) {
            addCriterion("forward_num not in", values, "forwardNum");
            return (Criteria) this;
        }

        public Criteria andForwardNumBetween(Integer value1, Integer value2) {
            addCriterion("forward_num between", value1, value2, "forwardNum");
            return (Criteria) this;
        }

        public Criteria andForwardNumNotBetween(Integer value1, Integer value2) {
            addCriterion("forward_num not between", value1, value2, "forwardNum");
            return (Criteria) this;
        }

        public Criteria andUploadEntryIsNull() {
            addCriterion("upload_entry is null");
            return (Criteria) this;
        }

        public Criteria andUploadEntryIsNotNull() {
            addCriterion("upload_entry is not null");
            return (Criteria) this;
        }

        public Criteria andUploadEntryEqualTo(Integer value) {
            addCriterion("upload_entry =", value, "uploadEntry");
            return (Criteria) this;
        }

        public Criteria andUploadEntryNotEqualTo(Integer value) {
            addCriterion("upload_entry <>", value, "uploadEntry");
            return (Criteria) this;
        }

        public Criteria andUploadEntryGreaterThan(Integer value) {
            addCriterion("upload_entry >", value, "uploadEntry");
            return (Criteria) this;
        }

        public Criteria andUploadEntryGreaterThanOrEqualTo(Integer value) {
            addCriterion("upload_entry >=", value, "uploadEntry");
            return (Criteria) this;
        }

        public Criteria andUploadEntryLessThan(Integer value) {
            addCriterion("upload_entry <", value, "uploadEntry");
            return (Criteria) this;
        }

        public Criteria andUploadEntryLessThanOrEqualTo(Integer value) {
            addCriterion("upload_entry <=", value, "uploadEntry");
            return (Criteria) this;
        }

        public Criteria andUploadEntryIn(List<Integer> values) {
            addCriterion("upload_entry in", values, "uploadEntry");
            return (Criteria) this;
        }

        public Criteria andUploadEntryNotIn(List<Integer> values) {
            addCriterion("upload_entry not in", values, "uploadEntry");
            return (Criteria) this;
        }

        public Criteria andUploadEntryBetween(Integer value1, Integer value2) {
            addCriterion("upload_entry between", value1, value2, "uploadEntry");
            return (Criteria) this;
        }

        public Criteria andUploadEntryNotBetween(Integer value1, Integer value2) {
            addCriterion("upload_entry not between", value1, value2, "uploadEntry");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andHeadUrlIsNull() {
            addCriterion("head_url is null");
            return (Criteria) this;
        }

        public Criteria andHeadUrlIsNotNull() {
            addCriterion("head_url is not null");
            return (Criteria) this;
        }

        public Criteria andHeadUrlEqualTo(String value) {
            addCriterion("head_url =", value, "headUrl");
            return (Criteria) this;
        }

        public Criteria andHeadUrlNotEqualTo(String value) {
            addCriterion("head_url <>", value, "headUrl");
            return (Criteria) this;
        }

        public Criteria andHeadUrlGreaterThan(String value) {
            addCriterion("head_url >", value, "headUrl");
            return (Criteria) this;
        }

        public Criteria andHeadUrlGreaterThanOrEqualTo(String value) {
            addCriterion("head_url >=", value, "headUrl");
            return (Criteria) this;
        }

        public Criteria andHeadUrlLessThan(String value) {
            addCriterion("head_url <", value, "headUrl");
            return (Criteria) this;
        }

        public Criteria andHeadUrlLessThanOrEqualTo(String value) {
            addCriterion("head_url <=", value, "headUrl");
            return (Criteria) this;
        }

        public Criteria andHeadUrlLike(String value) {
            addCriterion("head_url like", value, "headUrl");
            return (Criteria) this;
        }

        public Criteria andHeadUrlNotLike(String value) {
            addCriterion("head_url not like", value, "headUrl");
            return (Criteria) this;
        }

        public Criteria andHeadUrlIn(List<String> values) {
            addCriterion("head_url in", values, "headUrl");
            return (Criteria) this;
        }

        public Criteria andHeadUrlNotIn(List<String> values) {
            addCriterion("head_url not in", values, "headUrl");
            return (Criteria) this;
        }

        public Criteria andHeadUrlBetween(String value1, String value2) {
            addCriterion("head_url between", value1, value2, "headUrl");
            return (Criteria) this;
        }

        public Criteria andHeadUrlNotBetween(String value1, String value2) {
            addCriterion("head_url not between", value1, value2, "headUrl");
            return (Criteria) this;
        }

        public Criteria andVideoAuthorIsNull() {
            addCriterion("video_author is null");
            return (Criteria) this;
        }

        public Criteria andVideoAuthorIsNotNull() {
            addCriterion("video_author is not null");
            return (Criteria) this;
        }

        public Criteria andVideoAuthorEqualTo(String value) {
            addCriterion("video_author =", value, "videoAuthor");
            return (Criteria) this;
        }

        public Criteria andVideoAuthorNotEqualTo(String value) {
            addCriterion("video_author <>", value, "videoAuthor");
            return (Criteria) this;
        }

        public Criteria andVideoAuthorGreaterThan(String value) {
            addCriterion("video_author >", value, "videoAuthor");
            return (Criteria) this;
        }

        public Criteria andVideoAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("video_author >=", value, "videoAuthor");
            return (Criteria) this;
        }

        public Criteria andVideoAuthorLessThan(String value) {
            addCriterion("video_author <", value, "videoAuthor");
            return (Criteria) this;
        }

        public Criteria andVideoAuthorLessThanOrEqualTo(String value) {
            addCriterion("video_author <=", value, "videoAuthor");
            return (Criteria) this;
        }

        public Criteria andVideoAuthorLike(String value) {
            addCriterion("video_author like", value, "videoAuthor");
            return (Criteria) this;
        }

        public Criteria andVideoAuthorNotLike(String value) {
            addCriterion("video_author not like", value, "videoAuthor");
            return (Criteria) this;
        }

        public Criteria andVideoAuthorIn(List<String> values) {
            addCriterion("video_author in", values, "videoAuthor");
            return (Criteria) this;
        }

        public Criteria andVideoAuthorNotIn(List<String> values) {
            addCriterion("video_author not in", values, "videoAuthor");
            return (Criteria) this;
        }

        public Criteria andVideoAuthorBetween(String value1, String value2) {
            addCriterion("video_author between", value1, value2, "videoAuthor");
            return (Criteria) this;
        }

        public Criteria andVideoAuthorNotBetween(String value1, String value2) {
            addCriterion("video_author not between", value1, value2, "videoAuthor");
            return (Criteria) this;
        }

        public Criteria andExpand1IsNull() {
            addCriterion("expand1 is null");
            return (Criteria) this;
        }

        public Criteria andExpand1IsNotNull() {
            addCriterion("expand1 is not null");
            return (Criteria) this;
        }

        public Criteria andExpand1EqualTo(String value) {
            addCriterion("expand1 =", value, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand1NotEqualTo(String value) {
            addCriterion("expand1 <>", value, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand1GreaterThan(String value) {
            addCriterion("expand1 >", value, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand1GreaterThanOrEqualTo(String value) {
            addCriterion("expand1 >=", value, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand1LessThan(String value) {
            addCriterion("expand1 <", value, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand1LessThanOrEqualTo(String value) {
            addCriterion("expand1 <=", value, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand1Like(String value) {
            addCriterion("expand1 like", value, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand1NotLike(String value) {
            addCriterion("expand1 not like", value, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand1In(List<String> values) {
            addCriterion("expand1 in", values, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand1NotIn(List<String> values) {
            addCriterion("expand1 not in", values, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand1Between(String value1, String value2) {
            addCriterion("expand1 between", value1, value2, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand1NotBetween(String value1, String value2) {
            addCriterion("expand1 not between", value1, value2, "expand1");
            return (Criteria) this;
        }

        public Criteria andExpand2IsNull() {
            addCriterion("expand2 is null");
            return (Criteria) this;
        }

        public Criteria andExpand2IsNotNull() {
            addCriterion("expand2 is not null");
            return (Criteria) this;
        }

        public Criteria andExpand2EqualTo(String value) {
            addCriterion("expand2 =", value, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand2NotEqualTo(String value) {
            addCriterion("expand2 <>", value, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand2GreaterThan(String value) {
            addCriterion("expand2 >", value, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand2GreaterThanOrEqualTo(String value) {
            addCriterion("expand2 >=", value, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand2LessThan(String value) {
            addCriterion("expand2 <", value, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand2LessThanOrEqualTo(String value) {
            addCriterion("expand2 <=", value, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand2Like(String value) {
            addCriterion("expand2 like", value, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand2NotLike(String value) {
            addCriterion("expand2 not like", value, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand2In(List<String> values) {
            addCriterion("expand2 in", values, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand2NotIn(List<String> values) {
            addCriterion("expand2 not in", values, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand2Between(String value1, String value2) {
            addCriterion("expand2 between", value1, value2, "expand2");
            return (Criteria) this;
        }

        public Criteria andExpand2NotBetween(String value1, String value2) {
            addCriterion("expand2 not between", value1, value2, "expand2");
            return (Criteria) this;
        }
    }
}