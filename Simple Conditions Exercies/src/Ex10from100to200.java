import java.util.Scanner;

public class Ex10from100to200 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int input = Integer.parseInt(console.nextLine());
        if(input < 100){
            System.out.println("Less than 100");
        } else if ((input >= 100) && (input <= 200)){
            System.out.println("Between 100 and 200");
        } else{
            System.out.println("Greater than 200");
        }
    }
}

