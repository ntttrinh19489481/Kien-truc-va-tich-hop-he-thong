package JavaCoBan;
import java.util.Scanner;


public class Bai5 {
    private static final String Tong = null;
	public static void main(String[] args) {
        System.out.println("Nhập vào số phần tử trong mảng: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] arr = new double[n];
        double total = 0;
        for(int i=0; i<arr.length; i++){
            System.out.print("Nhập vào giá trị cho phần tử thứ "+(i+1)+": ");
            arr[i] = scanner.nextDouble();
        }
        scanner.close();
       
        	 for(int i=0; i<arr.length; i++) { 
        		if(arr[i] > 0) { total += arr[i]; } } return; } 
        { int n; float arr[i]; nhap(arr, n); xuat(arr, n); 

        Object total;
		System.out.format("Kết quả là: %.3f", total);
    }
		private void nhap(float[] arr, int n) {
			// TODO Auto-generated method stub
			
		}
}

