package myPackage;

import java.util.ArrayList;
import java.util.Random;

import javafx.animation.AnimationTimer;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
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
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.QuadCurve;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*
 * The view is the UI elements of the game
 */
public class View {

	Text titleLabel;
	Label loadingLabel;
	Pane root;
	Scene gameScene;
	Button playBtn, closeBtn;
	GraphicsContext gc, gameGraphics;
	Canvas canvas, canvasGame;
	Image gorillaImg, lionImg, elephantImg, signImg, menuBackground;
	ImageView imgG, imgL, imgE, imgS, imgBackground;
	QuadCurve hill;
	int count=0;
	
	public View(Pane root) {
		super();
		this.root = root;	
		
	//Styling for menu	
		canvas = new Canvas(800,600);
		gc = canvas.getGraphicsContext2D();
		gc.setFill(Color.LIGHTSKYBLUE);
		gc.fillRect(0,0,canvas.getWidth(),canvas.getHeight());
		root.getChildren().addAll(canvas);
		
		menuBackground = new Image("/Res/backgroundImg.png");
		imgBackground = new ImageView(menuBackground);
		imgBackground.setFitHeight(400);
		imgBackground.setFitWidth(800);
		imgBackground.setLayoutY(200);
		
		
		//Title of Game
		titleLabel = new Text("Zoo Safari Quiz Game");
		titleLabel.setFont(Font.font("Arial", FontWeight.EXTRA_BOLD, 60));
		titleLabel.setLayoutX(100);
		titleLabel.setLayoutY(150);
		titleLabel.setFill(Color.BROWN);
		
		//Play button
		playBtn = new Button("Play Game");
		playBtn.setScaleX(3);
		playBtn.setScaleY(3);
		playBtn.setLayoutX(360);
		playBtn.setLayoutY(290);

/*
 * Images for menu
 */
		gorillaImg = new Image("Res/gorilla.png");
		lionImg = new Image("Res/lion.png");
		elephantImg = new Image("Res/elephant.png");
		
		//Gorilla image layout
		imgG = new ImageView(gorillaImg);
		imgG.setFitHeight(150);
		imgG.setFitWidth(150);
		imgG.setLayoutX(175);
		imgG.setLayoutY(400);
		
		//Lion image layout
		imgL = new ImageView(lionImg);
		imgL.setFitHeight(170);
		imgL.setFitWidth(190);
		imgL.setLayoutX(295);
		imgL.setLayoutY(425);
		
		//Elephant image layout
		imgE = new ImageView(elephantImg);
		imgE.setFitHeight(150);
		imgE.setFitWidth(190);
		imgE.setLayoutX(450);
		imgE.setLayoutY(400);
		
		//Shape for hill
		hill = new QuadCurve();
		hill.setStroke(Color.BLACK);
		hill.setFill(Color.FORESTGREEN);
		hill.setStartX(0.0);
		hill.setStartY(600);
		hill.setEndX(800);
		hill.setEndY(600);
		hill.setControlX(375);
		hill.setControlY(50);
		
		//Adds all UI nodes to the root pane
		root.getChildren().addAll(playBtn, imgBackground, imgG, imgL, imgE, titleLabel);
	}
}
