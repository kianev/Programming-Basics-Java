import java.util.Scanner;

public class Ex04triangleOf$ {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        for (int i = 0; i < n ; i++) {
            System.out.println(printStars("$ ", i + 1).trim());
        }

    }
    public static String printStars(String strToRepeat, int count){
        String text = "";
        for (int i = 0; i < count ; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}
