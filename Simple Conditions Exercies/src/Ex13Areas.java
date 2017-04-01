import java.util.Scanner;

public class Ex13Areas {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine().toLowerCase();

        if(input.equals("square")){
            double squareRadius = Double.parseDouble(console.nextLine());
            double squareArea = squareRadius * squareRadius;
            System.out.println(Math.round(squareArea*1000d)/1000d);
        }
        else if(input.equals("rectangle")){
            double rectA = Double.parseDouble(console.nextLine());
            double rectB = Double.parseDouble(console.nextLine());
            double rectArea = rectA * rectB;
            System.out.println(Math.round(rectArea * 1000d)/1000d);
        }
        else if(input.equals("circle")){
            double radius = Double.parseDouble(console.nextLine());
            double circleArea = Math.PI * radius * radius;
            System.out.println(Math.round(circleArea*1000d)/1000d);
        }
        else if(input.equals("triangle")){
            double base = Double.parseDouble(console.nextLine());
            double height = Double.parseDouble(console.nextLine());
            double triangleArea = (base * height) / 2;
            System.out.println(Math.round(triangleArea*1000d)/1000d);
        }
    }
}
