import java.util.Scanner;

public class Ex07fruitShop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String fruit = console.nextLine().toLowerCase();
        String dayOfWeek = console.nextLine().toLowerCase();
        double quantity = Double.parseDouble(console.nextLine());
        double price = -1;
        if(dayOfWeek.equals("monday") || dayOfWeek.equals("tuesday") || dayOfWeek.equals("wednesday") || dayOfWeek.equals("thursday")
                || dayOfWeek.equals("friday")){
            if(fruit.equals("banana")){
                price =2.5;
            } else if(fruit.equals("apple")){
                price = 1.2;
            } else if(fruit.equals("orange")){
                price = 0.85;
            } else if(fruit.equals("grapefruit")){
                price = 1.45;
            } else if(fruit.equals("kiwi")){
                price = 2.7;
            } else if(fruit.equals("pineapple")){
                price = 5.5;
            } else if(fruit.equals("grapes")){
                price = 3.85;
            }
        } else if(dayOfWeek.equals("saturday") || dayOfWeek.equals("sunday")){
            if(fruit.equals("banana")){
                price = 2.7;
            }else if(fruit.equals("apple")){
                price = 1.25;
            }else if(fruit.equals("orange")){
                price = 0.9;
            }else if(fruit.equals("grapefruit")){
                price = 1.60;
            }else if(fruit.equals("kiwi")){
                price = 3;
            }else if(fruit.equals("pineapple")){
                price = 5.6;
            }else if(fruit.equals("grapes")){
                price = 4.2;
            }
        }else{
            System.out.println("error");
        }
        if(price > 0){
            System.out.println(quantity * price);
        }else{
            System.out.println("error");
        }

    }

}

