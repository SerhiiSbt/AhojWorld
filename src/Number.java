import java.util.Scanner;

class Number {
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i=1; i<= n; i++){
            sum =sum + i;
            System.out.println (sum);

    }
  }
}
