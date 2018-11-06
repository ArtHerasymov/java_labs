package com.my.lab1.applet;
import com.my.lab1.data.*;

import java.applet.Applet;
import java.awt.*;

public class TaskApplet extends Applet {

    private Data data;

     public void init() {
         this.data = new Data();
     }

     public void paint(Graphics g) {
         g.drawString("Surname: " + this.data.getSurname(), 50, 15);
         g.drawString(this.data.getCurrentDate(), 50, 35);
     }
}