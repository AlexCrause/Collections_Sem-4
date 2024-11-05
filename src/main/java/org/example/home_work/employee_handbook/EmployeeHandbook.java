package org.example.home_work.employee_handbook;

import org.example.home_work.employee.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeHandbook {

    Employee employee;
    List<Employee> employees;

    public EmployeeHandbook() {
        employees = new ArrayList<>();
    }

    // добавляет нового сотрудника в справочник
    public void addEmployee(Employee employee) {
        this.employee = employee;
        employees.add(employee);
    }

    // ищет сотрудника по стажу
    public List<Employee> getEmployeeByWorkExperience(int workExperience) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getWorkExperience() ==workExperience)  {
                result.add(employee);
            }
        }
        return result;
    }

    // ищет сотрудника по табельному номеру
    public List<Employee> getEmployeeByJobNumber(int jobNumber) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getJobNumber() == jobNumber) {
                result.add(employee);
            }
        }
        return result;
    }

    // Возвращает имя и номер телефона сотрудника по имени
    public List<String> getTelephoneNumberByEmployeeName(String name) {
        List<String> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) { // Проверка по имени
                result.add("Имя: " + employee.getName() + ", Номер телефона: " + employee.getTelephoneNumber());
            }
        }
        return result;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
