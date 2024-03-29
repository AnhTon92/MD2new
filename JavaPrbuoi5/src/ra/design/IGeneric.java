package ra.design;

public interface IGeneric<T,E> {
    void displayAll();
    void addNew();
    void update();
    T changeStatusById(E id);
}
