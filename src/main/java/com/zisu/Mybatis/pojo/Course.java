package com.zisu.Mybatis.pojo;

public class Course {
    private String cId;
    private String cName;
    private Integer cRedit;
    private Integer cHours;

    public Course() {
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Integer getcRedit() {
        return cRedit;
    }

    public void setcRedit(Integer cRedit) {
        this.cRedit = cRedit;
    }

    public Integer getcHours() {
        return cHours;
    }

    public void setcHours(Integer cHours) {
        this.cHours = cHours;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cId='" + cId + '\'' +
                ", cName='" + cName + '\'' +
                ", cRedit=" + cRedit +
                ", cHours=" + cHours +
                '}';
    }
}