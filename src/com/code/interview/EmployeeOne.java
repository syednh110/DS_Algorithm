package com.code.interview;

import java.io.Serializable;

public final class EmployeeOne implements Serializable {
    static private EmployeeOne employeeOne = null;
    private int id;
    private String name;
    private long salary;

    private EmployeeOne(int id, String name, long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    static EmployeeOne getObject(int id,String name,long salary){
        if(employeeOne==null){
            employeeOne = new EmployeeOne(id,name,salary);
        }
        return employeeOne;
    }



}
