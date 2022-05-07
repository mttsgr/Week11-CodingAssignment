package week11;

import java.util.stream.Collectors;

public class AnimalStream {

	public static void main(String[] args) {
		new AnimalStream().run();
	}

	private void run() {
		String names = Animals.getAnimals()
		.stream()
		.map(a -> a.toString())
		.sorted()
		.collect(Collectors.joining(", "));
		
		System.out.println(names);
	}

}
