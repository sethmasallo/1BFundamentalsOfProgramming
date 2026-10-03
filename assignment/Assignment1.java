import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Assignment1 {
    public static void main(String[] args) throws IOException {

        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter year: ");
            int year = Integer.parseInt(br.readLine());

            if(year % 4 == 0){
                System.out.println("is a leap year");
            } else{
                System.out.println("is not a leap year");
            }
        } catch (IOException e){
            System.out.println("INPUT ERROR");
        }
    }
}