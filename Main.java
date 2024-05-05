import java.util.ArrayList;
import java.util.List;

import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("John", 2000, 1, "2022-01-01", "Junior Developer");
        Worker worker2 = new Worker("Alice", 1800, 2, "2022-03-15", "Intern");
        Worker worker3 = new Worker("Bob", 2200, 2, "2021-11-20", "Senior Developer");

        Manager manager = new Manager("Michael", 3500, 5, "2020-05-10", "CTO");

        System.out.println(worker1.getName() + " has code: " + worker1.hashCode());
        System.out.println(worker2.getName() + " has code: " + worker2.hashCode());
        System.out.println(worker3.getName() + " has code: " + worker3.hashCode());
        System.out.println(manager.getName() + " has code: " + manager.hashCode());

        System.out.println(worker2.getName() + " equals worker1: " + worker2.equals(worker1));
        System.out.println(worker2.getName() + " equals worker3: " + worker2.equals(worker3));
        System.out.println(worker2.getName() + " equals manager: " + worker2.equals(manager));
    }
}