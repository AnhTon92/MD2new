import java.util.Scanner;

public class bt5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("nhập điểm Toán: ");
            int mathPoint = Integer.parseInt(scanner.nextLine());
            System.out.println("nhập điểm Lý: ");
            int physicPoint = Integer.parseInt(scanner.nextLine());
            System.out.println("nhập điểm Hóa: ");
            int chemicalPoint = Integer.parseInt(scanner.nextLine());
            System.out.println("nhập điểm Văn: ");
            int literaturePoint = Integer.parseInt(scanner.nextLine());
            System.out.println("nhập điểm Anh: ");
            int englishPoint = Integer.parseInt(scanner.nextLine());
            int averagePoint = (mathPoint + physicPoint + chemicalPoint + literaturePoint + englishPoint) / 5;
            if (mathPoint >= 0 && mathPoint <= 10 && physicPoint >= 0 && physicPoint <= 10 &&
                    chemicalPoint >= 0 && chemicalPoint <= 10 && literaturePoint >= 0 && literaturePoint <= 10 &&
                    englishPoint >= 0 && englishPoint <= 10) {
                System.out.println("điểm trung bình là " + averagePoint);
                if (averagePoint >= 0 && averagePoint < 5) {
                    System.out.println("xếp loại yếu");
                } else if (averagePoint >= 5 && averagePoint < 6.5) {
                    System.out.println("xếp loại trung bình");
                } else if (averagePoint >= 6.5 && averagePoint < 8) {
                    System.out.println("xếp loại khá");
                } else if (averagePoint >= 8 && averagePoint < 9) {
                    System.out.println("xếp loại giỏi");
                } else {
                    System.out.println("xếp loại xuất sắc");
                }
                break;
            } else {
                System.out.println("nhập lại đúng số điểm:");
            }

        }
    }
}
