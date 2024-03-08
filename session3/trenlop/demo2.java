import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] marks = new float[3];
        for (int i = 0; i < marks.length; i++) {
            System.out.println("nhập điểm thứ :"+(i+1));
            marks[i] = scanner.nextFloat();
        }
        float tongDiem = 0;
        for (float item : marks) {
            tongDiem = item + tongDiem;
        }
        System.out.println("diem trung bình là: "+tongDiem / marks.length);
        // tìm max trong mảng
        float max = marks[0];
        for (int i = 0; i < marks.length; i++) {
            if (max < marks[i]) {
                max = marks[i];
            }
        }
        System.out.println("điểm cao nhất là: "+max);



//        float diemTB = (marks[0] + marks[1] + marks[2]) / marks.length ;
//        System.out.println("điểm trung bình là: "+diemTB);

    }
}
