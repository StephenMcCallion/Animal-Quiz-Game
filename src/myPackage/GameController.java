package myPackage;

import java.util.ArrayList;

/*
 * This class includes the logic and controls user events.
 * Depending on the user interaction data is updated to 
 * the model classes 
 */
import java.util.Collections;
import java.util.Random;

import javafx.animation.AnimationTimer;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

// Field variables
public class GameController implements EventHandler {
	protected GameAudio gameAudio;
	protected Scene mainMenuScene;
	protected GameView gameView;
	protected View mainMenuView;
	protected Score score;
	protected QuestionsModel questions;
	protected Lion lion;
	protected Penguin penguin;
	protected Aligator aligator;
	protected Gorilla gorilla;
	protected Elephant elephant;
	protected PolarBear polarBear;
	protected Tiger tiger;
	protected ArrayList<GameObject> animals = new ArrayList<GameObject>();
	protected Factory factory;
	protected int count = 1;
	protected Object animal;
	protected RoundsModel roundModel;

	
	//Constructor for game controller
	public GameController(Score score, QuestionsModel questions, Scene mainMenuScene) {
		super();
		this.score = score;
		this.questions = questions;
		this.mainMenuScene = mainMenuScene;
		this.gameView = new GameView(score, questions);
		this.gameView.menuBtn.setOnAction(this);
		this.gameView.b1.setOnAction(this);
		this.gameView.b2.setOnAction(this);
		this.gameView.b3.setOnAction(this);
		this.gameView.b4.setOnAction(this);
		factory = new Factory(this.gameView.gc);
		updateView();
	}
	
	/*
	 * Event handlers to action when a user presses the button
	 * updates the score accordingly and proceeds to the next question 
	 */ 
	@Override
	public void handle(Event arg0) {
		if(arg0.getSource() == this.gameView.menuBtn) {
			gameAudio.confirm();
			this.count = 1;
			score.setCurrentScore(0);
			ZooGame.getStage().setScene(mainMenuScene);;
		}
		
		if(arg0.getSource() == this.gameView.b1) {
			checkAnswer(this.gameView.b1.getText(), animal);
			nextRound();
			updateView();
		}
		
		if(arg0.getSource() == this.gameView.b2) {
			checkAnswer(this.gameView.b2.getText(), animal);
			nextRound();
			updateView();
		}
		
		if(arg0.getSource() == this.gameView.b3) {
			checkAnswer(this.gameView.b3.getText(), animal);
			nextRound();
			updateView();
		}
		
		if(arg0.getSource() == this.gameView.b4) {
			checkAnswer(this.gameView.b4.getText(), animal);
			nextRound();
			updateView();
		}
	}
	
	// Updates the count variable
	public void nextRound() {
		count = count + 1;
	}
	
	/*
	 * This method uses the random class that chooses 
	 * instantiates the animals created in the factory and puts them into an Arraylist
	 */
	public void animalCreation() {
		ArrayList<String> s = new ArrayList<String>();
		s.add("lion");
		s.add("gorilla");
		s.add("penguin");
		s.add("elephant");
		s.add("aligator");
		s.add("polarBear");
		s.add("tiger");
		
		Random randomAnimalGenerator = new Random();

		int index = randomAnimalGenerator.nextInt(s.size());

		animals.add(this.factory.createProduct(s.get(index), -15, 10));
		animal = animals.get(0);
	}
	
