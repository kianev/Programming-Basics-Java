import java.util.Scanner;

public class Ex02fromNto1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        for (int i = n; i >=1 ; i--) {
            System.out.println(i);
        }
        while(n > 0){
            System.out.println(n);
            n--;
        }
    }
}
