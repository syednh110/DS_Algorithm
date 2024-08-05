package com.code.interview;

import java.util.HashMap;
import java.util.Map;

public class TestHashAndEqual {
    public static void main(String
                                    [] args) {
        Employee empl1 = new Employee(1, "Ali");
        Employee empl2 = new Employee(1, "Ali");

        Map<Employee, String> map = new HashMap<>();
        map.put(empl1, "Ali");
        System.out.println(map.get(empl2));
        System.out.println(empl1==empl2);
        System.out.println(empl1.equals(empl2));
    }
}
