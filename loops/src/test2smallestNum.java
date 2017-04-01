import java.util.Scanner;

public class test2smallestNum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int min = 1000000000;
        for (int i = 0; i <= n ; i++) {
            int num = Integer.parseInt(console.nextLine());
            if(num < min){
                min = num;
            }
        }
        System.out.println(min);
    }
}
