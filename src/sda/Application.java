package sda;

import sda.calculator.Calculator;
import sda.calculator.RandomGenerator;

public class Application {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        RandomGenerator generator = new RandomGenerator();
        System.out.println(myCalculator.sum(generator.getSmallNumber(), generator.getBigNumber()));
        System.out.println(myCalculator.subtract(generator.getSmallNumber(), generator.getBigNumber()));
        System.out.println(myCalculator.multiply(generator.getSmallNumber(), generator.getBigNumber()));
        System.out.println(myCalculator.divide(generator.getSmallNumber(), generator.getBigNumber()));
        System.out.println(myCalculator.divide(generator.getSmallNumber(), 0));
        System.out.println("Hello world");
        System.out.println(myCalculator.factorial(5));
        System.out.println(myCalculator.factorial(10));
    }
}
