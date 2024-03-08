package StopWatch;

public class Main {

    public static void main(String[] args) {
        // Khởi tạo StopWatch
        StopWatch stopWatch = new StopWatch();

        // Thực thi thuật toán sắp xếp chọn
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }

        // Bắt đầu đo thời gian
        stopWatch.start();

        selectionSort(arr);

        // Dừng đo thời gian
        stopWatch.stop();

        // In ra thời gian đã trôi qua
        System.out.println("Thời gian thực thi: " + stopWatch.getElapsedTime() + " mili giây");
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}

