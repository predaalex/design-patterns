package com.example.designPatterns.creational.Prototype;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
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

    @Override
    public Object clone() {
        List<String> temp = new ArrayList<>(this.getEmpList());
        return new Employees(temp);
    }

}