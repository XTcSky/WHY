package com.xtc.why.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysDeptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysDeptExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andDeptUnidIsNull() {
            addCriterion("dept_unid is null");
            return (Criteria) this;
        }

        public Criteria andDeptUnidIsNotNull() {
            addCriterion("dept_unid is not null");
            return (Criteria) this;
        }

        public Criteria andDeptUnidEqualTo(String value) {
            addCriterion("dept_unid =", value, "deptUnid");
            return (Criteria) this;
        }

        public Criteria andDeptUnidNotEqualTo(String value) {
            addCriterion("dept_unid <>", value, "deptUnid");
            return (Criteria) this;
        }

        public Criteria andDeptUnidGreaterThan(String value) {
            addCriterion("dept_unid >", value, "deptUnid");
            return (Criteria) this;
        }

        public Criteria andDeptUnidGreaterThanOrEqualTo(String value) {
            addCriterion("dept_unid >=", value, "deptUnid");
            return (Criteria) this;
        }

        public Criteria andDeptUnidLessThan(String value) {
            addCriterion("dept_unid <", value, "deptUnid");
            return (Criteria) this;
        }

        public Criteria andDeptUnidLessThanOrEqualTo(String value) {
            addCriterion("dept_unid <=", value, "deptUnid");
            return (Criteria) this;
        }

        public Criteria andDeptUnidLike(String value) {
            addCriterion("dept_unid like", value, "deptUnid");
            return (Criteria) this;
        }

        public Criteria andDeptUnidNotLike(String value) {
            addCriterion("dept_unid not like", value, "deptUnid");
            return (Criteria) this;
        }

        public Criteria andDeptUnidIn(List<String> values) {
            addCriterion("dept_unid in", values, "deptUnid");
            return (Criteria) this;
        }

        public Criteria andDeptUnidNotIn(List<String> values) {
            addCriterion("dept_unid not in", values, "deptUnid");
            return (Criteria) this;
        }

        public Criteria andDeptUnidBetween(String value1, String value2) {
            addCriterion("dept_unid between", value1, value2, "deptUnid");
            return (Criteria) this;
        }

        public Criteria andDeptUnidNotBetween(String value1, String value2) {
            addCriterion("dept_unid not between", value1, value2, "deptUnid");
            return (Criteria) this;
        }

        public Criteria andDeptNumIsNull() {
            addCriterion("dept_num is null");
            return (Criteria) this;
        }

        public Criteria andDeptNumIsNotNull() {
            addCriterion("dept_num is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNumEqualTo(String value) {
            addCriterion("dept_num =", value, "deptNum");
            return (Criteria) this;
        }

        public Criteria andDeptNumNotEqualTo(String value) {
            addCriterion("dept_num <>", value, "deptNum");
            return (Criteria) this;
        }

        public Criteria andDeptNumGreaterThan(String value) {
            addCriterion("dept_num >", value, "deptNum");
            return (Criteria) this;
        }

        public Criteria andDeptNumGreaterThanOrEqualTo(String value) {
            addCriterion("dept_num >=", value, "deptNum");
            return (Criteria) this;
        }

        public Criteria andDeptNumLessThan(String value) {
            addCriterion("dept_num <", value, "deptNum");
            return (Criteria) this;
        }

        public Criteria andDeptNumLessThanOrEqualTo(String value) {
            addCriterion("dept_num <=", value, "deptNum");
            return (Criteria) this;
        }

        public Criteria andDeptNumLike(String value) {
            addCriterion("dept_num like", value, "deptNum");
            return (Criteria) this;
        }

        public Criteria andDeptNumNotLike(String value) {
            addCriterion("dept_num not like", value, "deptNum");
            return (Criteria) this;
        }

        public Criteria andDeptNumIn(List<String> values) {
            addCriterion("dept_num in", values, "deptNum");
            return (Criteria) this;
        }

        public Criteria andDeptNumNotIn(List<String> values) {
            addCriterion("dept_num not in", values, "deptNum");
            return (Criteria) this;
        }

        public Criteria andDeptNumBetween(String value1, String value2) {
            addCriterion("dept_num between", value1, value2, "deptNum");
            return (Criteria) this;
        }

        public Criteria andDeptNumNotBetween(String value1, String value2) {
            addCriterion("dept_num not between", value1, value2, "deptNum");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNull() {
            addCriterion("dept_name is null");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNotNull() {
            addCriterion("dept_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNameEqualTo(String value) {
            addCriterion("dept_name =", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotEqualTo(String value) {
            addCriterion("dept_name <>", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThan(String value) {
            addCriterion("dept_name >", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("dept_name >=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThan(String value) {
            addCriterion("dept_name <", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThanOrEqualTo(String value) {
            addCriterion("dept_name <=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLike(String value) {
            addCriterion("dept_name like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotLike(String value) {
            addCriterion("dept_name not like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameIn(List<String> values) {
            addCriterion("dept_name in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotIn(List<String> values) {
            addCriterion("dept_name not in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameBetween(String value1, String value2) {
            addCriterion("dept_name between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotBetween(String value1, String value2) {
            addCriterion("dept_name not between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andPDeptUnidIsNull() {
            addCriterion("p_dept_unid is null");
            return (Criteria) this;
        }

        public Criteria andPDeptUnidIsNotNull() {
            addCriterion("p_dept_unid is not null");
            return (Criteria) this;
        }

        public Criteria andPDeptUnidEqualTo(String value) {
            addCriterion("p_dept_unid =", value, "pDeptUnid");
            return (Criteria) this;
        }

        public Criteria andPDeptUnidNotEqualTo(String value) {
            addCriterion("p_dept_unid <>", value, "pDeptUnid");
            return (Criteria) this;
        }

        public Criteria andPDeptUnidGreaterThan(String value) {
            addCriterion("p_dept_unid >", value, "pDeptUnid");
            return (Criteria) this;
        }

        public Criteria andPDeptUnidGreaterThanOrEqualTo(String value) {
            addCriterion("p_dept_unid >=", value, "pDeptUnid");
            return (Criteria) this;
        }

        public Criteria andPDeptUnidLessThan(String value) {
            addCriterion("p_dept_unid <", value, "pDeptUnid");
            return (Criteria) this;
        }

        public Criteria andPDeptUnidLessThanOrEqualTo(String value) {
            addCriterion("p_dept_unid <=", value, "pDeptUnid");
            return (Criteria) this;
        }

        public Criteria andPDeptUnidLike(String value) {
            addCriterion("p_dept_unid like", value, "pDeptUnid");
            return (Criteria) this;
        }

        public Criteria andPDeptUnidNotLike(String value) {
            addCriterion("p_dept_unid not like", value, "pDeptUnid");
            return (Criteria) this;
        }

        public Criteria andPDeptUnidIn(List<String> values) {
            addCriterion("p_dept_unid in", values, "pDeptUnid");
            return (Criteria) this;
        }

        public Criteria andPDeptUnidNotIn(List<String> values) {
            addCriterion("p_dept_unid not in", values, "pDeptUnid");
            return (Criteria) this;
        }

        public Criteria andPDeptUnidBetween(String value1, String value2) {
            addCriterion("p_dept_unid between", value1, value2, "pDeptUnid");
            return (Criteria) this;
        }

        public Criteria andPDeptUnidNotBetween(String value1, String value2) {
            addCriterion("p_dept_unid not between", value1, value2, "pDeptUnid");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(String value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(String value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(String value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(String value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(String value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(String value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLike(String value) {
            addCriterion("sort like", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotLike(String value) {
            addCriterion("sort not like", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<String> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<String> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(String value1, String value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(String value1, String value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andDeptTypeUnidIsNull() {
            addCriterion("dept_type_unid is null");
            return (Criteria) this;
        }

        public Criteria andDeptTypeUnidIsNotNull() {
            addCriterion("dept_type_unid is not null");
            return (Criteria) this;
        }

        public Criteria andDeptTypeUnidEqualTo(String value) {
            addCriterion("dept_type_unid =", value, "deptTypeUnid");
            return (Criteria) this;
        }

        public Criteria andDeptTypeUnidNotEqualTo(String value) {
            addCriterion("dept_type_unid <>", value, "deptTypeUnid");
            return (Criteria) this;
        }

        public Criteria andDeptTypeUnidGreaterThan(String value) {
            addCriterion("dept_type_unid >", value, "deptTypeUnid");
            return (Criteria) this;
        }

        public Criteria andDeptTypeUnidGreaterThanOrEqualTo(String value) {
            addCriterion("dept_type_unid >=", value, "deptTypeUnid");
            return (Criteria) this;
        }

        public Criteria andDeptTypeUnidLessThan(String value) {
            addCriterion("dept_type_unid <", value, "deptTypeUnid");
            return (Criteria) this;
        }

        public Criteria andDeptTypeUnidLessThanOrEqualTo(String value) {
            addCriterion("dept_type_unid <=", value, "deptTypeUnid");
            return (Criteria) this;
        }

        public Criteria andDeptTypeUnidLike(String value) {
            addCriterion("dept_type_unid like", value, "deptTypeUnid");
            return (Criteria) this;
        }

        public Criteria andDeptTypeUnidNotLike(String value) {
            addCriterion("dept_type_unid not like", value, "deptTypeUnid");
            return (Criteria) this;
        }

        public Criteria andDeptTypeUnidIn(List<String> values) {
            addCriterion("dept_type_unid in", values, "deptTypeUnid");
            return (Criteria) this;
        }

        public Criteria andDeptTypeUnidNotIn(List<String> values) {
            addCriterion("dept_type_unid not in", values, "deptTypeUnid");
            return (Criteria) this;
        }

        public Criteria andDeptTypeUnidBetween(String value1, String value2) {
            addCriterion("dept_type_unid between", value1, value2, "deptTypeUnid");
            return (Criteria) this;
        }

        public Criteria andDeptTypeUnidNotBetween(String value1, String value2) {
            addCriterion("dept_type_unid not between", value1, value2, "deptTypeUnid");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIsNull() {
            addCriterion("modified_time is null");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIsNotNull() {
            addCriterion("modified_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeEqualTo(Date value) {
            addCriterion("modified_time =", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotEqualTo(Date value) {
            addCriterion("modified_time <>", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeGreaterThan(Date value) {
            addCriterion("modified_time >", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modified_time >=", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeLessThan(Date value) {
            addCriterion("modified_time <", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeLessThanOrEqualTo(Date value) {
            addCriterion("modified_time <=", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIn(List<Date> values) {
            addCriterion("modified_time in", values, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotIn(List<Date> values) {
            addCriterion("modified_time not in", values, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeBetween(Date value1, Date value2) {
            addCriterion("modified_time between", value1, value2, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotBetween(Date value1, Date value2) {
            addCriterion("modified_time not between", value1, value2, "modifiedTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}