package week11;

import java.util.LinkedList;
import java.util.List;

public class AnimalSorter {

	public static void main(String[] args) {
		new AnimalSorter().run();

	}

	private void run() {
		boolean sortWithLambda = false;
		List<Animals> animals;
		String name;

		System.out.println("Original: " + Animals.getAnimals());

		if (sortWithLambda) {
			animals = sortWithLambda();
		 	name = "Lambda: ";
		}
		else {
			animals = sortWithMethodReference();
			name = "Method: ";
		}
		System.out.println(name + animals);
	}

	private List<Animals> sortWithMethodReference() {
		List <Animals> animals = Animals.getAnimals();
		
		animals.sort(Animals :: compare);
		return animals;
	}

	private List<Animals> sortWithLambda() {
		List<Animals> animals = Animals.getAnimals();
		
		animals.sort((a1, a2) -> a1.compare(a2));
		return new LinkedList<>(animals);
	}

}
