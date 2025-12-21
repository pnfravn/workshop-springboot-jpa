package model;

import java.util.Arrays;
import java.util.List;

public class RandomMusic {

	
		
List<String> music = Arrays.asList("wayv.wav", "aespa.wav", "exo.wav", "redvelvet.wav", "suju.wav", "tohoshinki.wav", "shinee.wav");	
	
public String musicGetter(int d) {
	
	String abc = music.get(d);
	return abc;
	}
}