package DesignPatterns.AbstractFactory.aviEx.instance;

import DesignPatterns.AbstractFactory.aviEx.storage.Storage;

//Concrete product - Google Family
public class GoogleComputeEngineInstance implements Instance{

    public GoogleComputeEngineInstance(Capacity capacity) {

        System.out.println("Created Google Compute Engine Instance...");
    }

    @Override
    public void start() {
        System.out.println("Google Compute Engine started.....");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached " + storage + " to Google Compute Engine....");
    }

    @Override
    public void stop() {
        System.out.println("Google Compute Engine stopped.....");
    }

    @Override
    public String toString() {
        return "Google Compute Engine";
    }
}
