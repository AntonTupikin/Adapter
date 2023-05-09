package org.example;

public class Main {
    public static void main(String[] args) {

        Ints calc = new IntsCalculator();
        System.out.println(calc.sum(5,2));
        System.out.println(calc.sub(5,2));
        System.out.println(calc.mult(5,2));
        System.out.println(calc.div(5,2));
        System.out.println(calc.pow(5,2));
    }
}