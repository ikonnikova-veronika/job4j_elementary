package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

    @Test
    public void whenMondayEng() {
        String name = "Monday";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenTuesdayRus() {
        String name = "Вторник";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMistake() {
        String name = "Апрель";
        int result = MultipleSwitchWeek.numberOfDay(name);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}