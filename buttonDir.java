 import java.awt.*;
 import java.applet.Applet;
 public class buttonDir extends Applet {
   public void init() {
     setLayout(new BorderLayout());
     add("North",  new Button("North"));
     add("South",  new Button("South"));
     add("East",   new Button("East"));
     add("West",   new Button("West"));
     add("Center", new Button("Center"));
   }
 }