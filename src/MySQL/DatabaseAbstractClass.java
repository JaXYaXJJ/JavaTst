package MySQL;

import org.intellij.lang.annotations.Language;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class DatabaseAbstractClass {
    protected Connection connection;

    protected  DatabaseAbstractClass() {
        this.connection = null;
    }

    //Check if there's an open connection
    protected boolean checkConnection() throws SQLException {
        return connection != null && !connection.isClosed();
    }

    public abstract Connection getConnection() throws SQLException;

    //Close open connection
    public void closeConnection() throws SQLException {
        connection.isClosed();
    }

    public ResultSet query(@Language("SQL") String query) throws SQLException {

        //Create connection if doesn't exist
        if(!checkConnection())
            connection = getConnection();

        PreparedStatement statement = connection.prepareStatement(query);
        return statement.executeQuery();
    }

    public void query(@Language("SQL") String query, ISQLConsumer<ResultSet> consumer) throws SQLException {

        ResultSet rs = query(query);
        consumer.accept(rs);
        rs.close();
    }

    public void perform(String query) throws SQLException {

        if(!checkConnection())
            connection = getConnection();

        PreparedStatement statement = connection.prepareStatement(query);
        statement.execute();
    }
}
