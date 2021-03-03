package myPackage;

import java.util.ArrayList;

/*
 * This glass manages the data for the choice of answers in each round
 * data is stored in an ArrayList and returned depending on the game object in play
 * the view is then updated by passing the answers as text to the buttons 
 */

public class RoundsModel {

	protected Penguin penguin;
	protected Aligator aligator;
	protected Gorilla gorilla;
	protected Elephant elephant;
	protected PolarBear polarBear;
	protected Lion lion;
	protected Tiger tiger;
	protected ArrayList<String> answers;
	protected ArrayList<GameObject> animals = new ArrayList<GameObject>();
	protected int count;
	protected Object animal;
	
	public RoundsModel(ArrayList<GameObject> animals, int count) {
		super();
		this.animals = animals;
		this.count = count;
		answers = new ArrayList<String>();
	}
	
	
	public ArrayList<String> rounds() {
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
		
//		Round 1
		if(count == 1) {
			if(animals.get(0).getClass().getSimpleName().equals("Penguin")) {
				answers.add(penguin.getName());
				answers.add("Lion");
				answers.add("Elephant");
				answers.add("Alligator");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Lion")) {
				answers.add("Penguin");
				answers.add(lion.getName());
				answers.add("Elephant");
				answers.add("Aligator");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Gorilla")) {
				answers.add("Penguin");
				answers.add("Lion");
				answers.add("Elephant");
				answers.add(gorilla.getName());
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Elephant")) {
				answers.add("Penguin");
				answers.add("Lion");
				answers.add(elephant.getName());
				answers.add("Aligator");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Aligator")) {
				answers.add("Penguin");
				answers.add("Lion");
				answers.add("Elephant");
				answers.add(aligator.getName());
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Tiger")) {
				answers.add("Penguin");
				answers.add(tiger.getName());
				answers.add("Elephant");
				answers.add("Tortoise");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("PolarBear")) {
				answers.add(polarBear.getName());
				answers.add("Lion");
				answers.add("Elephant");
				answers.add("Alligator");
			}
			return answers;
		}
		//Round 2
		else if(count == 2) {
			if(animals.get(0).getClass().getSimpleName().equals("Penguin")) {
				answers.add(penguin.getType());
				answers.add("Mammal");
				answers.add("Reptile");
				answers.add("Insect");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Lion")) {
				answers.add("Insect");
				answers.add(lion.getType());
				answers.add("Fish");
				answers.add("Bird");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Gorilla")) {
				answers.add("Fish");
				answers.add("Reptile");
				answers.add("Bird");
				answers.add(gorilla.getType());
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Elephant")) {
				answers.add("Reptile");
				answers.add("Bird");
				answers.add(elephant.getType());
				answers.add("Insect");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Aligator")) {
				answers.add("Bird");
				answers.add("Fish");
				answers.add("Mammal");
				answers.add(aligator.getType());
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Tiger")) {
				answers.add("Fish");
				answers.add("Insect");
				answers.add("Bird");
				answers.add(tiger.getType());
			}
			else if (animals.get(0).getClass().getSimpleName().equals("PolarBear")) {
				answers.add(polarBear.getType());
				answers.add("Fish");
				answers.add("Bird");
				answers.add("Reptile");
			}
			return answers;
		}
		//Round 3
		else if(count == 3) {
			if(animals.get(0).getClass().getSimpleName().equals("Penguin")) {
				answers.add("Omnivore");
				answers.add("Herbivore");
				answers.add("Carnivore");
				answers.add(penguin.getDiet());
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Lion")) {
				answers.add("Piscivore");
				answers.add(lion.getDiet());
				answers.add("Omnivore");
				answers.add("Carnivore");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Gorilla")) {
				answers.add("Omnivore");
				answers.add("Piscivore");
				answers.add("Carnivore");
				answers.add(gorilla.getDiet());
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Elephant")) {
				answers.add("Omnivore");
				answers.add("Piscivore");
				answers.add(elephant.getDiet());
				answers.add("Carnivore");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Aligator")) {
				answers.add("Omnivore");
				answers.add("Herbivore");
				answers.add("Piscivore");
				answers.add(aligator.getDiet());
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Tiger")) {
				answers.add("Herbivore");
				answers.add(tiger.getDiet());
				answers.add("Piscivore");
				answers.add("Omnivore");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("PolarBear")) {
				answers.add(polarBear.getDiet());
				answers.add("Omnivore");
				answers.add("Piscivore");
				answers.add("Herbivore");
			}
			return answers;
		}
		//Round 4
		else if(count == 4) {
			if(animals.get(0).getClass().getSimpleName().equals("Penguin")) {
				answers.add("Tower");
				answers.add("Pack");
				answers.add(penguin.getGroup());
				answers.add("Herd");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Lion")) {
				answers.add("Congregation");
				answers.add(lion.getGroup());
				answers.add("Pack");
				answers.add("Flock");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Gorilla")) {
				answers.add("Pack");
				answers.add("Pride");
				answers.add("March");
				answers.add(gorilla.getGroup());
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Elephant")) {
				answers.add("Pride");
				answers.add("Troop");
				answers.add(elephant.getGroup());
				answers.add("Waddle");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Aligator")) {
				answers.add("Celebration");
				answers.add("Swarm");
				answers.add("Pride");
				answers.add(aligator.getGroup());
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Tiger")) {
				answers.add("Pride");
				answers.add(tiger.getGroup());
				answers.add("Pack");
				answers.add("Stripe");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("PolarBear")) {
				answers.add(polarBear.getGroup());
				answers.add("Pack");
				answers.add("Pride");
				answers.add("Congregation");
			}
			return answers;
		}
		//Round 5
		else if(count == 5) {
			if(animals.get(0).getClass().getSimpleName().equals("Penguin")) {
				answers.add(penguin.getHome());
				answers.add("Africa");
				answers.add("Europe");
				answers.add("North America");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Lion")) {
				answers.add(lion.getHome());
				answers.add("Antartica");
				answers.add("Europe");
				answers.add("Australia");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Gorilla")) {
				answers.add("Europe");
				answers.add("Australia");
				answers.add(gorilla.getNativeTo());
				answers.add("Antartica");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Elephant")) {
				answers.add("Europe");
				answers.add("Australia");
				answers.add(elephant.getNativeTo());
				answers.add("North America");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Aligator")) {
				answers.add("Ocean");
				answers.add(aligator.getNativeTo());
				answers.add("Africa");
				answers.add("Australia");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Tiger")) {
				answers.add("Europe");
				answers.add(tiger.getHome());
				answers.add("Africa");
				answers.add("Antartica");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("PolarBear")) {
				answers.add("Ocean");
				answers.add("Antartica");
				answers.add("Africa");
				answers.add(polarBear.getHome());
			}
			return answers;
		}
		// Round 6
		else if(count == 6) {
			if(animals.get(0).getClass().getSimpleName().equals("Penguin")) {
				answers.add(penguin.getSpeed());
				answers.add("25km/h");
				answers.add("5km/h");
				answers.add("10km/h");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Lion")) {
				answers.add(lion.getSpeed());
				answers.add("50km/h");
				answers.add("100km/h");
				answers.add("40km/h");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Gorilla")) {
				answers.add("70km/h");
				answers.add("60km/h");
				answers.add(gorilla.getSpeed());
				answers.add("30km/h");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Elephant")) {
				answers.add("25km/h");
				answers.add("60km/h");
				answers.add("50km/h");
				answers.add(elephant.getSpeed());
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Aligator")) {
				answers.add("38km/h");
				answers.add(aligator.getSpeed());
				answers.add("30km/h");
				answers.add("28km/h");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Tiger")) {
				answers.add("50km/h");
				answers.add(tiger.getSpeed());
				answers.add("75km/h");
				answers.add("80km/h");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("PolarBear")) {
				answers.add("60km/h");
				answers.add("30km/h");
				answers.add("55km/h");
				answers.add(polarBear.getSpeed());
			}
			return answers;
		}
		// Round 7
		else if(count == 7) {
			if(animals.get(0).getClass().getSimpleName().equals("Penguin")) {
				answers.add(penguin.getLifespan());
				answers.add("30 years");
				answers.add("15 years");
				answers.add("25 years");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Lion")) {
				answers.add(lion.getLifespan());
				answers.add("10 years");
				answers.add("22 years");
				answers.add("30 years");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Gorilla")) {
				answers.add("30 years");
				answers.add("20 years");
				answers.add(gorilla.getLifespan());
				answers.add("50 years");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Elephant")) {
				answers.add("50 years");
				answers.add("60 years");
				answers.add(elephant.getLifespan());
				answers.add("30 years");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Aligator")) {
				answers.add("30 years");
				answers.add(aligator.getLifespan());
				answers.add("80 years");
				answers.add("15 years");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Tiger")) {
				answers.add("10 years");
				answers.add(tiger.getLifespan());
				answers.add("20 years");
				answers.add("25 years");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("PolarBear")) {
				answers.add("20 years");
				answers.add("40 years");
				answers.add("35 years");
				answers.add(polarBear.getLifespan());
			}
			return answers;
		}
		// Round 8
		else if(count == 8) {
			if(animals.get(0).getClass().getSimpleName().equals("Penguin")) {
				answers.add(penguin.getSleep());
				answers.add("15 hours");
				answers.add("8 hours");
				answers.add("6 hours");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Lion")) {
				answers.add(lion.getSleep());
				answers.add("10 hours");
				answers.add("5 hours");
				answers.add("14 hours");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Gorilla")) {
				answers.add("8 hours");
				answers.add("4 hours");
				answers.add(gorilla.getSleep());
				answers.add("16 hours");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Elephant")) {
				answers.add("18 hours");
				answers.add("4 hours");
				answers.add(elephant.getSleep());
				answers.add("16 hours");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Aligator")) {
				answers.add("10 hours");
				answers.add(aligator.getSleep());
				answers.add("16 hours");
				answers.add("6 hours");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Tiger")) {
				answers.add("18 hours");
				answers.add(tiger.getSleep());
				answers.add("16 hours");
				answers.add("22 hours");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("PolarBear")) {
				answers.add("16 hours");
				answers.add("12 hours");
				answers.add("10 hours");
				answers.add(polarBear.getSleep());
			}
			return answers;
		}
		// Round 9
		else if(count == 9) {
			if(animals.get(0).getClass().getSimpleName().equals("Penguin")) {
				answers.add(penguin.getWeigh());
				answers.add("15kg");
				answers.add("30kg");
				answers.add("32kg");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Lion")) {
				answers.add(lion.getWeigh());
				answers.add("200kg");
				answers.add("185kg");
				answers.add("150kg");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Gorilla")) {
				answers.add("190kg");
				answers.add("184kg");
				answers.add(gorilla.getWeigh());
				answers.add("250kg");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Elephant")) {
				answers.add("4000kg");
				answers.add("4200kg");
				answers.add(elephant.getWeigh());
				answers.add("4600kg");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Aligator")) {
				answers.add("50kg");
				answers.add(aligator.getWeigh());
				answers.add("30kg");
				answers.add("60kg");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Tiger")) {
				answers.add("340kg");
				answers.add(tiger.getWeigh());
				answers.add("330kg");
				answers.add("320kg");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("PolarBear")) {
				answers.add("400kg");
				answers.add("500kg");
				answers.add("550kg");
				answers.add(polarBear.getWeigh());
			}
			return answers;
		}
		// Round 10
		else if(count == 10) {
			if(animals.get(0).getClass().getSimpleName().equals("Penguin")) {
				answers.add(penguin.getCommunication());
				answers.add("Roar");
				answers.add("Expressions");
				answers.add("Squeeks");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Lion")) {
				answers.add(lion.getCommunication());
				answers.add("Squeeks");
				answers.add("Touch/Smell");
				answers.add("Hissing");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Gorilla")) {
				answers.add("Hissing");
				answers.add("Squeeks");
				answers.add(gorilla.getCommunication());
				answers.add("Expressions");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Elephant")) {
				answers.add("Squeeks");
				answers.add("Touch and smell");
				answers.add(elephant.getCommunication());
				answers.add("Expressions");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Aligator")) {
				answers.add("Trumpet");
				answers.add(aligator.getCommunication());
				answers.add("Squeeks");
				answers.add("Expressions");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("Tiger")) {
				answers.add("Expressions");
				answers.add(tiger.getCommunication());
				answers.add("Trumpet");
				answers.add("Squeeks");
			}
			else if (animals.get(0).getClass().getSimpleName().equals("PolarBear")) {
				answers.add("Hissing");
				answers.add("Dispays");
				answers.add("Roar");
				answers.add(polarBear.getCommunication());
			}
			return answers;
		}
		return null;
	}
}
