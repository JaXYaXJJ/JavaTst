package DesignPatterns.AbstractFactory.aviEx.instance;

import DesignPatterns.AbstractFactory.aviEx.storage.Storage;

public class AzureInstance implements Instance{

    public AzureInstance(Capacity capacity) {

        System.out.println("Created AzureInstance....");
    }

    @Override
    public void start() {
        System.out.println("AzureInstance started.....");
    }

    @Override
    public void attachStorage(Storage storage) {

        System.out.println("Attached " + storage + " to AzureInstance....");
    }

    @Override
    public void stop() {
        System.out.println("AzureInstance stopped.....");
    }

    @Override
    public String toString() {
        return "AzureInstance";
    }
}
