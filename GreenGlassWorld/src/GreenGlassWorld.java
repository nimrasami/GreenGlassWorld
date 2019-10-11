
import java.util.Scanner;

public class GreenGlassWorld {

    //Make sure the input is a word not a phrase
    //No numbers only letters
    public static boolean wordNotPhrase(String input) {
        char[] inputChar = input.toCharArray();
        for (int x = 0; x < input.length(); x++) {
            if (!Character.isAlphabetic(inputChar[x])) {
                //Tell the user to input a single word and or just letters not numbers
                System.out.println("Please enter a word not a phrase");
                return false;
            }
        }
        return true;
    }

    //Condition to check if in the GreenGlassWorld or not
    public static boolean inGreenGlassWorld(String input) {
        if (input.length() <= 1) {
            return false;
        }
        for (int y = 1; y < input.length(); y++) {
            if (input.charAt(y - 1) == input.charAt(y)) {
                return true;
            }
        }
        return false;
    }

    //Main class
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Ask user for the input
        System.out.println("Enter a word:");
        String z = input.nextLine();

        //Ask user for the input
        while (!wordNotPhrase(z)) {
            System.out.println("Enter a word:");
            z = input.nextLine();
        }
        
        //Check if in the GreenGlassWorld or not
        if (inGreenGlassWorld(z)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

}
