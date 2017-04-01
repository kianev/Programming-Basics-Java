import java.util.Scanner;

public class Ex13pyramide {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int counter = 0;
        int num = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                num +=1;
                System.out.print((num) + " ");
                counter++;
                if (counter == n) break;
            }
            System.out.println();
            if (counter == n) break;
        }
    }
}

