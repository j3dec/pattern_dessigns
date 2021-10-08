package fr.diginamic.strategy;

import java.util.Arrays;
import java.util.List;

public class InsertionSort implements StrategyTri{
    public static void trier(Integer[] arr) {
        for(int k=1; k<arr.length-1; k++)   {
            int temp = arr[k];
            int j= k-1;
            while(j>=0 && temp <= arr[j])   {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = temp;
        }
        List<Integer> listOfArr = Arrays.asList(arr);
        System.out.println(listOfArr);
    }
}
