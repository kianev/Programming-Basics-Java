import java.util.Scanner;

public class Ex02NxN {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println(printStars("* ",n-1)+ "*");
        }
    }
    static String printStars(String strToRepeat, int count){
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}
