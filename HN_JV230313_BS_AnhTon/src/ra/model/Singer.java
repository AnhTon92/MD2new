package ra.model;

import java.util.Scanner;

public class Singer {
    private int singerId;
    private String singerName;
    private int age;
    private String nationality;
    private boolean gender;
    private String genre;
    //Constructors
    public Singer () {

    }
    public Singer(int singerId, String singerName, int age, String nationality, boolean gender, String genre) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.age = age;
        this.nationality = nationality;
        this.gender = gender;
        this.genre = genre;
    }
    //Getter và Setter

    public int getSingerId() {
        return singerId;
    }

    public void setSingerId(int singerId) {
        this.singerId = singerId;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    // Phương thức nhập dữ liệu
    public void singerInputData() {
        Scanner sc = new Scanner(System.in);
        // nhập tên
        System.out.println("nhập tên ca sĩ: ");
        singerName = sc.nextLine();
        while (singerName.length() <= 0) {
            System.out.println("tên ca sĩ không được để trống, mời nhập lại: ");
            singerName = sc.nextLine();
            break;
        }
        //nhập tuổi
        System.out.println("nhập tuổi ca sĩ: ");
        age = Integer.parseInt(sc.nextLine());
        while (age <= 0) {
            System.out.println("tuổi phải lớn hơn 0, mời nhập lại");
            break;
        }
        //nhập quốc tịch
        System.out.println("nhập quốc tịch của ca sĩ:");
        nationality = sc.nextLine();
        while (nationality.length() <= 0) {
            System.out.println("không được để trống quốc tịch ca sĩ, nhập lại: ");
            break;
        }
        // nhập giới tính
        System.out.println("nhập giới tính ca sĩ (true-Nam/false-Nữ): ");
        gender = Boolean.parseBoolean(sc.nextLine());

        // nhập thể loại
        System.out.println("nhập thể loại âm nhạc của ca sĩ: ");
        genre = sc.nextLine();
        while (genre.length()<= 0) {
            System.out.println("không được để trống thể loại âm nhạc của ca sĩ, mời nhập lại");
            break;
        }
    }
    // Phương thức hiển thị dữ liệu
    public void singerDisplayData() {
        System.out.println("-----------------------------------");
        System.out.println("Mã ca sĩ: " + singerId);
        System.out.println("Tên ca sĩ: " + singerName);
        System.out.println("Tuổi ca sĩ: " + age);
        System.out.println("Quốc tịch ca sĩ: " + nationality);
        System.out.println("Giới tính ca sĩ: " + (gender ? "Nam" : "Nữ"));
        System.out.println("Thể loại ca sĩ: " + genre);
        System.out.println("-----------------------------------");
    }

}

