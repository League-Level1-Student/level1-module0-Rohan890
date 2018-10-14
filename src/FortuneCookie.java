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
	     JButton button = new JButton();
	     frame.add(button);
	     button.addActionListener(this);
	     frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
JOptionPane.	showMessageDialog(null,"Woohoo");
int rand = new Random().nextInt(5);


}

}
