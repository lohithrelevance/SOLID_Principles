package com.lohith.principles.solid.singlerResponsibility;

public class BookPersistance {

    public void save(Book book){
        System.out.println("Saving the book " + book);
    }
}
