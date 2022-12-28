package SOLID.Dependency;

import java.sql.ResultSet;

public class MySQL implements IDatabaseInterface {

    @Override
    public ResultSet get () {
        return null;
    }

    @Override
    public Boolean insert() {
        return false;
    }

    @Override
    public Boolean update() {
        return false;
    }

    @Override
    public Boolean delete() {
        return false;
    }
}
