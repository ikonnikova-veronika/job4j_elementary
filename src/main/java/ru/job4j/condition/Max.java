package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        boolean result = first > second;
        return result ? first : second;
    }

    public static int max(int first, int second, int third) {
        return max(
                max(first, second),
                third
        );
    }
}
