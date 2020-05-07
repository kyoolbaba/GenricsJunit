package com.genricjunit;

public class FindMax<IntegerFloatString extends Comparable> {
     IntegerFloatString[] values;

    FindMax(IntegerFloatString ... values){
        this.values = values;
    }


    public IntegerFloatString findMaxInStringIntegerFloat(){
        return findMaxInStringIntegerFloat(this.values);
    }
    @SafeVarargs
    private static <IntegerFloatString extends Comparable> IntegerFloatString findMaxInStringIntegerFloat
            (IntegerFloatString ... values) {
        IntegerFloatString max=values[0];
        for( IntegerFloatString val:values ){
            if ( val.compareTo(max)>0)
                max=val;
            }
        return max;
    }
}