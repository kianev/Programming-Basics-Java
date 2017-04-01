import java.util.Scanner;

public class Ex06number1to100 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Еnter a number in the range [1...100]: ");
        int n = Integer.parseInt(console.nextLine());

        while (n <= 0 || n > 100){

            System.out.println("Invalid number!");
            System.out.print("Еnter a number in the range [1...100]: ");
            n = Integer.parseInt(console.nextLine());
        }
                System.out.println("The number is: " + n);

            }

        }

