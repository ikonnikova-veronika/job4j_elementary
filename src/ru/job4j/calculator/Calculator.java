package ru.job4j.calculator;

public class Calculator {
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int six = 6;
        int four = 4;
        int five = 5;

        int onePlusTwo = one + two;
        System.out.println(one + "+" + two + "=" + onePlusTwo);

        int sixDivTwo = six / two;
        System.out.println(six + "/" + two + "=" + sixDivTwo);

        int fiveMinusTwo = five - two;
        System.out.println(five + "-" + two + "=" + fiveMinusTwo);

        int fourTimeTwo = four * two;
        System.out.println(four + "*" + two + "=" + fourTimeTwo);

    }
}
