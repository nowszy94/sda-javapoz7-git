package sda;

import sda.calculator.Calculator;
import sda.calculator.RandomGenerator;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        RandomGenerator randomGenerator = new RandomGenerator();
        System.out.println(calculator.sum(randomGenerator.getSmallNumber(), randomGenerator.getBigNumber()));
        System.out.println(calculator.subtract(randomGenerator.getSmallNumber(), randomGenerator.getBigNumber()));
        System.out.println(calculator.multiply(randomGenerator.getSmallNumber(), randomGenerator.getBigNumber()));
        System.out.println(calculator.divide(randomGenerator.getSmallNumber(), randomGenerator.getBigNumber()));
        System.out.println(calculator.divide(randomGenerator.getSmallNumber(), 0));
    }
}
