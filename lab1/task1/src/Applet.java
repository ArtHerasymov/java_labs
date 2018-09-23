package lab1.task1;
import javax.swing.*;
import java.util.*;
import java.text.*;
import java.time.*;

public class Applet{
    public void getWindow(String surname){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	    Date date = new Date();
        JOptionPane.showMessageDialog(null, "Surname: " + surname + "\nDate: " + dateFormat.format(date));
    }
}