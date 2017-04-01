import java.util.Scanner;

public class Ex07christmasTree {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int height = n + 1;
        for (int i = 0; i < height ; i++) {
            System.out.println(printStars(" ", n - i) + printStars("*", i) + " | "
                    + printStars("*", i));
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

