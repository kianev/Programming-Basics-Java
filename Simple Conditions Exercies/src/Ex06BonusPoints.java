import java.util.Scanner;

public class Ex06BonusPoints {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int score = Integer.parseInt(console.nextLine());
        double bonus;
        double bonusAdditional = 0;
        if(score <= 100){
            bonus = 5;
        } else if((score > 100) && (score <= 1000)){
            bonus = score * 0.2;
        } else {
            bonus = score * 0.1;
        }
        if(score % 2 == 0){
         bonusAdditional = 1;
         } else if (score % 5 == 0){
            bonusAdditional = 2;
        }
        System.out.println("Bonus score: " + (bonus + bonusAdditional));
        System.out.println("Total score: " + (score + bonus + bonusAdditional));
        }
}
