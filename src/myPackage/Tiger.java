package myPackage;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

class Tiger extends GameObject {

	private final String name = "Tiger";
	private final String type = "Mammal";
	private final String home = "Asia";
	private final String diet = "Carnivore";
	private final String group = "Streak";
	private final String speed = "65km/h";
	private final String lifespan = "15 years";
	private final String sleep = "20 hours";
	private final String weigh = "310kg";
	private final String communication = "Roar";
	
	public Tiger(GraphicsContext gc, double x, double y) {
		super(gc, x, y);
		img=new Image("Res/tiger.png");
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