package DesignPatterns.AbstractFactory.aviEx.factories;

import DesignPatterns.AbstractFactory.aviEx.instance.Instance;
import DesignPatterns.AbstractFactory.aviEx.storage.Storage;

public class Client {

    private ResourceFactory factory;

    public Client(ResourceFactory factory) {
        this.factory = factory;
    }

    public Instance createServer(Instance.Capacity cap, int storageMb) {

        Instance instance = factory.createInstance(cap);
        Storage storage = factory.createStorage(storageMb);

        instance.attachStorage(storage);

        return instance;
    }
}
