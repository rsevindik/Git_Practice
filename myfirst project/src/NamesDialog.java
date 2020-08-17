import javax.swing.JOptionPane; // this may end with * instead JOptionPane.!
/**
 This program demonstrates using dialogs with JOptionPane.
 */
public class NamesDialog {
    public static void main(String[] args) {

        String firstName, middleName, lastName;

        // Get the user's first name.

        firstName = JOptionPane.showInputDialog("What is " + "your first name? ");

        // Get the user's middle name.

        middleName = JOptionPane.showInputDialog("What is " + "your middle name? ");

        // Get the user's last name.

        lastName = JOptionPane.showInputDialog("What is " + "your last name? ");

        //Display a greeting
        JOptionPane.showMessageDialog(null, "Hello " + firstName + " " + middleName + " "
                + lastName);

        System.exit (0);
    }
}
