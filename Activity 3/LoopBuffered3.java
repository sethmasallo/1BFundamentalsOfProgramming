import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoopBuffered3 {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //varibles

        double balance = 20000.00;
        double amount;

        System.out.println("Current balance: " + balance);

        System.out.print("Enter amount (0 to stop): ");
        amount = Double.parseDouble(br.readLine());
        // start ng looping gamit ang while loop
        while (amount != 0 ){
            if (amount > 0){
                balance += amount;
                System.out.println("Deposit Successful! ");
            }
            else if (amount < 0){
                if (balance >= Math.abs(amount)){
                    balance += amount;
                    System.out.println("Withdrawal  Successful! ");
                }
            }else {
                System.out.println("INSUFFICIENT FUNDS! ");
            }
            System.out.printf("Outstanding Balance: %.2f\n", balance );
            System.out.print("\nEnter amount (0 to stop): ");
            amount = Double.parseDouble(br.readLine());
        }
            System.out.printf("\nFinal Balance: %.2f\n", balance);
        System.out.println("Thank you for using Mucho Dinero! ");

        br.close();
    }
}
