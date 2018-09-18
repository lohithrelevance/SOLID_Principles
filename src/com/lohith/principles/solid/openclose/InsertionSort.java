package com.lohith.principles.solid.openclose;

// public class InsertionSort extends Sorter {
public class InsertionSort implements Sorter {

    /*public InsertionSort() {
        super.type = SortType.INSERTIONSORT;
    }*/

    @Override
    public void sort() {
        System.out.println("Sorting with Insertion sort");
    }
}
