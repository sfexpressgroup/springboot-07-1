package com.ht.bean;

public class Emp {
    private int empno;
    private String empname;
    private String sex;
    private int age;
    private String des;
    private int deptno;
    private Integer phone;

    public Emp() {}

    public Emp(int empno, String empname, String sex, int age, String des, int deptno, Integer phone) {
        this.empno = empno;
        this.empname = empname;
        this.sex = sex;
        this.age = age;
        this.des = des;
        this.deptno = deptno;
        this.phone = phone;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", empname='" + empname + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", des='" + des + '\'' +
                ", deptno=" + deptno +
                ", phone=" + phone +
                '}';
    }
}
