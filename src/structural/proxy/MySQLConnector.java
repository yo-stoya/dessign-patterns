package structural.proxy;

public class MySQLConnector implements DatabaseConnector {
    private String url;
    private int port;
    private String database;
    private String table;

    public MySQLConnector(String url, int port, String database, String table) {
        this.url = url;
        this.port = port;
        this.database = database;
        this.table = table;
    }

    @Override
    public void openConnection() {
        System.out.println("Opening connection to");
    }

    @Override
    public void close() {
        System.out.println("Closing connection.");
    }
}
