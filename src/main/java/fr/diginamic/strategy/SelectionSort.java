package fr.diginamic.strategy;

import java.util.Arrays;
import java.util.List;

public class SelectionSort implements StrategyTri{
    public static void trier(Integer[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        List<Integer> listOfArr = Arrays.asList(arr);
        System.out.println(listOfArr);
    }
}
