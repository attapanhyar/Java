import java.awt.*;
import javax.swing.*;

public class GUITest{
	
	JFrame myFrame;
	//JTextField tf;
	JButton b1,b2,b3,b4,b5;
	public void initGUI(){
		myFrame = new JFrame();
		Container c = myFrame.getContentPane();
		//c.setLayout(new FlowLayout());
		c.setLayout(new GridLayout(2,3,10,20));
		JTextField tf = new JTextField(10);
		b1 = new JButton("Next ");
		b2 = new JButton("Previous");
		b3 = new JButton("Back to Strat");
		b4 = new JButton("Last Slide");
		b5 = new JButton("Exit");
		//c.add(tf);
		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(b4);
		c.add(b5);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(400,400);
		myFrame.setVisible(true);
		
		
	}
	public GUITest(){
		initGUI();
		
	}
	
	public static void main(String args[]){
		GUITest gui = new GUITest();
		
		
	}
	
	
}