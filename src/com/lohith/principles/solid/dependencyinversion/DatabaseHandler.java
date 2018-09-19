package com.lohith.principles.solid.dependencyinversion;

public class DatabaseHandler {

    private Database database;

    public DatabaseHandler(Database database) {
        this.database = database;
    }


    // private MySQLDatabase mySQLDatabase;  // Here Higher module DatabaseHandler heavily
    // relies on lower module MySQLDatabase

    // this can be handled by using design patterns like factory , strategy pattern.
    // Dependency inversion not independent from Open closed principle
    // if your violating Open closed principle then your violating Dependency inversion as well and vice verse.


    // suppose we create OracleDatabase class , then we need to modify this class like

   //  private OracleDatabase oracleDatabase;

    // the above line is clearly violating Open closed principle

   /* public DatabaseHandler() {
        this.mySQLDatabase = new MySQLDatabase();
    } */

    public void connect(){
        this.database.connect();
    }

    public void disconnect(){
        this.database.disconnect();
    }
}
