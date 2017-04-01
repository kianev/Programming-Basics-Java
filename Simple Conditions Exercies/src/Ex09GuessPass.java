import java.util.Scanner;

public class Ex09GuessPass {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter password: ");
        String pass = console.nextLine();
        String passSaved = "s3cr3t!P@ssw0rd";
        if(pass.equals(passSaved)){
            System.out.println("Welcome");
        }else{
            System.out.println("Wrong password!");
        }
    }
}
