import java.util.Scanner;

public class Ex10diamond {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int stars = 1;
        int stars2 = 1;
        int stars3 = 1;
        int padding2 = 1;
        int innerFillingBottom = 4;
        if(n % 2 == 0)stars++;
        if(n % 2 == 0)stars2++;
        if(n % 2 == 0)stars3++;
        for (int i = 0; i < (n + 1)/2; i++) {
            if (i == 0) {
                int padding = (n - stars) / 2;
                System.out.print(printStars("-", padding));
                System.out.print(printStars("*", stars));
                System.out.println(printStars("-", padding));
                stars = stars + 2;
            } else if (i > 0) {
                    int padding = (n - stars) / 2;
                    System.out.print(printStars("-", padding));
                    System.out.print(printStars("*", 1));
                    System.out.print(printStars("-", stars - 2));
                    System.out.print(printStars("*", 1));
                    System.out.println(printStars("-", padding));
                    stars = stars + 2;
            }
        }
        int bottomLine = (n + 1)/2 - 1;
        for (int j = 0; j < (n + 1)/2 - 1; j++) {
            if(j < bottomLine - 1){
            System.out.print(printStars("-", padding2));
            System.out.print(printStars("*", 1));
            System.out.print(printStars("-", n - innerFillingBottom ));
            System.out.print(printStars("*", 1));
            System.out.println(printStars("-", padding2));
            stars2 = stars2 + 2;
            padding2 = padding2 + 1;
            innerFillingBottom = innerFillingBottom + 2;
        }else if(j < bottomLine){
                System.out.print(printStars("-", padding2));
                System.out.print(printStars("*", stars3));
                System.out.println(printStars("-", padding2));
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
