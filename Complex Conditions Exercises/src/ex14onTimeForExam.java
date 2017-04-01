import java.util.Scanner;

public class ex14onTimeForExam {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int hourExam = Integer.parseInt(console.nextLine());
        int minutesExam = Integer.parseInt(console.nextLine());
        int hourArrival = Integer.parseInt(console.nextLine());
        int minuteArrival = Integer.parseInt(console.nextLine());

        if (hourArrival == hourExam) {
            if (minuteArrival == minutesExam) {
                System.out.println("On time");
            } else if (minuteArrival > minutesExam) {
                System.out.println("Late");
                System.out.println(Math.abs(minuteArrival - minutesExam) + " minutes after the start");
            } else if ((minuteArrival < minutesExam) && (Math.abs(minuteArrival - minutesExam) < 30)) {
                System.out.println("On time");
                System.out.println(Math.abs(minutesExam - minuteArrival) + " minutes before the start");
            } else if (minuteArrival < minutesExam) {
                System.out.println("Early");
                System.out.println(Math.abs(minutesExam - minuteArrival) + " minutes before the start");
            }
        } else if ((hourArrival > hourExam) && (hourArrival - hourExam == 1)) {
            if (minuteArrival == minutesExam) {
                System.out.println("Late");
                System.out.println((hourArrival - hourExam) + ":00 hours after the start");
            } else if (minuteArrival < minutesExam) {
                System.out.println("Late");
                System.out.println(60 - Math.abs(minutesExam - minuteArrival) + " minutes after the start");
            } else if (minuteArrival > minutesExam) {
                System.out.println("Late");
                if ((minuteArrival - minutesExam) < 10) {
                    System.out.println((hourArrival - hourExam) + ":0" + (minuteArrival - minutesExam) + " hours after the start");
                } else {
                    System.out.println((hourArrival - hourExam) + ":" + (minuteArrival - minutesExam) + " hours after the start");
                }
            }
        } else if ((hourArrival > hourExam) && (hourArrival - hourExam > 1)) {
            if (minuteArrival == minutesExam) {
                System.out.println("Late");
                System.out.println((hourArrival - hourExam) + ":00 hours after the start");
            } else if (minuteArrival < minutesExam) {
                System.out.println("Late");
                System.out.println((hourArrival - hourExam - 1) + ":" + (60 - Math.abs(minutesExam - minuteArrival) + " minutes after the start"));
            } else if (minuteArrival > minutesExam) {
                System.out.println("Late");
                if ((minuteArrival - minutesExam) < 10) {
                    System.out.println((hourArrival - hourExam) + ":0" + (minuteArrival - minutesExam) + " hours after the start");
                } else {
                    System.out.println((hourArrival - hourExam) + ":" + (minuteArrival - minutesExam) + " hours after the start");
                }
            }
        } else if ((hourArrival < hourExam) && (hourExam - hourArrival == 1)) {
            if (minuteArrival == minutesExam) {
                System.out.println("Early");
                System.out.println((hourExam - hourArrival) + ":00 hours before the start");
            } else if (minuteArrival < minutesExam) {
                System.out.println("Early");
                System.out.println((hourExam - hourArrival) + ":" + (minutesExam - minuteArrival) + " hours before the start");
            } else if (60 - minuteArrival + minutesExam <= 30) {
                System.out.println("On time");
                System.out.println((60 - minuteArrival) + " minutes before the start");
            } else if (minuteArrival > minutesExam) {
                System.out.println("Early");
                System.out.println(Math.abs(minuteArrival - 60) + minutesExam + " minutes before the start");
            }

        } else if (hourArrival < hourExam) {
            if (minuteArrival == minutesExam) {
                System.out.println("Early");
                System.out.println((hourExam - hourArrival) + ":00 hours before the start");
            } else if (minuteArrival > minutesExam) {
                System.out.println("Early");
                if (minuteArrival - minutesExam < 10) {
                    System.out.println((hourExam - hourArrival) + ":0" + (minuteArrival - minutesExam) + " hours before the start");
                } else {
                    System.out.println((hourExam - hourArrival) + ":" + (minuteArrival - minutesExam) + " hours before the start");
                }
            } else if (minuteArrival < minutesExam) {
                System.out.println("Early");
                if (minutesExam - minuteArrival < 10) {
                    System.out.println((hourExam - hourArrival) + ":0" + (minutesExam - minuteArrival) + " hours before the start");
                } else {
                    System.out.println((hourExam - hourArrival) + ":" + (minutesExam - minuteArrival) + " hours before the start");
                }
            }
        }
    }
}





