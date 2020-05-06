package com.genricjunit;

public class FindMaximum {
    public Integer findMaxInteger(Integer firstposition, Integer secondposition, Integer thirdposition) {
        Integer max = firstposition;
        if (secondposition.compareTo(max) > 0) {
            max = secondposition;
        }
        if (thirdposition.compareTo(max) > 0) {
            max= thirdposition;
        }
        return max;
    }

    public Float findMaxFloat(Float firstposition, Float secondposition, Float thirdposition) {
        Float max = firstposition;
        if (secondposition.compareTo(max) > 0) {
            max = secondposition;
        }
        if (thirdposition.compareTo(max) > 0) {
            max= thirdposition;
        }
        return max;
    }
}