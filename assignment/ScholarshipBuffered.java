import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScholarshipBuffered { //BufferedReader
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double Nsatscore;
        double salary;
        double entrance;

        System.out.print("Enter Nsat score: ");
        Nsatscore = Double.parseDouble(br.readLine());

        System.out.print("Enter salary: ");
        salary = Double.parseDouble(br.readLine());

        System.out.print("Enter entrance: ");
        entrance = Double.parseDouble(br.readLine());

        if(Nsatscore < 90 || salary > 10000 || entrance < 85) {
            System.out.println("REJECTED:");
        } else if (salary <= 3500 && (Nsatscore + entrance) /2 >= 90 ) {
            System.out.println("ACCEPTED:");
        } else {
            System.out.println("FOR FURTHER STUDY:");
        }
    }
}
