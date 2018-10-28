import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public static void main(String[] args) {
		FortuneCookie fc = new FortuneCookie();
		fc.showButton();
	}

	public FortuneCookie() {
		// TODO Auto-generated constructor stub
	}

	public void showButton() {
		System.out.println("Button clicked");
		JFrame frame = new JFrame();

		frame.setVisible(true);
		JButton button = new JButton("CLick here for a fortune");
		frame.add(button);
		button.addActionListener(this);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int rand = new Random().nextInt(5);
		if (rand == 1) {
			System.out.println("Today it's up to you to create the peacefulness you long for.");
		}
		if (rand == 2) {
			System.out.println("A friend asks only for your time not your money.");
		}
		if (rand == 3) {
			System.out.println("If you refuse to accept anything but the best, you very often get it.");
		}
		if (rand == 4) {
			System.out.println("A smile is your passport into the hearts of others.");
		}
		if (rand == 5) {
			System.out.println("A good way to keep healthy is to eat more Chinese food.");
		}
	}

}
