package myPackage;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

class Penguin extends GameObject {

	private final String name = "Penguin";
	private final String type = "Bird";
	private final String home = "Antartica";
	private final String diet = "Piscivore";
	private final String group = "Waddle";
	private final String speed = "9km/h";
	private final String lifespan = "20 years";
	private final String sleep = "20 hours";
	private final String weigh = "23kg";
	private final String communication = "Displays";
	
	public Penguin(GraphicsContext gc, double x, double y) {
		super(gc, x, y);
		img=new Image("Res/penguin.png");
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

