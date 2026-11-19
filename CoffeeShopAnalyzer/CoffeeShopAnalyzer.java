public class CoffeeShopAnalyzer { // ito pangalan ng class
    public static void main(String[] args) { // ito ay method kung saan mag sisimula ang prog

        //variables

        int TotalSales = 0; // nag declare ng variables
        int highest = Integer.MIN_VALUE; //ito yung pinaka mababang value para mahanap yung highest sales
        int lowest = Integer.MAX_VALUE; //ito naman yung pinaka mataas na value para mahanap yung lowest sales
        String bestDay = "", worstDay = ""; // dito ilalagay kung saan yung pinaka mataas at mababa na sakes

        int [] weeklySales = {120, 145, 130, 155, 180, 210, 195};
        //dito nakalagy yung bialang ng cups nabenta kada-araw
        String[] daysofWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        // ito naman yung pangalan ng araw ng bawat sales

        System.out.println("\n===== Daily Sales ====="); // pinapakita dito yung heading para sa daily sales
        for(int i = 0; i < weeklySales.length; i++){ //umpisa ng loop para ma check lahat ng sales sa array
            System.out.println(daysofWeek[i] + " sales" + ": " + weeklySales[i]); //pinapakita ang benta sa bawat araw
            TotalSales += weeklySales[i]; //dinadagdag natin yung sales kada araw para makuha yung total sales.

            if(weeklySales[i] > highest){ //check kung mas mataas yung current sales sa naunang highest.
                highest = weeklySales[i]; // kapag mas mataas, papalitan natin yung highest value.
                bestDay = daysofWeek[i]; // save natin kung anong araw nakuha yung highest sales.
            } // pag hinto ng if
            if(weeklySales[i] < lowest){ // check naman kung mas mababa yung current sales sa lowest.
                lowest = weeklySales[i]; // Kapag mas mababa, papalitan natin yung lowest value.
                worstDay = daysofWeek[i]; //save natin kung anong araw nakuha yung lowest sales.
            } // pag hinto ng if
        } // close ng loop
        double average = (double) TotalSales/weeklySales.length;
        //Kinukuha natin yung average sales ng paghati ng total sales sa bilang ng araw.
        System.out.println("\n===== Weekly Summary ====="); // pinapakita yung heading para sa weekly summary.
        System.out.println("Total Sales: " + TotalSales + " cups"); //Pinapakita kung ilan lahat na cups ang nabenta sa buong week.
        System.out.println("Highest Sales: " + highest + " cups"); //pinapakita ang pinaka mataas na sales.
        System.out.println("Average Sales: " + average + " cups"); // ito naman yung average na sales.
        System.out.println("Lowest Sales: " + lowest + " cups"); // dito pinapakita yung mababang sales.

        System.out.println("\n===== Best And Worst Day ====="); // pinapakita yung umpisa ng best and worst day.
        System.out.println("Best Day: " + bestDay); // dito pinapakita yung araw na pinaka maganda.
        System.out.println("Worst Day: " + worstDay); // dito naman yung araw na pinaka pangit na sales.

    } // pag tapos ng main method
} // pag tapos ng CoffeShopAnalyzer Class
