package com.code.lambdasstreams;

import java.util.*;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> lists = new ArrayList<>();
        Employee e1 = new Employee(1,500,"ALi");
        Employee e2 = new Employee(2,500,"Namdar");
        Employee e3 = new Employee(3,200,"ALi");
        Employee e4 = new Employee(4,100,"ALi");
        Employee e5 = new Employee(5,800,"ALi");

        lists.add(e1);
        lists.add(e2);
        lists.add(e3);
        lists.add(e4);
        lists.add(e5);


//        lists.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getId).reversed()).
//                forEach(System.out::println);

        System.out.println("--------------");

//        lists.stream().sorted((s1,s2)-> s1.getSalary()-s2.getSalary()).forEach(System.out::println);

    }
}
