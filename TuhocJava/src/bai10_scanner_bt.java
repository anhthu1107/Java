import java.util.Scanner;

public class bai10_scanner_bt {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào bán kính đường tròn: ");
        double r=sc.nextDouble(); //đọc toàn bộ dữ liệu mới nhập
        double cv= 2*Math.PI*r;
        double dt= Math.PI*Math.pow(r,2);
        System.out.println("Chu vi là: " +cv);
        System.out.println("Diện tích là: " +dt);*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập chiều dài: ");
        float a=sc.nextFloat();
        System.out.println("Mời nhập chều rộng: ");
        float b= sc.nextFloat();

        float dt=a*b;
        float cv= (a+b)*2;

        System.out.println("Diện tích hcn là: "+dt);
        System.out.println("Chu vi hcn là: "+cv);
    }
}
