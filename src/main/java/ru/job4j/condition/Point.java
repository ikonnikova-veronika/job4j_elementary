package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result1 = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(1, 0, 7, 0);
        double result3 = Point.distance(3, 3, 3, 8);
        System.out.println("result (0, 0) to (2, 0) is " + result1);
        System.out.println("result (1, 0) to (7, 0) is " + result2);
        System.out.println("result (3, 3) to (3, 8) is " + result3);
    }
}
