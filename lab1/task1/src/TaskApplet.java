import java.applet.Applet;
import java.awt.*;
public class TaskApplet extends Applet {

     private String date;
     private String surname = "SurnameTest";
     public void init() {
         date = new java.util.Date().toString();
     }
     public void paint(Graphics g) {

         g.drawString("Surname: " + surname, 50, 15);
         g.drawString(date, 50, 35);
     }
}