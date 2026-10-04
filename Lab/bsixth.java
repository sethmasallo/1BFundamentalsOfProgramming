import javax.swing.JOptionPane; // para magamit ang JOptionpane
public class bsixth {
    public static void main(String[] args) {

        String name = "";

        name = JOptionPane.showInputDialog("Please enter your name");
        //dito nag papakita ng input box para doon mag type yung user
        String msg = "Hello " + name + "!";
        // pag nag output lalabas ang hello plus name
        JOptionPane.showMessageDialog(null, msg);
        // ito naman ay nag papakita ng message box na may msg so yung msg ay nasa line 9
    }
}



// ito naman is Joption pane
