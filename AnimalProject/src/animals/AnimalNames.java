package animals;

import sortModel.Animal;

public class AnimalNames {

	private String animalName;
	
	public void Animal(String name) {
		this.animalName = name;
	}
	
	public String toString() {
		return animalName;
	}

	public String getAnimalName() {
		return animalName;
	}
	
	public static int compareAnimals(Animal a1, Animal a2) {
		return a1.animalName.compareTo(a2.animalName);
	}
}
