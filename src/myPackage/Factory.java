package myPackage;

import javafx.scene.canvas.GraphicsContext;

class Factory implements FactoryIF {

	GraphicsContext gc;
	
	public Factory(GraphicsContext gc) {
		super();
		this.gc = gc;
	}

	@Override
public GameObject createProduct(String discrim, double x, double y) {
		if(discrim.equals("lion"))
			return new Lion(gc, x, y);
		else if(discrim.equals("gorilla"))
			return new Gorilla(gc, x, y);
		else if(discrim.equals("penguin"))
			return new Penguin(gc, x, y);
		else if(discrim.equals("aligator"))
			return new Aligator(gc, x, y);
		else if(discrim.equals("elephant"))
			return new Elephant(gc, x, y);
		else if(discrim.equals("polarBear"))
			return new PolarBear(gc, x, y);
		else if(discrim.equals("tiger"))
			return new Tiger(gc, x, y);
		return null;
	}
}

