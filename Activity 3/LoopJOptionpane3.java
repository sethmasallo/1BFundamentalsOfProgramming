import javax.swing.*;

public class LoopJOptionpane3 {
    public static void main(String[] args) {
        // variables
        double balance = 20000.00;
        double amount;

        String output = "Starting Balance: " + balance + "\n";

        amount = Double.parseDouble(JOptionPane.showInputDialog("Enter amount ( 0 to stop): "));
        // start ng while loop and gumamit ng if else
        while (amount != 0) {

            if (amount > 0) {
                balance += amount;
                output  += "Deposit Successfully: " + "\n";
            }
            else if(amount < 0){

                if(balance >= Math.abs(amount)){
                    balance +=  amount;
                    output  += "Withdrawal Successful! \n";
                }
                else{
                    output += "INSUFFICIENT FUNDS! \n";
                }
            }
            output += String.format("Outstanding Balance:  %.2f\n", balance);
            amount = Double.parseDouble(JOptionPane.showInputDialog("Enter amount ( 0 to stop): "));
        }
        output += String.format("\nFinal Balance:  %.2f\n", balance);
        JOptionPane.showMessageDialog(null, output);
    }
}