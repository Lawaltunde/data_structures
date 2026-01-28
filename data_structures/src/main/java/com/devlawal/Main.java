package com.devlawal;

import java.util.Arrays;

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

    }


}
