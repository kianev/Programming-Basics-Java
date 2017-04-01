import java.util.Scanner;

public class Ex08factoriel {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        long n = Integer.parseInt(console.nextLine());
        long factorial = 1;
        do {
            factorial *= n;
            n--;
        }while (n > 0 );
        System.out.println(factorial);

        for (int i = 1; i <= n ; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
