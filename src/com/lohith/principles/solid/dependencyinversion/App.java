package com.lohith.principles.solid.dependencyinversion;

public class App {

    public static void main(String[] args) {
       // DatabaseHandler databaseHandler = new DatabaseHandler();

        DatabaseHandler databaseHandler = new DatabaseHandler(new MySQLDatabase());
        // we are injecting MySQLDatabase()

        // As we can DatabaseHandler does not instantiate any class with help of "new" , and it doesn't know about
        // concrete implementation of Mysql and Oracle database

        // Mysql and Oracle database doesn't know about Database handler
        databaseHandler.connect();

        databaseHandler.disconnect();
    }
}
