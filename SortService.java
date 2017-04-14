package com.pluralsight;

/**
 * Created by dan on 13.04.2017.
 */
public abstract class SortService {

    long before;
    long after;
    private long timeResult;



    public void sort(int[] items){}
    public long getTimeForSort(){
        return timeResult = after - before;
    }
    public void getLastArraySize(){}
}
