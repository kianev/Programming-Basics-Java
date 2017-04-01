import java.util.Scanner;

public class Ex08Commisions {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String town = console.nextLine().toLowerCase();
        double sales = Double.parseDouble(console.nextLine());
        double commicion = -1;

        if (town.equals("sofia")) {
            if (sales >= 0 && sales <= 500) commicion = 0.05;
            else if (sales > 500 && sales <= 1000) commicion = 0.07;
            else if (sales > 1000 && sales <= 10000) commicion = 0.08;
            else if (sales > 10000) commicion = 0.12;
        } else if (town.equals("varna")) {
            if (sales >= 0 && sales <= 500) commicion = 0.045;
            else if (sales > 500 && sales <= 1000) commicion = 0.075;
            else if (sales > 1000 && sales <= 10000) commicion = 0.1;
            else if (sales > 10000) commicion = 0.13;
        } else if (town.equals("plovdiv")) {
            if (sales >= 0 && sales <= 500) commicion = 0.055;
            else if (sales > 500 && sales <= 1000) commicion = 0.08;
            else if (sales > 1000 && sales <= 10000) commicion = 0.12;
            else if (sales > 10000) commicion = 0.145;
        }
        if(commicion > 0){
            double result = sales * commicion;
            System.out.printf("%.2f", result);
        }else{
            System.out.println("error");
        }
    }
}