	/*
	 * 	This method checks if the text in the button pressed matches the 
	 * 	string in the animal object thats has been produced by the factory in the view
	 */
	public boolean checkAnswer(String buttonText, Object animal) {
		animal = this.animals.get(0);
		ArrayList<String> answers = new ArrayList<String>();
		if(this.animals.get(0) instanceof Penguin) {
			penguin = (Penguin) animal;
		}
		else if (this.animals.get(0) instanceof Aligator) {
			aligator = (Aligator) animal;
		}
		else if (this.animals.get(0) instanceof Lion) {
			lion = (Lion) animal;
		}
		else if (this.animals.get(0) instanceof Elephant) {
			elephant = (Elephant) animal;
		}
		else if (this.animals.get(0) instanceof Gorilla) {
			gorilla = (Gorilla) animal;
		}
		else if (this.animals.get(0) instanceof Tiger) {
			tiger = (Tiger) animal;
		}
		else if (this.animals.get(0) instanceof PolarBear) {
			polarBear = (PolarBear) animal;
		}
		else {
			System.out.println("This animal does not exist");
		}
		// Checks the button text equals one of the objects properties in the animal ArrayList
		if (animals.get(0) instanceof Lion) {
			if (buttonText.equals(lion.getName()) || buttonText.equals(lion.getType()) ||
				buttonText.equals(lion.getDiet()) || buttonText.equals(lion.getHome()) || buttonText.equals(lion.getGroup()) ||
				buttonText.equals(lion.getSpeed()) || buttonText.equals(lion.getSleep()) || buttonText.equals(lion.getLifespan()) || 
				buttonText.equals(lion.getWeigh()) || buttonText.equals(lion.getCommunication())) {
				this.score.setCurrentScore(this.score.getCurrentScore() + 1);
				GameAudio.correct();
				return true;
			}
		}
		else if(animals.get(0) instanceof Penguin) {
			if (buttonText.equals(penguin.getName()) || buttonText.equals(penguin.getType()) ||
				buttonText.equals(penguin.getDiet()) || buttonText.equals(penguin.getHome()) || buttonText.equals(penguin.getGroup()) ||
				buttonText.equals(penguin.getSpeed()) || buttonText.equals(penguin.getSleep()) || buttonText.equals(penguin.getLifespan()) || 
				buttonText.equals(penguin.getWeigh()) || buttonText.equals(penguin.getCommunication())) {
				this.score.setCurrentScore(this.score.getCurrentScore() + 1);
				GameAudio.correct();
				return true;
			}
		}
		else if(animals.get(0) instanceof Gorilla) {
			if (buttonText.equals(gorilla.getName()) || buttonText.equals(gorilla.getType()) ||
				buttonText.equals(gorilla.getDiet()) || buttonText.equals(gorilla.getNativeTo()) || buttonText.equals(gorilla.getGroup()) ||
				buttonText.equals(gorilla.getSpeed()) || buttonText.equals(gorilla.getSleep()) || buttonText.equals(gorilla.getLifespan()) || 
				buttonText.equals(gorilla.getWeigh()) || buttonText.equals(gorilla.getCommunication())) {
				this.score.setCurrentScore(this.score.getCurrentScore() + 1);
				GameAudio.correct();
				return true;
			}
		}
		else if(animals.get(0) instanceof Aligator) {
			if (buttonText.equals(aligator.getName()) || buttonText.equals(aligator.getType()) ||
				buttonText.equals(aligator.getDiet()) || buttonText.equals(aligator.getNativeTo()) || buttonText.equals(aligator.getGroup()) ||
				buttonText.equals(aligator.getSpeed()) || buttonText.equals(aligator.getSleep()) || buttonText.equals(aligator.getLifespan()) || 
				buttonText.equals(aligator.getWeigh()) || buttonText.equals(aligator.getCommunication())) {
				this.score.setCurrentScore(this.score.getCurrentScore() + 1);
				GameAudio.correct();
				return true;
			}
		}
		else if(animals.get(0) instanceof Elephant) {
			if (buttonText.equals(elephant.getName()) || buttonText.equals(elephant.getType()) ||
				buttonText.equals(elephant.getDiet()) || buttonText.equals(elephant.getNativeTo()) || buttonText.equals(elephant.getGroup()) ||
				buttonText.equals(elephant.getSpeed()) || buttonText.equals(elephant.getSleep()) || buttonText.equals(elephant.getLifespan()) || 
				buttonText.equals(elephant.getWeigh()) || buttonText.equals(elephant.getCommunication())) {
				this.score.setCurrentScore(this.score.getCurrentScore() + 1);
				GameAudio.correct();
				return true;
			}
		}
		else if(animals.get(0) instanceof PolarBear) {
			if (buttonText.equals(polarBear.getName()) || buttonText.equals(polarBear.getType()) ||
				buttonText.equals(polarBear.getDiet()) || buttonText.equals(polarBear.getHome()) || buttonText.equals(polarBear.getGroup()) ||
				buttonText.equals(polarBear.getSpeed()) || buttonText.equals(polarBear.getSleep()) || buttonText.equals(polarBear.getLifespan()) || 
				buttonText.equals(polarBear.getWeigh()) || buttonText.equals(polarBear.getCommunication())) {
				this.score.setCurrentScore(this.score.getCurrentScore() + 1);
				GameAudio.correct();
				return true;
			}
		}
		else if(animals.get(0) instanceof Tiger) {
			if (buttonText.equals(tiger.getName()) || buttonText.equals(tiger.getType()) ||
				buttonText.equals(tiger.getDiet()) || buttonText.equals(tiger.getHome()) || buttonText.equals(tiger.getGroup()) ||
				buttonText.equals(tiger.getSpeed()) || buttonText.equals(tiger.getSleep()) || buttonText.equals(tiger.getLifespan()) || 
				buttonText.equals(tiger.getWeigh()) || buttonText.equals(tiger.getCommunication())) {
				this.score.setCurrentScore(this.score.getCurrentScore() + 1);
				GameAudio.correct();
				return true;
			}
		}
		GameAudio.incorrect();
		return false;
	}
	
	// This method updates the data on the buttons, questions and score in the game view
	public void updateView() {
		animals.clear();
		
		this.gameView.gc.clearRect(0, 0, this.gameView.canvas.getWidth(), this.gameView.canvas.getHeight());
		animalCreation();
		
		roundModel = new RoundsModel(animals, count);
		ArrayList<String> rounds = new ArrayList<String>();
		rounds = roundModel.rounds();
		
		String currentQuestion = this.questions.questions(this.count);
		
		if(currentQuestion != null) {
			if (rounds != null) {
				this.gameView.updateView(count, rounds, currentQuestion);	
			}
		}
		else {
			this.gameView.updateViewFinalScore();	
		}
		
	}
	
}
