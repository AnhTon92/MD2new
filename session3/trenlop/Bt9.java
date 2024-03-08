public class Bt9 {
    public static void main(String[] args) {
        int[] arr = {44,544,23,22,98,33,32};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                secondMax = max;
                max = arr[i];
            } else if (secondMax < arr[i] && arr[i] < max) {
                secondMax = arr[i];
            }
        }
        System.out.println("giá trị lớn nhất là: "+max);
        System.out.println("giá trị lớn nhì là: "+secondMax);
    }
}
