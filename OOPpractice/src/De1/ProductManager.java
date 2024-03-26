package De1;

import java.util.Scanner;

public class ProductManager {
    private static Product[] arrProduct;
    private static int n;

    public ProductManager() {
        arrProduct = new Product[100];



    public void menu() {
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("***********************MENU**************************");
            System.out.println("1. Nhập thông tin cho n sản phẩm (n nhập từ bàn phím)");
            System.out.println("2. Hiển thị thông tin các sản phẩm");
            System.out.println("3. Tính lợi nhuận các sản phẩm");
            System.out.println("4. Sắp xếp các sản phẩm theo lợi nhuận giảm dần");
            System.out.println("5. Thống kê các sản phẩm theo khoảng giá bán");
            System.out.println("6. Tìm các sản phẩm theo tên sản phẩm");
            System.out.println("7. Nhập sản phẩm");
            System.out.println("8. Bán sản phẩm");
            System.out.println("9. Cập nhật trạng thái sản phẩm theo mã SP");
            System.out.println("10. Xóa theo mã SP");
            System.out.println("0. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    nhapThongTinSanPham(scanner);
                    break;
                case 2:
                    hienThiThongTinSanPham();
                    break;
                case 3:
                    tinhLoiNhuanSanPham();
                    break;
                case 4:
                    sapXepSanPhamTheoLoiNhuanGiamDan();
                    break;
                case 5:
                    thongKeSanPhamTheoKhoangGiaBan();
                    break;
                case 6:
                    timSanPhamTheoTenSanPham();
                    break;
                case 7:
                    nhapSanPham();
                    break;
                case 8:
                    banSanPham();
                    break;
                case 9:
                    capNhatTrangThaiSanPhamTheoMaSP();
                    break;
                case 10:
                    xoaTheoMaSP();
                    break;
                case 0:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);
    }

    // Các chức năng
    private void nhapThongTinSanPham(Scanner scanner) {
        System.out.print("Nhập số lượng sản phẩm: ");
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sản phẩm thứ " + (i + 1));
            arrProduct[i] = new Product();
            arrProduct[i].inputData(scanner, arrProduct);
        }
    }

    private void hienThiThongTinSanPham() {
        if (n == 0) {
            System.out.println("Danh sách sản phẩm rỗng!");
            return;
        }
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.printf("|%-10s|%-25s|%10s|%10s|%10s|%5s|%-20s|%s|\n", "Mã SP", "Tên SP", "Giá nhập", "Giá xuất",
                "Lợi nhuận", "Số lượng", "Mô tả", "Trạng thái");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        for (int i = 0; i < n; i++) {
            arrProduct[i].displayData();
        }
    }

    private void tinhLoiNhuanSanPham() {
        for (int i = 0; i < n; i++) {
            arrProduct[i].calProfit();
        }
        System.out.println("Tính toán lợi nhuận thành công!");
    }

