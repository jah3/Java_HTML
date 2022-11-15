package com.example.demo.AllDataFolder;

import io.bretty.console.table.Alignment;
import io.bretty.console.table.ColumnFormatter;
import io.bretty.console.table.Table;


import java.sql.*;

public class SQLQuery {
    public static void showDataAutentification() throws SQLException{
        String[] headers = {"ID_", "username_", "password_"};
        int tempid = 0;
        String sql = "";
        try (Connection conn = DriverManager.getConnection(PropertiesReader.CONN_URL, PropertiesReader.CONN_USER, PropertiesReader.CONN_PASS);
             Statement stmt = conn.createStatement();) {

            ResultSet myRs = stmt.executeQuery("select * from Autentification");
            ColumnFormatter<String> cf1 = ColumnFormatter.text(Alignment.LEFT, 15);
            Table table1 = Table.of(new String[][]{headers}, cf1);
            System.out.println(table1);
            System.out.println("|_______________________________________________|");
            while (myRs.next()) {
                String[][] data = {{myRs.getString("ID_"), myRs.getString("username_"), myRs.getString("password_")}};
                ColumnFormatter<String> cf = ColumnFormatter.text(Alignment.LEFT, 15);
                Table table = Table.of(data, cf);
                System.out.println(table);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
