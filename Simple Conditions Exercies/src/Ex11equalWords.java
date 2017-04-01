import java.util.Scanner;

public class Ex11equalWords {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String first = console.nextLine().toLowerCase();
        String second = console.nextLine().toLowerCase();
        if(first.equals(second)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
}
