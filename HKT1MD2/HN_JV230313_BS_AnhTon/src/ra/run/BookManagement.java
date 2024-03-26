package ra.run;

import ra.bussiness.Book;

import java.util.Scanner;

public class BookManagement {

    private static final int MAX_BOOKS = 100;
    private Book[] books = new Book[MAX_BOOKS];
    private int countBooks = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookManagement bm = new BookManagement();
        int choice;

        do {
            System.out.println("******************MENU******************");
            System.out.println("1. Nhập số lượng sách thêm mới và nhập thông tin cho từng cuốn sách");
            System.out.println("2. Hiển thị thông tin tất cả sách trong thư viện");
            System.out.println("3. Sắp xếp sách theo lợi nhuận tăng dần");
            System.out.println("4. Xóa sách theo mã sách");
            System.out.println("5. Tìm kiếm tương đối sách theo tên sách hoặc mô tả");
            System.out.println("6. Thay đổi thông tin sách theo mã sách");
            System.out.println("7. Thoát");
            System.out.println("Chọn chức năng (1-7): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    bm.inputBooks();
                    break;
                case 2:
                    bm.displayAllBooks();
                    break;
                case 3:
                    bm.sortBooksByProfit();
                    break;
                case 4:
                    bm.deleteBookByCode();
                    break;
                case 5:
                    bm.searchBooksByTitleOrDescription();
                    break;
                case 6:
                    bm.updateBookByCode();
                    break;
                case 7:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn từ 1 đến 7.");
            }
        } while (choice != 7);
    }

    // Hàm nhập số lượng sách và thông tin cho từng cuốn sách
    private void inputBooks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng sản phẩm muốn thêm thông tin");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++)
        {
            System.out.println("Mời nhập thông tin của sách thứ " + (i + 1));
            Book newBook = new Book();
            newBook.inputData();
            books[countBooks] = newBook;
            countBooks++;
        }

    }

    // Hàm hiển thị thông tin tất cả sách
    private void displayAllBooks() {
        if (countBooks == 0) {
            System.out.println("Danh sách sách trống!");
            return;
        }

        for (int i = 0; i < countBooks; i++) {
            books[i].displayData();
        }
    }

    // Hàm sắp xếp sách theo lợi nhuận tăng dần
    private void sortBooksByProfit() {
        for (int i = 0; i < countBooks - 1; i++) {
            for (int j = i + 1; j < countBooks; j++) {
                if (books[i].getInterest() > books[j].getInterest()) {
                    Book temp = books[i];
                    books[i] = books[j];
                    books[j] = temp;
                }
            }
        }

        System.out.println("Sắp xếp sách theo lợi nhuận thành công!");
        displayAllBooks();
    }

    // hàm tìm kiếm vị trí sách theo mã sách
    private int findBookIndexByCode(int bookCode) {
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getBookId() == bookCode) {
                return i;
            }
        }
        return -1;
    }

    // Hàm xóa sách theo mã sách
    private void deleteBookByCode() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sách muốn xóa: ");
        int bookCode = sc.nextInt();

        int index = findBookIndexByCode(bookCode);
        if (index == -1) {
            System.out.println("Không tìm thấy sách có mã " + bookCode + "!");
            return;
        }

        // Di chuyển các phần tử sau phần tử cần xóa lên một vị trí
        for (int i = index; i < countBooks - 1; i++) {
            books[i] = books[i + 1];
        }

// Giảm số lượng sách sau khi xóa
        countBooks--;

        System.out.println("Xóa sách có mã " + bookCode + " thành công!");
    }
    // hàm tìm kiếm sách theo tên hoặc mô tả
    private void searchBooksByTitleOrDescription() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên hoặc mô tả sách muốn tìm kiếm: ");
        String keyword = sc.nextLine();

        // Duyệt qua tất cả các sách
        for (int i = 0; i < countBooks; i++) {
            // So sánh tên và mô tả với từ khóa tìm kiếm
            if (books[i].getBookName().contains(keyword) || books[i].getDescriptions().contains(keyword)) {
                books[i].displayData();
            }
        }

        // Thông báo nếu không tìm thấy sách nào
        if (countBooks == 0) {
            System.out.println("Không tìm thấy sách nào phù hợp với từ khóa " + keyword + "!");
        }
    }
    //hàm update thông tin sách theo mã
    private void updateBookByCode() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sách muốn thay đổi thông tin: ");
        int bookCode = sc.nextInt();

        int index = findBookIndexByCode(bookCode);
        if (index == -1) {
            System.out.println("Không tìm thấy sách có mã " + bookCode + "!");
            return;
        }

        // Lấy thông tin mới cho sách
      books[index]. inputData();

        System.out.println("Cập nhật thông tin sách có mã " + bookCode + " thành công!");
    }


}
