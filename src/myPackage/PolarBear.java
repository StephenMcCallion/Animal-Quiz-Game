package myPackage;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

class PolarBear extends GameObject {

	private final String name = "Polar bear";
	private final String type = "Mammal";
	private final String home = "Artic";
	private final String diet = "Carnivore";
	private final String group = "Celebration";
	private final String speed = "40km/h";
	private final String lifespan = "25 years";
	private final String sleep = "8 Hours";
	private final String weigh = "450kg";
	private final String communication = "Touch and Smell";
	
	public PolarBear(GraphicsContext gc, double x, double y) {
		super(gc, x, y);
		img=new Image("Res/polarBear.png");
		update();
	}

	@Override
	public void update() {
		x = 10;
		y = 50;
		super.update();
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getHome() {
		return home;
	}

	public String getDiet() {
		return diet;
	}

	public String getGroup() {
		return group;
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
