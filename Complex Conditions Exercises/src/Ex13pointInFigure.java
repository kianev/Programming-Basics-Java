import java.util.Scanner;

public class Ex13pointInFigure {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int h = Integer.parseInt(console.nextLine());
        int x = Integer.parseInt(console.nextLine());
        int y = Integer.parseInt(console.nextLine());

        int ax1 = 0;
        int ay1 = 0;
        int ax2 = 3 * h;
        int ay2 = h;
        int bx1 = h;
        int by1 = h;
        int bx2 = 2 * h;
        int by2 = 4 * h;

        if ((x > ax1) && (x < ax2) && (y > ay1) && (y < ay2)) {
            System.out.println("inside");
        } else if ((x > bx1) && (x < bx2) && (y > by1) && (y < by2)) {
            System.out.println("inside");
        } else if ((x < ax1) && (x > ax2) && (y < ay1) || (y > ay2)) {
            System.out.println("outside");
        } else if ((x < bx1) && (x > bx2) && (y < by1) || (y > by2)) {
            System.out.println("outside");
        }else{
            System.out.println("border");
        }
    }
}
