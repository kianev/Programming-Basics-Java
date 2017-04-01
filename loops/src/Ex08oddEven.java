import java.util.Scanner;

public class Ex08oddEven {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 1; i <= n ; i++) {
            int numbers = Integer.parseInt(console.nextLine());
          if(i % 2 == 0){
              evenSum += numbers;
          }else if(i % 2 != 0){
              oddSum += numbers;
          }
        }

        if(oddSum == evenSum){
            System.out.println("Yes, sum = " + oddSum);
        }else{
            System.out.println("No, diff = " + Math.abs(oddSum - evenSum));
        }
    }
}
