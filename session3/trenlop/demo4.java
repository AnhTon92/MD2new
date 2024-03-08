import java.util.Scanner;

public class demo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row,col;
        System.out.println("Mời nhập vào số hàng ");
        row = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời nhập vào số côt ");
        col = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[row][col];
        do {
            System.out.println("========== MENU===========\n" +
                    "1 Nhập giá trị cho tất cả phần tử mảng \n" +
                    "2 In các phần tử của mảng dưới dạng ma trận\n" +
                    "3 In ra đường chéo chính \n" +
                    "4 In ra đường chéo phụ (phải là ma trận vuông)\n" +
                    "5 In ra đường viền \n"+
                    "6 Thoat");
            System.out.println("Moi ban chon 1- 7");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                            System.out.printf("array[%d][%d] = ",i,j);
                            arr[i][j] = Integer.parseInt(scanner.nextLine());
                        }
                    }

                case 2:
                    System.out.println("IN dưới ma trận :");
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                            System.out.printf("%-3d",arr[i][j]);
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Đường chéo chính :");
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                            if(i==j){
                                System.out.printf("%-3d",arr[i][j]);
                            } else {
                                System.out.printf("%-3s","");
                            }

                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    if(row == col){
                        System.out.println("Đường chéo phụ :");
                        for (int i = 0; i < arr.length; i++) {
                            for (int j = 0; j < arr[i].length; j++) {
                                if(i+j== arr.length - 1){
                                    System.out.printf("%-3d",arr[i][j]);
                                } else {
                                    System.out.printf("%-3s","");
                                }

                            }
                            System.out.println();
                        }
                    } else {
                        System.out.println("Chéo phụ chỉ dành cho ma trận vuông thôi");
                    }

                    break;
                case 5:
                    System.out.println("Đường biên:");
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                            if(i==0 || j==0 || j== col-1 || i == row -1){
                                System.out.printf("%-3d",arr[i][j]);
                            } else {
                                System.out.printf("%-3s","");
                            }

                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    System.out.println("Thoát chương trình");
                default:
                    System.out.println("lỗi");
            }
        } while (true);
    }
}