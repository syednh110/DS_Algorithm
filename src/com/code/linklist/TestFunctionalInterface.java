package com.code.linklist;

import java.util.*;

@FunctionalInterface
public interface TestFunctionalInterface {
    void run();

}

class testFunctional{
    public static void main(String[] args) {
        TestFunctionalInterface testFunctionalInterface = () -> {
            System.out.println("Hello WOrld");
        };
        testFunctionalInterface.run();

        Employee e1= new Employee(1,"Sachin");
        Employee e2= new Employee(1,"Sachin");
        Employee e3= new Employee(1,"Sachin");
        Set<Employee> set = new HashSet<>();
        set.add(e1);
        set.add(e2);
        set.add(e3);

        System.out.println(set.size());

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        method(list);

        System.out.println(list.size());
    }

    public static void method(List li){
        li.add(3);
        li.add(4);
        li.add(5);
    }
}
class Employee{
    Integer id;
    String name;
    Employee(Integer id,String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
