package myPackage;

import java.util.ArrayList;

import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.QuadCurve;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.util.Duration;

public class GameView {
	
	// Field variables for view
	protected GraphicsContext gc;
	protected Canvas canvas;
	protected Scene gameScene;
	private BorderPane gameLayout, finalScoreRoot;
	protected HBox hBoxTop, hboxBackground;
	private VBox vBoxSign, vboxTree, vboxTree2, questionBox, animal;
	private QuestionsModel questions;
	private Text questionText, questionNo;
	private Label labelScore, yourScore;
	private Score score;
	private StackPane middleStack, questionPane;
	protected Image signImg, tree1Img, tree2Img, backgroundImg, questionImg, finalScoreImage, owlProf;
	private ImageView imgS, imgT, imgT2, imgB, imgQ, imgFS, imgO;
	protected Button b1, b2, b3, b4, menuBtn;
	
	// Constructor for game view
	public GameView(Score score, QuestionsModel questions) {
		super();
		this.score = score;
		this.questions = questions;
		// Sets up the scene
		gameLayout = new BorderPane();

		Scene gameScene = new Scene(gameLayout, 800, 600);
		ZooGame.getStage().setScene(gameScene);
		gameLayout.setBackground(new Background(new BackgroundFill(Color.LIGHTSKYBLUE,null,null)));
		
		// Score Layout
		StackPane stack = new StackPane();
		gameLayout.setTop(stack);
		HBox hBoxTop = new HBox();
		hBoxTop.setSpacing(100);
		hBoxTop.setBackground(new Background(new BackgroundFill(Color.LIGHTSKYBLUE,null,null)));
		hBoxTop.setAlignment(Pos.BASELINE_CENTER);
		labelScore = new Label("Your current score is: " + score.getCurrentScore());
		labelScore.setFont(Font.font("Arial", 20));
		hBoxTop.getChildren().addAll(labelScore);
		
		// Back to main menu btn layout
		HBox hBoxMenuBtn = new HBox();
		menuBtn = new Button("Main Menu");
		menuBtn.setPrefSize(100, 20);
		hBoxMenuBtn.getChildren().add(menuBtn);
		hBoxMenuBtn.setAlignment(Pos.CENTER_RIGHT);
		StackPane.setMargin(menuBtn, new Insets(0, 10, 0, 0));
		stack.getChildren().addAll(hBoxTop, hBoxMenuBtn);
		
		// Questions View
		questionImg = new Image("/Res/questionSign.png");
		imgQ = new ImageView(questionImg);
		imgQ.setFitHeight(70);
		imgQ.setFitWidth(530);
		imgQ.setLayoutX(40);
		imgQ.setLayoutY(150);
		questionText = new Text();
		questionText.setFill(Color.WHITE);
		questionText.setFont(Font.font("Arial", FontWeight.BOLD, 20));
		VBox questionNoLayout = new VBox();
		questionNoLayout.setPadding(new Insets(5, 0, 0, 150));
		questionNo = new Text();
		questionNo.setFill(Color.WHITE);
		questionNo.setFont(Font.font("Arial", FontWeight.BOLD, 16));
		questionNoLayout.getChildren().add(questionNo);
		
		HBox questionTextBox = new HBox();
		questionTextBox.setAlignment(Pos.TOP_CENTER);
		questionTextBox.setPadding(new Insets(20, 0, 0, 0));
		questionTextBox.getChildren().add(questionText);
		questionPane = new StackPane();
		questionPane.setAlignment(Pos.TOP_CENTER);
		questionPane.setPadding(new Insets(0, 0, 30, 0));
		questionPane.getChildren().addAll(imgQ, questionTextBox, questionNoLayout);
		
		// Middle layout
		middleStack = new StackPane();
		gameLayout.setCenter(middleStack);
		
		//Sets the layout of the background image 
		hboxBackground = new HBox();
		hboxBackground.setAlignment(Pos.BOTTOM_CENTER);
		backgroundImg = new Image("Res/backgroundImg.png");
		imgB = new ImageView(backgroundImg);
		imgB.setFitHeight(500);
		imgB.setFitWidth(800);
		imgB.setLayoutX(295);
		imgB.setLayoutY(700);
		hboxBackground.getChildren().addAll(imgB);
		
		//Sets the layout of the zoo sign
		vBoxSign = new VBox();
		vBoxSign.setAlignment(Pos.BOTTOM_CENTER);
		vBoxSign.setPadding(new Insets(0, 0, 30, 0)); //Sets padding (top, right, bottom, left)
		signImg = new Image("Res/sign.png");
		imgS = new ImageView(signImg);
		imgS.setFitHeight(400);
		imgS.setFitWidth(800);
		imgS.setLayoutX(295);
		imgS.setLayoutY(500);
		vBoxSign.getChildren().addAll(imgS);
		
		//Sets the layout of the left tree 
		vboxTree = new VBox();
		vboxTree.setAlignment(Pos.CENTER_LEFT);
		vboxTree.setPadding(new Insets(0, 0, 30, 0)); //Sets padding (top, right, bottom, left)		
		tree1Img = new Image("Res/tree1.png");
		imgT = new ImageView(tree1Img);
		imgT.setFitHeight(200);
		imgT.setFitWidth(150);
		imgT.setLayoutX(50);
		imgT.setLayoutY(150);
		vboxTree.getChildren().addAll(imgT);
		
		//Sets the layout of the right tree
		vboxTree2 = new VBox();
		vboxTree2.setAlignment(Pos.CENTER_RIGHT);
		vboxTree2.setPadding(new Insets(0, 0, 30, 0)); //Sets padding (top, right, bottom, left)		
		tree2Img = new Image("Res/tree1.png");
		imgT2 = new ImageView(tree1Img);
		imgT2.setFitHeight(200);
		imgT2.setFitWidth(150);
		imgT2.setLayoutX(50);
		imgT2.setLayoutY(150);
		vboxTree2.getChildren().add(imgT2);
		
		// This layout contains the animal that is produced by the factory 
		animal = new VBox();
		canvas = new Canvas(220, 260);
		gc = canvas.getGraphicsContext2D();
		gc.setFill(Color.SKYBLUE);
		gc.fillRect(0,0,canvas.getWidth(),canvas.getHeight());
		animal.setAlignment(Pos.BOTTOM_CENTER);
		animal.getChildren().add(canvas);		
		middleStack.getChildren().addAll(hboxBackground, vboxTree, vboxTree2, questionPane, vBoxSign, animal);
		
		// Answer buttons layout
		HBox hBoxBottom = new HBox();
		hBoxBottom.setPadding(new Insets(15, 12, 15, 12));
		gameLayout.setBottom(hBoxBottom);
		hBoxBottom.setSpacing(50);
		hBoxBottom.setAlignment(Pos.BASELINE_CENTER);
		hBoxBottom.setBackground(new Background(new BackgroundFill(Color.rgb(60, 95, 3), null, null)));
		
		b1 = new Button();
		b1.setPrefSize(100, 20);
		b2 = new Button();
		b2.setPrefSize(100, 20);
		b3 = new Button();
		b3.setPrefSize(100, 20);
		b4 = new Button();
		b4.setPrefSize(100, 20);
		hBoxBottom.getChildren().addAll(b1, b2, b3, b4);
	}
	
