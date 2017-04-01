import java.util.Scanner;
public class Ex14minutes15 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int hours = Integer.parseInt(console.nextLine());
        int minutes = Integer.parseInt(console.nextLine());

        if(minutes <= 44){
            minutes += 15;
            System.out.println(hours + ":" + minutes);
        } else if ((minutes >= 45) && (minutes <= 54) && (hours < 23)) {
            hours += 1;
            minutes -= 45;
            System.out.println(hours + ":0" + minutes);
        } else if((minutes >= 55) && (hours < 23)){
                hours += 1;
                minutes -= 45;
                System.out.println(hours + ":" + minutes);
            }  else if ((minutes >= 45) && (minutes <= 54) && (hours == 23)) {
            hours = 0;
            minutes -= 45;
            System.out.println(hours + ":0" + minutes);
        } else if((minutes >= 55) && (hours == 23)){
            hours = 0;
            minutes -= 45;
            System.out.println(hours + ":" + minutes);
        }
        }
    }

