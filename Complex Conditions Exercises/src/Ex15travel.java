import java.util.Scanner;

public class Ex15travel {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double budget = Double.parseDouble(console.nextLine());
        String season = console.nextLine().toLowerCase();

        if(budget <= 100){
            if(season.equals("summer")){
                budget = budget * 0.3;
                System.out.println("Somewhere in Bulgaria");
                System.out.printf("Camp - %.2f ",budget);
            }else if(season.equals("winter")){
                budget = budget * 0.7;
                System.out.println("Somewhere in Bulgaria");
                System.out.printf("Hotel - %.2f ",budget);
            }

        }else if((budget > 100) && (budget <= 1000)){
            if(season.equals("summer")){
                budget = budget * 0.4;
                System.out.println("Somewhere in Balkans");
                System.out.printf("Camp - %.2f ",budget);
            }else if(season.equals("winter")){
                budget = budget * 0.8;
                System.out.println("Somewhere in Balkans");
                System.out.printf("Hotel - %.2f ",budget);
            }
         }else if(budget > 1000){
            budget = budget * 0.9;
            System.out.println("Somewhere in Europe");
            System.out.printf("Hotel - %.2f ",budget);

}
}
}
