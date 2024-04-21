package org.example.annonymous;

import java.util.ArrayList;
import java.util.List;

public class FilterableImpl {
    public List<Integer> loadInteger() {
        return filter(List.of(1, 2, 3, 4, 5), (Integer a) -> {return a >= 3;});
    }

    private List<Integer> filter(List<Integer> integerList, Filterable filterable){
        List<Integer> filterIntegerList = new ArrayList<>();

        for (Integer integer : integerList){
            if(filterable.apply(integer)){
                filterIntegerList.add(integer);
            }
        }
        return filterIntegerList;
    }
}
