package iofile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
//    public static void main(String[] args) {
//        // Thêm và in ra danh sách các ??i t??ng Object
//        List<Object> objects = new ArrayList<>();
//        List<Student> students = new ArrayList<>();
//        objects.add(new Student(1, "Tôn"));
//        objects.add(new Student(2, "Tú"));
//    // ghi t?ng ??i t??ng Object vào file dùng ph??ng th?c writeObject.
//        for (Object obj : objects) {
//            writeObject("objects.dat", obj);
//        }
//        // dùng List readObject ?? ??c và in ra danh sách các ??i t??ng Object t? file
//        List<Object> readObjects = readAllObjects("objects.dat");
//        for (Object obj : readObjects) {
//            System.out.println(obj);
//        }
//        //in ra
//        System.out.println("Danh sách sinh viên:");
//
//    }
//// ph??ng th?c writeObject ?? ghi ??i t??ng vào file
//    public static <T extends Serializable> void writeObject(String path, Object obj ) {
//        // Ki?m tra file t?n t?i ?? quy?t ??nh s? d?ng stream lo?i nào
//        // ??t bi?n append ?? check t?n t?i gán m?c ??nh là ?ã t?n t?i (true)
//        boolean append = new File(path).exists();// ??t vào try-catch, n?u append ?ã t?n t?i thì ch?y
//        // ph??ng th?c ? class AppendableObjectOutputStream(in ra không ghi ?è mà chèn vào sau ph?n thân c?a stream) n?u ch?a thì in ra bình th??ng (ghi ?è)
//        try (ObjectOutputStream oos = append ?
//                new AppendableObjectOutputStream(new FileOutputStream(path, true)) :
//                new ObjectOutputStream(new FileOutputStream(path, true))) {
//            oos.writeObject(obj);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static <T> List<T> readAllObjects(String path) {
//        List<Student> students = new ArrayList<>();
//        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
//            while (true) {
//                T obj = (T) ois.readObject();
//                objects.add(obj);
//            }
//        } catch (EOFException e) {
//            // K?t thúc file
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return objects;
//    }
public static void main(String[] args) {
    // Thêm và in ra danh sách các ??i t??ng Student
    List<Student> students = new ArrayList<>();
    students.add(new Student(1, "Tôn"));
    students.add(new Student(2, "Tú"));

    // Ghi t?ng ??i t??ng Student vào file dùng ph??ng th?c writeObject.
    for (Student student : students) {
        writeObject("students.dat", student);
    }

    // ??c và in ra danh sách các ??i t??ng Student t? file
    List<Student> readStudents = readAllObjects("students.dat");
    System.out.println("Danh sách sinh viên:");
    for (Student student : readStudents) {
        System.out.printf("ID: %d | Tên: %s\n", student.id, student.name);
    }
}

    // Ph??ng th?c writeObject ?? ghi ??i t??ng vào file
    public static <T extends Serializable> void writeObject(String path, Student obj) {
        boolean append = new File(path).exists();
        try (ObjectOutputStream oos = append ?
                new AppendableObjectOutputStream(new FileOutputStream(path, true)) :
                new ObjectOutputStream(new FileOutputStream(path, true))) {
            oos.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Ph??ng th?c readAllObjects ?? ??c t?t c? các ??i t??ng t? file
    public static <T> List<T> readAllObjects(String path) {
        List<T> objects = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            while (true) {
                T obj = (T) ois.readObject();
                objects.add(obj);
            }
        } catch (EOFException e) {
            // K?t thúc file
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return objects;
    }
}


