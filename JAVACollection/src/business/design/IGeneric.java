package business.design;

import java.util.List;
import java.util.Scanner;


public interface IGeneric<T,E> {
    void displayAll();
    void addNew();
    void update();
T findbyId(E id);
T changeStatusById(E id);
}

