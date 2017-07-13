package com.kgfsl.log4jtest;
import java.io.FileReader;
import java.util.*;
import java.io.*;
import java.sql.*;
public class DBUploadCSV
{
public static void main(String args[])
{
read();
upload();


}
static void upload()
{
Connection connection = DBConnection.getDBConnection();
try
{

String loadQuery = "LOAD DATA LOCAL INFILE '" + "C://Users//ramya.s//employee.csv" + "' INTO TABLE employee FIELDS TERMINATED BY ','" + " LINES TERMINATED BY '\n' (emp_id, emp_name, emp_company,emp_project) ";
System.out.println(loadQuery);

Statement stmt = connection.createStatement();

stmt.execute(loadQuery);
System.out.println("Upload successfully");

}

catch (Exception e)
{
e.printStackTrace();
}




}
static public void read()
{
try
{
Scanner scanner = new Scanner(new File("C://Users//ramya.s//employee.csv"));
scanner.useDelimiter(",");
while(scanner.hasNext()){
System.out.print(scanner.next());
}
scanner.close();
}
catch(Exception ex)
{
ex.printStackTrace();
}


}
}