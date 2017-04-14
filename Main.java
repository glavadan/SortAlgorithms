package com.pluralsight;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);





        System.out.println("Array size:");
        int size = s.nextInt();
        int[] items = new int[size];

        System.out.println("Array values");
        for (int i= 0; i < size; i++){
            items[i]=s.nextInt();
        }


        System.out.println("1 - BubbleSort, 2 - InsertionSort, 3 - MergeSort");

        switch (s.nextInt()) {
            case 1 :
                SortService bu = new BubbleSortService();
                bu.sort(items);

                System.out.println("Bubble");
                System.out.println(bu.getTimeForSort());
                for( int i=0; i<items.length; i++){
                    System.out.print(items[i]+" ");
                }
                break;
            case 2 : SortService in = new InsertionSortService();
                in.sort(items);
                System.out.println("Insertion");
                System.out.println(in.getTimeForSort());
                for ( int i=0; i<items.length; i++){
                    System.out.print(items[i]+" ");
                }
                break;
            case 3 : SortService me = new MergeSortService();
                me.sort(items);
                System.out.println("Merge");
                System.out.println(me.getTimeForSort());
                for (int i=0; i<items.length; i++){
                    System.out.print(items[i]+" ");
                }
            default: break;
        }


    }
}
