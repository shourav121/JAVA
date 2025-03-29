package OUESTION;
import java.util.Scanner;
public class naturalNumber {
    public static void main(String[] args) {
        int n;
        System.out.println("enter the n term of number");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i+" ");
        }
    }
}
