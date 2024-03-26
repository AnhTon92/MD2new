package ra.business.design;

import ra.business.entity.Employee;

import java.util.Scanner;

public class EmployeeManager implements CRUD {
    public EmployeeManager() {
    }
public static Scanner scanner = new Scanner(System.in);
public static Employee[] employees = new Employee[100];
static int size = 0;
    @Override
    public void createData() {
        Employee newEmployee = new Employee();
        employees[size] = newEmployee;
        employees[size].inputData();
        size++;
    }

    @Override
    public void readData() {
        if (size == 0) {
            System.out.println(Alert.ALERT_SIZE);
        } else {
            for (int i = 0; i < size; i++) {
                employees[i].displayData();
            }
        }
    }

    @Override
    public void showInfo() {
        System.out.println(Alert.GET_ID);
        int input = Integer.parseInt(scanner.nextLine());
        if (size == 0) {
            System.out.println(Alert.ALERT_SIZE);
        } else {
            for (int i = 0; i < size; i++) {
                if (employees[i].getEmployeeId() == input) {
                    employees[i].displayData();
                } else {
                    System.out.println(Alert.ALERT_SIZE);
                }
            }
        }
    }

    @Override
    public void updateData() {
        System.out.println(Alert.GET_ID);
        int input = Integer.parseInt(scanner.nextLine());
        if (size == 0) {
            System.out.println(Alert.ALERT_SIZE);
        } else {
            for (int i = 0; i < size; i++) {
                if (employees[i].getEmployeeId() == input) {
                    employees[i].inputData();
                } else {
                    System.out.println(Alert.ALERT_SIZE);
                }
            }
        }
    }

    @Override
    public void deleteData() {
        int index = -1;
        System.out.println(Alert.GET_ID);
        int input = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < size; i++) {
            if (size == 0) {
                System.out.println(Alert.ALERT_SIZE);
            } else {
                for (int j = 0; j < size; j++) {
                    if (employees[j].getEmployeeId() == input) {
                        index = j;
                        break;
                    } else {
                        System.out.println(Alert.ALERT_SIZE);
                    }
                }
            }
        }
        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                employees[i] = employees[i + 1];
            }
            employees[size - 1] = null;
            size--;
        } else {
            System.out.println(Alert.ALERT_SIZE);
        }
    }

    @Override
    public void searchData() {
        System.out.println(Alert.GET_NAME);
        String input = scanner.nextLine();
        if (size == 0) {
            System.out.println(Alert.ALERT_SIZE);
        } else {
            for (int i = 0; i < size; i++) {
                if (employees[i].getEmployeeName().toLowerCase().contains(input.toLowerCase())) {
                    employees[i].displayData();
                    break;
                } else {
                    System.out.println(Alert.ALERT_SIZE);
                }
            }
        }
    }

    @Override
    public void sortData() {
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                if (employees[i].getEmployeeName().compareTo(employees[j].getEmployeeName())>0){
                    Employee tg =employees[i];
                    employees[i]=employees[j];
                    employees[j]=tg;
                }
            }
        }
        createData();
    }
    }

