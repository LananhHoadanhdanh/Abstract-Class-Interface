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
    public void editById(int id) {

    }

    @Override
    public void deleteById(int id) {

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
    }
}
