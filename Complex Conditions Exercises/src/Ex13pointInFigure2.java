import java.util.Scanner;

public class Ex13pointInFigure2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int h = Integer.parseInt(console.nextLine());
        int x = Integer.parseInt(console.nextLine());
        int y = Integer.parseInt(console.nextLine());

        int x1 = 0;
        int y1 = 0;
        int x2 = 3 * h;
        int y2 = h;
        int x3 = h;
        int y3 = h;
        int x4 = 2 * h;
        int y4 = 4 * h;
        if (((((x == x1) || (x == 3 * h)) && (y1 <= y) && (y <= h)) || (((y == y1) || (y == h)) && (x1 <= x) && (x <= 3 * h)) ||
                (((x == h) || (x == 2 * h)) && (h <= y) && (y <= 4 * h)) || (((y == h) || (y == 4 * h)) && (h <= x) && (x <= 2 * h))) &&
                (!((y == h) && (x > h) && (x < 2 * h)))){
            System.out.println("border");
        }else if (((x >= x1) && (x <= 3 * h) && (y >= y1) && (y <= h)) || ((x >= h) && (x <= 2 * h) && (y >= h) && (y <= 4 * h)) ||
                (y == h) && (x > h) && (x < 2 * h)){
            System.out.println("inside");
        }else{
            System.out.println("outside");
        }
    }
}
