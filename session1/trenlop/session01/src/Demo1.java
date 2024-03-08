public class Demo1 {
    public static void main (String[] args){
        int num = 10;
        System.out.println("giá trị biến = " +num);
        System.out.println("ok");
        System.out.printf("Giá trị biến = %d",num);
        int age = 18;
        String fullName = "Nguyễn Văn A";
        boolean sex = true;
        System.out.println("Họ và tên: " +fullName+ "Tuổi "+age+"Giới tính "+(sex ? "Nam" : "Nữ"));
        //in có định dạng
        System.out.printf("Họ và tên: %s Tuổi: %d Giới tính: %b \n", fullName,age,sex);
        System.out.printf("\t\t Họ tên : %s",fullName);
    }
}
