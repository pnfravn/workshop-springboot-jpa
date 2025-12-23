package application;

import javax.swing.JOptionPane;

import model.AudioPlayer;
import model.PlayerTimer;
import model.RandomMusic;

public class Program {
	public static void main(String[] args) {

		
		PlayerTimer pt = new PlayerTimer();
		pt.ts(2);
		pt.start();
		
		
	}
}
