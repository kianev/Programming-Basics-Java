import java.util.Scanner;

public class Ex07SumSec {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = Integer.parseInt(console.nextLine());
        int b = Integer.parseInt(console.nextLine());
        int c = Integer.parseInt(console.nextLine());
        int sumSecs = a + b + c;
        int min = sumSecs / 60;
        int secs = sumSecs % 60;
        if(secs < 10){
            System.out.println(min + ":0" + secs);
        } else{
            System.out.println(min + ":" + secs);
        }
    }
}
