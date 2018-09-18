package com.lohith.principles.solid.openclose;

class SorterManager {
    public void sort(Sorter sorter){

       /* if (sorter.type == SortType.INSERTIONSORT){
            doInsertionSort(sorter);

        }else if (sorter.type == SortType.MERGESORT){
            doMergeSort(sorter);
        } // for QUICK SORT , new condition needs to be added for QUICK SORT , this violates Open closed principle*/

       sorter.sort();
    }

    /*

    for Strategy pattern , we can knock off these methods.

    private void doInsertionSort(Sorter sorter) {
        sorter.sort();
    }

    private void doMergeSort(Sorter sorter) {
        sorter.sort();
    }*/

    // for QUICK SORT , this class needs to be modified
}
