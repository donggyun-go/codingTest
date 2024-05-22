package club99;

import java.util.Scanner;

public class Ex2869 {
    public void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int V = scan.nextInt();
        scan.close();
        
        int days = (V - B) / (A - B);
        if ((V - B) % (A - B) != 0) {
            days++;
        }
        
        System.out.println(days);
    }
}

