
public class Ex0110to10Stars {
    public static void main(String[] args) {

        for (int i = 0; i < 10 ; i++) {
            System.out.println(printStars("*",10));
        }
    }
    static String printStars(String strToRepeat, int count){
        String text = "";
        for (int i = 0; i < count ; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}
