import java.util.Scanner;

public class Ex03from1to2N {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        System.out.println(1);
        for (int i = 1; i <= n; i++) {
            System.out.println(Math.round(Math.pow(2, i)));
        }
        int num = 1;
        System.out.println(num);
        for (int i = 1; i <= n; i++) {
            num = num * 2;
            System.out.println(num);
        }
    }


}
