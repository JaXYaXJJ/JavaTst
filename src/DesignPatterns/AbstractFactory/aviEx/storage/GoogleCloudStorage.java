package DesignPatterns.AbstractFactory.aviEx.storage;

public class GoogleCloudStorage implements Storage{

    public GoogleCloudStorage(int capacityInMb) {

        System.out.println("Allocated " + capacityInMb + " on Google Cloud Storage");
    }

    @Override
    public String getId() {
        return "GoogleStorage1";
    }

    @Override
    public String toString() {
        return "Google Cloud Storage";
    }
}
