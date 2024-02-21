package com.code.lambdasstreams.interfaceExample;

public class Interface1 {

    interface Formula {
        double calculate(int a);

        default double sqrt(int a) {
            return Math.sqrt(positive(a));
        }

        static int positive(int a) {
            return a > 0 ? a : 0;
        }
    }

    public static void main(String[] args) {
        Formula formula1 = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }

            @Override
            public double sqrt(int a) {
                return a*a;
            }


        };

        System.out.println(formula1.calculate(100));    // 100.0
        System.out.println(formula1.sqrt(-23));        // 0.0
        System.out.println(Formula.positive(4));        // 0.0
        System.out.println(Formula.positive(5));

//        Formula formula2 = (a) -> sqrt( a * 100);
    }

}