package fr.diginamic.strategy;

public class StrategyFactorySort {

    enum Sort {
        BUBBLE, INSERTION, SELECTION
    }

    Sort s;

    public void exec(Integer[] arr, Sort s) {

        switch (s) {
            case BUBBLE:
                System.out.println("Avec le Bubble Sort:");
                BubbleSort.trier(arr);
                break;
            case INSERTION:
                System.out.println("\nAvec l'insertion Sort:");
                InsertionSort.trier(arr);
                break;
            case SELECTION:
                System.out.println("\nAvec le selection Sort:");
                SelectionSort.trier(arr);
                break;
        }
    }
}
