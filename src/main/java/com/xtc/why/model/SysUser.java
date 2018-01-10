package com.xtc.why.model;

import java.util.Date;

public class SysUser {
    private String userName;

    private String password;

    private String realName;

    private String gender;

    private Date birthday;

    private String familyAddr;

    private String nowAddr;

    private String fixPhone;

    private String phone;

    private String eMail;

    private String urgentName;

    private String urgentPhone;

    private String deptUnid;

    private String jobUnid;

    private String sort;

    private String userNum;

    private String remark;

    private Date createtime;

    private Date modifiedTime;

    private String status;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getFamilyAddr() {
        return familyAddr;
    }

    public void setFamilyAddr(String familyAddr) {
        this.familyAddr = familyAddr == null ? null : familyAddr.trim();
    }

    public String getNowAddr() {
        return nowAddr;
    }

    public void setNowAddr(String nowAddr) {
        this.nowAddr = nowAddr == null ? null : nowAddr.trim();
    }

    public String getFixPhone() {
        return fixPhone;
    }

    public void setFixPhone(String fixPhone) {
        this.fixPhone = fixPhone == null ? null : fixPhone.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail == null ? null : eMail.trim();
    }

    public String getUrgentName() {
        return urgentName;
    }

    public void setUrgentName(String urgentName) {
        this.urgentName = urgentName == null ? null : urgentName.trim();
    }

    public String getUrgentPhone() {
        return urgentPhone;
    }

    public void setUrgentPhone(String urgentPhone) {
        this.urgentPhone = urgentPhone == null ? null : urgentPhone.trim();
    }

    public String getDeptUnid() {
        return deptUnid;
    }

    public void setDeptUnid(String deptUnid) {
        this.deptUnid = deptUnid == null ? null : deptUnid.trim();
    }

    public String getJobUnid() {
        return jobUnid;
    }

    public void setJobUnid(String jobUnid) {
        this.jobUnid = jobUnid == null ? null : jobUnid.trim();
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort == null ? null : sort.trim();
    }

    public String getUserNum() {
        return userNum;
    }

    public void setUserNum(String userNum) {
        this.userNum = userNum == null ? null : userNum.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}