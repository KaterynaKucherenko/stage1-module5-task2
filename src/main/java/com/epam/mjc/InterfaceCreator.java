package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
       return x ->{
           List<Integer> result = new ArrayList<>();
           for (Integer tmp : x){
               int num = tmp/divider;
               result.add(num);
           }
return result;
       };
    }
}
