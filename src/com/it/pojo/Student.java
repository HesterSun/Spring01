package com.it.pojo;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student{
    private Course[] courses;
    private List<Course> list;
    private Map<String,Course> map;
    private Set<Course> set;

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public List<Course> getList() {
        return list;
    }

    public void setList(List<Course> list) {
        this.list = list;
    }

    public Map<String, Course> getMap() {
        return map;
    }

    public void setMap(Map<String, Course> map) {
        this.map = map;
    }

    public Set<Course> getSet() {
        return set;
    }

    public void setSet(Set<Course> set) {
        this.set = set;
    }
}
