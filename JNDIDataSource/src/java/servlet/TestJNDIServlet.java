/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 *
 * @author hongt
 */
@WebServlet("/listProducts")
public class TestJNDIServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        try {
            Context initContext = new InitialContext();
            Context envContext = (Context) initContext.lookup("java:comp/env");
            DataSource ds = (DataSource) envContext.lookup("jdbc/ProductDB");
            Connection conn = ds.getConnection();
            Statement statement = conn.createStatement();
            String sql = "select name, quantity from Product";
            ResultSet rs = statement.executeQuery(sql);
            int count = 1;
            while (rs.next()) {
                writer.println(String.format("Product #%d: %-15s %s",
                        count++,
                        rs.getString("name"),
                        rs.getString("quantity")));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        } catch (NamingException ex) {
            Logger.getLogger(TestJNDIServlet.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
    }
}
