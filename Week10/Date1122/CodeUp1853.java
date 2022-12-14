package Week10.Date1122;

import java.util.Scanner;

public class CodeUp1853 {
    static int sum = 0;
    public static void recursive(int n) {
        if (n == 0) {
            return ;
        } else {
            recursive(n-1);
            //System.out.println(n);
            sum += n;
        }
    }
    public static int sum(int n) {
        if(n == 0) return n;
        return n + sum(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recursive(n);
        System.out.println(sum(n));
    }
}
