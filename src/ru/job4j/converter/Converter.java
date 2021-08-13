package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float dollar = Converter.rubleToDollar(2100);
        float euro = Converter.rubleToEuro(4760);
        System.out.println("2100 rubles are " + dollar + " dollar.");
        System.out.println("4760 rubles are " + euro + " euro.");

    }
}
