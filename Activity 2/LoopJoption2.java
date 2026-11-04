import javax.swing.*;

public class LoopJoption2 {
    public static void main(String[] args){

        int num;
        String output = "";


        for (int i = 2; i <= 80; i += 2){
            output += i + " ";

            if( i % 20 == 0){
               output += "\n";
            }
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
