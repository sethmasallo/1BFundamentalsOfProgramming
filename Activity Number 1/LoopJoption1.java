import javax.swing.*;
public class LoopJoption1 {
    public static void main(String[] args) {

        // variabless

        int num;
        int highest;
        int lowest;

        num = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number"));
        highest = num;
        lowest = num;

        // looping, for loop

        for(int i = 2; i <= 10; i++){
            JOptionPane.showMessageDialog(null,"Enter a number " + i + ": ");
            num = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number: "));
            if(num > highest){
                highest = num;
            }
            if(num < lowest){
                lowest = num;
            }
        }
        JOptionPane.showMessageDialog(null, "Highest number is: " + highest + "\n Lowest number is: " + lowest);
    }
}
