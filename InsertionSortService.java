package com.pluralsight;

/**
 * Created by dan on 13.04.2017.
 */
public class InsertionSortService extends SortService {
    @Override
    public void sort(int[]  items) {
        before = System.nanoTime();
        for(int i=1; i < items.length; i++){
            for (int j=i; j>0&&items[j]<items[j-1];j--){
                int k = items[j];
                items[j]=items[j-1];
                items[j-1] = k;
            }
        }
        after = System.nanoTime();
    }
    public long getBefore( ){
        return this.before;
    }
    public long getAfter() {
        return this.after;
    }


}
