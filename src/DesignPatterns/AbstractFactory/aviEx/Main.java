package DesignPatterns.AbstractFactory.aviEx;

import DesignPatterns.AbstractFactory.aviEx.factories.AwsResourceFactory;
import DesignPatterns.AbstractFactory.aviEx.factories.AzureResourceFactory;
import DesignPatterns.AbstractFactory.aviEx.factories.Client;
import DesignPatterns.AbstractFactory.aviEx.factories.GoogleResourceFactory;
import DesignPatterns.AbstractFactory.aviEx.instance.Instance;

public class Main {
    public static void main(String[] args) {

        Client awsClient = new Client(new AwsResourceFactory());

        Instance instanceOne = awsClient.createServer(Instance.Capacity.MICRO, 20480);
        instanceOne.start();
        instanceOne.stop();

        System.out.println("*******************************************************");

        Client gcpClient = new Client(new GoogleResourceFactory());

        Instance instanceTwo = gcpClient.createServer(Instance.Capacity.MICRO,20480);
        instanceTwo.start();
        instanceTwo.stop();

        System.out.println("*******************************************************");

        Client azureClient = new Client(new AzureResourceFactory());

        Instance instanceThree = azureClient.createServer(Instance.Capacity.MICRO,30480);
        instanceThree.start();
        instanceThree.stop();
    }
}
