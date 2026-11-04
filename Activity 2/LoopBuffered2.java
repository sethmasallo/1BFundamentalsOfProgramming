import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoopBuffered2 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Loop buffered activity 2

        int n;

        for (int i = 2; i <= 80; i += 2){
            System.out.print(i + " " );

            if( i % 20 == 0){
                System.out.println();
            }
        }
    }
}
