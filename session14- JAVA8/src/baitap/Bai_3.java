package baitap;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Bai_3 {
    public static void main(String[] args) {
        //tạo mảng số ngẫu nhiên từ 1 đến 1000
        List<Integer> random = Stream.generate(()-> new Random().nextInt(1000))
                .limit(100)
                .sorted().toList();
        System.out.println("List: "+random);
        //sử dụng stream api để tìm số lớn nhất trong mảng
        Optional<Integer> max = random.stream().max(Comparator.naturalOrder());
        System.out.println("giá trị lớn nhất: "+ max.orElseThrow(()-> new RuntimeException("không có phần tử nào trong danh sách")));
    }
}
