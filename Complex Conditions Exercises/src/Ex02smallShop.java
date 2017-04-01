import java.util.Scanner;

public class Ex02smallShop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String product = console.nextLine().toLowerCase();
        String town = console.nextLine().toLowerCase();
        double quantity = Double.parseDouble(console.nextLine());

        if(town.equals("sofia")){
            if(product.equals("coffee")){
                System.out.println(quantity * 0.5);
            }if(product.equals("water")){
                System.out.println(quantity * 0.8);
            }if(product.equals("beer")){
                System.out.println(quantity * 1.2);
            }if(product.equals("sweets")){
                System.out.println(quantity * 1.45);
            }if(product.equals("peanuts")){
                System.out.println(quantity * 1.60);
            }
        }

        if(town.equals("plovdiv")){
            if(product.equals("coffee")){
                System.out.println(quantity * 0.4);
            }if(product.equals("water")){
                System.out.println(quantity * 0.7);
            }if(product.equals("beer")){
                System.out.println(quantity * 1.15);
            }if(product.equals("sweets")){
                System.out.println(quantity * 1.3);
            }if(product.equals("peanuts")){
                System.out.println(quantity * 1.50);
            }
        }

        if(town.equals("varna")){
            if(product.equals("coffee")){
                System.out.println(quantity * 0.45);
            }if(product.equals("water")){
                System.out.println(quantity * 0.70);
            }if(product.equals("beer")){
                System.out.println(quantity * 1.1);
            }if(product.equals("sweets")){
                System.out.println(quantity * 1.35);
            }if(product.equals("peanuts")){
                System.out.println(quantity * 1.55);
            }
        }
    }
}
