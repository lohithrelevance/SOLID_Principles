package com.lohith.principles.solid.singlerResponsibility;

public class App {
    public static void main(String[] args) {

        Book book1 = new Book("Albert Camus" , 120);
        book1.save();
    }
}
