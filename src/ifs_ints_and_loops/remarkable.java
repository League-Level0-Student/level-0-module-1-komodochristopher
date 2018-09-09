package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class remarkable {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			String name = JOptionPane.showInputDialog("what is your name human");
			if (name.equalsIgnoreCase("brandon")) {
				JOptionPane.showMessageDialog(null, "you are smart");
			}
			if (name.equalsIgnoreCase("nathan")) {
				JOptionPane.showMessageDialog(null, "you like fortnite");
			}
			if (name.equalsIgnoreCase("adam")) {
				JOptionPane.showMessageDialog(null,
						"adamberg vs rainbowlishes land adamberg says make adamberg win  blah blah blah!");
			}
			if (name.equalsIgnoreCase("samuel")) {
				JOptionPane.showMessageDialog(null,
						"minecraft is awesome- mine diamonds........is that all you like.........- -_    (^_^)");
			}
		}
	}
}
