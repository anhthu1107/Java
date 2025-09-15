import java.util.Scanner;

public class bai12_toantu3ngoi {
    public static void main(String[] args) {
        //nhập vào bàn phím một số, ktra chẵn lẻ
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào 1 số nguyên n: ");
        int n = sc.nextInt();
        String traloi = (n % 2 == 0) ? "chẵn" : "lẻ";
        System.out.println("Số vừa nhập là số " + traloi);
    }
}
