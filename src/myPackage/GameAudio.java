package myPackage;

import java.nio.file.Paths;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/*
 * This class manages the games audio 
 * methods are called in the game controller class
 * depending on what the users action and response to answers are.
 */

public class GameAudio {
	
	private static MediaPlayer mediaPlayer, confirmSelection, correct, incorrect;
	
	// Main theme 
	public static void menuTheme() {
		String s = "/Users/stephenmccallion/eclipse-workspace/DesignPatternsResit/src/res/menuTheme.wav";
		Media h = new Media(Paths.get(s).toUri().toString());
		mediaPlayer = new MediaPlayer(h);
		mediaPlayer.setAutoPlay(true);
		mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
		mediaPlayer.play();
	}
	
	// Confirm Selection (Play or back to main menu)
	public static void confirm() {
		String s = "/Users/stephenmccallion/eclipse-workspace/DesignPatternsResit/src/res/confirm.wav";
		Media h = new Media(Paths.get(s).toUri().toString());
		confirmSelection = new MediaPlayer(h);
		confirmSelection.setAutoPlay(true);
		confirmSelection.play();
	}
	
	// Correct answer
	public static void correct() {
		String s = "/Users/stephenmccallion/eclipse-workspace/DesignPatternsResit/src/res/correct.wav";
		Media h = new Media(Paths.get(s).toUri().toString());
		correct = new MediaPlayer(h);
		correct.setAutoPlay(true);
		correct.play();
	}
	
	// Incorrect answer
	public static void incorrect() {
		String s = "/Users/stephenmccallion/eclipse-workspace/DesignPatternsResit/src/res/incorrect.wav";
		Media h = new Media(Paths.get(s).toUri().toString());
		incorrect = new MediaPlayer(h);
		incorrect.setAutoPlay(true);
		incorrect.play();
	}
	
	
}
