import java.util.ArrayList;
import java.util.List;

import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        Worker worker1 = new Worker("John", 2000, 1, "2022-01-01", "Junior Developer");
        Worker worker2 = new Worker("Alice", 1800, 2, "2022-03-15", "Intern");
        Worker worker3 = new Worker("Bob", 2200, 3, "2021-11-20", "Senior Developer");
        Worker worker4 = new Worker("Emma", 1900, 4, "2023-02-10", "Project Manager");

        Manager manager = new Manager("Michael", 3500, 5, "2020-05-10", "CTO");

        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee employee : employees) {
            System.out.println("- " + employee.getName() +
                    " (ID: " + employee.hashCode() +
                    ", Position: " + employee.getPosition() +
                    ", Hire date: " + employee.getHireDate() +
                    ", Salary: " + employee.getSalary() + ")");
            employee.work();
        }
    }
}