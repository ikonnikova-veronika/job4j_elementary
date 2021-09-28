package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int row = 0; row < array.length; row++) {
            for (int length = 0; length < array[row].length; length++) {
                rsl += array[row][length];
            }
        }
        return rsl;
    }
}
