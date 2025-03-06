package com.awsravi.javay25.realtime;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
public static void main(String[] args) {

    List<Employee> employeeList = new ArrayList<Employee>();

    employeeList.add(new Employee(111, "Ravikumar", 28, "Male", "Java Developer", 2023, 25000.0));
    employeeList.add(new Employee(122, "Aruna", 25, "Female", "FrontEnd UI", 2022, 35000));
    employeeList.add(new Employee(122, "Sunitha", 25, "Female", "FrontEnd", 2021, 28000));
    employeeList.add(new Employee(133, "Rajeswari", 32, "Female", "FullStack Developer Lead", 2024, 158000.0));
    employeeList.add(new Employee(144, "Karthik", 28, "Male", "Java Developer", 2024, 32500.0));
    employeeList.add(new Employee(155, "Renuka", 27, "Female", "Java Developer", 2021, 22700.0));
    employeeList.add(new Employee(166, "Gokul", 43, "Male", "FullStack Developer Lead", 2022, 10500.0));
    employeeList.add(new Employee(177, "RamMohan", 35, "Male", "Java Developer", 2023, 27000.0));
    employeeList.add(new Employee(188, "Keerthi", 31, "Male", "Java Development", 2024, 34500.0));
    employeeList.add(new Employee(199, "Jayasree", 24, "Female", "Java Developer", 2022, 11500.0));
    employeeList.add(new Employee(200, "Sindhuri", 38, "Female", "Java Developer", 2021, 11000.5));
    employeeList.add(new Employee(211, "Ravi", 27, "Male", "FullStack Developer", 2023, 15700.0));
    employeeList.add(new Employee(222, "Hemalatha", 25, "Female", "UI Lead", 2022, 28200.0));
    employeeList.add(new Employee(233, "Manohar", 27, "Male", "Devops", 2020, 21300.0));
    employeeList.add(new Employee(244, "Dinesh", 24, "Male", "Manager", 2020, 10700.5));
    employeeList.add(new Employee(255, "Gowri", 23, "Male", "Infrastructure", 2020, 12700.0));
    employeeList.add(new Employee(266, "Nirmal", 26, "Male", "Product Development", 2021, 28900.0));
    employeeList.add(new Employee(277, "Victor", 31, "Male", "Product Manager", 2018, 235700.0));

    System.out.println("List Of All Employees: By awsravi ");
    for (Employee listAll : employeeList) {
        System.out.println(listAll);
    }
    //How many male and female employees are there in the organization?
    System.out.println("How many male and female employees are there in the organization.....?");
    Map<String, Long> noOfMaleAndFemaleEmployees =
            employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

    System.out.println(noOfMaleAndFemaleEmployees);

    //Print the name of all departments in the organization?
    System.out.println("Print the name of all departments in the organization.....?");
    employeeList.stream()
            .map(Employee::getDepartment)
            .distinct()
            .forEach(System.out::println);

    //What is the average age of male and female employees?
    System.out.println("What is the average age of male and female employees.....?");
    Map<String, Double> avgAgeOfMaleAndFemaleEmployees =
            employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));

    System.out.println(avgAgeOfMaleAndFemaleEmployees);

    //Get the details of highest paid employee in the organization?
    System.out.println("Get the details of highest paid employee in the organization.....?");
    Optional<Employee> highestPaidEmployeeWrapper=
            employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));

    Employee highestPaidEmployee = highestPaidEmployeeWrapper.get();

    System.out.println("Details Of Highest Paid Employee : ");

    System.out.println("==================================");

    System.out.println("ID : "+highestPaidEmployee.getId());

    System.out.println("Name : "+highestPaidEmployee.getName());

    System.out.println("Age : "+highestPaidEmployee.getAge());

    System.out.println("Gender : "+highestPaidEmployee.getGender());

    System.out.println("Department : "+highestPaidEmployee.getDepartment());

    System.out.println("Year Of Joining : "+highestPaidEmployee.getYearOfJoining());

    System.out.println("Salary : "+highestPaidEmployee.getSalary());

    //Get the names of all employees who have joined after 2015?
    System.out.println("Get the names of all employees who have joined after 2015.....?");
    employeeList.stream()
            .filter(e -> e.getYearOfJoining() > 2023)
            .map(Employee::getName)
            .forEach(System.out::println);

    //Count the number of employees in each department?
    System.out.println("Count the number of employees in each department.....?");
    Map<String, Long> employeeCountByDepartment=
            employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

    Set<Map.Entry<String, Long>> entrySet = employeeCountByDepartment.entrySet();

    for (Map.Entry<String, Long> entry : entrySet)
    {
        System.out.println(entry.getKey()+" : "+entry.getValue());
    }

    //What is the average salary of each department?
    System.out.println("What is the average salary of each department.....?");
    Map<String, Double> avgSalaryOfDepartments=
            employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

    Set<Map.Entry<String, Double>> entrySetForAvgSalDept = avgSalaryOfDepartments.entrySet();

    for (Map.Entry<String, Double> entry : entrySetForAvgSalDept)
    {
        System.out.println(entry.getKey()+" : "+entry.getValue());
    }

    //Get the details of youngest male employee in the product development department?
    System.out.println("Get the details of youngest male employee in the product development department.....?");
    Optional<Employee> youngestMaleEmployeeInProductDevelopmentWrapper=
            employeeList.stream()
                    .filter(e -> e.getGender()=="Male" && e.getDepartment()=="Product Development")
                    .min(Comparator.comparingInt(Employee::getAge));

    Employee youngestMaleEmployeeInProductDevelopment = youngestMaleEmployeeInProductDevelopmentWrapper.get();

    System.out.println("Details Of Youngest Male Employee In Product Development");

    System.out.println("----------------------------------------------");

    System.out.println("ID : "+youngestMaleEmployeeInProductDevelopment.getId());

    System.out.println("Name : "+youngestMaleEmployeeInProductDevelopment.getName());

    System.out.println("Age : "+youngestMaleEmployeeInProductDevelopment.getAge());

    System.out.println("Year Of Joinging : "+youngestMaleEmployeeInProductDevelopment.getYearOfJoining());

    System.out.println("Salary : "+youngestMaleEmployeeInProductDevelopment.getSalary());

    //Who has the most working experience in the organization?
    System.out.println("Who has the most working experience in the organization.....?");
    Optional<Employee> seniorMostEmployeeWrapper=
            employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();

    Employee seniorMostEmployee = seniorMostEmployeeWrapper.get();

    System.out.println("Senior Most Employee Details :");

    System.out.println("----------------------------");

    System.out.println("ID : "+seniorMostEmployee.getId());

    System.out.println("Name : "+seniorMostEmployee.getName());

    System.out.println("Age : "+seniorMostEmployee.getAge());

    System.out.println("Gender : "+seniorMostEmployee.getGender());

    System.out.println("Age : "+seniorMostEmployee.getDepartment());

    System.out.println("Year Of Joinging : "+seniorMostEmployee.getYearOfJoining());

    System.out.println("Salary : "+seniorMostEmployee.getSalary());

    //How many male and female employees are there in the sales and marketing team?
    System.out.println("How many male and female employees are there in the sales and marketing team.....?");
    Map<String, Long> countMaleFemaleEmployeesInSalesMarketing=
            employeeList.stream()
                    .filter(e -> e.getDepartment()=="FullStack Developer Lead")
                    .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

    System.out.println(countMaleFemaleEmployeesInSalesMarketing);

    //What is the average salary of male and female employees?
    System.out.println("What is the average salary of male and female employees?.....?");
    Map<String, Double> avgSalaryOfMaleAndFemaleEmployees=
            employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));

    System.out.println(avgSalaryOfMaleAndFemaleEmployees);

    //List down the names of all employees in each department?
    System.out.println("List down the names of all employees in each department.....?");
    Map<String, List<Employee>> employeeListByDepartment=
            employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));

    Set<Map.Entry<String, List<Employee>>> entrySetListByDept = employeeListByDepartment.entrySet();

    for (Map.Entry<String, List<Employee>> entry : entrySetListByDept)
    {
        System.out.println("--------------------------------------");

        System.out.println("Employees In "+entry.getKey() + " : ");

        System.out.println("--------------------------------------");

        List<Employee> list = entry.getValue();

        for (Employee e : list)
        {
            System.out.println(e.getName());
        }
    }
    //What is the average salary and total salary of the whole organization?
    System.out.println("What is the average salary and total salary of the whole organization.....?");
    DoubleSummaryStatistics employeeSalaryStatistics=
            employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));

    System.out.println("Average Salary = "+employeeSalaryStatistics.getAverage());

    System.out.println("Total Salary = "+employeeSalaryStatistics.getSum());

    //Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
    System.out.println("Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.....?");
    Map<Boolean, List<Employee>> partitionEmployeesByAge=
            employeeList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 25));

    Set<Map.Entry<Boolean, List<Employee>>> entrySetPartiByAge = partitionEmployeesByAge.entrySet();

    for (Map.Entry<Boolean, List<Employee>> entry : entrySetPartiByAge)
    {
        System.out.println("----------------------------");

        if (entry.getKey())
        {
            System.out.println("Employees older than 25 years :");
        }
        else
        {
            System.out.println("Employees younger than or equal to 25 years :");
        }

        System.out.println("----------------------------");

        List<Employee> list = entry.getValue();

        for (Employee e : list)
        {
            System.out.println(e.getName());
        }
    }
    //Who is the oldest employee in the organization? What is his age and which department he belongs to?
    System.out.println("Who is the oldest employee in the organization? What is his age and which department he belongs to.....?");
    Optional<Employee> oldestEmployeeWrapper = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));

    Employee oldestEmployee = oldestEmployeeWrapper.get();

    System.out.println("Name : "+oldestEmployee.getName());

    System.out.println("Age : "+oldestEmployee.getAge());

    System.out.println("Department : "+oldestEmployee.getDepartment());
}
}
