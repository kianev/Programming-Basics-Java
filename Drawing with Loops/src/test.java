import java.util.Scanner;

public class test {
    public static void main(String[] args) {
                Scanner console = new Scanner(System.in);
                int n = Integer.parseInt(console.nextLine());
                int stars = 1;
                if(n % 2 == 0)stars++;
                for (int i = (n + 1)/2 ; i > 0; i--){

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
