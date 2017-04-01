import java.util.Scanner;

public class Ex12butterfly {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        for (int i = 0; i < n - 2; i++) {
            if (i % 2 == 0) {
                System.out.println(printStars("*", n - 2) + "\\" + " " + "/" + printStars("*", n - 2));
            }else if(i % 2 != 0){
                System.out.println(printStars("-", n - 2) + "\\" + " " + "/" + printStars("-", n - 2));
            }
        }
            System.out.println(printStars(" ", n - 1) + "@" + printStars(" ", n - 1));
        for (int i = 0; i < n - 2; i++) {
            if (i % 2 == 0) {
                System.out.println(printStars("*", n - 2) + "/" + " " + "\\" + printStars("*", n - 2));
            }else if(i % 2 != 0){
                System.out.println(printStars("-", n - 2) + "/" + " " + "\\" + printStars("-", n - 2));
            }
        }
    }
    public static String printStars(String strToRepeat,int count){
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}

