package myPackage;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;

/*
 * This class handles the user interaction on the main menu view
 */
public class Controller implements EventHandler{
	View view;
	GameController gameController;
	Score score;
	QuestionsModel questions;
	Scene mainMenuScene;
	
	public Controller(View view, Score score, QuestionsModel questions, Scene mainMenuScene) {
		super();
		this.view = view;
		this.score = score;
		this.questions = questions;
		this.view.playBtn.setOnAction(this);
		this.mainMenuScene = mainMenuScene;
	}

	@Override
	public void handle(Event arg0) {
		//Updates the scene to game 
		if(arg0.getSource() == this.view.playBtn) {
			GameAudio.confirm();
			gameController = new GameController(score, questions, mainMenuScene);	
		}
	}
}
