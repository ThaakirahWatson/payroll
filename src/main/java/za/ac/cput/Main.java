package za.ac.cput;

import za.ac.cput.domain.Employee;
import za.ac.cput.factory.EmployeeFactory;

public class Main {
    public static void main(String[] args) {

        Employee e1 = EmployeeFactory.createEmployee("12345", "Thaakirah", "Watson");

        System.out.println(e1.toString());
    }
}

