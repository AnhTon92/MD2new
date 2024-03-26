package Empoyee;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];


        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee();
            employees[i].inputData();
        }

        // hien thi ten nv
        for (int i = 0; i < employees.length; i++) {
            System.out.println("ten nhan vien");
            System.out.println( employees[i].getEmployeeName());
        }

//        for (Employee employee : employees) {
//            employee.displayData();
//            System.out.println();
//        }
    }
}

