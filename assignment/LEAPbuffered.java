import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LEAPbuffered {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a year: ");
        int year = Integer.parseInt(br.readLine());

        if (year % 4 == 0) {
            System.out.println(year + " is a leap year");
        }else {
            System.out.println(year + " is not a leap year");
        }
    }
}
