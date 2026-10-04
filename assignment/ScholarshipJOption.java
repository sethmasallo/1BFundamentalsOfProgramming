import javax.swing.*;

public class ScholarshipJOption {
    public static void main(String[] args) {

        double Nsatscore;
        double salary;
        double entrance;

        Nsatscore = Double.parseDouble(JOptionPane.showInputDialog("Enter Nsat score"));
        salary = Double.parseDouble(JOptionPane.showInputDialog("Enter salary"));
        entrance = Double.parseDouble(JOptionPane.showInputDialog("Enter entrance"));


        if (Nsatscore   < 90 || salary  > 10000 || entrance  < 85) {
            System.out.println("REJECTED: ");
            JOptionPane.showMessageDialog(null, "REJECTED");
        } else if (salary <= 3500 && (Nsatscore + entrance) /2 >= 90 ) {
            System.out.println("ACCEPTED: ");
            JOptionPane.showMessageDialog(null, "ACCEPTED");
        } else {
            System.out.println("FOR FUTHER STUDY: ");
            JOptionPane.showMessageDialog(null, "FOR FUTHER STUDY");

        }
    }
}
