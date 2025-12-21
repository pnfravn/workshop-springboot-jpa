package model;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;

public class PlayerTimer {
	
	RandomMusic rm = new RandomMusic();
		
	int aleatorio = (int) (Math.random() * 7);
	
	String music = rm.musicGetter(aleatorio);

	int secondsPassed = 0;
	
	public void ts(int dc) {
		
		secondsPassed = dc;
	}
	
	Timer mytimer = new Timer();
	TimerTask task = new TimerTask() {
		
		@Override
		public void run() {
			secondsPassed--;
			System.out.println("Seconds passed: " + secondsPassed);
			if (secondsPassed <= 0) {
				System.out.println("Playing");
				mytimer.cancel();
				
				String filepath = music;
				AudioPlayer.PlayMusic(filepath);
				JOptionPane.showMessageDialog(null, "Press ok to stop playing");
			}
		}
	};
		
	public void start() {
		mytimer.scheduleAtFixedRate(task, 1000, 1000);
	}
		
}
