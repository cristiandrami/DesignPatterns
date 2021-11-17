package main;

import java.awt.Dimension;

import javax.swing.JFrame;

import square.GiantCyanSquare;
import square.SmallRedSquare;

public class Main {
	public static void main(String[] args) {
		JFrame window= new JFrame("Square");
		GiantCyanSquare square1= new GiantCyanSquare();
		SmallRedSquare square2= new SmallRedSquare();
		window.setSize(new Dimension(400, 300));
		window.add(square1);
		window.add(square2);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

}
