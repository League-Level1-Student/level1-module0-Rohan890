import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV {
public static void main(String[] args) {
	JButton duckButton = new JButton();
	JButton frogButton = new JButton();
	JButton unicornButton = new JButton();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	frame.add(panel);
	panel.add(duckButton);
	panel.add(frogButton);
	panel.add(unicornButton);
	frame.setVisible(true);
	frogButton.setText("Frog");
	duckButton.setText("Duck");
	unicornButton.setText("Unicorn");
	frame.pack();
}
	public CutenessTV() {
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
}
