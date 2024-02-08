import model.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeApp {

    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        createEmployees(empList);
// Get employee by city
//        Map<String, List<Employee>> collect = empList.stream().
//                collect(Collectors.groupingBy(Employee::getCity));
//        System.out.println(collect);

//        Filter employee by age
//        List<Employee> collect = empList.stream().filter(emp -> emp.getAge() > 25).collect(Collectors.toList());
//        System.out.println(collect);

//        Program to print the max and min salary
        /*Optional<Employee> highestSalaried = empList.stream().collect(Collectors.
                maxBy(Comparator.comparingDouble(Employee::getSalary)));
        Optional<Employee> lowestSalaried = empList.stream().collect(Collectors.
                minBy(Comparator.comparingDouble(Employee::getSalary)));
        if(highestSalaried.isPresent()){
            System.out.println(highestSalaried.get());
        }

        if(lowestSalaried.isPresent()){
            System.out.println(lowestSalaried.get());
        }*/

//        Max salary of employee from each department
        /*Map<String, Employee> highestSalaryByDepartment = empList.stream().collect(Collectors.
                groupingBy(e -> e.getDepartment(),
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingDouble(e -> e.getSalary())), Optional::get)));
        System.out.println(highestSalaryByDepartment);*/

//        Print the active and inactive employees
        /*Map<String, Long> empCountByStatus = empList.stream().collect(
                Collectors.groupingBy(Employee::getActive, Collectors.counting()));
        System.out.println(empCountByStatus);*/

//        Program to print employee details working in each department
//        Map<String, List<Employee>> collect = empList.stream().collect(
//                Collectors.groupingBy(Employee::getDepartment));
//        System.out.println(collect);

        // Program to find number of male and female employees
//        Map<String, Long> collect = empList.stream().collect(
//                Collectors.groupingBy(Employee::getGender, Collectors.counting()));
//        System.out.println(collect);

        //Average salary for each gender
//        Map<String, Double> collect = empList.stream().collect(
//                Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
//        System.out.println(collect);

        // Sort Employees based on age
//        empList.sort(Comparator.comparing(Employee::getAge));
//        empList.stream().map(emp -> emp.getAge() + " - " + emp.getName()).forEach(System.out:: println);

        // Employee List who joined after 2018
//        List<Employee> collect = empList.stream().filter(f -> f.getYearOfJoining() > 2010)
//                .collect(Collectors.toList());
//        collect.stream().map(f-> f.getName() + "-" + f.getYearOfJoining()).forEach(System.out::println);

        //Count number of employee for each department
//        Map<String, Long> collect = empList.stream().collect(
//                Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
//        System.out.println(collect);

        //Average salary for each department
//        Map<String, Double> collect = empList.stream().collect(
//                Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
//        System.out.println(collect);

        // Get the employee with minimum age
//        Optional<Employee> m = empList.stream().filter(e -> e.getGender().equals("M")).min(Comparator.comparingInt(Employee::getAge));
//        System.out.printf(m.get().getName());

        // Who has the most working exp in org
//        Optional<Employee> max = empList.stream().min(Comparator.comparingInt(Employee::getYearOfJoining));
//        Optional<Employee> collect = empList.stream().collect(Collectors.minBy(Comparator.comparingInt(Employee::getYearOfJoining)));
//        Optional<Employee> first = empList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
//        System.out.println(first.get().getName());


        // How many male and female emp is there in sales team
//        Map<String, Long> sales = empList.stream().filter(f -> f.getDepartment().equals("sales"))
//                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
//        System.out.println(sales);

        // What is the average and total salary of the whole org
//        DoubleSummaryStatistics collect = empList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
//        System.out.println("Average Salary: " + collect.getAverage() + " ,Total Salary: " + collect.getSum() + " ,Min salary: " + collect.getMin());

        // Separate the employees who are younger than 28 years
//        For only getting single list empList.stream().filter(e -> e.getAge() <= 29).collect(Collectors.toList()).forEach(System.out::println);
//        empList.stream().collect(Collectors.partitioningBy(e -> e.getAge() < 27)).forEach((k, v) -> System.out.println(k + " => " + v));


        // Who is the oldest employee
        Employee employee = empList.stream().max(Comparator.comparingInt(Employee::getAge)).get();
        System.out.println(employee.getName() + " " + employee.getAge());

    }

    private static void createEmployees(List<Employee> empList) {
        Employee em1 = new Employee("1", "srideep", 29, "Kolkata", "M", "yes", "system", 2022, 50000);
        Employee em2 = new Employee("6", "Tathagata", 35, "Delhi", "M", "yes", "system", 2011, 60000);
        Employee em3 = new Employee("89", "Akash", 27, "Delhi", "M", "yes", "IT", 2021, 30000);
        Employee em4 = new Employee("34", "Tirthankar", 30, "Kolkata", "M", "yes", "sales", 2018, 25000);
        Employee em5 = new Employee("16", "Sourav", 24, "Mumbai", "M", "no", "sales", 2020, 10000);
        Employee em6 = new Employee("18", "Rohini", 30, "Mumbai", "F", "no", "sales", 2017, 40000);

        empList.addAll(List.of(em1, em2, em3, em4, em5, em6));
    }
}
