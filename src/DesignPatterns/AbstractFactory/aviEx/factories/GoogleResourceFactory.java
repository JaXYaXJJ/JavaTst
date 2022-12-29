package DesignPatterns.AbstractFactory.aviEx.factories;

import DesignPatterns.AbstractFactory.aviEx.storage.GoogleCloudStorage;
import DesignPatterns.AbstractFactory.aviEx.instance.GoogleComputeEngineInstance;
import DesignPatterns.AbstractFactory.aviEx.instance.Instance;
import DesignPatterns.AbstractFactory.aviEx.storage.Storage;

public class GoogleResourceFactory implements ResourceFactory{

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capacityInMb) {
        return new GoogleCloudStorage(capacityInMb);
    }
}
