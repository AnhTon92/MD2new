package bussiness.run.teacher;
import bussiness.config.Config;
import bussiness.config.InputMethods;
import bussiness.config.Validate;
import bussiness.design.IExamService;
import bussiness.designImpl.AuthenService;
import bussiness.designImpl.CatalogServiceImpl;
import bussiness.designImpl.ExamServiceImpl;
import bussiness.entity.Catalog;
import bussiness.entity.Exam;
import bussiness.entity.Question;
import bussiness.entity.Users;
import presentation.LoginMain;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import static bussiness.config.Color.*;

public class MenuTeacher {
    IExamService examService = new ExamServiceImpl();
    public void displayMenuTeacher() {
        int choice = 0;
        while (choice != 6) {
            System.out.println(YELLOW_BOLD_BRIGHT + ".----------------------------------------------------------------------.");
            System.out.printf("|  QUIZIZZ   ADMINISTATION      Xin chào, " + BLUE_BOLD_BRIGHT + "%-13s " + YELLOW_BOLD_BRIGHT + "|\n" + RESET);
            System.out.println(YELLOW_BOLD_BRIGHT + "|----------------------------QUIZIZZ   MANAGEMENT---------------------------|");
            System.out.println("|" + RESET + "" + WHITE_BOLD_BRIGHT + "[1] Hiển thị danh sách đề thi                       " + YELLOW_BOLD_BRIGHT + "|");
            System.out.println("|" + RESET + "" + WHITE_BOLD_BRIGHT + "[2] Thêm mới đề thi                        " + YELLOW_BOLD_BRIGHT + "|");
            System.out.println("|" + RESET + "" + WHITE_BOLD_BRIGHT + "[3] Chỉnh sửa đề thi                                 " + YELLOW_BOLD_BRIGHT + "|");
            System.out.println("|" + RESET + "" + WHITE_BOLD_BRIGHT + "[4] Xóa đề thi                                 " + YELLOW_BOLD_BRIGHT + "|");
            System.out.println("|" + RESET + "" + WHITE_BOLD_BRIGHT + "[5] Thống kê kết quả thi của người dự thi                                 " + YELLOW_BOLD_BRIGHT + "|");
            System.out.println("|" + RESET + "" + WHITE_BOLD_BRIGHT + "[6] Đăng xuất                                 " + YELLOW_BOLD_BRIGHT + "|");
            System.out.println("'----------------------------------------------------------------------'" + RESET);
            System.out.print(WHITE_BOLD_BRIGHT + "Nhập lựa chọn : ");
            choice = Validate.validateInt();
            switch (choice) {
                case 1:
                       examService.findAll().forEach(exam -> exam.displayData(AuthenService.usersList));
                    break;
                case 2:
                        addNewExam();
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;


                case 6:
                    new Config<Users>().writeFile(Config.URL_USER_LOGIN, null);
                    System.out.println(GREEN_BOLD_BRIGHT + "Đăng xuất thành công !" + RESET);
                    new LoginMain();
                    break;
                default:
                    System.out.println(RED_BOLD_BRIGHT + "Không hợp lệ, vui lòng nhập lại." + RESET);
            }
        }
    }

    public void addNewExam() {

        Exam exam = new Exam();
        exam.setExamId(examService.getNewId());
        Users users = Config.readDataLogin(Config.URL_USER_LOGIN);
        exam.setUserId(users.getUserId());
        exam.setDescription(InputMethods.getString());
        exam.setDuration(InputMethods.getLong());
        exam.setCreatedAt(new Date());
        exam.setStatus(true);
        exam.setCategories(getCatalogForExam());
        exam.setListQuestion(getListQuestionForExam());
    }

    public List<Question> getListQuestionForExam() {
    List<Question>
    }

    public List<Catalog> getCatalogForExam() {
        List<Catalog> catalogList = new ArrayList<>();
        int choice;
        do {
            System.out.println("==============================EXAM CATALOG================================");
            System.out.println("[1]. Chọn loại danh mục cho bài thi: ");
            System.out.println("[2]. Thoát: ");
            System.out.println("Xin mời lựa chọn: ");
            choice = InputMethods.getInteger();
            switch (choice) {
                case 1:
                   while (true){
                       System.out.println("Danh sách danh mục: ");
                       for (int i = 0; i < CatalogServiceImpl.catalogList.size(); i++) {
                           Catalog catalog = CatalogServiceImpl.catalogList.get(i);
                           System.out.println((i + 1) + ". ID: " + catalog.getCatalogId() + ", Tên: " + catalog.getCatalogName());
                       }
                       System.out.println("Vui lòng lựa chọn ID danh mục bạn muốn thêm");
                       String choiceID = InputMethods.getString();
                       Catalog catalog = CatalogServiceImpl.catalogList.stream().filter(item -> item.getCatalogId().equals(choiceID))
                               .findFirst().orElse(null);
                       if (catalog == null){
                           System.out.println("Không tìm thấy. Mời nhập lại: ");
                       } else {
                           catalogList.add(catalog);
                           break;
                       }
                   }
                   break;
                case 2:
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }

        }while (choice!= 2);
        return catalogList;
    }
}
