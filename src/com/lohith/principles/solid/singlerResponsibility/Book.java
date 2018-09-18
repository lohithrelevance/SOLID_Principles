package com.lohith.principles.solid.singlerResponsibility;

public class Book implements BookHandler{


    private BookPersistance bookPersistance;

    // features , tightly coupled to Book class
    private int numOfPages;
    private String authorName;

    public Book(String authorName ,int numOfPages) {
        this.numOfPages = numOfPages;
        this.authorName = authorName;
        this.bookPersistance = new BookPersistance();
    }

    @Override
    public String toString() {
        return "Book{" +
                "numOfPages=" + numOfPages +
                ", authorName='" + authorName + '\'' +
                '}';
    }

    // behaviours
    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public void save() {
        this.bookPersistance.save(this);
    }

    @Override
    public void print() {

    }

   /* public void printAndSave(){
        System.out.println("Print and save");  //Violates Single Responsibility Principle , 2 responsibilities to change
        // print and save by single method
        // Needs to be separated like print() & save()
    }*/


   // not essential to Book , if book  cannot be printed , it will remain as book having number of pages
    // and author name, no matter we are printing or not .
  /* @Override
   public void print(){
       System.out.println("Printing the book");
   }*/



   // same as above , not related to as features of the book , that's what interface has been created to implement those
    // behaviours

/*
   @Override
   public void save(){
       System.out.println("Saving the book");  // this book is tightly coupled to Book class hence it will be moved
       // to another class BookPersistance
       // since Book can be save either in PDF , Doc or any other format
       // hence we can knock off this method (by commenting)
   }
*/





}
