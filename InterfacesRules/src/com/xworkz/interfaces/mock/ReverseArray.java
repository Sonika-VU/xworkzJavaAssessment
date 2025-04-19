package com.xworkz.interfaces.mock;

public class ReverseArray {

    public void arrayReverse(int[] arr){
        int[] reverseArr = new int[arr.length];
        int j=reverseArr.length-1;
        for(int i=0; i< arr.length; i++){
            reverseArr[j] = arr[i];
            j--;
        }

        for(int num : reverseArr){
            System.out.print(num + "  ");
        }
    }
}
