import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GPbuffered { // Bufferedreader
    public  static void main(String[] args) throws IOException {

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        double HourlyPayRate;
        double HoursWorked;
        double GrossPay;
        double TaxRate;
        double WithHoldingTax;
        double NetPay;

        System.out.print("Enter Hourly Pay Rate:");
        HourlyPayRate = Double.parseDouble(reader.readLine());

        System.out.print("Enter Hours Worked:");
        HoursWorked = Double.parseDouble(reader.readLine());

        GrossPay =  HourlyPayRate * HoursWorked;

        if (GrossPay <= 2000) {
            TaxRate = 0.10;
        } else if (GrossPay <= 4000) {
            TaxRate = 0.12;
        } else if (GrossPay <= 10000){
            TaxRate = 0.15;
        } else  {
            TaxRate = 0.20;
        }

        WithHoldingTax = GrossPay * TaxRate;
        NetPay = GrossPay - WithHoldingTax;

        System.out.println("PayRoll Result: ");
        System.out.println("Gross Pay: " + GrossPay);
        System.out.println("Tax Rate: " + (TaxRate * 100) + "%" );
        System.out.println("With Holding Tax: " + WithHoldingTax);
        System.out.println("Net Pay: " + NetPay);

    }
}
