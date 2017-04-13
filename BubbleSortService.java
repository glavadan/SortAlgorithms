package com.pluralsight;

/**
 * Created by dan on 13.04.2017.
 */
public class BubbleSortService extends SortService {


    public void sort(int items[]) {
        before = System.nanoTime();
        for (int i = 0; i < items.length; i++) {
            for (int j = items.length - 1; j > i; j--) {
                if (items[j] < items[j - 1]) {
                    int k = items[j];
                    items[j] = items[j - 1];
                    items[j - 1] = k;
                }
            }
        }
        after = System.nanoTime();
    }
}
