package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchWeekTest {

    @Test
    public void whenThursday() {
        int day = 4;
        String expected = "Четверг";
        String name = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, name);
    }

    @Test
    public void whenMistake() {
        int day = 8;
        String expected = "Ошибка";
        String name = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, name);
    }
}