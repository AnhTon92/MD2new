public class Bt4 {

    public static void main(String[] args) {
        // Khởi tạo ma trận
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Tìm phần tử lớn nhất
        int max = matrix[0][0];
        int row = 0, col = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        // In kết quả
        System.out.println("Phần tử lớn nhất là: " + max);
        System.out.println("Tọa độ: (" + row + ", " + col + ")");
    }
}

