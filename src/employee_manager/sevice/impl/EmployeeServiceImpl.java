package employee_manager.sevice.impl;

import employee_manager.model.Boss;
import employee_manager.model.Employee;
import employee_manager.sevice.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
    private Employee[] employeeList = new Employee[3];
    private int size = 0;


    @Override
    public void add(Employee employee) {
        employeeList[size] = employee;
        size++;
    }

    @Override
    public void editById(int id, Employee employee) {
        employeeList[findIndexById(id)] = employee;
    }

    @Override
    public void deleteById(int id) {
        Employee[] newEmployeeList = new Employee[employeeList.length - 1];
        if (findIndexById(id) != -1) {
            for (int i = 0; i < newEmployeeList.length; i++) {
                if (i < findIndexById(id)) {
                    newEmployeeList[i] = employeeList[i];
                } else {
                    newEmployeeList[i] = employeeList[i + 1];
                }
            }
            System.out.println("New list employee: ");
            for (int i = 0; i < newEmployeeList.length; i++) {
                System.out.println(newEmployeeList[i]);
            }
            System.out.println("--------------------------");
        } else {
            System.out.println("Không có giá trị đó trong mảng");
        }
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < employeeList.length; i++) {
            if (employeeList[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void print() {
        for (int i = 0; i < employeeList.length; i++) {
            System.out.println(employeeList[i]);
        }
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        Employee employee1 = new Employee(2, "Hoa", 30, 10000000);
        Employee employee2 = new Employee(3, "Hương", 30, 15000000);
        Employee employee3 = new Employee(1, "Hùng", 30, 12000000);
        employeeService.add(employee1);
        employeeService.add(employee2);
        employeeService.add(employee3);
        employeeService.print();
        System.out.println("Index = " + employeeService.findIndexById(2));

        Employee employee4 = new Employee(4, "Hà", 40, 120000000);
        employeeService.editById(3, employee4);

        employeeService.print();

        employeeService.deleteById(4);
    }
}
