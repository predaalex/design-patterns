package com.example.designPatterns.creational.Prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * 	Creates new objects by copying an existing object (the prototype) instead of creating new instances from scratch.
 * 	This is often more efficient for complex object creation.
 */
public class Employees implements Cloneable {

    private final List<String> empList;

    public Employees() {
        empList = new ArrayList<>();
    }

    public Employees(List<String> list) {
        this.empList = list;
    }

    public void loadData() {
        empList.add("Pankaj");
        empList.add("Raj");
        empList.add("David");
        empList.add("Lisa");
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}