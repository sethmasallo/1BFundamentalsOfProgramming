import javax.swing.JOptionPane;

public class LEAPJoption {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Enter year: ");
        int year = Integer.parseInt(input);

        if  (year % 4 == 0){
            JOptionPane.showMessageDialog(null, " is a leap year");
        } else{
            JOptionPane.showMessageDialog(null, " is not a leap year");
        }

    }
}
