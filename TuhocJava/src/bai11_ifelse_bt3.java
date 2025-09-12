/*
Bài tập java 06: Viết chương trình nhập vào 1 năm dương lich, kiểm tra năm đó có phải năm nhuận hay không •
Fợi ý : Năm nhuận là năm
(chia hết cho 4, và không chia hết cho 100) hoặc ( chia hết cho 400) ((nam %4 ==0) && (nam %100 !=0)) || ( nam %400 ==0)
Case test
Năm nhuận : 2004, 2008, 2012, 2016, 2020, 2024
Năm không nhuận : 1900, 2005
*/
import java.util.Scanner;

public class bai11_ifelse_bt3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào 1 năm dương lịch");
        int nam= sc.nextInt();
        if ((nam %4==0 && nam%100!=0)||(nam%400==0))
            System.out.println("Năm " +nam +" là năm nhuận");
        else
            System.out.println("Năm " +nam +" không phải là năm nhuận");
        }
    }

