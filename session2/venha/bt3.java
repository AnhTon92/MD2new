public class bt3 {

    public static void main(String[] args) {
        // Duyệt từ 2 đến 100
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;

            // Kiểm tra i có chia hết cho bất kỳ số nào từ 2 đến căn bậc hai của i hay không
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Nếu i là số nguyên tố, in ra màn hình
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}

