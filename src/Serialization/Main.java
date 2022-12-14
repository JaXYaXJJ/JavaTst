package Serialization;

import java.io.*;

public class Main {

    private static void serializeObject() {

        SerializableClass serializableClass = new SerializableClass();

        serializableClass.setName("Demo Class");
        serializableClass.setId(5);

        System.out.println("Name before serialization : " + serializableClass.getName());
        System.out.println("ID before serialization : " + serializableClass.getId());


        try (ObjectOutputStream out = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("SerializableClass.ser")
                )))
        {

            out.writeObject(serializableClass);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void deSerializeObject() {

        try (ObjectInputStream input = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream("SerializableClass.ser")
                )))
        {

            SerializableClass deserializedObject = (SerializableClass) input.readObject();

            System.out.println("Name after de Serialization : " + deserializedObject.getName());
            System.out.println("ID after de Serialization : " + deserializedObject.getId());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

        serializeObject();
        deSerializeObject();

    }
}