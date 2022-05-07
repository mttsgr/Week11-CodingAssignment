package week11;

import java.util.List;

public class Animals {
	private String name;
	
	private static final List<Animals> animals = List.of(
			new Animals("Monkey"), 
			new Animals ("Dog"), 
			new Animals ("Cat"), 
			new Animals ("Dolphin"), 
			new Animals ("Horse")
			);
			
	public Animals(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name + " Animal";
	}
	
	public int compare (Animals that) {
		return this.name.compareTo(that.name);
	}

	public static List<Animals> getAnimals() {
		return animals;
	}
}
