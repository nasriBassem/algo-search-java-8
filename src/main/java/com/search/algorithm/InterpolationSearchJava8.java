package com.search.algorithm;

import java.util.List;

public class InterpolationSearchJava8 {

    public static int interpolationSearch(final List<Integer> elements, final int x){
        int lowEnd = 0;
        int highEnd = elements.size()-1;
        int probe= lowEnd + (((highEnd-lowEnd)*(x-elements.get(lowEnd))/(elements.get(highEnd)-elements.get(lowEnd))));
        while(probe<elements.size() &&  elements.get(probe)!=x){
            highEnd = x < elements.get(probe) ? highEnd - 1 : highEnd + 1;
            probe= lowEnd + (((highEnd-lowEnd)*(x-elements.get(lowEnd))/(elements.get(highEnd)-elements.get(lowEnd))));
        }
        return (probe < elements.size()) ? ((elements.get(probe) != x) ? -1 : probe) : -1;
    }
}
