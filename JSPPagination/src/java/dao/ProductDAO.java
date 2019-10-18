package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import model.Product;

public class ProductDAO {

    private int noOfRecords;

    public ProductDAO() {}

    public List<Product> viewAllProducts(int offset, int noOfRecords) {
        String query = "SELECT SQL_CALC_FOUND_ROWS * FROM product LIMIT "+offset+","+noOfRecords;
        List<Product> list = new ArrayList<>();
        Product product = null;
        try {
            Context initContext = new InitialContext();
            Context envContext = (Context) initContext.lookup("java:comp/env");
            DataSource ds = (DataSource) envContext.lookup("jdbc/MYSQLProductDB");
            Connection connection = ds.getConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                product = new Product();
                
                product.setName(rs.getString("name"));
                product.setQuantity(rs.getInt("quantity"));
                product.setPrice(rs.getInt("price"));
                product.setCategoryID(rs.getInt("category_id"));
                product.setProductID(rs.getInt("product_id"));
                list.add(product);
            }
            rs.close();
            rs = statement.executeQuery("SELECT FOUND_ROWS()");
            if (rs.next()) {
                this.noOfRecords = rs.getInt(1);
            }

        } catch (SQLException | NamingException ex) {
            System.err.println(ex);
        }
        return list;
    }

    public int getNoOfRecords() {
        return noOfRecords;
    }
}

