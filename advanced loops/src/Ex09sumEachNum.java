import java.util.Scanner;
public class Ex09sumEachNum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        int sum = 0;
        int num = 0;
        int rest = 0;
        int delitel = 10;
        do {
            rest = number / delitel;
            num = number % delitel;
            sum = sum + num;
            number = rest;
        }while(number > 0);
        System.out.println(sum);
    }
}
