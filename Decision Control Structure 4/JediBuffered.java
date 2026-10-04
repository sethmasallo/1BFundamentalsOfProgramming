import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JediBuffered {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double height;
        int age;
        String citizenship;
        String recommendee;

        System.out.print("Enter your height: ");
        height = Double.parseDouble(br.readLine());

        System.out.print("Enter your age: ");
        age = Integer.parseInt(br.readLine());

        System.out.print("Enter your citizenship (C/N): ");
        citizenship = br.readLine();

        System.out.print("Enter your recommendee (R/N): ");
        recommendee = br.readLine();

        if (recommendee.equals("R")) {
            System.out.print("Accepted:");
        } else if (height >= 200 && age >= 21 && age <= 25 && citizenship.equals("C")) {
            System.out.println("Accepted:");
        } else {
            System.out.println("REJECTED:");
        }
    }
}