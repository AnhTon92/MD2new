package baitap.bai15.business.entity;

public class Student {
    int StudentId;
    String name;
    double averageScore;

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageScore() {
        return averageScore;
    }
    public Student(int i, String nguyễnVănA, double v) {
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                ", name='" + name + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }
}
