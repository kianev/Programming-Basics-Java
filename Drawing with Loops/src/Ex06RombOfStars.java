import java.util.Scanner;

public class Ex06RombOfStars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int noOfSpases = n - 1;
        for (int i = 1; i <= n ; i++) {
            for (int j = noOfSpases; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            noOfSpases--;
        }
        for (int i = n - 1; i >= 1 ; i--) {
            for (int j = 1; j <= noOfSpases + 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            noOfSpases++;
        }
    }
}
