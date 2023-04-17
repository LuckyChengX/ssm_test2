package com.lucky.ssm.pojo;

/**
 * @ClassPackage:com.lucky.ssm.pojo
 * @ClassName:Emp
 * @Author:LuckyCheng 23953
 * @Create:2023/4/16-15:29 星期日
 * @ClassDescription:
 */
public class Emp {
    private int eid;
    private String empName;
    private String empSex;
    private int empAge;
    private int did;

    public Emp(int eid, String empName, String empSex, int empAge) {
        this.eid = eid;
        this.empName = empName;
        this.empSex = empSex;
        this.empAge = empAge;
    }

    public Emp() {
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eid=" + eid +
                ", empName='" + empName + '\'' +
                ", empSex='" + empSex + '\'' +
                ", empAge=" + empAge +
                ", did=" + did +
                '}';
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpSex() {
        return empSex;
    }

    public void setEmpSex(String empSex) {
        this.empSex = empSex;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }
}

