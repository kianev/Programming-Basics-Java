import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex11oddEvenPositions {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        DecimalFormat df = new DecimalFormat("#.##");
        double oddSum = 0;
        double oddMin = 10000000000.00;
        double oddMax = -10000000000.00;
        double evenSum = 0;
        double evenMin = 10000000000.00;
        double evenMax = -1000000000.00;

        for (int i = 1; i <= n ; i++) {
            double numbers = Double.parseDouble(console.nextLine());
            if(i % 2 != 0){
                oddSum += numbers;
                if(numbers < oddMin){
                    oddMin = numbers;
                }if(numbers > oddMax ){
                    oddMax = numbers;
                }
            }else if(i % 2 == 0){
                evenSum += numbers;
                if(numbers < evenMin){
                    evenMin = numbers;
                }if(numbers > evenMax){
                    evenMax = numbers;
                }
            }
        }
        if(oddSum == 0){
            System.out.println("OddSum = 0");
            System.out.println("OddMin = No");
            System.out.println("OddMax = No");
        }else{
            System.out.println("OddSum = " + df.format(oddSum));
            System.out.println("OddMin = " + df.format(oddMin));
            System.out.println("OddMax = " + df.format(oddMax));
        }
        if(evenSum == 0){
            System.out.println("EvenSum = 0");
            System.out.println("EvenMin = No");
            System.out.println("EvenMax = No");
        }else{
            System.out.println("EvenSum = " + df.format(evenSum));
            System.out.println("EvenMin = " + df.format(evenMin));
            System.out.println("EvenMax = " + df.format(evenMax));
        }
    }
}

