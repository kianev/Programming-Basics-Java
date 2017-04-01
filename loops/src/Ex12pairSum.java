import java.util.Scanner;

public class Ex12pairSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int currPairSum = 0;
        int lastPairSum = 0;
        int maxPairSumDiff = 0;
        int sumDiff = 0;

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < 2; j++) {
                int currNumber = Integer.parseInt(console.nextLine());
                currPairSum += currNumber;
            }
            if( i > 0){
                sumDiff = Math.abs(currPairSum - lastPairSum);
                maxPairSumDiff = Math.max(maxPairSumDiff,sumDiff);
            }
            lastPairSum = currPairSum;
            currPairSum = 0;
        }
        boolean areSumEqual = maxPairSumDiff == 0;
        if(areSumEqual){
            System.out.println("Yes, value = " + lastPairSum);
        }else{
            System.out.println("No, maxdiff = " + maxPairSumDiff);
        }
    }
}
