import javax.swing.*;

public class Assignment3 {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Enter a year: ");
        int year = Integer.parseInt(input);

        if (year % 4 == 0) {
            JOptionPane.showMessageDialog(null, "is a leap year");
        } else{
            JOptionPane.showMessageDialog(null, "is not a leap year");
        }

    }
}
