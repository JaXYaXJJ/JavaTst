package DesignPatterns.AbstractFactory.aviEx.instance;

import DesignPatterns.AbstractFactory.aviEx.storage.Storage;

//Product A family
//Compute Resource : Virtual Machine, Server ....
public interface Instance {

    enum Capacity {
        MICRO,
        SMALL,
        LARGE
    }

    void start();
    void attachStorage(Storage storage);
    void stop();
}