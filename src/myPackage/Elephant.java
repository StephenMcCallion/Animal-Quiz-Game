package myPackage;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Elephant extends GameObject{
	
	private final String name = "Elephant";
	private final String group = "Herd";
	private final String type = "Mammal";
	private final String nativeTo = "Africa";
	private final String diet = "Herbivore";
	private final String speed = "40km/h";
	private final String lifespan = "50 years";
	private final String sleep = "2 hours";
	private final String weigh = "4500kg";
	private final String communication = "Trumpet";

	public Elephant(GraphicsContext gc, double x, double y) {
		super(gc, x, y);
		img = new Image("Res/elephant.png");
		update();
	}

	public String getName() {
		return name;
	}

	public String getGroup() {
		return group;
	}

	public String getType() {
		return type;
	}

	public String getNativeTo() {
		return nativeTo;
	}

	public String getDiet() {
		return diet;
	}

	public String getSpeed() {
		return speed;
	}

	public String getLifespan() {
		return lifespan;
	}

	public String getSleep() {
		return sleep;
	}

	public String getWeigh() {
		return weigh;
	}

	public String getCommunication() {
		return communication;
	}

	
}