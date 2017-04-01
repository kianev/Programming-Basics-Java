import java.util.Scanner;

public class Ex04sumNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int sum = 0;
        for (int i = 0; i < n ; i++) {
            int number = Integer.parseInt(console.nextLine());
            sum = sum + number;
        }
        System.out.println(sum);
    }
}