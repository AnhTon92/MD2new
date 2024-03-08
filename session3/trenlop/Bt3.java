import java.util.Scanner;

public class Bt3 {
    public static void main(String[] args)
    {
        int [] mang1 = {1,2,3,4,5,6,7};
        int [] mang2 = {8,9,10,11,12,13};
        int lenght = mang1.length + mang2.length;
        int [] mang3 = new int[lenght];
        int vitri = 0 ;
        for (int element: mang1)
        {
            mang3[vitri] = element;
            vitri ++;
        }
        for (int element: mang2)
        {
            mang3[vitri] = element;
            vitri++;
        }
        for (int element: mang3)
        {
            System.out.println(element);
        }
    }
}
