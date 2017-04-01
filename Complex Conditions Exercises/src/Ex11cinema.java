import java.util.Scanner;

public class Ex11cinema {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String typeProjecttion = console.nextLine().toLowerCase();
        double r = Double.parseDouble(console.nextLine());
        double c = Double.parseDouble(console.nextLine());
        double price = 0;
        if(typeProjecttion.equals("premiere")){
           price = 12;
        }else if(typeProjecttion.equals("normal")){
            price = 7.5;
        }else if(typeProjecttion.equals("discount")){
            price = 5;
        }
        double result = r * c * price;
        System.out.printf("%.2f leva", result);
    }
}
