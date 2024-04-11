package bussiness.run.admin;

import bussiness.config.Config;
import bussiness.config.Validate;
import bussiness.entity.Users;
import presentation.LoginMain;

import java.util.List;

import static bussiness.config.Color.*;

public class MenuAdmin {
    static  Config<Users> config = new Config<>();
    public static List<Object> userLogin;
    static {
        userLogin = Config.readData(Config.URL_USER_LOGIN);
    }
    private static MenuAdmin menuAdmin = new MenuAdmin();

    public static MenuAdmin getInstance() {
        return menuAdmin;
    }

    private MenuAdmin() {

    }

    public void displayMenuAdmin() {
        int choice = 0;
        while (choice != 8) {
            System.out.println(YELLOW_BOLD_BRIGHT + ".----------------------------------------------------------------------.");
            System.out.printf("|  QUIZIZZ   ADMINISTATION                  Xin chào, " + BLUE_BOLD_BRIGHT + "%-13s " + YELLOW_BOLD_BRIGHT + "|\n" + RESET);
            System.out.println(YELLOW_BOLD_BRIGHT + "|----------------------------QUIZIZZ   MANAGEMENT---------------------------|");
            System.out.println("|" + RESET + "                        " + WHITE_BOLD_BRIGHT + "[1] Hiển thị danh sách toàn bộ người dùng                        " + YELLOW_BOLD_BRIGHT + "|");
            System.out.println("|" + RESET + "                        " + WHITE_BOLD_BRIGHT + "[2] Khóa/mở người dùng theo tên                         " + YELLOW_BOLD_BRIGHT + "|");
            System.out.println("|" + RESET + "                        " + WHITE_BOLD_BRIGHT + "[3] Tìm kiếm thông tin người dùng theo tên                                 " + YELLOW_BOLD_BRIGHT + "|");
            System.out.println("|" + RESET + "                        " + WHITE_BOLD_BRIGHT + "[4] Thống kê danh sách người dự thi                                 " + YELLOW_BOLD_BRIGHT + "|");
            System.out.println("|" + RESET + "                        " + WHITE_BOLD_BRIGHT + "[5] Thống kê danh sách bài thi                                 " + YELLOW_BOLD_BRIGHT + "|");
            System.out.println("|" + RESET + "                        " + WHITE_BOLD_BRIGHT + "[6] Thống kê điểm thi trung bình theo tháng                                " + YELLOW_BOLD_BRIGHT + "|");
            System.out.println("|" + RESET + "                        " + WHITE_BOLD_BRIGHT + "[7] Thống kê top 10 bạn có điểm thi cao nhất trong tháng                                 " + YELLOW_BOLD_BRIGHT + "|");
            System.out.println("|" + RESET + "                        " + WHITE_BOLD_BRIGHT + "[8] Đăng xuất                                " + YELLOW_BOLD_BRIGHT + "|");
            System.out.println("'----------------------------------------------------------------------'" + RESET);
            System.out.print(WHITE_BOLD_BRIGHT + "Nhập lựa chọn : ");
            choice = Validate.validateInt();
            switch (choice) {
                case 1:

                    break;
                case 2:

                    break;
                     case 3:

                    break;
                     case 4:

                    break;
                     case 5:

                    break;
                     case 6:

                    break;
                     case 7:

                    break;


                case 8:
                    new Config<Users>().writeFile(Config.URL_USER_LOGIN, null);
                    System.out.println(GREEN_BOLD_BRIGHT + "Đăng xuất thành công !" + RESET);
                    new LoginMain();
                    break;
                default:
                    System.out.println(RED_BOLD_BRIGHT + "Không hợp lệ, vui lòng nhập lại." + RESET);
            }
        }
    }
}

