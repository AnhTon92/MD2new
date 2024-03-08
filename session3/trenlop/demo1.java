public class demo1 {
    public static void main(String[] args) {
        //khai báo mảng
        int[] numbers = new int[5];
        System.out.println(numbers.length);
        String[] nyc = {"Hương", "Ngọc", "Trang", "Linh", "Đạt"};
        System.out.println("số phần tử của mảng nyc" + nyc.length);
        nyc[4] = "Đạt09";
        //truy cập vào phần tử mảng
        System.out.println("nyc thứ 3" + nyc[2]);
        System.out.println("nyc của QA là: " + nyc[4]);
        // dùng vòng lặp để duyệt qua mảng
        System.out.println("danh sách người yêu cũ");
        System.out.println(nyc[0]);
        System.out.println(nyc[1]);
        System.out.println(nyc[2]);
        System.out.println(nyc[3]);
        System.out.println(nyc[4]);
        //for i
        for (int i = 0; i < nyc.length; i++) {
            System.out.println(nyc[i]);
        }
        // for each
        for (String item : nyc) {
            System.out.println(item);
        }
        // tìm max trong mảng

    }
}
