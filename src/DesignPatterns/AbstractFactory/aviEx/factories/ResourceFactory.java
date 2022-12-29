package DesignPatterns.AbstractFactory.aviEx.factories;

import DesignPatterns.AbstractFactory.aviEx.instance.Instance;
import DesignPatterns.AbstractFactory.aviEx.storage.Storage;

public interface ResourceFactory {

    Instance createInstance(Instance.Capacity capacity);
    Storage createStorage(int capacityInMb);
}