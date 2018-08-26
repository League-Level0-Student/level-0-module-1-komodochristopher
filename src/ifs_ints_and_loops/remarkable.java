package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class remarkable {
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
		String name = JOptionPane.showInputDialog("what is your name human");
		if (name.equalsIgnoreCase("brandon")) {
			JOptionPane.showMessageDialog(null, "you are smart");
			if (name.equalsIgnoreCase("nathan")) {
				JOptionPane.showMessageDialog(null, "you like fortnite");
			}
		}
	}
}
}