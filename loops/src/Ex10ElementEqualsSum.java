import java.util.Scanner;

public class Ex10ElementEqualsSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int maxValue = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(console.nextLine());
            sum  += num;
            if(num > maxValue){
                maxValue = num;
            }
        }
        sum = sum - maxValue;
        if(sum == maxValue){
            System.out.println("Yes Sum = " + sum);
        }else{
            System.out.println("No Diff = " + Math.abs(sum - maxValue));
        }
    }
}
