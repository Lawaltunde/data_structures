package com.devlawal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main( String[] args )
    {
        int[] num = {1,2,3,4,30};
        int[] num2 = {1,2,3,3,2,4};
        int[][] num3 = {num, num2};
        TheArrayExercise theArrayExercise = new TheArrayExercise();
        System.out.println("Max value is : " +theArrayExercise.findMax(num));
        System.out.println(Arrays.toString(theArrayExercise.reverseArray(num)));
        System.out.println("The Sum of the Array is : " + theArrayExercise.sumOfArray(num));
        System.out.println(theArrayExercise.checkForDuplicate(num2));
        System.out.println("Second Largest numver is : "+ theArrayExercise.findSecondLargestNumber(num));
        System.out.println("Second Largest numver is : "+ theArrayExercise.findSecondLargestNumber(new int[]{7,8}));
        System.out.println(theArrayExercise.sumOfElementIn2DArray(num3));
        System.out.println(theArrayExercise.maxElementIn2DArray(num3));

        System.out.println("++++++++++++++++++");


        // List
        List<Integer> val = Arrays.asList(1,2,3,4,30);
        ArrayList<Integer> output = new ArrayList<>();
        output.add(78);
        ListExercises listExercises = new ListExercises();
        listExercises.addElementToList(val, output);
        System.out.println(output);
        System.out.println(listExercises.removeElementFromList(2, output));
        System.out.println("The largest number is: "+ listExercises.findLargestElement(val));
        System.out.println(listExercises.checkifElementExist(78, output));
        System.out.println(listExercises.checkifElementExist(100, output));
        ArrayList<Integer> output2 = new ArrayList<>(output);
        System.out.println(listExercises.mergeTwoArrayLists(output, output2));

        System.out.println("++++++++++++++++++");

    }


}
