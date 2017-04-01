import java.util.Scanner;

public class Ex09house {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int stars = 1;
        if (n % 2 == 0) stars++;
        for (int i = 0; i < (n+1) / 2; i++) { // Draw the roof
            int padding = (n - stars) / 2;
            System.out.print(printStars("-", padding));
            System.out.print(printStars("*", stars));
            System.out.println(printStars("-", padding));
            stars = stars + 2;
        }
        for (int i = 0; i < n / 2; i++) {
            System.out.println(printStars("|",1)+ printStars("*", n - 2) + printStars("|",1));

        }
    }
    public static String printStars(String strToRepeat, int count){
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}
