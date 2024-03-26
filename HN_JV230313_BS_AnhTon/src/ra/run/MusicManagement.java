package ra.run;


import ra.model.Singer;
import ra.model.Song;

import java.util.Scanner;

public class MusicManagement {
    private  static Scanner sc = new Scanner(System.in);
    private static final int MAX_SINGERS = 100;
    private static Singer[] singers = new Singer[MAX_SINGERS];
    private static int count = 0;

    private static final int MAX_SONGS = 100;
    private static Song[] songs = new Song[MAX_SONGS];
    private  static int count1 = 0;

    public static void main(String[] args) {


        int choice;

        do {
            System.out.println("******************MENU******************");
            System.out.println("1. Quản lý ca sĩ");
            System.out.println("2. Quản lý bài hát");
            System.out.println("3. Tìm kiếm bài hát");
            System.out.println("4. Thoát");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    menuSinger();
                    break;
                case 2:
                    MenuSong();
                    break;
                case 3:
                    searchMenu();
                    break;
                case 4:
                    System.exit(4);
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn từ 1 đến 7.");
            }
        } while (choice != 4);
    }





    public static void menuSinger() {

        int choice;
        do {
            System.out.println("******************MENU SINGER******************");
            System.out.println("1.Nhập vào số lượng ca sĩ cần thêm và nhập thông tin cần thêm mới");
            System.out.println("2.Hiển thị danh sách tất cả ca sĩ đã lưu trữ");
            System.out.println("3.Thay đổi thông tin ca sĩ theo mã id");
            System.out.println("4.Xóa ca sĩ theo mã id (kiểm tra xem nếu ca sĩ có bài hát thì không xóa được)\n");
            System.out.println("5. Thoát");
            System.out.println("Chọn chức năng (1-5): ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    inputSinger();
                    break;
                case 2:
                    displayAllSingers();
                    break;
                case 3:
                    updateSingerByCode();
                    break;
                case 4:
                    deleteSingerByCode();
                    break;
                case 5:
                    System.exit(5);
                    break;
                default:
                    System.out.println("lựa chọn không hợp lệ");

            }
        } while (choice != 5);

    }

    // nhập số lượng ca sĩ và thông tin cho từng ca sĩ cần thêm
    private static void inputSinger() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng ca sĩ muốn thêm:");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Mời nhập thông tin của ca sĩ thứ " + (i + 1));
            Singer newSinger = new Singer();
            newSinger.singerInputData();
            singers[count] = newSinger;
            count++;
        }
    }

    //hàm hiển thị ca sĩ
    private static void displayAllSingers() {
        if (count == 0) {
            System.out.println("Danh sách sách trống!");
            return;
        }

        for (int i = 0; i < count; i++) {
            singers[i].singerDisplayData();
        }
    }

    // hàm tìm kiếm vị trí theo mã
    private static int findSingerIndexByCode(int singerCode) {
        for (int i = 0; i < count; i++) {
            if (singers[i].getSingerId() == singerCode) {
                return i;
            }
        }
        return -1;
    }

    //hàm update ca sĩ
    private static void  updateSingerByCode() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã ca sĩ muốn thay đổi thông tin: ");
        int singerCode = sc.nextInt();

        int index = findSingerIndexByCode(singerCode);
        if (index == -1) {
            System.out.println("Không tìm thấy sách có mã " + singerCode + "!");
            return;
        }

        // Lấy thông tin mới cho ca sĩ
        singers[index].singerInputData();

        System.out.println("Cập nhật thông tin ca sĩ có mã " + singerCode + " thành công!");
    }

    // xóa ca sĩ theo mã id
    private static void deleteSingerByCode() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã ca sĩ muốn xóa: ");
        int singerCode = sc.nextInt();

        int index = findSingerIndexByCode(singerCode);
        if (index == -1) {
            System.out.println("Không tìm thấy sách có mã " + singerCode + "!");
            return;
        }

        // Di chuyển các phần tử sau phần tử cần xóa lên một vị trí
        for (int i = index; i < count - 1; i++) {
            singers[i] = singers[i + 1];
        }
    }
    public static void MenuSong () {

        int choice;
        do {
            System.out.println("******************MENU SONG******************");
            System.out.println("1.Nhập vào số lượng bài hát cần thêm và nhập thông tin cần thêm mới");
            System.out.println("2.Hiển thị danh sách tất cả bài hát đã lưu trữ");
            System.out.println("3.Thay đổi thông tin bài hát theo mã id");
            System.out.println("4.Xóa bài hát theo mã id \n");
            System.out.println("5. Thoát");
            System.out.println("Chọn chức năng (1-5): ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    inputSong();
                    break;
                case 2:
                    displayAllSongs();
                    break;
                case 3:
                   updateSongByCode();
                    break;
                case 4:
                    deleteSongByCode();
                    break;
                case 5:
                    System.exit(5);
                    break;
                default:
                    System.out.println("lựa chọn không hợp lệ");

            }
        } while (choice != 5);

    }

    // nhập số lượng bài hát và thông tin cho từng bài hát cần thêm
    private static void inputSong() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng bài hát muốn thêm:");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Mời nhập thông tin của bài hát thứ " + (i + 1));
            Song newSong = new Song();
            newSong.songInputData();
            songs[count1] = newSong;
            count1++;
        }
    }

    //hàm hiển thị bài hát
    private static void displayAllSongs() {
        if (count1 == 0) {
            System.out.println("Danh sách sách trống!");
            return;
        }

        for (int i = 0; i < count1; i++) {
            songs[i].songDisplayData();
        }
    }

    // hàm tìm kiếm vị trí theo mã
    private static int findSongIndexByCode(int songCode) {
        for (int i = 0; i < count1; i++) {
            if (songs[i].getSongId().equals(songCode)) {
                return i;
            }
        }
        return -1;
    }

    //hàm update bài hát
    private static void  updateSongByCode() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã bài hát muốn thay đổi thông tin: ");
        int songCode = sc.nextInt();

        int index = findSongIndexByCode(songCode);
        if (index == -1) {
            System.out.println("Không tìm thấy sách có mã " + songCode + "!");
            return;
        }

        // Lấy thông tin mới cho bài hát
        songs[index].songInputData();

        System.out.println("Cập nhật thông tin ca sĩ có mã " + songCode + " thành công!");
    }

    // xóa bài hát theo mã id
    private static void deleteSongByCode() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã bài hát muốn xóa: ");
        int songCode = sc.nextInt();

        int index = findSongIndexByCode(songCode);
        if (index == -1) {
            System.out.println("Không tìm thấy sách có mã " + songCode + "!");
            return;
        }

        // Di chuyển các phần tử sau phần tử cần xóa lên một vị trí
        for (int i = index; i < count - 1; i++) {
            songs[i] = songs[i + 1];
        }

    }
    public static void searchMenu () {
        int choice;
        do {
            System.out.println("*********************SEARCH-MANAGEMENT************************");
            System.out.println("1. Tìm kiếm bài hát theo tên ca sĩ hoặc thể loại");
            System.out.println("2. Tìm kiếm ca sĩ theo tên hoặc thể loại");
            System.out.println("3. Hiển thị danh sách bài hát theo thứ tự tên tăng dần");
            System.out.println("4. Hiển thị 10 bài hát được đăng mới nhất");
            System.out.println("5. Thoát");
            System.out.println("Lựa chọn của bạn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    searchSongBySingerOrGenre();
                    break;
                case 2:
                    searchSingerByNameOrGenre();
                    break;
                case 3:
                    songDcreased();
                    break;
                case 4:
                    displayNewestSong();
                    break;
                case 5:
                    System.exit(5);
                    break;
                default:
                    System.out.println("lựa chọn không hợp lệ");

            }
        } while (choice != 5);

    }
    //tìm kiếm bài hát theo tên ca sĩ hoặc thể loại
    private static void searchSongBySingerOrGenre() {
        System.out.println("Nhập tên ca sĩ hoặc thể loại: ");
        String keyword = sc.nextLine();
        for (int i = 0; i < songs.length; i++) {
            if (songs[i].getSinger().getSingerName().equals(keyword) || songs[i].getSongId().equals(keyword)) {
                songs[i].songDisplayData();
            }
        }
    }
    //tìm kiếm ca sĩ theo tên hoặc thể loại
    public static void searchSingerByNameOrGenre () {
        System.out.println("Nhập tên ca sĩ hoặc thể loại: ");
        String keyword = sc.nextLine();
        for (int i = 0; i < singers.length; i++) {
            if (singers[i].getSingerName().equals(keyword) || singers[i].getGenre().equals(keyword)) {
                singers[i].singerDisplayData();
            }
        }
    }
    //hiển thị danh sách bài hát theo thứ tự tăng dần
    public static void songDcreased () {
        for (int i = songs.length-1; i >= 0 ; i--) {
            for (int j = i+1; j < songs.length ; j++) {
                
            }
        }
    }
    //hiển thị 10 bài hát được đăng mới nhất
    public static void displayNewestSong(){
        if (songs.length<=10) {
            for (int i = 0; i < songs.length; i++) {
                songs[i].songDisplayData();
            }
        } else {
            Song[] clone = songs.clone();
            for (int i = songs.length-1; i >= 0; i--) {
                for (int j = i+1; j < songs.length; j++) {
                    if (clone[i].getCreateDate().getTime()<clone[j].getCreateDate().getTime()) {
                        Song tg = clone[i];
                        clone[i]=clone[j];
                        clone[j]=tg;
                    }
                }
            }
            for (int i = 0; i < 10; i++) {
                clone[i].songDisplayData();
            }
        }
    }
}





