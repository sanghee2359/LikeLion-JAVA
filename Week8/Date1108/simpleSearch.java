package Week8.Date1108;

import java.util.Scanner;

public class simpleSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int idx = 0;

        while(true){
            if(numbers[idx] == k){
                break;
            }
            idx++;
        }
        System.out.println(idx+1);
    }
}
