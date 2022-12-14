package Serialization;

import java.io.Serializable;

public class SerializableClass implements Serializable {

    private String name;
    private transient int id; // non serializable

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}