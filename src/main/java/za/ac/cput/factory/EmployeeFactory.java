package za.ac.cput.factory;

import za.ac.cput.domain.Employee;

public class EmployeeFactory {
    public static Employee createEmployee(String employeeNumber, String firstName, String lastName) {
        if(employeeNumber.isEmpty() || employeeNumber == null)
            return null;

        if(firstName.isEmpty() || firstName == null)
            return null;

        if(lastName.isEmpty() || lastName == null)
            return null;

        return new Employee.Builder()
                .setEmployeeNumber(employeeNumber)
                .setFirstName(firstName)
                .setLastName(lastName)
                .build();
    }
}
