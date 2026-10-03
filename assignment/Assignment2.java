import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scan.nextInt();

        if (year % 4 == 0) {
            System.out.print("is a leap year");
        } else {
            System.out.print("is not a leap year");
        }
    }
}
