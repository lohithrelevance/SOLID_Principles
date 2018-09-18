package com.lohith.principles.solid.openclose;

// public class MergeSort extends Sorter{
public class MergeSort implements Sorter{

   /* public MergeSort() {
        super.type = SortType.MERGESORT;
    }*/

    @Override
    public void sort() {
        System.out.println("Sorting with Merge sort");
    }
}
