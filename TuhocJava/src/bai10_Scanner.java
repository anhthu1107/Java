import java.util.Scanner;

public class bai10_Scanner {
    public static void main(String[] args) {
       /* //khởi tạo một đối tượng scanner
        Scanner sc = new Scanner(System.in);

        //Cho phép nhập chuỗi
        System.out.println("Mời nhập vào mk cấp 1: ");
        String mk1= sc.nextLine();
        System.out.println("mk cấp 1 là: " +mk1);

        //nhập số nguyên
        System.out.println("Mời nhập vào một số nguyên a: ");
        int a = sc.nextInt();
        System.out.println("a= " +a);

        //nhập số float
        System.out.println("Mời nhập vào một số thực x: ");
        float x = sc.nextFloat();
        System.out.println("x= " +x);

        //nhập chuỗi
        System.out.println("Mời nhập vào mk cấp 2: ");
        String mk2= sc.nextLine();
        System.out.println("mk cấp 2 là: " +mk2);*/

        //nhập chuỗi
        System.out.println("Mời cụ nhập tên: ");
        String ten = new Scanner(System.in).nextLine();
        System.out.println("tên cụ là: " +ten);

        //nhập chuỗi
        System.out.println("Mời cụ nhập giới tính: ");
        String gt = new Scanner(System.in).nextLine();
        System.out.println("giới tính cụ là: " +gt);

        //nhập float
        System.out.println("Mời cụ nhập chiều cao: ");
        float cao = new Scanner(System.in).nextFloat();
        System.out.println("chiều cao cụ là: " +cao);

        //nhập chuỗi
        System.out.println("Mời cụ nhập giới tính: ");
        String gt2 = new Scanner(System.in).nextLine();
        System.out.println("giới tính cụ là: " +gt2);
    }
}
