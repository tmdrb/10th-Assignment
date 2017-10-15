package Assignment10;
import java.awt.*;
import javax.swing.*;

 class MyFrame8 extends JFrame {
	       public MyFrame8() {
	 
	             setTitle("BorderLayoutTest");
	             setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	             setLayout(new BorderLayout());
	 
	           
	             add(new JButton("Center"), BorderLayout.CENTER);
	             add(new JButton("Line Start"), BorderLayout.LINE_START);
	             add(new JButton("Line End"), BorderLayout.LINE_END);
	             add(new JButton("Page Start"), BorderLayout.PAGE_START);
	             add(new JButton("Page End"), BorderLayout.PAGE_END);
	 
	             pack();
	             setVisible(true);
	       }
	}

public class Test{
public static void main(String[] args) {
	MyFrame8 a = new MyFrame8();
}
}