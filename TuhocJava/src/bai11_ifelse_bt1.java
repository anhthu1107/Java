import java.util.Scanner;

public class bai11_ifelse_bt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tổng 2 số: ");
        double tong2so = sc.nextDouble();
        System.out.println("Nhập vào hiệu 2 số: ");
        double hieu2so = sc.nextDouble();

        if (hieu2so > tong2so) {
            System.out.println("Lỗi: Hiệu số không thể lớn hơn Tổng số. Vui lòng nhập lại.");
        } else {
            // Ứng dụng công thức toán học
            double x = (tong2so + hieu2so) / 2;
            double y = tong2so - x;

            System.out.println("Giá trị x cần tìm là: " + x);
            System.out.println("Giá trị y cần tìm là: " +y);
        }
    }
}
