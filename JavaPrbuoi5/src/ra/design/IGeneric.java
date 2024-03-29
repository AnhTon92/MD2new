package ra.design;

public interface IGeneric<T,E> {
    void displayAll();
    void addNew();
    void update();
    T findbyId(E id);
    T changeStatusById(E id);
}
