public class prob2 {
    public static void main(String[] args) {

        double [] temp = new double[5]; // dito is array lang siya double ginamit ko kasi may decimal
        temp[0] = 32.5; // 0 tatawagin niya yung temp 0 which is 1 yon
        temp[1] = 34.0; // dito pag tinawag mo yung 1 lalabas yung 34.0
        temp[2] = 31.8; // ganon din dito same lang hanggang sa temp [4] or temp 5 normal na bilang
        temp[3] = 33.2;
        temp[4] = 35.1;

        for (int i = 0; i < temp.length; i++) { //

            System.out.println("Day " + (i + 1) + ": " + temp[i]); // i + 1 para lumabas ang day 1 hindi 0

        }
        temp[2] = 32.0; // papalitan yung temp [2] ng 32.0 so yung output niya is 32.0 na hindi 31.8

        System.out.println( "Updated temperature for day 3: " + temp[2]);
        //nag sop ulit para makita yung updated na value kasi nag palit tayo sa temp [2]

    }
}
