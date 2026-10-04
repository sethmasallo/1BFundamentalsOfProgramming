import javax.swing.*;

public class JediJoption {
    public static void main(String args[]) {

        double height;
        int age;
        String citizenship;
        String recommendee;

        height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        citizenship = JOptionPane.showInputDialog("Enter your citizenship (C/N):");
        recommendee = JOptionPane.showInputDialog("Enter your recommendee (R/N):");

        if(recommendee.equalsIgnoreCase("R")) {
            System.out.print("Accepted:");
            JOptionPane.showMessageDialog(null, "Accepted:");
        }else if (height >= 200 && age >= 21 && age <= 25 && citizenship.equals("C")) {
            System.out.print("Accepted:");
            JOptionPane.showMessageDialog(null ,"Accepted:");
        } else {
            System.out.print("Rejected:");
            JOptionPane.showMessageDialog(null, "Rejected");
        }
    }
}
