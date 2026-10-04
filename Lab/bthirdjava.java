import java.io.BufferedReader; //use for buffered reader
import java.io.IOException; // to handle possible input error
import java.io.InputStreamReader; //
// astig
public class bthirdjava {
    public static void main(String[] args){

        BufferedReader dataln = new BufferedReader(new InputStreamReader(System.in));
        //gumagawa ng reader para makapag input

        String name = "Please input your name";
        System.out.print( "Input "); // papakita ng input sa screen
        try{
            name = dataln.readLine();
        } catch (IOException e){ // hinahandle and error sa input
            System.out.println("Error!"); }
        System.out.println("Hello " +  name + "!");
    }
}
// buffered reader siya
