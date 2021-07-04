import java.awt.*;
import javax.swing.*;

public class BorderLayoutTest1 {
	
	JFrame myFrame;
	
	//JTextField tf;
	JButton b1,b2,b3,b4,b5;
	public void initGUI(){
		myFrame = new JFrame();
		Container c = myFrame.getContentPane();
		Panel p = new Panel();
    p.setLayout(new BorderLayout());
    p.add(new Button("Okay"), "South");
		
		
		
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(400,400);
		myFrame.setVisible(true);
		
		
	}
	public BorderLayout(){
		initGUI();
		
	}
	
	public static void main(String args[]){
		BorderLayout gui = new BorderLayout();
		
		
	}
	
	
}