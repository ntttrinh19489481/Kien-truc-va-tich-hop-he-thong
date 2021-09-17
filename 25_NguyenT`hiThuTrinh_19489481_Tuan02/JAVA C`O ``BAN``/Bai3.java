package JavaCoBan;
import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        double a, b, c, x1, x2, delta;
        String ketQua = "";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhap a (a # 0): ");
            a = scanner.nextDouble();
        } while (a == 0);
        System.out.print("Nhap b: ");
        b = scanner.nextDouble();
        System.out.print("Nhap c: ");
        c = scanner.nextDouble();
        System.out.println("Phuong trinh bac hai bạn vua nhap có dang: "+a+"x^2 + "+b+"x + "+c+" = 0");
        // tính delta = b * b - 4 * a * c;
        delta = Math.pow(b, 2) - 4 * a * c;
        // kiểm tra nếu delta < 0 thì phương trình vô nghiệm
        // delta = 0 thì phương trình có nghiệm kép
        // delta > 0 thì phương trình có 2 nghiệm phân biệt
        if (delta < 0) {
            ketQua = "Phuong trinh vo nghiem!";
        } else if (delta == 0) {
            x1 = x2 = -b/ (2*a);
            System.out.println("Phuong trinh có nghiem kep là x1 = x2 = "+x1);
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            ketQua = "Phương trinh có 2 nghiem x1 = " + x1 + " và x2 = " + x2;
        }
        System.out.println(ketQua);

    }
}