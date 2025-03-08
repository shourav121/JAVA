package OUESTION;

import java.util.Scanner;

public class ODDEVEN {

    public static void main(String[] args) {
        int n;
        System.out.println("enter any number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n%2!=0){
            System.out.println("odd number");
        }
        else{
            System.out.println("even number");
        }
    }
}