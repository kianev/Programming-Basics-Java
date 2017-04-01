import java.util.Scanner;

public class Ex17transportPrice {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int km = Integer.parseInt(console.nextLine());
        String dayNight = console.nextLine();
        double taxiDay = 0.79;
        double taxiNight = 0.90;
        double taxiInitial = 0.70;
        double bus = 0.09;
        double train = 0.06;

        if (km >= 100){
            System.out.println(km * train);
        }else if((km < 100) && (km >= 20)){
            System.out.println(km * bus);
        }else if(km < 20){
            if(dayNight.equals("day")){
                System.out.println(taxiInitial + (km * taxiDay));
            } if (dayNight.equals("night")){
                System.out.println(taxiInitial + (km * taxiNight));
            }
        }
    }
}
