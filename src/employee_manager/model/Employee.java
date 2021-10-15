package employee_manager.model;

import employee_manager.sevice.EmployeeService;

public class Employee extends Person {
    private int salary;

    public Employee() {
    }

    public Employee(int id, String name, int age, int salary) {
        super(id, name, age);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", salary=" + salary +
                '}';
    }
}
