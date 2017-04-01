import java.util.Scanner;

public class Ex09CharNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String letters = console.nextLine();
        int countLetters = 0;
        for (int i = 0; i < letters.length(); i++) {
            char currentLetter = letters.charAt(i);

            switch (currentLetter){
                case 'a' : countLetters += 1; break;
                case 'e' : countLetters += 2; break;
                case 'i' : countLetters += 3; break;
                case 'o' : countLetters += 4; break;
                case 'u' : countLetters += 5; break;
            }
        }
        System.out.println(countLetters);
    }
}
