package baitap;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bai9 {

    public static void main(String[] args) {
        List<Integer> listSoNguyen = new ArrayList<>();
        listSoNguyen.add(1);
        listSoNguyen.add(2);
        listSoNguyen.add(3);
        listSoNguyen.add(1);
        listSoNguyen.add(4);
        listSoNguyen.add(2);

        // Duyệt qua list
        for (int i = 0; i < listSoNguyen.size(); i++) {
            // Kiểm tra phần tử hiện tại có trùng lặp với các phần tử sau nó hay không
            for (int j = i + 1; j < listSoNguyen.size(); j++) {
                if (Objects.equals(listSoNguyen.get(i), listSoNguyen.get(j))) {
                    // Xóa phần tử trùng lặp
                    listSoNguyen.remove(j);
                    j--; // Giảm j để bù cho việc xóa phần tử
                }
            }
        }




        // In ra list sau khi xóa phần tử trùng lặp
        System.out.println(listSoNguyen);
    }
}

