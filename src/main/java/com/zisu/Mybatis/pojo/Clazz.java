package com.zisu.Mybatis.pojo;

import java.util.List;

public class Clazz {
    private String clazzId;
    private String clazzName;
    private String clazzCremarks;
    private List<Course> courses;

    public Clazz() {
    }

    public String getClazzId() {
        return clazzId;
    }

    public void setClazzId(String clazzId) {
        this.clazzId = clazzId;
    }

    public String getClazzName() {
        return clazzName;
    }

    public void setClazzName(String clazzName) {
        this.clazzName = clazzName;
    }

    public String getClazzCremarks() {
        return clazzCremarks;
    }

    public void setClazzCremarks(String clazzCremarks) {
        this.clazzCremarks = clazzCremarks;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "clazzId='" + clazzId + '\'' +
                ", clazzName='" + clazzName + '\'' +
                ", clazzCremarks='" + clazzCremarks + '\'' +
                ", courses=" + courses +
                '}';
    }
}