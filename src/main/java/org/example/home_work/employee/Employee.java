package org.example.home_work.employee;

public class Employee {

    private final int jobNumber;
    private final String telephoneNumber;
    private final String name;
    private final int workExperience;


    public Employee(int jobNumber, String telephoneNumber, String name, int workExperience) {
        this.jobNumber = jobNumber;
        this.telephoneNumber = telephoneNumber;
        this.name = name;
        this.workExperience = workExperience;
    }

    public int getJobNumber() {
        return jobNumber;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    @Override
    public String toString() {
        return "Сотрудник:\n" +
                "  Табельный номер: " + getJobNumber() + "\n" +
                "  Номер телефона: " + getTelephoneNumber() + "\n" +
                "  Имя: " + getName() + "\n" +
                "  Стаж: " + getWorkExperience() + " год(а)\n";
    }

}
