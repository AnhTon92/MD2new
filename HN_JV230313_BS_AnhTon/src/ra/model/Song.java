package ra.model;

import java.util.Date;
import java.util.Scanner;

public class Song {
    private String songId;
    private String songName;
    private String descriptions;
    private Singer singer;
    private String songWriter;
    private Date createDate;
    private boolean songStatus;

    //Constructors
    public Song() {
    }

    public Song(String songId, String songName, String descriptions, Singer singer, String songWriter, Date createDate, boolean songStatus) {
        this.songId = songId;
        this.songName = songName;
        this.descriptions = descriptions;
        this.singer = singer;
        this.songWriter = songWriter;
        this.createDate = new Date();
        this.songStatus = songStatus;
    }
    //getter và setter

    public String getSongId() {
        return songId;
    }

    public void setSongId(String songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Singer getSinger() {
        return singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    public String getSongWriter() {
        return songWriter;
    }

    public void setSongWriter(String songWriter) {
        this.songWriter = songWriter;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public boolean isSongStatus() {
        return songStatus;
    }

    public void setSongStatus(boolean songStatus) {
        this.songStatus = songStatus;
    }

    //Phương thức nhập
    public void songInputData(Singer singer[],int length) {
        Scanner sc = new Scanner(System.in);
        //nhập mã bài hát
        do {
            System.out.println("nhập mã bài hát (SXXX): ");
            songId = sc.nextLine();

        } while (!validateSongid(songId));
        //nhập tên bài hát

        System.out.println("nhập tên bài hát: ");
        songName = sc.nextLine();
        while (songName.length() <= 0) {
            System.out.println("tên bài hát không được để trống mời nhập lại");
            break;
        }
        //nhập mô tả
        System.out.println("nhập mô tả bài hát");
        descriptions = sc.nextLine();
        //nhập ca sĩ
        System.out.println("mời lựa chọn ca sĩ theo danh sách: ");
        for (int i = 0; i < length; i++) {
            System.out.println((i+1)+"."+singer[i].getSingerName());
        }

        System.out.println("nhập ca sĩ trình bày: ");
        int choice= Integer.parseInt(sc.nextLine());
        if (choice >1 && choice<= length ){

            this.singer = singer[choice-1];

        }else {
            System.out.println("không tồn tại");
            return;
        }


            //nhập tác giả
            System.out.println("nhập tác giả bài hát: ");
            songWriter = sc.nextLine();
            while (songWriter.length() <= 0) {
                System.out.println("tên tác giả không được để trống, mời nhập lại");
                break;
            }
            // ngày
            System.out.println(createDate);
            // nhập trạng thái
            System.out.println("nhập trạng thái bài hát (true/false): ");
            songStatus = sc.nextBoolean();

        }

    public void songDisplayData() {
        System.out.println("-----------------------------------");
        System.out.println("Mã bài hát: " + songId);
        System.out.println("Tên bài hát: " + songName);
        System.out.println("Mô tả: " + descriptions);
        System.out.println("ca sĩ trình bày: " + singer);
        System.out.println("tác giả: " + songWriter);
        System.out.println("trạng thái bài hát: " + (songStatus ? "Có" : "Không"));
        System.out.println("ngày: " + createDate);
        System.out.println("-----------------------------------");
    }

    private  boolean validateSongid(String songId) {
        if (songId.length() != 4 || !songId.startsWith("S")) {
            System.err.println("mã bài hát phải bắt đầu bằng S và có độ dài = 4 kí tự");
            return false;
        }
        return true;
    }
    }



