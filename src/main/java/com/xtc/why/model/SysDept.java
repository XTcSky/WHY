package com.xtc.why.model;

import java.util.Date;

public class SysDept {
    private String deptUnid;

    private String deptNum;

    private String deptName;

    private String pDeptUnid;

    private String sort;

    private String deptTypeUnid;

    private String phone;

    private String status;

    private String remark;

    private Date createtime;

    private Date modifiedTime;

    public String getDeptUnid() {
        return deptUnid;
    }

    public void setDeptUnid(String deptUnid) {
        this.deptUnid = deptUnid == null ? null : deptUnid.trim();
    }

    public String getDeptNum() {
        return deptNum;
    }

    public void setDeptNum(String deptNum) {
        this.deptNum = deptNum == null ? null : deptNum.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getpDeptUnid() {
        return pDeptUnid;
    }

    public void setpDeptUnid(String pDeptUnid) {
        this.pDeptUnid = pDeptUnid == null ? null : pDeptUnid.trim();
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort == null ? null : sort.trim();
    }

    public String getDeptTypeUnid() {
        return deptTypeUnid;
    }

    public void setDeptTypeUnid(String deptTypeUnid) {
        this.deptTypeUnid = deptTypeUnid == null ? null : deptTypeUnid.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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
}