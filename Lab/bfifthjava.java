import java.util.Scanner; // para magamit ang scanner
public class bfifthjava {
    public static void main(String[] args) {

        String name = "Seth Masallo"; // data type and variable
        int age = 20; // data type and variable

        Scanner inputDevice = new Scanner(System.in);
        // gumagawa ng scanner at kumuha ng input
        System.out.print("Please enter your name: ");
        name = inputDevice.nextLine(); // kinukuha ang text/name na tinatype ng user
        System.out.print("Please enter your age: ");
        age = inputDevice.nextInt(); // same sa taas ito naman ay whole num/age na tinatype ng user
        System.out.println("Your name is " + name + " and you are " + age + " years old.");

    }
}

// ito naman ay scanner
