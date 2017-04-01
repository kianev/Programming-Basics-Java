import java.util.Scanner;

public class Ex08converter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double input = Double.parseDouble(console.nextLine());
        String sourceMetrics = console.nextLine().toLowerCase();
        String destMetrics = console.nextLine().toLowerCase();

        if(sourceMetrics.equals("mm"))
            input = input / 1000;
        if(sourceMetrics.equals("sm"))
            input = input / 100;
        if(sourceMetrics.equals("mi"))
            input = input / 0.000621371192 ;
        if(sourceMetrics.equals("in"))
            input = input / 39.3700787;
        if(sourceMetrics.equals("km"))
            input = input / 0.001;
        if(sourceMetrics.equals("ft"))
            input = input / 3.2808399;
        if(sourceMetrics.equals("yd"))
            input = input / 1.0936133;
        if(sourceMetrics.equals("m"))
            input = input;


        if(destMetrics.equals("mm"))
            input = input * 1000;
        if(destMetrics.equals("sm"))
            input = input * 100;
        if(destMetrics.equals("mi"))
            input = input * 0.000621371192;
        if(destMetrics.equals("in"))
            input = input * 39.3700787;
        if(destMetrics.equals("km"))
            input = input * 0.001;
        if(destMetrics.equals("ft"))
            input = input * 3.2808399;
        if(destMetrics.equals("yd"))
            input = input * 1.0936133 ;
        if(destMetrics.equals("m"))
            input = input;

        System.out.println(input + " " + destMetrics);
    }
}
