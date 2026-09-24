import javax.swing.JOptionPane;
public class bsixth {
    public static void main(String[] args) {

        String name = "Seth Masallo";

        name = JOptionPane.showInputDialog("Please enter your name");

        String msg = "Hello " + name + "!";
        JOptionPane.showMessageDialog(null, msg);
    }
}





