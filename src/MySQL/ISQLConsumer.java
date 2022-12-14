package MySQL;

import java.sql.SQLException;

@FunctionalInterface
public interface ISQLConsumer<T> {

    void accept(T t) throws SQLException;
}
