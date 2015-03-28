/**
 * @param args
 */
public static void main(String[] args) 
{
    try {

        String url = "jdbc:mysql://softwareengineering.ccg9pdiausna.us-west-2.rds.amazonaws.com:3306/";
        String userName = "cse360";
        String password = "classproject";
        String dbName = "patientdb";
        String driver = "com.mysql.jdbc.Driver";
        Connection connection = DriverManager.getConnection(url + dbName, userName, password);

        // Do something with the Connection


    } catch (SQLException ex) {
        // handle any errors
        System.out.println("SQLException: " + ex.getMessage());
        System.out.println("SQLState: " + ex.getSQLState());
        System.out.println("VendorError: " + ex.getErrorCode());
    }
    // TODO Auto-generated method stub

}