package org.example.home_work;

import org.example.home_work.employee.Employee;
import org.example.home_work.employee_handbook.EmployeeHandbook;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Employee employee = new Employee(1, "89922172118", "Василий", 2);
        Employee employee2 = new Employee(2, "89922172119", "Иван", 1);
        Employee employee3 = new Employee(3, "89922172120", "Иван", 3);

        EmployeeHandbook employeeHandbook = new EmployeeHandbook();
        employeeHandbook.addEmployee(employee);
        employeeHandbook.addEmployee(employee2);
        employeeHandbook.addEmployee(employee3);

        System.out.println("Введите имя сотрудника: ");
        String name = scanner.nextLine();
        System.out.println(employeeHandbook.getTelephoneNumberByEmployeeName(name));

        System.out.println("Введите стаж работы: ");
        int workExperience = scanner.nextInt();
        System.out.println(employeeHandbook.getEmployeeByWorkExperience(workExperience));

        System.out.print("Введите табельный номер сотрудника: ");
        int jobNumber = scanner.nextInt();
        System.out.println(employeeHandbook.getEmployeeByJobNumber(jobNumber));

        //System.out.println(employeeHandbook.getEmployees());

        scanner.close();
    }
}
