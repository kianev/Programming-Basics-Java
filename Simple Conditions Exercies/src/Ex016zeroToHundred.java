import java.util.Scanner;

public class Ex016zeroToHundred {
    public static void main(String[] args) {
        String[] zeroToNinetheen = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] twentyToNinety = {"zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());

        if ((number <= 19) && (number >= 0)) {
            System.out.println(zeroToNinetheen[number]);
        } else if ((number >= 20) && (number < 100)) {
            if (number % 10 == 0) {
                System.out.println(twentyToNinety[number / 10]);
            } else if (number % 10 != 0){
                System.out.println((twentyToNinety[number / 10]) + " " + (zeroToNinetheen[number % 10]));
            }
            }
            else if(number == 100){
            System.out.println("hundred");
        } else{
            System.out.println("invalid number");
        }
        }
    }

