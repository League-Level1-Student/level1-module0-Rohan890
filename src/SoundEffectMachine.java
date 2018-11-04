import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.charset.MalformedInputException;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectMachine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton leftButton = new JButton();
	JButton rightButton = new JButton();
	JButton thirdButton = new JButton();
	JButton fourthButton = new JButton();

	public static void main(String[] args) {
		SoundEffectMachine e = new SoundEffectMachine();
		e.showButton();
	}

	public void showButton() {
		frame.add(panel);
		panel.add(leftButton);
		panel.add(rightButton);
		panel.add(thirdButton);
		panel.add(fourthButton);
		frame.setVisible(true);
		rightButton.addActionListener(this);
		leftButton.addActionListener(this);
		thirdButton.addActionListener(this);
		fourthButton.addActionListener(this);
		frame.pack();

	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton press = (JButton) e.getSource();
		if (press == leftButton) {
			playSound("organpop.wav");
		} else if (press == rightButton) {
			playSound("ping.wav");
		} else if (press == thirdButton) {
			playSound("cmajor.wav");
		} else if (press == fourthButton) {
			playSound("bass.wav");
		}
	}

}
