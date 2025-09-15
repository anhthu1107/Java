import java.util.Scanner;

/*Bài tập java 08: Viết chương trình giải phương trình bậc 2:
ax^2 + bx + c =0
1. case1 : a=1, b=2, c=-3
→ Pt có 2 nghiệm x1=1.0 x2 = -3.0
2. case2 : a=1, b=2, c=1
→ Pt có nghiệm kép x1=x2 = -1.0
3. case3 : a=1, b=1, c=1
→ Pt vô nghiệm
*/
public class bai11_ifelse_bt5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //nhập vào 3 hệ số a, b, c
        System.out.println("Mời nhập vào hệ số a: ");
        double a=sc.nextDouble();
        System.out.println("Mời nhập vào hệ số b: ");
        double b=sc.nextDouble();
        System.out.println("Mời nhập vào hệ số c: ");
        double c=sc.nextDouble();

        //tính denta
        double delta= Math.pow(b,2) -(4*a*c); //Math.pow là bình phương
        //kiểm tra điều kiện
        if (delta <0)
            System.out.println("Phương trình vô nghiệm.");
        else if (delta==0){
            double x= -b/(2*a);
            System.out.println("pt có nghiệm kép x1 = x2 =" +x);
        }
        else {
            double x1 = (-b+Math.sqrt(delta))/(2*a); //Math.sqrt là căn
            double x2 = (-b-Math.sqrt(delta))/(2*a);
            System.out.println("Phương trình có 2 nghiệm phân biệt: ");
            System.out.println("x1 = " +x1);
            System.out.println("x2 = " +x2);
        }
    }
}
