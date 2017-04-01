import java.util.Scanner;

public class Ex05invalidNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        if ((n < 100) || (n > 200)) {
            if (n != 0) {
                System.out.println("invalid");
            }
        }
    }
}
