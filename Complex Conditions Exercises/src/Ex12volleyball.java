import java.util.Scanner;

public class Ex12volleyball {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String leapYear = console.nextLine().toLowerCase();
        double p = Integer.parseInt(console.nextLine());
        double h = Integer.parseInt(console.nextLine());

        double playsInSofia = (48 - h) * 0.75;
        double playsInHoliday = p * 0.6666666666666666;
        double playsTotal = playsInSofia + playsInHoliday + h;

        if(leapYear.equals("leap")){
            playsTotal = playsTotal * 1.15;
            System.out.println(Math.floor(playsTotal));
        }else if(leapYear.equals("normal")){
            System.out.println(Math.floor(playsTotal));
        }
    }
}


