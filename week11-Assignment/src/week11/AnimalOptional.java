package week11;

import java.util.NoSuchElementException;
import java.util.Optional;

public class AnimalOptional {
	public static void main(String[] args) {
	}
	private void run() {
		Animals animal = animalMethod(Optional.of("Racoon"));
		System.out.println(animal);
		
		try {
			Optional<Animals> empty = Optional.empty();
			animalMethod(Optional.empty());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	private Animals animalMethod(Optional<Animals> optionalAnimal) {
		
		return optionalAnimal.orElseThrow(
				() -> new NoSuchElementException("The animal does not exist"));
	}
}
