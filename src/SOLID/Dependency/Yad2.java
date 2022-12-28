package SOLID.Dependency;

import java.util.Collections;
import java.util.List;

public class Yad2 {

    private IDatabaseInterface db;

    public Yad2(IDatabaseInterface db) {

        this.db = db;
    }

    public List<String> listProducts() {

        db.get();

        return Collections.emptyList();
    }

    public Boolean save() {

        return db.insert();
    }

    public Boolean delete() {

        return db.insert();
    }
}