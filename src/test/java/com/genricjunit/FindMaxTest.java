package com.genricjunit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindMaxTest {
    FindMaximum findMaximum;
    @Before
    public void setUp() throws Exception {
        findMaximum = new FindMaximum();
    }

    @Test
    public void testMaximumIntegerFirstPosition() {
        int maximumNumber =findMaximum.findMaxInteger(9,2,1);
        Assert.assertEquals(9, maximumNumber);
    }

    @Test
    public void testMaximumIntegerSecondPosition() {
        int maximumNumber =findMaximum.findMaxInteger(2,9,3);
        Assert.assertEquals(9, maximumNumber);
    }

    @Test
    public void testMaximumIntegerThirdPosition() {
        int maximumNumber =findMaximum.findMaxInteger(2,5,10);
        Assert.assertEquals(10, maximumNumber);
    }

    @Test
    public void testMaximumFloatFirstPosition() {
        float maximumNumber =findMaximum.findMaxFloat(9.3f,2.8f,1.6f);
        Assert.assertEquals(9.3f, maximumNumber,0.1);
    }

    @Test
    public void testMaximumFloatSecondPosition() {
        float maximumNumber =findMaximum.findMaxFloat(2.8f,9.8f,3.6f);
        Assert.assertEquals(9.8, maximumNumber,0.1);
    }

    @Test
    public void testMaximumFloatThirdPosition() {
        float maximumNumber =findMaximum.findMaxFloat(2.8f,5.3f,10.9f);
        Assert.assertEquals(10.9, maximumNumber,.1);
    }

    @Test
    public void testMaximumStringFirstPosition() {
        String maximumString =findMaximum.findMaxString("A","B","C");
        Assert.assertEquals("C", maximumString);
    }

    @Test
    public void testMaximumStringSecondPosition() {
        String maximumString =findMaximum.findMaxString("B","C","A");
        Assert.assertEquals("C",maximumString);
    }

    @Test
    public void testMaximumStringThirdPosition() {
        String maximumString =findMaximum.findMaxString("B","C","B");
        Assert.assertEquals("C",maximumString);
    }
}
