package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float dollar = Converter.rubleToDollar(2100);
        float euro = Converter.rubleToEuro(4760);
        System.out.println("2100 rubles are " + dollar + " dollar.");
        System.out.println("4760 rubles are " + euro + " euro.");

        float in = 420;

        float expectedEuro = 6;
        float outEuro = Converter.rubleToEuro(in);
        boolean passedEuro = expectedEuro == outEuro;

        float expectedDollar = 7;
        float outDollar = Converter.rubleToDollar(in);
        boolean passedDollar = expectedDollar == outDollar;

        System.out.println("420 rubles are 6 Euro. Test result : " + passedEuro);
        System.out.println("420 rubles are 7 Dollar. Test result : " + passedDollar);

    }
}
