import java.util.Scanner;

public class Ex07rightLeftColums {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < n ; i++) {
          int numbersLeft = Integer.parseInt(console.nextLine());
          sumLeft = sumLeft + numbersLeft;
        }
        for (int j = 0; j < n ; j++) {
            int numbersRight = Integer.parseInt(console.nextLine());
            sumRight = sumRight + numbersRight;
        }
        if(sumLeft == sumRight){
            System.out.println("Yes, sum = " + sumLeft);
        }else{
            System.out.println("No, diff = " + Math.abs(sumLeft - sumRight));
        }
    }
}
