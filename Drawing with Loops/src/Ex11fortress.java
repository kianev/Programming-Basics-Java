import java.util.Scanner;

public class Ex11fortress {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int middle = (2 * n) - 2 * (n / 2) - 4;
        System.out.println("/"+ printStars("^", n/2) + "\\" + printStars("_", middle) +
                "/" + printStars("^", n/2) + "\\" );
        for (int i = 0; i < n - 3 ; i++) {
            System.out.println("|" + printStars(" ", (2 * n - 2)) + "|");
        }
        System.out.println("|" + printStars(" ", (n/2 + 1 )) + printStars("_", middle)+ printStars(" ", (n/2 + 1 ))+ "|");

        System.out.println("\\"+ printStars("_", n/2) + "/" + printStars(" ", middle) +
                "\\" + printStars("_", n/2) + "/" );


    }
    public static String printStars(String strToRepeat,int count){
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}
