import java.util.Scanner;

public class Ex14tableOfNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int num = 0;
        int lower = 0;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {
                num = i + j + 1;
                lower = 2*n - num;
                if(num <= n){
                System.out.print(num + " ");
            }else{
                    System.out.print(lower + " ");
                }
        }
            System.out.println();
    }
}}

