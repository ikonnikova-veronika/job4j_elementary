package ru.job4j.calculator;
import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double differenceAndDiv(double first, double second) {
        return difference(first, second)
                + div(first, second);
    }

    public static double allFunctionSum(double first, double second) {
        return difference(first, second)
                + div(first, second)
                + sum(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Сумма сложения и произведения: " + sumAndMultiply(10, 20));
        System.out.println("Сумма разности и частного: " + differenceAndDiv(10, 20));
        System.out.println("Общая сумма: " + allFunctionSum(10, 20));
    }
}
