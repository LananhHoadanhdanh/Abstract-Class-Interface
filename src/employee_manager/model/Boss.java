package employee_manager.model;

public class Boss extends Person{
    private int numberOfEmployees = 0;

    public Boss() {
    }

    public Boss(int id, String name, int age, int numberOfEmployees) {
        super(id, name, age);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
}
