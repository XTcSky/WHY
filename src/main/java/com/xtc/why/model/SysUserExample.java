package com.xtc.why.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SysUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysUserExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("real_name is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("real_name is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("real_name =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("real_name <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("real_name >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("real_name >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("real_name <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("real_name <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("real_name like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("real_name not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("real_name in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("real_name not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("real_name between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("real_name not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andFamilyAddrIsNull() {
            addCriterion("family_addr is null");
            return (Criteria) this;
        }

        public Criteria andFamilyAddrIsNotNull() {
            addCriterion("family_addr is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyAddrEqualTo(String value) {
            addCriterion("family_addr =", value, "familyAddr");
            return (Criteria) this;
        }

        public Criteria andFamilyAddrNotEqualTo(String value) {
            addCriterion("family_addr <>", value, "familyAddr");
            return (Criteria) this;
        }

        public Criteria andFamilyAddrGreaterThan(String value) {
            addCriterion("family_addr >", value, "familyAddr");
            return (Criteria) this;
        }

        public Criteria andFamilyAddrGreaterThanOrEqualTo(String value) {
            addCriterion("family_addr >=", value, "familyAddr");
            return (Criteria) this;
        }

        public Criteria andFamilyAddrLessThan(String value) {
            addCriterion("family_addr <", value, "familyAddr");
            return (Criteria) this;
        }

        public Criteria andFamilyAddrLessThanOrEqualTo(String value) {
            addCriterion("family_addr <=", value, "familyAddr");
            return (Criteria) this;
        }

        public Criteria andFamilyAddrLike(String value) {
            addCriterion("family_addr like", value, "familyAddr");
            return (Criteria) this;
        }

        public Criteria andFamilyAddrNotLike(String value) {
            addCriterion("family_addr not like", value, "familyAddr");
            return (Criteria) this;
        }

        public Criteria andFamilyAddrIn(List<String> values) {
            addCriterion("family_addr in", values, "familyAddr");
            return (Criteria) this;
        }

        public Criteria andFamilyAddrNotIn(List<String> values) {
            addCriterion("family_addr not in", values, "familyAddr");
            return (Criteria) this;
        }

        public Criteria andFamilyAddrBetween(String value1, String value2) {
            addCriterion("family_addr between", value1, value2, "familyAddr");
            return (Criteria) this;
        }

        public Criteria andFamilyAddrNotBetween(String value1, String value2) {
            addCriterion("family_addr not between", value1, value2, "familyAddr");
            return (Criteria) this;
        }

        public Criteria andNowAddrIsNull() {
            addCriterion("now_addr is null");
            return (Criteria) this;
        }

        public Criteria andNowAddrIsNotNull() {
            addCriterion("now_addr is not null");
            return (Criteria) this;
        }

        public Criteria andNowAddrEqualTo(String value) {
            addCriterion("now_addr =", value, "nowAddr");
            return (Criteria) this;
        }

        public Criteria andNowAddrNotEqualTo(String value) {
            addCriterion("now_addr <>", value, "nowAddr");
            return (Criteria) this;
        }

        public Criteria andNowAddrGreaterThan(String value) {
            addCriterion("now_addr >", value, "nowAddr");
            return (Criteria) this;
        }

        public Criteria andNowAddrGreaterThanOrEqualTo(String value) {
            addCriterion("now_addr >=", value, "nowAddr");
            return (Criteria) this;
        }

        public Criteria andNowAddrLessThan(String value) {
            addCriterion("now_addr <", value, "nowAddr");
            return (Criteria) this;
        }

        public Criteria andNowAddrLessThanOrEqualTo(String value) {
            addCriterion("now_addr <=", value, "nowAddr");
            return (Criteria) this;
        }

        public Criteria andNowAddrLike(String value) {
            addCriterion("now_addr like", value, "nowAddr");
            return (Criteria) this;
        }

        public Criteria andNowAddrNotLike(String value) {
            addCriterion("now_addr not like", value, "nowAddr");
            return (Criteria) this;
        }

        public Criteria andNowAddrIn(List<String> values) {
            addCriterion("now_addr in", values, "nowAddr");
            return (Criteria) this;
        }

        public Criteria andNowAddrNotIn(List<String> values) {
            addCriterion("now_addr not in", values, "nowAddr");
            return (Criteria) this;
        }

        public Criteria andNowAddrBetween(String value1, String value2) {
            addCriterion("now_addr between", value1, value2, "nowAddr");
            return (Criteria) this;
        }

        public Criteria andNowAddrNotBetween(String value1, String value2) {
            addCriterion("now_addr not between", value1, value2, "nowAddr");
            return (Criteria) this;
        }

        public Criteria andFixPhoneIsNull() {
            addCriterion("fix_phone is null");
            return (Criteria) this;
        }

        public Criteria andFixPhoneIsNotNull() {
            addCriterion("fix_phone is not null");
            return (Criteria) this;
        }

        public Criteria andFixPhoneEqualTo(String value) {
            addCriterion("fix_phone =", value, "fixPhone");
            return (Criteria) this;
        }

        public Criteria andFixPhoneNotEqualTo(String value) {
            addCriterion("fix_phone <>", value, "fixPhone");
            return (Criteria) this;
        }

        public Criteria andFixPhoneGreaterThan(String value) {
            addCriterion("fix_phone >", value, "fixPhone");
            return (Criteria) this;
        }

        public Criteria andFixPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("fix_phone >=", value, "fixPhone");
            return (Criteria) this;
        }

        public Criteria andFixPhoneLessThan(String value) {
            addCriterion("fix_phone <", value, "fixPhone");
            return (Criteria) this;
        }

        public Criteria andFixPhoneLessThanOrEqualTo(String value) {
            addCriterion("fix_phone <=", value, "fixPhone");
            return (Criteria) this;
        }

        public Criteria andFixPhoneLike(String value) {
            addCriterion("fix_phone like", value, "fixPhone");
            return (Criteria) this;
        }

        public Criteria andFixPhoneNotLike(String value) {
            addCriterion("fix_phone not like", value, "fixPhone");
            return (Criteria) this;
        }

        public Criteria andFixPhoneIn(List<String> values) {
            addCriterion("fix_phone in", values, "fixPhone");
            return (Criteria) this;
        }

        public Criteria andFixPhoneNotIn(List<String> values) {
            addCriterion("fix_phone not in", values, "fixPhone");
            return (Criteria) this;
        }

        public Criteria andFixPhoneBetween(String value1, String value2) {
            addCriterion("fix_phone between", value1, value2, "fixPhone");
            return (Criteria) this;
        }

        public Criteria andFixPhoneNotBetween(String value1, String value2) {
            addCriterion("fix_phone not between", value1, value2, "fixPhone");
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

        public Criteria andEMailIsNull() {
            addCriterion("e_mail is null");
            return (Criteria) this;
        }

        public Criteria andEMailIsNotNull() {
            addCriterion("e_mail is not null");
            return (Criteria) this;
        }

        public Criteria andEMailEqualTo(String value) {
            addCriterion("e_mail =", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotEqualTo(String value) {
            addCriterion("e_mail <>", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailGreaterThan(String value) {
            addCriterion("e_mail >", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailGreaterThanOrEqualTo(String value) {
            addCriterion("e_mail >=", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLessThan(String value) {
            addCriterion("e_mail <", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLessThanOrEqualTo(String value) {
            addCriterion("e_mail <=", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailLike(String value) {
            addCriterion("e_mail like", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotLike(String value) {
            addCriterion("e_mail not like", value, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailIn(List<String> values) {
            addCriterion("e_mail in", values, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotIn(List<String> values) {
            addCriterion("e_mail not in", values, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailBetween(String value1, String value2) {
            addCriterion("e_mail between", value1, value2, "eMail");
            return (Criteria) this;
        }

        public Criteria andEMailNotBetween(String value1, String value2) {
            addCriterion("e_mail not between", value1, value2, "eMail");
            return (Criteria) this;
        }

        public Criteria andUrgentNameIsNull() {
            addCriterion("urgent_name is null");
            return (Criteria) this;
        }

        public Criteria andUrgentNameIsNotNull() {
            addCriterion("urgent_name is not null");
            return (Criteria) this;
        }

        public Criteria andUrgentNameEqualTo(String value) {
            addCriterion("urgent_name =", value, "urgentName");
            return (Criteria) this;
        }

        public Criteria andUrgentNameNotEqualTo(String value) {
            addCriterion("urgent_name <>", value, "urgentName");
            return (Criteria) this;
        }

        public Criteria andUrgentNameGreaterThan(String value) {
            addCriterion("urgent_name >", value, "urgentName");
            return (Criteria) this;
        }

        public Criteria andUrgentNameGreaterThanOrEqualTo(String value) {
            addCriterion("urgent_name >=", value, "urgentName");
            return (Criteria) this;
        }

        public Criteria andUrgentNameLessThan(String value) {
            addCriterion("urgent_name <", value, "urgentName");
            return (Criteria) this;
        }

        public Criteria andUrgentNameLessThanOrEqualTo(String value) {
            addCriterion("urgent_name <=", value, "urgentName");
            return (Criteria) this;
        }

        public Criteria andUrgentNameLike(String value) {
            addCriterion("urgent_name like", value, "urgentName");
            return (Criteria) this;
        }

        public Criteria andUrgentNameNotLike(String value) {
            addCriterion("urgent_name not like", value, "urgentName");
            return (Criteria) this;
        }

        public Criteria andUrgentNameIn(List<String> values) {
            addCriterion("urgent_name in", values, "urgentName");
            return (Criteria) this;
        }

        public Criteria andUrgentNameNotIn(List<String> values) {
            addCriterion("urgent_name not in", values, "urgentName");
            return (Criteria) this;
        }

        public Criteria andUrgentNameBetween(String value1, String value2) {
            addCriterion("urgent_name between", value1, value2, "urgentName");
            return (Criteria) this;
        }

        public Criteria andUrgentNameNotBetween(String value1, String value2) {
            addCriterion("urgent_name not between", value1, value2, "urgentName");
            return (Criteria) this;
        }

        public Criteria andUrgentPhoneIsNull() {
            addCriterion("urgent_phone is null");
            return (Criteria) this;
        }

        public Criteria andUrgentPhoneIsNotNull() {
            addCriterion("urgent_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUrgentPhoneEqualTo(String value) {
            addCriterion("urgent_phone =", value, "urgentPhone");
            return (Criteria) this;
        }

        public Criteria andUrgentPhoneNotEqualTo(String value) {
            addCriterion("urgent_phone <>", value, "urgentPhone");
            return (Criteria) this;
        }

        public Criteria andUrgentPhoneGreaterThan(String value) {
            addCriterion("urgent_phone >", value, "urgentPhone");
            return (Criteria) this;
        }

        public Criteria andUrgentPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("urgent_phone >=", value, "urgentPhone");
            return (Criteria) this;
        }

        public Criteria andUrgentPhoneLessThan(String value) {
            addCriterion("urgent_phone <", value, "urgentPhone");
            return (Criteria) this;
        }

        public Criteria andUrgentPhoneLessThanOrEqualTo(String value) {
            addCriterion("urgent_phone <=", value, "urgentPhone");
            return (Criteria) this;
        }

        public Criteria andUrgentPhoneLike(String value) {
            addCriterion("urgent_phone like", value, "urgentPhone");
            return (Criteria) this;
        }

        public Criteria andUrgentPhoneNotLike(String value) {
            addCriterion("urgent_phone not like", value, "urgentPhone");
            return (Criteria) this;
        }

        public Criteria andUrgentPhoneIn(List<String> values) {
            addCriterion("urgent_phone in", values, "urgentPhone");
            return (Criteria) this;
        }

        public Criteria andUrgentPhoneNotIn(List<String> values) {
            addCriterion("urgent_phone not in", values, "urgentPhone");
            return (Criteria) this;
        }

        public Criteria andUrgentPhoneBetween(String value1, String value2) {
            addCriterion("urgent_phone between", value1, value2, "urgentPhone");
            return (Criteria) this;
        }

        public Criteria andUrgentPhoneNotBetween(String value1, String value2) {
            addCriterion("urgent_phone not between", value1, value2, "urgentPhone");
            return (Criteria) this;
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

        public Criteria andJobUnidIsNull() {
            addCriterion("job_unid is null");
            return (Criteria) this;
        }

        public Criteria andJobUnidIsNotNull() {
            addCriterion("job_unid is not null");
            return (Criteria) this;
        }

        public Criteria andJobUnidEqualTo(String value) {
            addCriterion("job_unid =", value, "jobUnid");
            return (Criteria) this;
        }

        public Criteria andJobUnidNotEqualTo(String value) {
            addCriterion("job_unid <>", value, "jobUnid");
            return (Criteria) this;
        }

        public Criteria andJobUnidGreaterThan(String value) {
            addCriterion("job_unid >", value, "jobUnid");
            return (Criteria) this;
        }

        public Criteria andJobUnidGreaterThanOrEqualTo(String value) {
            addCriterion("job_unid >=", value, "jobUnid");
            return (Criteria) this;
        }

        public Criteria andJobUnidLessThan(String value) {
            addCriterion("job_unid <", value, "jobUnid");
            return (Criteria) this;
        }

        public Criteria andJobUnidLessThanOrEqualTo(String value) {
            addCriterion("job_unid <=", value, "jobUnid");
            return (Criteria) this;
        }

        public Criteria andJobUnidLike(String value) {
            addCriterion("job_unid like", value, "jobUnid");
            return (Criteria) this;
        }

        public Criteria andJobUnidNotLike(String value) {
            addCriterion("job_unid not like", value, "jobUnid");
            return (Criteria) this;
        }

        public Criteria andJobUnidIn(List<String> values) {
            addCriterion("job_unid in", values, "jobUnid");
            return (Criteria) this;
        }

        public Criteria andJobUnidNotIn(List<String> values) {
            addCriterion("job_unid not in", values, "jobUnid");
            return (Criteria) this;
        }

        public Criteria andJobUnidBetween(String value1, String value2) {
            addCriterion("job_unid between", value1, value2, "jobUnid");
            return (Criteria) this;
        }

        public Criteria andJobUnidNotBetween(String value1, String value2) {
            addCriterion("job_unid not between", value1, value2, "jobUnid");
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

        public Criteria andUserNumIsNull() {
            addCriterion("user_num is null");
            return (Criteria) this;
        }

        public Criteria andUserNumIsNotNull() {
            addCriterion("user_num is not null");
            return (Criteria) this;
        }

        public Criteria andUserNumEqualTo(String value) {
            addCriterion("user_num =", value, "userNum");
            return (Criteria) this;
        }

        public Criteria andUserNumNotEqualTo(String value) {
            addCriterion("user_num <>", value, "userNum");
            return (Criteria) this;
        }

        public Criteria andUserNumGreaterThan(String value) {
            addCriterion("user_num >", value, "userNum");
            return (Criteria) this;
        }

        public Criteria andUserNumGreaterThanOrEqualTo(String value) {
            addCriterion("user_num >=", value, "userNum");
            return (Criteria) this;
        }

        public Criteria andUserNumLessThan(String value) {
            addCriterion("user_num <", value, "userNum");
            return (Criteria) this;
        }

        public Criteria andUserNumLessThanOrEqualTo(String value) {
            addCriterion("user_num <=", value, "userNum");
            return (Criteria) this;
        }

        public Criteria andUserNumLike(String value) {
            addCriterion("user_num like", value, "userNum");
            return (Criteria) this;
        }

        public Criteria andUserNumNotLike(String value) {
            addCriterion("user_num not like", value, "userNum");
            return (Criteria) this;
        }

        public Criteria andUserNumIn(List<String> values) {
            addCriterion("user_num in", values, "userNum");
            return (Criteria) this;
        }

        public Criteria andUserNumNotIn(List<String> values) {
            addCriterion("user_num not in", values, "userNum");
            return (Criteria) this;
        }

        public Criteria andUserNumBetween(String value1, String value2) {
            addCriterion("user_num between", value1, value2, "userNum");
            return (Criteria) this;
        }

        public Criteria andUserNumNotBetween(String value1, String value2) {
            addCriterion("user_num not between", value1, value2, "userNum");
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