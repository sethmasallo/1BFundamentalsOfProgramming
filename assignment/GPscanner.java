import java.util.Scanner;

public class GPscanner { // GROSS PAY Scanner
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        
        // variable
        double HourlyPayRate;
        double HoursWorked;
        double GrossPay;
        double TaxRate;
        double WithHoldingtax;
        double Netpay;
        
        System.out.print("Enter Hourly Pay Rate: ");
        HourlyPayRate=scanner.nextDouble();
        
        System.out.print("Enter Hours Worked: ");
        HoursWorked=scanner.nextDouble();


        GrossPay = HourlyPayRate * HoursWorked;

        if (GrossPay <= 2000){
            TaxRate = 0.10;
        } else if (GrossPay <= 4000) {
            TaxRate = 0.12;
        } else if (GrossPay <= 10000) {
            TaxRate = 0.15;
        } else  {
            TaxRate = 0.20;
        }

        WithHoldingtax = GrossPay * TaxRate;
        Netpay = GrossPay - WithHoldingtax;

        System.out.println("PayRoll Result: ");
        System.out.println("Gross Pay: " + GrossPay);
        System.out.println("Tax Rate: " + (TaxRate * 100 ) + "%");
        System.out.println("WithHolding Tax: " + WithHoldingtax);
        System.out.println("Net Pay: " + Netpay);
    }
}
