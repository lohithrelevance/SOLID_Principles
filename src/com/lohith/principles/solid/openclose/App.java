package com.lohith.principles.solid.openclose;

public class App {

    public static void main(String[] args) {
        SorterManager sorterManager = new SorterManager();
        //sorterManager.sort(new InsertionSort());

        /*sorterManager.sort(new MergeSort());*/
        // suppose if we try to add Quick Sort, Bubble sort , etc ..
        // we need to modify SortType for additional sort type (Quick sort) , and SorterManager another "else"
        // condition and its respective convenient method
        // and if we keep on adding different sort combinations , SorterManager (assumed to unit tested) needs to be
        // modified indefinitely.
        // this breaks Open closed principle

        // the better approach to support Open closed Principle , we will use Strategy pattern
        // we will knock off SortType class (now redundant, kept only for sake of problem definition.
        // and we will modify SorterManager


        // After making changes according to Strategy pattern
        // if we add Quicksort , we are adding new QuickSort Class (open for extension) only and rest of the things works fine as it is.
        // this implies , minimal changes in existing code (closed for modification)

        sorterManager.sort(new QuickSort());


    }
}
