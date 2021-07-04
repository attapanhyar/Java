import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.Scanner;
class CatchTheRat extends JFrame
{

// The Rat

JLabel lb;


// Move it randomly!

Random r;


 public CatchTheRat(int k)
 {


 // Set frame properties

 setTitle("Catch The Rat");
 setLayout(new FlowLayout());
 setDefaultCloseOperation(EXIT_ON_CLOSE);
 setVisible(true);


 // Set the background (just for a good look)

 setContentPane(new JLabel(new ImageIcon("background.png")));


 // Set layout to the content pane
 getContentPane().setLayout(new FlowLayout());


 // Create the rat

 lb=new JLabel(new ImageIcon("rat.png"));


 // Add the rat

 getContentPane().add(lb);


 // Create Random object

 r=new Random();


 // Create a timer and call it for every k seconds

 new Timer(k,new ActionListener(){


  public void actionPerformed(ActionEvent ae)
  {
  

  // Move the rat randomly, subtract 75, so that the rat should not meet the edges
  
  lb.setLocation(r.nextInt(getWidth()-75),r.nextInt(getHeight()-75));


  }


 }).start();


 // Add mouselistener, notify when user clicks it!

 lb.addMouseListener(new MouseAdapter(){


  public void mouseClicked(MouseEvent me)
  {

    
  // Create a beep sound when clicked to notify

  Toolkit.getDefaultToolkit().beep();


  // Also print it!

  System.out.println("Caught!");

  
  }


 });


 // Maximize the frame

 setExtendedState(MAXIMIZED_BOTH);


 }


 public static void main(String args[])
 {


 // Create Scanner object

 Scanner s=new Scanner(System.in);


 // Let the user enter his capability of catching the rat!

 System.out.println("Enter the speed");


 // Read the input

 int k=s.nextInt();


 // Create the frame and send the value of k

 new CatchTheRat(k);


 }

}