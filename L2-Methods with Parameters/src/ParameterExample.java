import javax.swing.*;

public class ParameterExample {

    public static void main(String[] args) {
        area(4, 3);
       // perimeter();
    }

    public static void area(double width, double length){


        double area = width * length;
        JOptionPane.showMessageDialog(null, "The area is " + area);
    }

    public static void perimeter(){
        double width = Double.parseDouble(JOptionPane.showInputDialog("What is the width?"));
        double length = Double.parseDouble(JOptionPane.showInputDialog("What is the length"));

        double perimeter = 2 * width + 2 *  length;
        JOptionPane.showMessageDialog(null, "The area is " + perimeter);
    }
}
