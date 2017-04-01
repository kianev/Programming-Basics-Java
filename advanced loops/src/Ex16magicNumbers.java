import java.util.Scanner;

public class Ex16magicNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        for (int i = 1; i <= n ; i++) {
            if(i > 9)break;
            for (int j = 1; j <= n ; j++) {
                if(j > 9)break;
                for (int k = 1; k <= n ; k++) {
                    if(k > 9)break;
                    for (int l = 1; l <= n ; l++) {
                        if(l > 9)break;
                        for (int m = 1; m <= n ; m++) {
                            if(m > 9)break;
                            for (int o = 1; o <= n ; o++) {
                                if(o > 9)break;
                                if((j * i * k * l * m * o) == n){
                                    System.out.printf("%d%d%d%d%d%d ",i,j,k,l,m,o);

                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
