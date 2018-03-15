package sda;

import sda.calculator.Calculator;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(5, 10));
        System.out.println(calculator.subtract(5, 10));
        System.out.println(calculator.multiply(5, 10));
        System.out.println(calculator.divide(5, 10));
        System.out.println(calculator.divide(5, 0));
    }
}
