import java.util.Arrays;

public class prob1 {
    public static  void main(String []args){

        String [][] seats ={ {"Alice", "Bob", "Charlie"}, {"David", "Emma", "Frank"}
        // dito pag gamit ng 2d array yung row 1 is alice to charli sa row 2 david to frank
        };
        System.out.println(seats[1][2]); // dito nag print ng seats 1, 2 it means tinatawg yung row 1 and row 2
        seats[0][1] = "Vacant"; // dito is sa row 1 papalitan ng vacant si bob kasi sa row 1 siya yung number 1
        System.out.println(Arrays.deepToString(seats)); // deepn to string para magamit ang 2d arrays
    }
}
