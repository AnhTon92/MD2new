import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        // nhap 1 so tu 0-999 va doi ra tieng anh
        //    X          Y           Z
        // hang tram    hang chuc    hang DV
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("moi nhap so: ");
            int n = Integer.parseInt(scanner.nextLine());
            int hangTram = n / 100;
            int hangChuc = n % 100 / 10;
            int hangDv = n % 10;
            String chuoi = "";

            if (n >= 0 && n <= 999) {
                //số từ 0-999

                System.out.println("hàng trăm: " + hangTram);
                System.out.println("   Hàng chục:  " + hangChuc);
                System.out.println("   Hàng đơn vị:   " + hangDv);
                switch (hangTram) {
                    case 1:
                        chuoi = " One Hundred";
                        break;
                    case 2:
                        chuoi = " Two Hundred";
                        break;
                    case 3:
                        chuoi = " Three Hundred";
                        break;
                    case 4:
                        chuoi = " Four Hundred";
                        break;
                    case 5:
                        chuoi = " Five Hundred";
                        break;
                    case 6:
                        chuoi = " Six Hundred";
                        break;
                    case 7:
                        chuoi = " Seven Hundred";
                        break;
                    case 8:
                        chuoi = " Eight Hundred";
                        break;
                    case 9:
                        chuoi = " Nine Hundred";
                        break;

                }
                if (hangChuc >= 2) {
                    switch (hangChuc) {
                        case 2:
                            chuoi = chuoi + " Twenty";
                            break;
                        case 3:
                            chuoi = chuoi + " Thirty";
                            break;
                        case 4:
                            chuoi = chuoi + " Fourty";
                            break;
                        case 5:
                            chuoi = chuoi + " Fifty";
                            break;
                        case 6:
                            chuoi = chuoi + " Sixty";
                            break;
                        case 7:
                            chuoi = chuoi + " Seventy";
                            break;
                        case 8:
                            chuoi = chuoi + " Eighty";
                            break;
                        case 9:
                            chuoi = chuoi + " Ninety";
                            break;

                    }
                }
                if (hangChuc == 1) {
                    switch (hangDv) {
                        case 0:
                            chuoi = chuoi + " ten";
                            break;
                        case 1:
                            chuoi = chuoi + " eleven";
                            break;
                        case 2:
                            chuoi = chuoi + " twelve";
                            break;
                        case 3:
                            chuoi = chuoi + " thirteen";
                            break;
                        case 4:
                            chuoi = chuoi + " fourteen";
                            break;
                        case 5:
                            chuoi = chuoi + " fifteen";
                            break;
                        case 6:
                            chuoi = chuoi + " sixteen";
                            break;
                        case 7:
                            chuoi = chuoi + " seventeen";
                            break;
                        case 8:
                            chuoi = chuoi + " eighteen";
                            break;
                        case 9:
                            chuoi = chuoi + " nineteen";
                            break;

                    }
                }
                if (hangChuc != 1) {
                    switch (hangDv) {

                        case 1:
                            chuoi = chuoi + " one";
                            break;
                        case 2:
                            chuoi = chuoi + " two";
                            break;
                        case 3:
                            chuoi = chuoi + " three";
                            break;
                        case 4:
                            chuoi = chuoi + " four";
                            break;
                        case 5:
                            chuoi = chuoi + " five";
                            break;
                        case 6:
                            chuoi = chuoi + " six";
                            break;
                        case 7:
                            chuoi = chuoi + " seven";
                            break;
                        case 8:
                            chuoi = chuoi + " eight";
                            break;
                        case 9:
                            chuoi = chuoi + " nine";
                            break;
                    }
                }
                System.out.println(chuoi);
            } else {
                System.out.println("số nằm ngoài khoảng 0-999");
            }
        }
    }
}

