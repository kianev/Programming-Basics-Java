import java.util.Scanner;

public class Ex18TubesInPool {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int volume = Integer.parseInt(console.nextLine());
        int p1 = Integer.parseInt(console.nextLine());
        int p2 = Integer.parseInt(console.nextLine());
        double hours = Double.parseDouble(console.nextLine());
        double p1Fill = p1 * hours;
        double p2Fill = p2 * hours;
        double poolFull = p1Fill + p2Fill; // in liters
        double fullPercent = (float)((poolFull*100)/volume);
        double p1Percent = (float)((p1Fill * 100)/poolFull);
        double p2Percent = (float)((p2Fill * 100)/poolFull);
        double exessiveLiters = poolFull - volume;

        if(poolFull <= volume){
            System.out.println("The pool is " + Math.round(fullPercent) + "% full. Pipe 1: " + Math.round(p1Percent)
                    + "%. Pipe 2: " + Math.round(p2Percent) + "%");
        } else if(poolFull > volume){
            System.out.println("For " + hours + " hours the pool overflows with " + Math.round(exessiveLiters)+ " liters.");
        }
    }
}
