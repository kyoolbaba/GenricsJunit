package com.genricjunit;

import org.junit.Assert;
import org.junit.Test;

public class FindMaxTest {

    @Test
    public void testMaximumIntegerFirstPosition() {
        FindMax findMax = new FindMax(11,5,6,9,2);
        Assert.assertEquals(11,(int) findMax.findMaxInStringIntegerFloat());
    }

    @Test
    public void testMaximumIntegerSecondPosition() {
        FindMax findMax = new FindMax(11,55,6,9,2);
        Assert.assertEquals(55,(int) findMax.findMaxInStringIntegerFloat());
    }

    @Test
    public void testMaximumIntegerThirdPosition() {
        FindMax findMax = new FindMax(11,55,69,9,2);
        Assert.assertEquals(69,(int) findMax.findMaxInStringIntegerFloat());
    }

    @Test
    public void testMaximumStringFirstPosition() {
        FindMax findMax = new FindMax("monkey","Zebra","A","Bat");
        Assert.assertEquals("monkey",(String) findMax.findMaxInStringIntegerFloat());
    }

    @Test
    public void testMaximumStringSecondPosition() {
        FindMax findMax = new FindMax("A","monkey","Bat","Zebra");
        Assert.assertEquals("monkey",(String) findMax.findMaxInStringIntegerFloat());
    }

    @Test
    public void testMaximumStringThirdPosition() {
        FindMax findMax = new FindMax("A","Bat","monkey","Zebra");
        Assert.assertEquals("monkey",(String) findMax.findMaxInStringIntegerFloat());
    }

    @Test
    public void testMaximumFloatFirstPosition() {
        FindMax findMax = new FindMax(8.1f,7.5f,5.6f);
        Assert.assertEquals(8.1f, findMax.findMaxInStringIntegerFloat());
    }

    @Test
    public void testMaximumFloatSecondPosition() {
        FindMax findMax = new FindMax(8.1f,7.5f,5.6f);
        Assert.assertEquals(8.1f, findMax.findMaxInStringIntegerFloat());
    }

    @Test
    public void testMaximumFloatThirdPosition() {
        FindMax findMax = new FindMax(8.1f,7.5f,5.6f);
        Assert.assertEquals(8.1f, findMax.findMaxInStringIntegerFloat());;
    }
}
