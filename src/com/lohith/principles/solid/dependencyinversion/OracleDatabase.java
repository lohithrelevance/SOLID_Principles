package com.lohith.principles.solid.dependencyinversion;

public class OracleDatabase implements Database {
    @Override
    public void connect() {
        System.out.println(" Connecting Oracle database");
    }

    @Override
    public void disconnect() {
        System.out.println(" Disconnecting Oracle Database");
    }
}
