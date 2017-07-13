package com.kgfsl.log4jtest;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.CSVReader;
class EmpTest
{
    public static void main(String args[])
    {
        try
        {
        CSVReader reader=new CSVReader(new FileReader("C:\\Users\\ramya.s\\log4jtest\\src\\main\\java\\com\\kgfsl\\log4jtest\\emp1.csv"),',');
        List<Employee> emps=new ArrayList<Employee>();
        String[] record=null;
        while ((record = reader.readNext()) != null) {
			Employee emp = new Employee();
			emp.setId(record[0]);
			emp.setName(record[1]);
			emp.setAge(record[2]);
			emp.setCountry(record[3]);
			emps.add(emp);
		}
System.out.println(emps);
reader.close();
    }
    catch(Exception e){
             System.out.println(e);

    }
    }
}