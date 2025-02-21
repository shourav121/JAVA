package condition;

public class elseif {
    public static void main(String[] args) {
        int age = 100;
        if (age >= 18) {
            System.out.println("adult");
        } else if (13 <= age && 18 >= age) {
            System.out.println("teen");

        } else {
            System.out.println("child");
        }
    }
}