	/*
	 * This method updates the view when called by the controller
	 * the view changes as per the data stored in the models
	 */
	public void updateView(int count, ArrayList<String> rounds, String currentQuestion) {
		
		b1.setText(rounds.get(0));
		b2.setText(rounds.get(1));
		b3.setText(rounds.get(2));
		b4.setText(rounds.get(3));
		
		//Updates the Questions
		questionText.setText(currentQuestion);
		questionNo.setText(questions.getCurrentQuestionNo());
		//Updates the score
		labelScore.setText("Your current score is: " + score.getCurrentScore() + " out of 10");
		
	}
	
	//Changes the scene to show the users final score
	public void updateViewFinalScore() {
		finalScoreRoot = new BorderPane();
		Scene endScene = new Scene(finalScoreRoot, 800, 600);
		ZooGame.getStage().setScene(endScene);
		BackgroundImage highScoreBackground = new BackgroundImage(new Image("/Res/zoobackground.jpg",endScene.getWidth(), endScene.getHeight(),false,true),
		BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
		BackgroundSize.DEFAULT);
		finalScoreRoot.setBackground(new Background(highScoreBackground));
	
		HBox mainMenuButtonLayout = new HBox();
		mainMenuButtonLayout.getChildren().add(menuBtn);
		mainMenuButtonLayout.setAlignment(Pos.CENTER_RIGHT);
		finalScoreRoot.setTop(mainMenuButtonLayout);
		
		StackPane finalScoreLayout = new StackPane();
		
		finalScoreImage = new Image("/Res/highScore.png");
		imgFS = new ImageView(finalScoreImage);
		imgFS.setFitHeight(400);
		imgFS.setFitWidth(450);
		imgFS.setLayoutX(40);
		imgFS.setLayoutY(150);
		
		owlProf = new Image("/Res/owlProfesor.png");
		imgO = new ImageView(owlProf);
		imgO.setFitHeight(200);
		imgO.setFitWidth(250);
		imgO.setLayoutX(450);
		imgO.setLayoutY(150);
		StackPane.setAlignment(imgO, Pos.BOTTOM_RIGHT);
		StackPane.setMargin(imgO, new Insets(100));
		
		yourScore = new Label();
		yourScore.setTextAlignment(TextAlignment.CENTER);
		yourScore.setTextFill(Color.WHITE);
		yourScore.setFont(Font.font("Arial", FontWeight.BOLD, 30));
		yourScore.setMaxWidth(270);
		yourScore.setWrapText(true);
		yourScore.setText("Your final score is " + score.getCurrentScore() + " out of 10");
		
		finalScoreLayout.getChildren().addAll(imgFS, yourScore, imgO);
		finalScoreRoot.setCenter(finalScoreLayout);
	}
}
