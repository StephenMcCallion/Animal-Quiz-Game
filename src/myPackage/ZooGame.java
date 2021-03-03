package myPackage;

import java.nio.file.Paths;
import java.util.ArrayList;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ZooGame extends Application{
	private Pane root;
	private GameAudio gameAudio;
	private View view;
	private Controller controller;
	private static Stage stage;
	private Scene mainMenuScene;
	private Score score;
	private QuestionsModel questions;
	private int count = 1;
	

	public static void main(String[] args) {
		launch(args);
	}

	public static Stage getStage() {
		return stage;
	}
	
	/*
	 * This method starts the application by instantiating the MVC pattern 
	 * and passing the required parameters to the controller
	 */
	@Override
	public void start(Stage stage) throws Exception {
		this.stage = stage;
		gameAudio.menuTheme();
      	stage.setTitle("Zoo Game");
      	root = new Pane();
      	mainMenuScene = new Scene(root, 800, 600);
      	stage.setScene(mainMenuScene);
      	stage.show();
		score = new Score(0);
		questions = new QuestionsModel(count);
		view = new View(root);
		controller = new Controller(view, score, questions, mainMenuScene);	
	}
	
}
