package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To2Then1() {
        int left = 3;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To2ThenAny() {
        int left = 3;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To2To3Then3() {
        int first = 3;
        int second = 3;
        int third = 4;
        int result = Max.max(first, second, third);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To2To3Then1() {
        int first = 6;
        int second = 2;
        int third = 4;
        int result = Max.max(first, second, third);
        int expected = 6;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To2To3ThenAny() {
        int first = 6;
        int second = 6;
        int third = 6;
        int result = Max.max(first, second, third);
        int expected = 6;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To2To3To4Then1() {
        int first = 8;
        int second = 6;
        int third = 6;
        int fourth = 7;
        int result = Max.max(first, second, third, fourth);
        int expected = 8;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To2To3To4ThenAny() {
        int first = 6;
        int second = 6;
        int third = 6;
        int fourth = 6;
        int result = Max.max(first, second, third, fourth);
        int expected = 6;
        Assert.assertEquals(result, expected);
    }
}