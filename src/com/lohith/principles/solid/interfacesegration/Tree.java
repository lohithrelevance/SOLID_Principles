package com.lohith.principles.solid.interfacesegration;

public interface Tree {

    int findMax();
    int findMin();
    void traverse();

    //specific to BalancedTree

    // moved to IBalancedTree interface
    /*void rightRotation();
    void leftRotation();*/

}
