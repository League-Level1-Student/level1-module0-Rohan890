/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This will make sure the program exits when you
																	// close the window

		// 1. find an image on the internet, and put its URL in a String variable (from
		// your browser, right click on the image, and select “Copy Image Address”)
		String u = ("https://images-na.ssl-images-amazon.com/images/I/41BjwT0HeUL._SX425_.jpg");
		// 2. create a variable of type "Component" that will hold your image
		Component r;
		// 3. use the "createImage()" method below to initialize your Component
		r = createImage(u);
		// 4. add the image to the quiz window
		quizWindow.add(r);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String q = JOptionPane.showInputDialog("What city does the picture represent");
		// 7. print "CORRECT" if the user gave the right answer
		if (q.equals("Los Angeles")) {
			System.out.println("CORRECT");
		} else {
			System.out.println("INCORRECT");
		}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of
		// this until step 12)
		quizWindow.remove(r);
		// 10. find another image and create it (might take more than one line of code)
		String p = ("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a4/SDPadres_logo.svg/1200px-SDPadres_logo.svg.png");
		// 11. add the second image to the quiz window
		Component t;
		t = createImage(p);
		quizWindow.add(t);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String h = JOptionPane.showInputDialog("What team is this");
		// 14+ check answer, say if correct or incorrect, etc.
		if (h.equals("Padres")) {
			System.out.println("CORRECT");
		} else {
			System.out.println("INCORRECT");
		}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
