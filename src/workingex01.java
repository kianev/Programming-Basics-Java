import java.util.Scanner;

public class workingex01 {
    public static void main(String[] args) {
        /*String str = "Pesho";
          String str2 = "Pesho";
          if( str == str2){
              System.out.println("true");  //true
          }else{
              System.out.println("false");
          }*/

        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        String str2 = console.nextLine();
        if( str == str2){
            System.out.println("true");
        }else{
            System.out.println("false"); // false
        }

        if( str.equals(str2)){
            System.out.println("true");
        }else{
            System.out.println("false"); // false
        }
    }
}