    public static void sapXepSanPhamTheoLoiNhuanGiamDan() {
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arrProduct[j].getProfit() > arrProduct[i].getProfit()) {
                    maxIndex = j;
                }
            }
            Product temp = arrProduct[i];
            arrProduct[i] = arrProduct[maxIndex];
            arrProduct[maxIndex] = temp;
        }
        System.out.println("Đã sắp xếp sản phẩm theo profit giảm dần.");
    }

    public static void thongKeSanPhamTheoKhoangGiaBan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá thấp nhất trong khoảng giá bán: ");
        float fromExportPrice = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập giá cao nhất trong khoảng giá bán: ");
        float toExportPrice = Float.parseFloat(scanner.nextLine());
        System.out.println("Sản phẩm trong khoảng giá bán từ " + fromExportPrice + " đến " + toExportPrice + " là:");
        boolean checkExportPrice = false;
        for (int i = 0; i < n; i++) {
            if (arrProduct[i].getExportPrice() >= fromExportPrice && arrProduct[i].getImportPrice() <= toExportPrice) {
                arrProduct[i].displayData();
                checkExportPrice = true;
            }
        }
        if (!checkExportPrice) {
            System.out.println("Không có sản phẩm trong khoảng giá bán từ " + fromExportPrice + " đến " + toExportPrice);
        }
    }

    public static void timSanPhamTheoTenSanPham() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên sản phầm cần tìm:");
        String inputName = scanner.nextLine();
        boolean checkName = false;
        for (int i = 0; i < n; i++) {
            if (arrProduct[i].getProductName().equals(inputName)) {
                arrProduct[i].displayData();
                checkName = true;
            }
        }
        if (!checkName) {
            System.out.println("Không co sản phẩm với tên cần tìm");
        }
    }

    public static void nhapSanPham() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sản phầm :");
        String inputProductID = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < n; i++) {
            if (arrProduct[i].getProductid().equals(inputProductID)) {
                check = true;
                System.out.println("Nhập số lượng cần them:");
                int addQuantity = Integer.parseInt(scanner.nextLine());
                arrProduct[i].setQuantity(arrProduct[i].getQuantity() + addQuantity);
                System.out.println("Số lượng sản phẩm đã được cập nhật thành công.");
                break;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy sản phẩm với mã sản phẩm đã nhập.");
        }
    }

    public static void banSanPham() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sản phầm :");
        String inputProductName = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < n; i++) {
            if (arrProduct[i].getProductName().equals(inputProductName)) {
                check = true;
                if (arrProduct[i].isStatus()) {
                    System.out.println("Nhập số lượng sản phẩm cần bán:");
                    int soldQuantity = Integer.parseInt(scanner.nextLine());
                    if (soldQuantity <= arrProduct[i].getQuantity()) {
                        arrProduct[i].setQuantity(arrProduct[i].getQuantity() - soldQuantity);
                        System.out.println("Sản phẩm dã bán thành công");
                    } else {
                        System.out.println("Số lượng sp bán vuot qua số lượng sp hiện có");
                    }
                } else {
                    System.out.println("Sản phẩm không còn bán");
                }
            }
        }
        if (!check) {
            System.out.println("Không có tên sản phẩm ");
        }
    }

    public static void capNhatTrangThaiSanPhamTheoMaSP() {
        boolean checkID = false;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập mã sản phẩm (độ dài 4 ký tự, bắt đầu bằng 'P'): ");
            String inputProductId = scanner.nextLine();
            if (inputProductId.length() == 4 && inputProductId.charAt(0) == 'P') {
                checkID = true;
                boolean check = false;
                for (int i = 0; i < n; i++) {
                    if (arrProduct[i].getProductid().equals(inputProductId)) {
                        check = true;
                        if (arrProduct[i].isStatus()) {
                            arrProduct[i].setStatus(false);
                            System.out.println("Đã cập nhật trạng thái mã (" + inputProductId + ") chuyển sang : Chưa bán");
                        } else {
                            arrProduct[i].setStatus(true);
                            System.out.println("Đã cập nhật trạng thái mã (" + inputProductId + ") chuyển sang : Đang bán");
                        }
                        break;
                    }
                }
                if (!check) {
                    System.out.println("Mã sản phẩm không có ");
                }
            } else {
                System.out.println("Mã sản phẩm không hợp lệ. Vui lòng nhập lại.");
            }
        } while (!checkID);
    }

    public static void xoaTheoMaSP() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm cần xóa:");
        String delProductId = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < n; i++) {
            if (arrProduct[i].getProductid().equals(delProductId)) {
                check = true;
                for (int j = i; j < n - 1; j++) {
                    arrProduct[j] = arrProduct[j + 1];
                }
                n--;
                System.out.println("Đã xóa sản phẩm có mã: " + delProductId);
                break;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy sản phẩm có mã: " + delProductId);
        }
    }

}}

