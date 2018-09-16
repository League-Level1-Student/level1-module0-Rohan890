import java.nio.charset.MalformedInputException;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class House {
	public static void main(String[] args) {
		Robot r2d2 = new Robot();
		r2d2.setX(100);
		r2d2.setY(500);
		r2d2.penDown();
	for (int i = 0; i < 5; i++) {
		
	
		String height = JOptionPane.showInputDialog("enter a number");
	int h = Integer.parseInt(height);
	r2d2.setSpeed(1000);	
	r2d2.move(h);
		r2d2.turn(45);
		r2d2.move(h);
		r2d2.turn(45);
		r2d2.turn(45);
		r2d2.move(h);
		r2d2.turn(45);
		r2d2.move(h);
	}
	}

	public House() {
		// TODO Auto-generated constructor stub
	
	}

}
