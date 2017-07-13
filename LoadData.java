package com.kgfsl.log4jtest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class LoadData {
public static void main(String[] args) throws Exception {
Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "");
String filename = ("C:\\Users\\ramya.s\\log4jtest\\src\\main\\java\\com\\kgfsl\\log4jtest\\emp1.csv");
System.out.println(filename);
String tablename = "employee";

String qry = " LOAD DATA LOCAL INFILE '" + filename + "' INTO TABLE " + tablename + " FIELDS TERMINATED BY ','"
+ " LINES TERMINATED BY '\n'";
Statement stmt = connection.createStatement();
stmt.execute(qry);
}
}

