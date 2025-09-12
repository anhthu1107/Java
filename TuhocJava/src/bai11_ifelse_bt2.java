/*Bài tập java 05: Viết chương trình nhập vào chiều cao, cân nặng, tính BMI và xuất ra thông báo
        BMI<15: Thân hình quá gầy
        BMI>=15 and BMI<16: Thân hình gầy
        BMI>=16 and BMI<18.5: Thân hình hơi gầy
        BMI>=18.5 and BMI<25: Thân hình bình thường
        BMI>=25 and BMI < 30: Thân hình hơi béo
        BMI >=30 and BMI<35: Thân hình béo
        BMI >=35: Thân hình quá béo
        Gợi ý cách tính : BMI=canNang/(chieu Cao ^2)*/
import java.util.Scanner;

public class bai11_ifelse_bt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chiều cao (m): ");
        Double chieuCao = sc.nextDouble();
        System.out.println("Nhập vào cân nặng (kg): ");
        Double canNang = sc.nextDouble();

        Double BMI = canNang / (chieuCao * chieuCao);
        System.out.println("BMI của bạn= " + BMI);

        if (BMI < 15) {
            System.out.println("Thân hình quá gầy");
        } else if (BMI >= 15 && BMI < 16) {
            System.out.println("Thân hình gầy");
        } else if (BMI >= 16 && BMI < 18.5) {
            System.out.println("Thân hình hơi gầy");
        } else if (BMI >= 18.5 && BMI < 25) {
            System.out.println("Thân hình bình thường");
        } else if (BMI >= 25 && BMI < 30) {
            System.out.println("Thân hình hơi béo");
        } else if (BMI >= 30 && BMI < 35) {
            System.out.println("Thân hình béo");
        } else { // Trường hợp còn lại: BMI >= 35
            System.out.println("Thân hình quá béo");
        }

        sc.close();
    }
}