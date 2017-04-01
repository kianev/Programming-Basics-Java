import java.util.Scanner;

public class Ex08sunGlasses {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());

        System.out.println(printStars("*", 2 * n) + printStars(" ", n) + printStars("*", 2 * n));
        for (int i = 0; i < n - 2 ; i++) {
            if(i == (n-1) / 2 - 1){
                System.out.println("*" + printStars("/",2*n-2) + "*" + printStars("|",n) +
                        "*" + printStars("/",2*n-2) + "*");
            }else{
            System.out.println("*" + printStars("/",2*n-2) + "*" + printStars(" ",n) +
                    "*" + printStars("/",2*n-2) + "*");
        }
    }
        System.out.println(printStars("*", 2 * n) + printStars(" ", n) + printStars("*", 2 * n));
    }
    public static String printStars(String strToRepeat, int count){
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}
