package com.kgfsl.log4jtest;
import java.io.IOException;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.*;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;
import com.opencsv.bean.CsvToBean;

class CSVHeader {
public static void main(String[] args) throws IOException {
CSVReader reader = new CSVReader(new FileReader("C:\\Users\\ramya.s\\log4jtest\\src\\main\\java\\com\\kgfsl\\log4jtest\\emp1.csv"), ',');
    
    HeaderColumnNameMappingStrategy<Employee> beanStrategy = new HeaderColumnNameMappingStrategy<Employee>();
    beanStrategy.setType(Employee.class);
    
    CsvToBean<Employee> csvToBean = new CsvToBean<Employee>();
    List<Employee> emps = csvToBean.parse(beanStrategy, reader);
    
    System.out.println(emps);
    reader.close();
    
}
}