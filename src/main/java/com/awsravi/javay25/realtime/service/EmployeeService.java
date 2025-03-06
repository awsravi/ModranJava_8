package com.awsravi.javay25.realtime.service;

import com.awsravi.javay25.realtime.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private List<Employee> employees = new ArrayList<>();

    public EmployeeService() {
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Ravikumar", 28, "", "HR", 2023, 25000.0));
        employeeList.add(new Employee(122, "Aruna", 25, "Female", "Sales And Marketing", 2022, 35000));
        employeeList.add(new Employee(122, "Sunitha", 25, "Female", "Sales And Marketing", 2021, 28000));
        employeeList.add(new Employee(133, "Rajeswari", 29, "Female", "Infrastructure", 2024, 158000.0));
        employeeList.add(new Employee(144, "Karthik", 28, "Male", "Product Development", 2024, 32500.0));
        employeeList.add(new Employee(155, "Renuka", 27, "Female", "HR", 2021, 22700.0));
        employeeList.add(new Employee(166, "Gokul", 43, "Male", "Security And Transport", 2022, 10500.0));
        employeeList.add(new Employee(177, "RamMohan", 35, "Male", "Account And Finance", 2023, 27000.0));
        employeeList.add(new Employee(188, "Keerthi", 31, "Male", "Product Development", 2024, 34500.0));
        employeeList.add(new Employee(199, "Jayasree", 24, "Female", "Sales And Marketing", 2022, 11500.0));
        employeeList.add(new Employee(200, "Sindhuri", 38, "Female", "Security And Transport", 2021, 11000.5));
        employeeList.add(new Employee(211, "Ravi", 27, "Male", "Infrastructure", 2023, 15700.0));
        employeeList.add(new Employee(222, "Aruna", 25, "Female", "Product Development", 2022, 28200.0));
        employeeList.add(new Employee(233, "Manohar", 27, "Male", "Account And Finance", 2020, 21300.0));
        employeeList.add(new Employee(244, "Dinesh", 24, "Male", "Sales And Marketing", 2020, 10700.5));
        employeeList.add(new Employee(255, "Gowri", 23, "Male", "Infrastructure", 2020, 12700.0));
        employeeList.add(new Employee(266, "Nirmal", 26, "Male", "Product Development", 2021, 28900.0));
        employeeList.add(new Employee(277, "Victor", 31, "Male", "Product Development", 2018, 235700.0));
        }
}
