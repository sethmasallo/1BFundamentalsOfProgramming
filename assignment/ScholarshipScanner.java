import java.util.Scanner;

public class ScholarshipScanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        // variable

        double nsatscore;
        double salary;
        double entrance;

        System.out.print("Enter the NSAT score: ");
        nsatscore=scanner.nextDouble();

        System.out.print("Enter the salary: ");
        salary=scanner.nextDouble();

        System.out.print("Enter the entrance: ");
        entrance=scanner.nextDouble();

        if (nsatscore < 90 ||  salary  > 10000 || entrance < 85) {
            System.out.println("REJECTED:");
        } else if (salary <= 3500 && (nsatscore + entrance) /2 >= 90 ) {
            System.out.println("ACCEPTED:");
        } else{
            System.out.println("FOR FURTHER STUDY:");
        }
    }
}
