package DesignPatterns.AbstractFactory.aviEx.factories;

import DesignPatterns.AbstractFactory.aviEx.instance.Ec2Instance;
import DesignPatterns.AbstractFactory.aviEx.instance.Instance;
import DesignPatterns.AbstractFactory.aviEx.storage.S3Storage;
import DesignPatterns.AbstractFactory.aviEx.storage.Storage;

public class AwsResourceFactory implements ResourceFactory{

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capacityInMb) {
        return new S3Storage(capacityInMb);
    }
}
