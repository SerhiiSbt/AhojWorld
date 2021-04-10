import java.util.Scanner;

public class HelloAndrew {
    public static void main(String[] args) {
        System.out.println("Whats your name?");

        Scanner in= new Scanner(System.in);
        String name = in.next();
        System.out.println("Ahoj, "+name);
    }
}
