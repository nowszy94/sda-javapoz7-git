package sda;

import sda.calculator.Calculator;
import sda.calculator.RandomGenerator;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        RandomGenerator generator = new RandomGenerator();
        System.out.println(calculator.sum(generator.getSmallNumber(), generator.getBigNumber()));
        System.out.println(calculator.subtract(generator.getSmallNumber(), generator.getBigNumber()));
        System.out.println(calculator.multiply(generator.getSmallNumber(), generator.getBigNumber()));
        System.out.println(calculator.divide(generator.getSmallNumber(), generator.getBigNumber()));
        System.out.println(calculator.divide(generator.getSmallNumber(), 0));
    }
}
