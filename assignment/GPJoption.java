import javax.swing.*;

public class GPJoption { // Joptionn
    public static void main(String[] args) {

        double HourlyPayRate;
        double HoursWorked;
        double TaxRate;
        double GrossPay;
        double WithHoldingTax;
        double NetPay;


        HourlyPayRate = Double.parseDouble(JOptionPane.showInputDialog("Enter Hourly Pay Rate"));
        HoursWorked = Double.parseDouble(JOptionPane.showInputDialog("Enter Hours Worked"));

        GrossPay = HourlyPayRate * HoursWorked;

        if (GrossPay <= 2000) {
            TaxRate = 0.10;
        } else if (GrossPay <= 4000){
            TaxRate = 0.12;
        } else if (GrossPay <= 10000) {
            TaxRate = 0.15;
        } else  {
            TaxRate = 0.20;
        }

        WithHoldingTax = GrossPay  * TaxRate;
        NetPay = GrossPay - WithHoldingTax;

JOptionPane.showMessageDialog(null,

        "PayRoll Result:  " + "\n" +
                "GrossPay: " + GrossPay + "\n" +
                "Tax Rate: " + (TaxRate * 100 )+ "\n" +
                "WithHolding tax: " + WithHoldingTax + "\n" +
                "Net Pay: " + NetPay
        );
    }
}
