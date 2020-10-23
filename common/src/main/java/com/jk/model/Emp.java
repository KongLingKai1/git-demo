package com.jk.model;

import lombok.Data;

@Data
public class Emp {

    private     Integer     empId;

    private     String      empName;

    private     Integer     bmId;

    private     String      empDate;

    private     String      empGw;

    private     String      empZw;

    private     String      bmName;

    public String getBmName() {
        return bmName;
    }

    public void setBmName(String bmName) {
        this.bmName = bmName;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getBmId() {
        return bmId;
    }

    public void setBmId(Integer bmId) {
        this.bmId = bmId;
    }

    public String getEmpDate() {
        return empDate;
    }

    public void setEmpDate(String empDate) {
        this.empDate = empDate;
    }

    public String getEmpGw() {
        return empGw;
    }

    public void setEmpGw(String empGw) {
        this.empGw = empGw;
    }

    public String getEmpZw() {
        return empZw;
    }

    public void setEmpZw(String empZw) {
        this.empZw = empZw;
    }
}
