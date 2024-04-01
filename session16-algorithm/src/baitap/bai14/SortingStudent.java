package baitap.bai14;

public class SortingStudent {
    // Sắp xếp chèn
    public static void insertionSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getScore() < key.getScore()) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = key;
        }
    }

    // Sắp xếp chọn
    public static void selectionSort(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < students.length; j++) {
                if (students[j].getScore() > students[maxIndex].getScore()) {
                    maxIndex = j;
                }
            }
            Student temp = students[maxIndex];
            students[maxIndex] = students[i];
            students[i] = temp;
        }
    }

    // Sắp xếp nổi bọt
    public static void bubbleSort(Student[] students) {
        boolean swapped;
        for (int i = 0; i < students.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].getScore() < students[j + 1].getScore()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
