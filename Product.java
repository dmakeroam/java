/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sit;
import java.sql.*;
/**
 *
 * @author oam
 */
public class Product {
   private int productId;
   private int manufacturerId;
   private String manufacturerName; //manufacturer_id
   private String productName; // description

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(int manufacturerId) {
        this.manufacturerId = manufacturerId;
    }
    

    @Override
    public String toString() {
        return "Product{" + "productId=" + productId + ", manufacturerName=" + manufacturerName + ", productName=" + productName + '}';
    }
    public static Product findById(int id) throws Exception{
       Product po=null;
       Connection con=ConnectionFetcher.getConnection();
       PreparedStatement stmt=con.prepareStatement("select * from app.product "
               + "inner join app.manufacturer on app.product.manufacturer_id=app.manufacturer.manufacturer_id "
               + "where product_id=?");
       stmt.setInt(1, id);
       ResultSet rs=stmt.executeQuery();
       if(rs.next()){
           po=new Product();
           po.setProductId(rs.getInt("product_id"));
           po.setProductName(rs.getString("description"));
           po.setManufacturerName(rs.getString("name"));
       }
       return po;
    }
    public static boolean insert(Product obj) throws Exception{
        Connection con=ConnectionFetcher.getConnection();
        PreparedStatement stmt=con.prepareStatement("insert into app.product "
                + "(product_id,manufacturer_id,product_code,description) values(?,?,'SW',?)");
        stmt.setInt(1,obj.productId);
        stmt.setInt(2,obj.manufacturerId);
        stmt.setString(3,obj.productName);
        return stmt.executeUpdate()==1;
    }
    public static boolean delete(int id) throws Exception{
        Connection con=ConnectionFetcher.getConnection();
        PreparedStatement stmt=con.prepareStatement("delete from app.product where product_id=?");
        stmt.setInt(1, id);
        return stmt.executeUpdate()==1;
    }
    public static boolean update(Product obj) throws Exception{
        Connection con=ConnectionFetcher.getConnection();
        PreparedStatement stmt=con.prepareStatement("update app.product "
                + "set manufacturer_id=?,description=? where product_id=?");
        stmt.setInt(1,obj.manufacturerId);
        stmt.setString(2,obj.productName);
        stmt.setInt(3,obj.productId);
        return stmt.executeUpdate()==1;
    }
    public static int countRow() throws Exception{
        int count=0;
        Connection con=ConnectionFetcher.getConnection();
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from app.product");
        while(rs.next()){
          count++;  
        }
        return count;
    }
    public static Product[] showAllData() throws Exception{
        Connection con=ConnectionFetcher.getConnection();
        Product [] po=new Product[countRow()];
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from app.product");
        int i=0;
        while(rs.next()){
           po[i]=new Product();
           po[i].setProductId(rs.getInt("product_id"));
           po[i].setManufacturerId(rs.getInt("manufacturer_id"));
           po[i].setProductName(rs.getString("description"));
           i++;
        }
        return po;
    }
}
