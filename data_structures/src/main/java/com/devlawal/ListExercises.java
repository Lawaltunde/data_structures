package com.devlawal;

import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    // add elements to an arraylist
    public List<Integer> addElementToList(List<Integer> val, ArrayList<Integer> output) {
        for (Integer e : val) {
            output.add(e);
        }
        return output;
    }

    // remove element from an arraylist
    public List<Integer> removeElementFromList(Integer element, ArrayList<Integer> theList) {
        boolean isRemoved = theList.remove(element);
        if (isRemoved) {
            System.out.println(element + " was removed!");
        }
        else {
            System.out.println(element + " wasn't found in the list!");
        }
        return theList;
    }

    // find largest element in the list
    public int findLargestElement(List<Integer> val) {
        int max = val.get(0);
        for (Integer element : val) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    // check if element exist
    public boolean checkifElementExist(int element, ArrayList<Integer> theList) {
        return theList.contains(element);
    }
    // merge two Arraylists
    public List<Integer> mergeTwoArrayLists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        list1.addAll(list2);
        return list1;
    }
}
