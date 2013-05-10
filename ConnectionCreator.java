public class ConnectionCreator {
    public static Connection building(){
        Connection con=null;
        try {
           con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample","app","app");
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionCreator.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
