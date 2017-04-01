import java.util.Scanner;

public class Ex07NOD {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = Integer.parseInt(console.nextLine());
        int b = Integer.parseInt(console.nextLine());
        int n = Math.max(a,b);

        while(a % n != 0 || b % n != 0){
            n--;
        }
        System.out.println(n);

       /* int delitel = 0;
        for (int i = n; i > 0 ; i--) {
            if((a % i == 0) && (b % i == 0)) {
                delitel = i;
                System.out.println(delitel);
                break;
            }
        }*/
    }
}
