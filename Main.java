import java.util.ArrayList;
import java.util.List;

import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        Worker worker1 = new Worker("John", 2000, 1, "2022-01-01", "Junior developer");
        Worker worker2 = new Worker("Alice", 1800, 2, "2022-03-15", "Intern");
        Worker worker3 = new Worker("Bob", 2200, 3, "2021-11-20", "Senior developer");
        Worker worker4 = new Worker("Emma", 1900, 2, "2023-02-10", "Project manager");
        Worker worker5 = new Worker("Jack", 2100, 5, "2022-05-05", "Senior developer");
        Worker worker6 = new Worker("Sophia", 2500, 2, "2023-07-20", "Senior manager");

        Manager manager1 = new Manager("Michael", 3500, 6, "2020-05-10", "CTO");
        Manager manager2 = new Manager("Emily", 3200, 7, "2021-08-15", "HR Manager");
        Manager manager3 = new Manager("Daniel", 3800, 3, "2019-12-20", "Project director");

        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(worker5);
        employees.add(worker6);
        employees.add(manager1);
        employees.add(manager2);
        employees.add(manager3);

        double totalSalary = 0;
        double totalManagerSalary = 0;
        double totalWorkerSalary = 0;

        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
            if (employee instanceof Manager) {
                totalManagerSalary += employee.getSalary();
            } else if (employee instanceof Worker) {
                totalWorkerSalary += employee.getSalary();
            }
        }

        System.out.println("Total salary of all employees: " + totalSalary);
        System.out.println("Total salary of all managers: " + totalManagerSalary);
        System.out.println("Total salary of all workers: " + totalWorkerSalary);

        for (int i = 0; i < employees.size(); i++) {
            for (int j = i + 1; j < employees.size(); j++) {
                if (employees.get(i).hashCode() == employees.get(j).hashCode()) {
                    System.out.println("Employees with the same ID: " + employees.get(i).getName() + " and " + employees.get(j).getName());
                }
            }
        }
    }
}