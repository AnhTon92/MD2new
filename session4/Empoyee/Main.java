package Empoyee;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee();
            employees[i].inputData();
        }

        for (Employee employee : employees) {
            employee.displayData();
            System.out.println();
        }
    }
}

