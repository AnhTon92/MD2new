package iofile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
//    public static void main(String[] args) {
//        // Th�m v� in ra danh s�ch c�c ??i t??ng Object
//        List<Object> objects = new ArrayList<>();
//        List<Student> students = new ArrayList<>();
//        objects.add(new Student(1, "T�n"));
//        objects.add(new Student(2, "T�"));
//    // ghi t?ng ??i t??ng Object v�o file d�ng ph??ng th?c writeObject.
//        for (Object obj : objects) {
//            writeObject("objects.dat", obj);
//        }
//        // d�ng List readObject ?? ??c v� in ra danh s�ch c�c ??i t??ng Object t? file
//        List<Object> readObjects = readAllObjects("objects.dat");
//        for (Object obj : readObjects) {
//            System.out.println(obj);
//        }
//        //in ra
//        System.out.println("Danh s�ch sinh vi�n:");
//
//    }
//// ph??ng th?c writeObject ?? ghi ??i t??ng v�o file
//    public static <T extends Serializable> void writeObject(String path, Object obj ) {
//        // Ki?m tra file t?n t?i ?? quy?t ??nh s? d?ng stream lo?i n�o
//        // ??t bi?n append ?? check t?n t?i g�n m?c ??nh l� ?� t?n t?i (true)
//        boolean append = new File(path).exists();// ??t v�o try-catch, n?u append ?� t?n t?i th� ch?y
//        // ph??ng th?c ? class AppendableObjectOutputStream(in ra kh�ng ghi ?� m� ch�n v�o sau ph?n th�n c?a stream) n?u ch?a th� in ra b�nh th??ng (ghi ?�)
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
//            // K?t th�c file
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return objects;
//    }
public static void main(String[] args) {
    // Th�m v� in ra danh s�ch c�c ??i t??ng Student
    List<Student> students = new ArrayList<>();
    students.add(new Student(1, "T�n"));
    students.add(new Student(2, "T�"));

    // Ghi t?ng ??i t??ng Student v�o file d�ng ph??ng th?c writeObject.
    for (Student student : students) {
        writeObject("students.dat", student);
    }

    // ??c v� in ra danh s�ch c�c ??i t??ng Student t? file
    List<Student> readStudents = readAllObjects("students.dat");
    System.out.println("Danh s�ch sinh vi�n:");
    for (Student student : readStudents) {
        System.out.printf("ID: %d | T�n: %s\n", student.id, student.name);
    }
}

    // Ph??ng th?c writeObject ?? ghi ??i t??ng v�o file
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

    // Ph??ng th?c readAllObjects ?? ??c t?t c? c�c ??i t??ng t? file
    public static <T> List<T> readAllObjects(String path) {
        List<T> objects = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            while (true) {
                T obj = (T) ois.readObject();
                objects.add(obj);
            }
        } catch (EOFException e) {
            // K?t th�c file
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return objects;
    }
}


