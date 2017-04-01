import java.util.Scanner;

public class Ex04fruitVegetable {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String fruitOrVeg = console.nextLine().toLowerCase();

        switch (fruitOrVeg){
            case "banana":
            case "apple":
            case "kiwi":
            case "lemon":
            case "cherry":
            case "grapes":
                System.out.println("fruit");break;
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                System.out.println("Vegetable");break;
                default:
                    System.out.println("unknown");
        }
    }
}
