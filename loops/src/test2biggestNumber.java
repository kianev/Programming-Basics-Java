import java.util.Scanner;

public class test2biggestNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int max = -1000000000;
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(console.nextLine());
            if(num > max){
                max = num;
            }
        }
        System.out.println(max);
    }
}

