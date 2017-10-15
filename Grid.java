package Assignment10;
import java.awt.*;
import javax.swing.*;
 
class MyFrame9 extends JFrame {
       public MyFrame9() {
 
             setTitle("GridLayoutTest");
             setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
             setLayout(new GridLayout(0, 3));	
 
             add(new JButton("Button1"));
             add(new JButton("Button2"));
             add(new JButton("Button3"));
             add(new JButton("B4"));
             add(new JButton("Long Button5"));
 
             pack();
             setVisible(true);
       }
}

public class Grid {
	public static void main(String[] args) {
		MyFrame9 a = new MyFrame9();
	}
}
