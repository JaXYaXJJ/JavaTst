package DesignPatterns.AbstractFactory.aviEx.factories;

import DesignPatterns.AbstractFactory.aviEx.instance.AzureInstance;
import DesignPatterns.AbstractFactory.aviEx.storage.AzureStorage;
import DesignPatterns.AbstractFactory.aviEx.instance.Instance;
import DesignPatterns.AbstractFactory.aviEx.storage.Storage;

public class AzureResourceFactory implements ResourceFactory{

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new AzureInstance(capacity);
    }

    @Override
    public Storage createStorage(int capacityInMb) {
        return new AzureStorage(capacityInMb);
    }
}
