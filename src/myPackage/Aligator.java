package myPackage;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Aligator extends GameObject{
	
	private final String name = "Alligator";
	private final String group = "Congregation";
	private final String type = "Reptile";
	private final String nativeTo = "North America";
	private final String diet = "Carnivore";
	private final String speed = "32km/h";
	private final String lifespan = "40 years";
	private final String sleep = "8 hours";
	private final String weigh = "40kg";
	private final String communication = "Hissing";

	public Aligator(GraphicsContext gc, double x, double y) {
		super(gc, x, y);
		img = new Image("Res/crocodile.png");
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
