package condition;

public class largestthree {
    public static void main(String[] args) {
        int a=449;
        int b=88;
        int c=255233;
        if(a>=b && a>=c){
            System.out.println("a");
        }
        else if(b>=c){
            System.out.println("b");
        }
        else{
            System.out.println("c");
        }
    }
}
