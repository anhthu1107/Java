import java.util.Scanner;

public class bai12_toantu3ngoi_bt1 {
    public static void main(String[] args) {
/*        Bài tập Java 10:
Viết chương trình nhập vào điểm trung bình, và kết quả xếp loại của học sinh theo tiêu chuẩn sau: ( dùng toán tử 3 ngôi)
• Giỏi: Nếu Điếm >=8
• Khá: Nếu 8 > Điểm >= 6.5
• Trung bình: Nếu 6.5 > Điểm >= 5
• Yếu: Nếu Điểm < 5*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào: ");
        double dtb = sc.nextDouble();
        //Xử lí lệnh để tính toán
        String traloi = (dtb>=8 && dtb <= 10)?"Giỏi":
                ((dtb<8 && dtb >=6.5)? "Khá":
                        (dtb<6.5&& dtb >=5)? "Trung bình": "Yếu");
        System.out.println(traloi);
    }
}
