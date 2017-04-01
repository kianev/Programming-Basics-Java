import java.util.Scanner;

public class Ex01personalTitels {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double age = Double.parseDouble(console.nextLine());
        String title = console.nextLine();

        if(title.equals("m") && (age >= 16)){
            System.out.println("Mr.");
        } else if (title.equals("m") && (age < 16)){
            System.out.println("Master");
        }
        if(title.equals("f") && (age >= 16)){
            System.out.println("Ms.");
        }  else if (title.equals("f") && (age < 16)) {
            System.out.println("Miss");
        }
    }
}
