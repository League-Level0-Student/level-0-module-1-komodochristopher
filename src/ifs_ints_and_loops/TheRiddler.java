package ifs_ints_and_loops;
//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score= 0 ; 
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String answer=
		JOptionPane.showInputDialog(null,
				"what person is the leader of _________  army and has fought against rainbowlishes land?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one 
		if(answer.equals("adam and bob")) {
		JOptionPane.showMessageDialog(null, "correct."); 
		score++;
		} else {
JOptionPane.showMessageDialog(null, "incorrect");}
		// 5. Otherwise, say "wrong" and tell them the right answer of
		// 6. Add some more riddles
		String answer1=
		JOptionPane.showInputDialog(null,
				       "who cheat people in the adamberg election and hates hillary clinton?");
		if(answer.equals("Trump Chicken.2.2 and hillary bot 4.6")) {
			JOptionPane.showMessageDialog(null, "correct."); 
			score++;
			} else {
	JOptionPane.showMessageDialog(null, "incorrect");}
		String answer2=
				JOptionPane.showInputDialog(null,
						       " what do you call a guy with a gas mask on thinking that a spider is scary");
				if(answer.equals(" the amazing pyro")) {
					JOptionPane.showMessageDialog(null, "correct."); 
					score++;
					} else {
			JOptionPane.showMessageDialog(null, "incorrect");}
		// 2. Make a pop up to show the score.
JOptionPane.showMessageDialog(null, "your score is " + score);
	}
	

}

