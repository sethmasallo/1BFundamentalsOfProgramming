import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoopBuffered1 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num,highest,lowest;

        System.out.print("Enter a number 1: ");
        num = Integer.parseInt(br.readLine());

        highest = num;
        lowest = num;

        for(int i = 2; i <= 10; i++) {
            System.out.print("Enter a number " + i + ": ");
            num = Integer.parseInt(br.readLine());

            if (num > highest) {
                highest = num;
            }
            if (num < lowest) {
                lowest = num;
            }
        }
            System.out.println("\nHighest number is: " + highest);
            System.out.println("Lowest number is: " + lowest);

            br.close();
    }
}
