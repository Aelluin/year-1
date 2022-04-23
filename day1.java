import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;

public class day1 {

    public static void main(String[] args) {

        JTextArea myArea = new JTextArea(10, 20);

        String yes;
        String no;

        // Asking the user if he/she want to start coding
        int greetings = JOptionPane.showConfirmDialog(null, "Do you wish to start coding?",
                "Greeting the user", JOptionPane.YES_NO_OPTION);

        // strings (yes or no)
        yes = "Great, press 'OK' to enter your name!";
        no = "Ohh okay I'll be waiting until you're ready!";

        // if yes, then...
        if (greetings == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, yes, "Next step", JOptionPane.PLAIN_MESSAGE);

            // if no, then...
        } else if (greetings == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, no, "Take a good rest!", JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        }
        // asking the user to input his/her first and last name
        String first_name;
        first_name = JOptionPane.showInputDialog(null, "What is your first name? ", JOptionPane.QUESTION_MESSAGE);
        String last_name;
        last_name = JOptionPane.showInputDialog(null, "What is your last name?", JOptionPane.QUESTION_MESSAGE);

        // message to the user
        myArea.setText("\n            Hello! " + first_name + " " + last_name + "!"
                + "\n\n\n              Goodluck cramming! :>"
                + "\n\n\n\n                            (>_<)");

        // setting font and colors
        myArea.setFont(new Font("Tahoma", Font.BOLD, 18));
        myArea.setBackground(Color.blue);
        myArea.setForeground(Color.white);
        JOptionPane.showMessageDialog(null, myArea, "Happy coding!", JOptionPane.PLAIN_MESSAGE);
    }

}