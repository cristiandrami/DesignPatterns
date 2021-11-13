package main;

import javax.swing.JFrame;

import adapter.TreeAdapter;
import tree.Tree;

public class Main {
	public static void main(String[] args) {
		JFrame window= new JFrame();
		Tree tree= new TreeAdapter(window);
		tree.drawTree();
		  
		window.setSize(600,600);  
		window.setVisible(true);  
		
	}

}
