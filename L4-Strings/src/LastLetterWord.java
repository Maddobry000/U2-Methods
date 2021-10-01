import javax.swing.*;

public class LastLetterWord {

    /*
    Create a program that takes the last 3 letters of each String
    and outputs them as one string.

    Use a method to find and return the last three letters and a string parameter.

    Ex:  Goodbye, Hello, Morning -> byelloing
    */

    /*
    1. grab input
    2. make a method that takes away the last three letters
    3. isolate the last letters of any word
    4.combine the last three words
    5.output the words
     */

    public static void main(String[] args) {

        String word1 = JOptionPane.showInputDialog("Enter word 1: ");
        String word2 = JOptionPane.showInputDialog("Enter word 2: ");
        String word3 = JOptionPane.showInputDialog("Enter word 3: ");

        JOptionPane.showMessageDialog(null, lastThree(word1) + lastThree(word2) + lastThree(word3));
        System.exit(0);
    }

    public static String lastThree(String word){

        return word.substring(word.length()-3);


    }

}