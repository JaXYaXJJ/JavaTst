package DesignPatterns.AbstractFactory.aviEx.storage;

public class AzureStorage implements Storage{

    public AzureStorage(int capacityInMb) {

        System.out.println("Allocated " + capacityInMb + " on AzureStorage");
    }

    @Override
    public String getId() {
        return "Azure30";
    }

    @Override
    public String toString() {
        return "AzureStorage Storage";
    }
}
