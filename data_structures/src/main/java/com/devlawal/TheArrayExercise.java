package com.devlawal;

import java.awt.font.OpenType;
import java.util.Arrays;

public class TheArrayExercise {

    // find maximum numver
    public int findMax(int[] val) {
        int holder = 0;

        if (val.length == 0) {
            return 0;
        }
        holder = val[0];
        for (int i = 1; i < val.length; i++) {
           if (holder < val[i]) {
               holder = val[i];
           }
        }
        return holder;
    }

    // reverse array
    // I will further improve this to perform reverse on array of all types
    public int[] reverseArray(int[] val) {
        if (val.length == 0) {
            return null;
        }
        int left = 0;
        int right = val.length - 1;
        int temp = 0;

        while (left <= right) {
            temp = val[left];
            val[left] = val[right];
            val[right] = temp;
            left++;
            right--;
        }
       return val;
    }

    // sum of array element
    public int sumOfArray(int[] val) {
        int sum = 0;
        if (val.length == 0) {
            return 0;
        }
        for (int i : val) {
            sum += i;
        }
        return sum;
    }

    // check for duplicate
    public boolean checkForDuplicate(int[] val) {
        if (val.length == 0) {
            return false;
        }
        for (int i = 0; i < val.length; i++) {
            for (int j = 0; j < val.length; j++) {
                if (j == i) {
                    continue;
                }
                if (val[i] == val[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // find Second largest number
    public int findSecondLargestNumber(int[] val) {
        if (val.length == 0 || val.length == 1) {
            return 0;
        }
        int secondLargest = val[0];
        int firstLargest = val[1];
        int temp = 0;
        if (secondLargest > firstLargest)
        {
            temp = secondLargest;
            secondLargest = firstLargest;
            firstLargest = temp;
        }
        for (int i = 2; i < val.length; i++) {
            if (firstLargest < val[i]) {
                secondLargest = firstLargest;
                firstLargest = val[i];
            }
        }
        return secondLargest;
    }
}
