import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isPalindrom = true;
        char repeat;

        do{
            System.out.println("Input a word: ");
            String userInput = scanner.nextLine();

            String cleanInput = userInput.replaceAll("[^a-zA-Z]", "").toLowerCase();
            int length = cleanInput.length();

            for(int i=0;i<length/2;i++){
                if (cleanInput.charAt(i) != cleanInput.charAt(length - 1 - i)){
                    isPalindrom = false;
                    break;
                }
            }

            if(isPalindrom){
                System.out.println("The word is Palindrome");
                System.out.println(cleanInput);
            }else{
                System.out.println("The word is not Palindrome");
                System.out.println(cleanInput);
            }

            System.out.println("Do you want to try again? (Y/N): ");
            repeat = scanner.next().charAt(0);
            scanner.nextLine();

        } while (repeat == 'Y' || repeat == 'y');
        System.out.println("Thanks for playing!");


    }
}