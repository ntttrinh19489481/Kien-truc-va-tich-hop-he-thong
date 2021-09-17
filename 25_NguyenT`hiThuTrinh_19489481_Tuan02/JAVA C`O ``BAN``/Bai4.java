package JavaCoBan;
import java.util.Scanner;
public class Bai4 {

    public static void main(String[] args) {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so n: ");
        n = sc.nextInt();
        for(int i = 1; i <= n; ++i)
        {
            // sum = sum + i;
            sum += i;
        }
        System.out.println("Tong các so tu nhien tu 1 đen "+ n +" la: "+sum);
 
    }
}