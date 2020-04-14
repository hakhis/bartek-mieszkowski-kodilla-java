package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        for (Integer list : numbers) {
            if (list % 2 == 0) {
                    tempList.add(list);
            }
        }
        return tempList;
    }
}
