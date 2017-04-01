import java.util.Scanner;

public class Ex03OddEven {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int input = Integer.parseInt(console.nextLine());
        if(input % 2 == 0){
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}
