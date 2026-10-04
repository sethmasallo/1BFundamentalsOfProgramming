import java.util.Scanner;

public class JediScanner {
    public static void main(String[] args) {

        // variablesssss
        double height;
        int age;
        String citizenship;
        String recommendee;

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your height:  ");
        height=scanner.nextDouble();

        System.out.print("Enter your age:  ");
        age=scanner.nextInt();

        System.out.print("Enter citizenship (C/N): ");
        citizenship=scanner.next();

        System.out.print("Enter your recommendee (R/N): ");
        recommendee=scanner.next();

        if ( recommendee.equals("R") ) {
            System.out.println("Accepted:");
        } else if ( height >= 200 && age >= 21 && age <= 25 && citizenship.equals("C") ) {
            System.out.println("Accepted:");
        }else  {
            System.out.println("Rejected:");
        }
    }
}
