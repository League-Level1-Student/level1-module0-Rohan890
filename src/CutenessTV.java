import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener{
	JButton duckButton = new JButton();
	JButton frogButton = new JButton();
	JButton unicornButton = new JButton();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	public static void main(String[] args) {
		CutenessTV e = new CutenessTV();
		
	}

	public CutenessTV() {
		frame.add(panel);
		panel.add(duckButton);
		panel.add(frogButton);
		panel.add(unicornButton);
		frame.setVisible(true);
		frogButton.setText("Frog");
		duckButton.setText("Duck");
		unicornButton.setText("Unicorn");
		duckButton.addActionListener(this);
		frogButton.addActionListener(this);
		unicornButton.addActionListener(this);
		frame.pack();
		// TODO Auto-generated constructor stub
	}

	void showDucks() {
		playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
		playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
		playVideo("https:/a/www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI(videoID);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton press = (JButton) e.getSource();
		if (press == duckButton) {
			playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
		} else if (press == unicornButton) {
			playVideo("https:/a/www.youtube.com/watch?v=a-xWhG4UU_Y");
		} else if (press == frogButton) {
			playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
		}
		// TODO Auto-generated method stub
		
	}
}
