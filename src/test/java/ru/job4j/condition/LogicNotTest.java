package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LogicNotTest {

    @Test
    public void isEvenTrue() {
        int num = 4;
        boolean rsl = LogicNot.isEven(num);
        Assert.assertTrue(rsl);
    }

    @Test
    public void isEvenFalse() {
        int num = 5;
        boolean rsl = LogicNot.isEven(num);
        Assert.assertFalse(rsl);
    }

    @Test
    public void isPositiveTrue() {
        int num = 4;
        boolean rsl = LogicNot.isPositive(num);
        Assert.assertTrue(rsl);
    }

    @Test
    public void isPositiveFalse() {
        int num = -4;
        boolean rsl = LogicNot.isPositive(num);
        Assert.assertFalse(rsl);
    }

    @Test
    public void notEvenTrue() {
        int num = 5;
        boolean rsl = LogicNot.notEven(num);
        Assert.assertTrue(rsl);
    }

    @Test
    public void notEvenFalse() {
        int num = 4;
        boolean rsl = LogicNot.notEven(num);
        Assert.assertFalse(rsl);
    }

    @Test
    public void notPositiveTrue() {
        int num = -4;
        boolean rsl = LogicNot.notPositive(num);
        Assert.assertTrue(rsl);
    }

    @Test
    public void notPositiveFalse() {
        int num = 4;
        boolean rsl = LogicNot.notPositive(num);
        Assert.assertFalse(rsl);
    }

    @Test
    public void notEvenAndPositiveTrue() {
        int num = 5;
        boolean rsl = LogicNot.notEvenAndPositive(num);
        Assert.assertTrue(rsl);
    }

    @Test
    public void notEvenAndPositiveFalse() {
        int num = -5;
        boolean rsl = LogicNot.notEvenAndPositive(num);
        Assert.assertFalse(rsl);
    }

    @Test
    public void evenOrNotPositiveTrue() {
        int num = -5;
        boolean rsl = LogicNot.evenOrNotPositive(num);
        Assert.assertTrue(rsl);
    }

    @Test
    public void evenOrNotPositiveFalse() {
        int num = 5;
        boolean rsl = LogicNot.evenOrNotPositive(num);
        Assert.assertFalse(rsl);
    }
}