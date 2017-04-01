import java.util.Scanner;
public class Ex12fibonachi {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int prev = 0;
        int next = 1;
        int fib = 0;
        System.out.print("1");
        for (int i = 0; i < n; i++) {
            ;
            fib = prev + next;
            prev = next;
            next = fib;
            System.out.print(" " + fib);
        }
       /* if (fib == 0) {
            System.out.println(1);
        } else {
            System.out.println(fib);
        }*/
    }
}

