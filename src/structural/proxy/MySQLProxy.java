package structural.proxy;

public class MySQLProxy implements DatabaseConnector {
    private MySQLConnector mySQLConnector;
    private String url;
    private int port;
    private String database;
    private String table;

    public MySQLProxy(String url, int port, String database, String table) {
        this.url = url;
        this.port = port;
        this.database = database;
        this.table = table;
    }

    @Override
    public void openConnection() {
        if (mySQLConnector == null) {
            mySQLConnector = new MySQLConnector(url, port, database, table);
        }

        mySQLConnector.openConnection();
    }

    @Override
    public void close() {
        System.out.println("other cleanup...");
        mySQLConnector.close();
    }
}
