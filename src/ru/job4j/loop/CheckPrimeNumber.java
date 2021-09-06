package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        for (int i = 2; i < number; i++) {
            prime = number % i != 0;
            if (number % i == 0) {
                break;
            }
        }
        return prime;
    }
}
