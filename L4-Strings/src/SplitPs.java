import javax.swing.*;

public class SplitPs {

    /*
    Assuming a String has a P, return a String containing the first p and the next 3 letters.

    "Hippopotamus" -> ppop
     */

    /*
    1. get the input - p and the next three letters
    2. isolate p
    3. isolate the last three letters
    4.output the letters
     */

    public static void main(String[] args) {

        String word = JOptionPane.showInputDialog("Enter a word with a p: ");

        JOptionPane.showMessageDialog(null, splitP(word));
    }
    public static String splitP (String word){

        int pIndex = word.indexOf('p');

        return word.substring(pIndex, pIndex + 4);

    }

}