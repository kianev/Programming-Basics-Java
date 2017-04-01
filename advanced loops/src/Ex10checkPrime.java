import java.util.Scanner;
public class Ex10checkPrime {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int devider = 2;
        int maxDevider = (int)Math.sqrt(n);
        boolean prime = true;
        if(n < 2) {
            prime = false;
        }
        while (prime && devider <= maxDevider){
            if(n % devider == 0){
                prime = false;
            }
            devider++;
        }

        if(prime){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }}
