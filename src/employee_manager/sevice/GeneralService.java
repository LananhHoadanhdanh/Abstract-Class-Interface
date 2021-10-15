package employee_manager.sevice;

public interface GeneralService<T> {
    public void add(T t);
    public void editById(int id);
    public void deleteById(int id);
    public int findIndexById(int id);
    public void print();
}
