import java.util.Scanner;

public class Ex11enterEvenNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter even number: ");
        int a = -1;
        while (true) {
            try {
                a = Integer.parseInt(console.nextLine());
                if(a % 2 != 0){
                    System.out.println("The number is not even.");
                }else{
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid number!");
            }
        }
        System.out.println("Even number entered: " + a);
    }
}
